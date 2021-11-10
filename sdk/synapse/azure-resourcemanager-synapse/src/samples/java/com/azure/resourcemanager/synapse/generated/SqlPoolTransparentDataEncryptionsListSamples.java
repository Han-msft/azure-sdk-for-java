// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for SqlPoolTransparentDataEncryptions List. */
public final class SqlPoolTransparentDataEncryptionsListSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: Get list of transparent data encryption configurations of a SQL Analytics pool.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getListOfTransparentDataEncryptionConfigurationsOfASQLAnalyticsPool(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolTransparentDataEncryptions()
            .list("sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-9187", Context.NONE);
    }
}
