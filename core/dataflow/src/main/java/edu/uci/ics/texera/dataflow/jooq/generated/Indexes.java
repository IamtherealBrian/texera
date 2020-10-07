/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.dataflow.jooq.generated;


import edu.uci.ics.texera.dataflow.jooq.generated.tables.*;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>texera_db</code> schema.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index KEY_SEARCH_DICT_PRIMARY = Indexes0.KEY_SEARCH_DICT_PRIMARY;
    public static final Index KEY_SEARCH_DICT_UID = Indexes0.KEY_SEARCH_DICT_UID;
    public static final Index UPLOADED_FILE_PRIMARY = Indexes0.UPLOADED_FILE_PRIMARY;
    public static final Index UPLOADED_FILE_UID = Indexes0.UPLOADED_FILE_UID;
    public static final Index USER_ACCOUNT_NAME = Indexes0.USER_ACCOUNT_NAME;
    public static final Index USER_ACCOUNT_PRIMARY = Indexes0.USER_ACCOUNT_PRIMARY;
    public static final Index WORKFLOW_PRIMARY = Indexes0.WORKFLOW_PRIMARY;
    public static final Index WORKFLOW_OF_USER_PRIMARY = Indexes0.WORKFLOW_OF_USER_PRIMARY;
    public static final Index WORKFLOW_OF_USER_WF_ID = Indexes0.WORKFLOW_OF_USER_WF_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index KEY_SEARCH_DICT_PRIMARY = Internal.createIndex("PRIMARY", KeySearchDict.KEY_SEARCH_DICT, new OrderField[]{KeySearchDict.KEY_SEARCH_DICT.KSD_ID}, true);
        public static Index KEY_SEARCH_DICT_UID = Internal.createIndex("uid", KeySearchDict.KEY_SEARCH_DICT, new OrderField[]{KeySearchDict.KEY_SEARCH_DICT.UID, KeySearchDict.KEY_SEARCH_DICT.NAME}, true);
        public static Index UPLOADED_FILE_PRIMARY = Internal.createIndex("PRIMARY", UploadedFile.UPLOADED_FILE, new OrderField[]{UploadedFile.UPLOADED_FILE.FID}, true);
        public static Index UPLOADED_FILE_UID = Internal.createIndex("uid", UploadedFile.UPLOADED_FILE, new OrderField[]{UploadedFile.UPLOADED_FILE.UID, UploadedFile.UPLOADED_FILE.NAME}, true);
        public static Index USER_ACCOUNT_NAME = Internal.createIndex("name", UserAccount.USER_ACCOUNT, new OrderField[]{UserAccount.USER_ACCOUNT.NAME}, true);
        public static Index USER_ACCOUNT_PRIMARY = Internal.createIndex("PRIMARY", UserAccount.USER_ACCOUNT, new OrderField[]{UserAccount.USER_ACCOUNT.UID}, true);
        public static Index WORKFLOW_PRIMARY = Internal.createIndex("PRIMARY", Workflow.WORKFLOW, new OrderField[]{Workflow.WORKFLOW.WF_ID}, true);
        public static Index WORKFLOW_OF_USER_PRIMARY = Internal.createIndex("PRIMARY", WorkflowOfUser.WORKFLOW_OF_USER, new OrderField[]{WorkflowOfUser.WORKFLOW_OF_USER.UID, WorkflowOfUser.WORKFLOW_OF_USER.WF_ID}, true);
        public static Index WORKFLOW_OF_USER_WF_ID = Internal.createIndex("wf_id", WorkflowOfUser.WORKFLOW_OF_USER, new OrderField[]{WorkflowOfUser.WORKFLOW_OF_USER.WF_ID}, false);
    }
}
