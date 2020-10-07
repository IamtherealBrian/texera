/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.dataflow.jooq.generated.tables;


import edu.uci.ics.texera.dataflow.jooq.generated.Indexes;
import edu.uci.ics.texera.dataflow.jooq.generated.Keys;
import edu.uci.ics.texera.dataflow.jooq.generated.TexeraDb;
import edu.uci.ics.texera.dataflow.jooq.generated.tables.records.UserAccountRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UserAccount extends TableImpl<UserAccountRecord> {

    /**
     * The reference instance of <code>texera_db.user_account</code>
     */
    public static final UserAccount USER_ACCOUNT = new UserAccount();
    private static final long serialVersionUID = -783621522;
    /**
     * The column <code>texera_db.user_account.name</code>.
     */
    public final TableField<UserAccountRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");
    /**
     * The column <code>texera_db.user_account.uid</code>.
     */
    public final TableField<UserAccountRecord, UInteger> UID = createField(DSL.name("uid"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * Create a <code>texera_db.user_account</code> table reference
     */
    public UserAccount() {
        this(DSL.name("user_account"), null);
    }

    /**
     * Create an aliased <code>texera_db.user_account</code> table reference
     */
    public UserAccount(String alias) {
        this(DSL.name(alias), USER_ACCOUNT);
    }

    /**
     * Create an aliased <code>texera_db.user_account</code> table reference
     */
    public UserAccount(Name alias) {
        this(alias, USER_ACCOUNT);
    }

    private UserAccount(Name alias, Table<UserAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserAccount(Name alias, Table<UserAccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserAccount(Table<O> child, ForeignKey<O, UserAccountRecord> key) {
        super(child, key, USER_ACCOUNT);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserAccountRecord> getRecordType() {
        return UserAccountRecord.class;
    }

    @Override
    public Schema getSchema() {
        return TexeraDb.TEXERA_DB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_ACCOUNT_NAME, Indexes.USER_ACCOUNT_PRIMARY);
    }

    @Override
    public Identity<UserAccountRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_USER_ACCOUNT;
    }

    @Override
    public UniqueKey<UserAccountRecord> getPrimaryKey() {
        return Keys.KEY_USER_ACCOUNT_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserAccountRecord>> getKeys() {
        return Arrays.<UniqueKey<UserAccountRecord>>asList(Keys.KEY_USER_ACCOUNT_NAME, Keys.KEY_USER_ACCOUNT_PRIMARY);
    }

    @Override
    public UserAccount as(String alias) {
        return new UserAccount(DSL.name(alias), this);
    }

    @Override
    public UserAccount as(Name alias) {
        return new UserAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserAccount rename(String name) {
        return new UserAccount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserAccount rename(Name name) {
        return new UserAccount(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, UInteger> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
