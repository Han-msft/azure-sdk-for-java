// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.SyncGroupsType;

/**
 * Samples for SyncGroups ListLogs.
 */
public final class SyncGroupsListLogsSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/SyncGroupGetLog.json
     */
    /**
     * Sample code: Get sync group logs.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSyncGroupLogs(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getSyncGroups()
            .listLogs("syncgroupcrud-65440", "syncgroupcrud-8475", "syncgroupcrud-4328", "syncgroupcrud-3187",
                "2017-01-01T00:00:00", "2017-12-31T00:00:00", SyncGroupsType.ALL, null,
                com.azure.core.util.Context.NONE);
    }
}
