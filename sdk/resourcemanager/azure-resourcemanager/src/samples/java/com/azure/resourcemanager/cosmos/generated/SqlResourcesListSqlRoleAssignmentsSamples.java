// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for SqlResources ListSqlRoleAssignments.
 */
public final class SqlResourcesListSqlRoleAssignmentsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/
     * CosmosDBSqlRoleAssignmentList.json
     */
    /**
     * Sample code: CosmosDBSqlRoleAssignmentList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlRoleAssignmentList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .listSqlRoleAssignments("myResourceGroupName", "myAccountName", com.azure.core.util.Context.NONE);
    }
}
