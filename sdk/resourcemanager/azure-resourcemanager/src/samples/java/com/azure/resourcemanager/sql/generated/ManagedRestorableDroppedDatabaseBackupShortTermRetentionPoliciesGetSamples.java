// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.ManagedShortTermRetentionPolicyName;

/**
 * Samples for ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies Get.
 */
public final class ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * GetManagedShortTermRetentionPolicyRestorableDropped.json
     */
    /**
     * Sample code: Get the short term retention policy for the database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getTheShortTermRetentionPolicyForTheDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies()
            .getWithResponse("Default-SQL-SouthEastAsia", "testsvr", "testdb,131403269876900000",
                ManagedShortTermRetentionPolicyName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
