// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the mode of database creation.
 * 
 * Default: regular database creation.
 * 
 * Copy: creates a database as a copy of an existing database. sourceDatabaseId must be specified as the resource ID of
 * the source database.
 * 
 * Secondary: creates a database as a secondary replica of an existing database. sourceDatabaseId must be specified as
 * the resource ID of the existing primary database.
 * 
 * PointInTimeRestore: Creates a database by restoring a point in time backup of an existing database. sourceDatabaseId
 * must be specified as the resource ID of the existing database, and restorePointInTime must be specified.
 * 
 * Recovery: Creates a database by restoring a geo-replicated backup. sourceDatabaseId must be specified as the
 * recoverable database resource ID to restore.
 * 
 * Restore: Creates a database by restoring a backup of a deleted database. sourceDatabaseId must be specified. If
 * sourceDatabaseId is the database's original resource ID, then sourceDatabaseDeletionDate must be specified. Otherwise
 * sourceDatabaseId must be the restorable dropped database resource ID and sourceDatabaseDeletionDate is ignored.
 * restorePointInTime may also be specified to restore from an earlier point in time.
 * 
 * RestoreLongTermRetentionBackup: Creates a database by restoring from a long term retention vault.
 * recoveryServicesRecoveryPointResourceId must be specified as the recovery point resource ID.
 * 
 * Copy, Secondary, and RestoreLongTermRetentionBackup are not supported for DataWarehouse edition.
 */
public final class CreateMode extends ExpandableStringEnum<CreateMode> {
    /**
     * Static value Default for CreateMode.
     */
    public static final CreateMode DEFAULT = fromString("Default");

    /**
     * Static value Copy for CreateMode.
     */
    public static final CreateMode COPY = fromString("Copy");

    /**
     * Static value Secondary for CreateMode.
     */
    public static final CreateMode SECONDARY = fromString("Secondary");

    /**
     * Static value PointInTimeRestore for CreateMode.
     */
    public static final CreateMode POINT_IN_TIME_RESTORE = fromString("PointInTimeRestore");

    /**
     * Static value Restore for CreateMode.
     */
    public static final CreateMode RESTORE = fromString("Restore");

    /**
     * Static value Recovery for CreateMode.
     */
    public static final CreateMode RECOVERY = fromString("Recovery");

    /**
     * Static value RestoreExternalBackup for CreateMode.
     */
    public static final CreateMode RESTORE_EXTERNAL_BACKUP = fromString("RestoreExternalBackup");

    /**
     * Static value RestoreExternalBackupSecondary for CreateMode.
     */
    public static final CreateMode RESTORE_EXTERNAL_BACKUP_SECONDARY = fromString("RestoreExternalBackupSecondary");

    /**
     * Static value RestoreLongTermRetentionBackup for CreateMode.
     */
    public static final CreateMode RESTORE_LONG_TERM_RETENTION_BACKUP = fromString("RestoreLongTermRetentionBackup");

    /**
     * Static value OnlineSecondary for CreateMode.
     */
    public static final CreateMode ONLINE_SECONDARY = fromString("OnlineSecondary");

    /**
     * Creates a new instance of CreateMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CreateMode() {
    }

    /**
     * Creates or finds a CreateMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CreateMode.
     */
    public static CreateMode fromString(String name) {
        return fromString(name, CreateMode.class);
    }

    /**
     * Gets known CreateMode values.
     * 
     * @return known CreateMode values.
     */
    public static Collection<CreateMode> values() {
        return values(CreateMode.class);
    }
}
