// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of the backup engine.
 */
public final class BackupEngineType extends ExpandableStringEnum<BackupEngineType> {
    /**
     * Static value Invalid for BackupEngineType.
     */
    public static final BackupEngineType INVALID = fromString("Invalid");

    /**
     * Static value DpmBackupEngine for BackupEngineType.
     */
    public static final BackupEngineType DPM_BACKUP_ENGINE = fromString("DpmBackupEngine");

    /**
     * Static value AzureBackupServerEngine for BackupEngineType.
     */
    public static final BackupEngineType AZURE_BACKUP_SERVER_ENGINE = fromString("AzureBackupServerEngine");

    /**
     * Creates a new instance of BackupEngineType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BackupEngineType() {
    }

    /**
     * Creates or finds a BackupEngineType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BackupEngineType.
     */
    @JsonCreator
    public static BackupEngineType fromString(String name) {
        return fromString(name, BackupEngineType.class);
    }

    /**
     * Gets known BackupEngineType values.
     * 
     * @return known BackupEngineType values.
     */
    public static Collection<BackupEngineType> values() {
        return values(BackupEngineType.class);
    }
}
