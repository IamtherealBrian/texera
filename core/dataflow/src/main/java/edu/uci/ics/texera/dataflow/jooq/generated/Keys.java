/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.dataflow.jooq.generated;


import edu.uci.ics.texera.dataflow.jooq.generated.tables.*;
import edu.uci.ics.texera.dataflow.jooq.generated.tables.records.*;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.UInteger;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>texera_db</code> schema.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<KeySearchDictRecord, UInteger> IDENTITY_KEY_SEARCH_DICT = Identities0.IDENTITY_KEY_SEARCH_DICT;
    public static final Identity<UploadedFileRecord, UInteger> IDENTITY_UPLOADED_FILE = Identities0.IDENTITY_UPLOADED_FILE;
    public static final Identity<UserAccountRecord, UInteger> IDENTITY_USER_ACCOUNT = Identities0.IDENTITY_USER_ACCOUNT;
    public static final Identity<WorkflowRecord, UInteger> IDENTITY_WORKFLOW = Identities0.IDENTITY_WORKFLOW;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<KeySearchDictRecord> KEY_KEY_SEARCH_DICT_UID = UniqueKeys0.KEY_KEY_SEARCH_DICT_UID;
    public static final UniqueKey<KeySearchDictRecord> KEY_KEY_SEARCH_DICT_PRIMARY = UniqueKeys0.KEY_KEY_SEARCH_DICT_PRIMARY;
    public static final UniqueKey<UploadedFileRecord> KEY_UPLOADED_FILE_UID = UniqueKeys0.KEY_UPLOADED_FILE_UID;
    public static final UniqueKey<UploadedFileRecord> KEY_UPLOADED_FILE_PRIMARY = UniqueKeys0.KEY_UPLOADED_FILE_PRIMARY;
    public static final UniqueKey<UserAccountRecord> KEY_USER_ACCOUNT_NAME = UniqueKeys0.KEY_USER_ACCOUNT_NAME;
    public static final UniqueKey<UserAccountRecord> KEY_USER_ACCOUNT_PRIMARY = UniqueKeys0.KEY_USER_ACCOUNT_PRIMARY;
    public static final UniqueKey<WorkflowRecord> KEY_WORKFLOW_PRIMARY = UniqueKeys0.KEY_WORKFLOW_PRIMARY;
    public static final UniqueKey<WorkflowOfUserRecord> KEY_WORKFLOW_OF_USER_PRIMARY = UniqueKeys0.KEY_WORKFLOW_OF_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<KeySearchDictRecord, UserAccountRecord> KEY_SEARCH_DICT_IBFK_1 = ForeignKeys0.KEY_SEARCH_DICT_IBFK_1;
    public static final ForeignKey<UploadedFileRecord, UserAccountRecord> UPLOADED_FILE_IBFK_1 = ForeignKeys0.UPLOADED_FILE_IBFK_1;
    public static final ForeignKey<WorkflowOfUserRecord, UserAccountRecord> WORKFLOW_OF_USER_IBFK_1 = ForeignKeys0.WORKFLOW_OF_USER_IBFK_1;
    public static final ForeignKey<WorkflowOfUserRecord, WorkflowRecord> WORKFLOW_OF_USER_IBFK_2 = ForeignKeys0.WORKFLOW_OF_USER_IBFK_2;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<KeySearchDictRecord, UInteger> IDENTITY_KEY_SEARCH_DICT = Internal.createIdentity(KeySearchDict.KEY_SEARCH_DICT, KeySearchDict.KEY_SEARCH_DICT.KSD_ID);
        public static Identity<UploadedFileRecord, UInteger> IDENTITY_UPLOADED_FILE = Internal.createIdentity(UploadedFile.UPLOADED_FILE, UploadedFile.UPLOADED_FILE.FID);
        public static Identity<UserAccountRecord, UInteger> IDENTITY_USER_ACCOUNT = Internal.createIdentity(UserAccount.USER_ACCOUNT, UserAccount.USER_ACCOUNT.UID);
        public static Identity<WorkflowRecord, UInteger> IDENTITY_WORKFLOW = Internal.createIdentity(Workflow.WORKFLOW, Workflow.WORKFLOW.WF_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<KeySearchDictRecord> KEY_KEY_SEARCH_DICT_UID = Internal.createUniqueKey(KeySearchDict.KEY_SEARCH_DICT, "KEY_key_search_dict_uid", KeySearchDict.KEY_SEARCH_DICT.UID, KeySearchDict.KEY_SEARCH_DICT.NAME);
        public static final UniqueKey<KeySearchDictRecord> KEY_KEY_SEARCH_DICT_PRIMARY = Internal.createUniqueKey(KeySearchDict.KEY_SEARCH_DICT, "KEY_key_search_dict_PRIMARY", KeySearchDict.KEY_SEARCH_DICT.KSD_ID);
        public static final UniqueKey<UploadedFileRecord> KEY_UPLOADED_FILE_UID = Internal.createUniqueKey(UploadedFile.UPLOADED_FILE, "KEY_uploaded_file_uid", UploadedFile.UPLOADED_FILE.UID, UploadedFile.UPLOADED_FILE.NAME);
        public static final UniqueKey<UploadedFileRecord> KEY_UPLOADED_FILE_PRIMARY = Internal.createUniqueKey(UploadedFile.UPLOADED_FILE, "KEY_uploaded_file_PRIMARY", UploadedFile.UPLOADED_FILE.FID);
        public static final UniqueKey<UserAccountRecord> KEY_USER_ACCOUNT_NAME = Internal.createUniqueKey(UserAccount.USER_ACCOUNT, "KEY_user_account_name", UserAccount.USER_ACCOUNT.NAME);
        public static final UniqueKey<UserAccountRecord> KEY_USER_ACCOUNT_PRIMARY = Internal.createUniqueKey(UserAccount.USER_ACCOUNT, "KEY_user_account_PRIMARY", UserAccount.USER_ACCOUNT.UID);
        public static final UniqueKey<WorkflowRecord> KEY_WORKFLOW_PRIMARY = Internal.createUniqueKey(Workflow.WORKFLOW, "KEY_workflow_PRIMARY", Workflow.WORKFLOW.WF_ID);
        public static final UniqueKey<WorkflowOfUserRecord> KEY_WORKFLOW_OF_USER_PRIMARY = Internal.createUniqueKey(WorkflowOfUser.WORKFLOW_OF_USER, "KEY_workflow_of_user_PRIMARY", WorkflowOfUser.WORKFLOW_OF_USER.UID, WorkflowOfUser.WORKFLOW_OF_USER.WF_ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<KeySearchDictRecord, UserAccountRecord> KEY_SEARCH_DICT_IBFK_1 = Internal.createForeignKey(edu.uci.ics.texera.dataflow.jooq.generated.Keys.KEY_USER_ACCOUNT_PRIMARY, KeySearchDict.KEY_SEARCH_DICT, "key_search_dict_ibfk_1", KeySearchDict.KEY_SEARCH_DICT.UID);
        public static final ForeignKey<UploadedFileRecord, UserAccountRecord> UPLOADED_FILE_IBFK_1 = Internal.createForeignKey(edu.uci.ics.texera.dataflow.jooq.generated.Keys.KEY_USER_ACCOUNT_PRIMARY, UploadedFile.UPLOADED_FILE, "uploaded_file_ibfk_1", UploadedFile.UPLOADED_FILE.UID);
        public static final ForeignKey<WorkflowOfUserRecord, UserAccountRecord> WORKFLOW_OF_USER_IBFK_1 = Internal.createForeignKey(edu.uci.ics.texera.dataflow.jooq.generated.Keys.KEY_USER_ACCOUNT_PRIMARY, WorkflowOfUser.WORKFLOW_OF_USER, "workflow_of_user_ibfk_1", WorkflowOfUser.WORKFLOW_OF_USER.UID);
        public static final ForeignKey<WorkflowOfUserRecord, WorkflowRecord> WORKFLOW_OF_USER_IBFK_2 = Internal.createForeignKey(edu.uci.ics.texera.dataflow.jooq.generated.Keys.KEY_WORKFLOW_PRIMARY, WorkflowOfUser.WORKFLOW_OF_USER, "workflow_of_user_ibfk_2", WorkflowOfUser.WORKFLOW_OF_USER.WF_ID);
    }
}
