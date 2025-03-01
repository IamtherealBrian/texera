import { DatasetVersionFileTreeNode } from "./datasetVersionFileTree";

export interface DatasetVersion {
  dvid: number | undefined;
  did: number;
  creatorUid: number;
  name: string;
  versionHash: string | undefined;
  creationTime: number | undefined;
  versionFileTreeNodes: DatasetVersionFileTreeNode[] | undefined;
}

export interface Dataset {
  did: number | undefined;
  name: string;
  isPublic: number;
  storagePath: string | undefined;
  description: string;
  creationTime: number | undefined;
  versionHierarchy: DatasetVersion[] | undefined;
}
