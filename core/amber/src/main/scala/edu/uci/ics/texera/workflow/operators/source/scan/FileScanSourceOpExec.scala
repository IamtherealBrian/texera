package edu.uci.ics.texera.workflow.operators.source.scan

import edu.uci.ics.amber.engine.common.SourceOperatorExecutor
import edu.uci.ics.amber.engine.common.tuple.amber.TupleLike
import edu.uci.ics.texera.web.resource.dashboard.user.dataset.`type`.DatasetFileDesc
import edu.uci.ics.texera.workflow.common.tuple.schema.AttributeTypeUtils.parseField
import org.apache.commons.compress.archivers.{ArchiveInputStream, ArchiveStreamFactory}
import org.apache.commons.io.IOUtils.toByteArray

import java.io._
import scala.collection.mutable
import scala.jdk.CollectionConverters.IteratorHasAsScala

class FileScanSourceOpExec private[scan] (
    filePath: String,
    datasetFileDesc: DatasetFileDesc,
    fileAttributeType: FileAttributeType,
    fileEncoding: FileDecodingMethod,
    extract: Boolean,
    outputFileName: Boolean,
    fileScanLimit: Option[Int] = None,
    fileScanOffset: Option[Int] = None
) extends SourceOperatorExecutor {

  @throws[IOException]
  override def produceTuple(): Iterator[TupleLike] = {
    var filenameIt: Iterator[String] = Iterator.empty
    val fileEntries: Iterator[InputStream] = {
      val is = createInputStream(filePath, datasetFileDesc)
      if (extract) {
        val inputStream: ArchiveInputStream = new ArchiveStreamFactory().createArchiveInputStream(
          new BufferedInputStream(is)
        )
        val (it1, it2) = Iterator
          .continually(inputStream.getNextEntry)
          .takeWhile(_ != null)
          .filterNot(_.getName.startsWith("__MACOSX"))
          .duplicate
        filenameIt = it1.map(entry => entry.getName)
        it2.map(_ => inputStream)
      } else {
        Iterator(is)
      }
    }

    if (fileAttributeType.isSingle) {
      fileEntries.zipAll(filenameIt, null, null).map {
        case (entry, fileName) =>
          val fields: mutable.ListBuffer[Any] = mutable.ListBuffer()
          if (outputFileName) {
            fields.addOne(fileName)
          }
          fields.addOne(fileAttributeType match {
            case FileAttributeType.SINGLE_STRING =>
              new String(toByteArray(entry), fileEncoding.getCharset)
            case _ => parseField(toByteArray(entry), fileAttributeType.getType)
          })
          TupleLike(fields.toSeq: _*)
      }
    } else {
      fileEntries.flatMap(entry =>
        new BufferedReader(new InputStreamReader(entry, fileEncoding.getCharset))
          .lines()
          .iterator()
          .asScala
          .slice(
            fileScanOffset.getOrElse(0),
            fileScanOffset.getOrElse(0) + fileScanLimit.getOrElse(Int.MaxValue)
          )
          .map(line => {
            TupleLike(fileAttributeType match {
              case FileAttributeType.SINGLE_STRING => line
              case _                               => parseField(line, fileAttributeType.getType)
            })
          })
      )
    }
  }

}
