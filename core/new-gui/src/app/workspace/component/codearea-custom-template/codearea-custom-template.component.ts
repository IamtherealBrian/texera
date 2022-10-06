import { Component } from "@angular/core";
import { FieldType } from "@ngx-formly/core";
import { MatDialog, MatDialogRef } from "@angular/material/dialog";
import { CodeEditorDialogComponent } from "../code-editor-dialog/code-editor-dialog.component";
import { UntilDestroy, untilDestroyed } from "@ngneat/until-destroy";
import { CoeditorPresenceService } from "../../service/workflow-graph/model/coeditor-presence.service";

/**
 * CodeareaCustomTemplateComponent is the custom template for 'codearea' type of formly field.
 *
 * When the formly field type is 'codearea', it overrides the default one line string input template
 * with this component.
 *
 * Clicking on the 'Edit code content' button will create a new dialogue with CodeEditorComponent
 * as its content. The data of this field will be sent to this dialogue, which contains a Monaco editor.
 */
@UntilDestroy()
@Component({
  selector: "texera-codearea-custom-template",
  templateUrl: "./codearea-custom-template.component.html",
  styleUrls: ["./codearea-custom-template.component.scss"],
})
export class CodeareaCustomTemplateComponent extends FieldType {
  dialogRef: MatDialogRef<CodeEditorDialogComponent> | undefined;

  constructor(public dialog: MatDialog, private coeditorPresenceService: CoeditorPresenceService) {
    super();
    this.handleShadowingMode();
  }

  /**
   * Opens the code editor.
   */
  onClickEditor(): void {
    this.dialogRef = this.dialog.open(CodeEditorDialogComponent, {
      data: this.formControl?.value || "",
    });
  }

  /**
   * When shadowing a co-editor, this method handles the opening/closing of the code editor based on the co-editor.
   * @private
   */
  private handleShadowingMode(): void {
    this.coeditorPresenceService
      .getCoeditorOpenedCodeEditorSubject()
      .pipe(untilDestroyed(this))
      .subscribe(_ => {
        this.onClickEditor();
      });
    this.coeditorPresenceService
      .getCoeditorClosedCodeEditorSubject()
      .pipe(untilDestroyed(this))
      .subscribe(_ => {
        this.dialogRef?.close();
      });
  }
}
