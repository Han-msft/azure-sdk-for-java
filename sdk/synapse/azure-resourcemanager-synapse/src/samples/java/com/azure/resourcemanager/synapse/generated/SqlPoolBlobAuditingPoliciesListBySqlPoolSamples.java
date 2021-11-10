// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for SqlPoolBlobAuditingPolicies ListBySqlPool. */
public final class SqlPoolBlobAuditingPoliciesListBySqlPoolSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: List audit settings of a database.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void listAuditSettingsOfADatabase(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolBlobAuditingPolicies()
            .listBySqlPool("blobauditingtest-6852", "blobauditingtest-2080", "testdb", Context.NONE);
    }
}
