// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.models.ConnectionPolicyName;

/** Samples for SqlPoolConnectionPolicies Get. */
public final class SqlPoolConnectionPoliciesGetSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: Get a connection policy of a SQL Analytics pool.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getAConnectionPolicyOfASQLAnalyticsPool(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolConnectionPolicies()
            .getWithResponse(
                "blobauditingtest-6852", "blobauditingtest-2080", "testdb", ConnectionPolicyName.DEFAULT, Context.NONE);
    }
}
