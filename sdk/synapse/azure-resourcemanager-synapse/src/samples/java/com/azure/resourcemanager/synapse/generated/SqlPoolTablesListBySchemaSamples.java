// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for SqlPoolTables ListBySchema. */
public final class SqlPoolTablesListBySchemaSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: List the tables of a given schema in a SQL Analytics pool.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listTheTablesOfAGivenSchemaInASQLAnalyticsPool(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.sqlPoolTables().listBySchema("myRG", "serverName", "myDatabase", "dbo", null, Context.NONE);
    }
}
