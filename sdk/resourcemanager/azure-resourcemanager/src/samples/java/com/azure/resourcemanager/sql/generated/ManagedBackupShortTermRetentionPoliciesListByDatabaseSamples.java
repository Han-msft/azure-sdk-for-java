// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ManagedBackupShortTermRetentionPolicies ListByDatabase.
 */
public final class ManagedBackupShortTermRetentionPoliciesListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * GetListManagedShortTermRetentionPolicy.json
     */
    /**
     * Sample code: Get the short term retention policy list for the database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getTheShortTermRetentionPolicyListForTheDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getManagedBackupShortTermRetentionPolicies()
            .listByDatabase("Default-SQL-SouthEastAsia", "testsvr", "testdb", com.azure.core.util.Context.NONE);
    }
}
