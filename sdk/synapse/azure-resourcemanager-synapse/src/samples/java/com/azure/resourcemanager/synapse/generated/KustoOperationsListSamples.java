// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for KustoOperations List. */
public final class KustoOperationsListSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: KustoOperationsList.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoOperationsList(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.kustoOperations().list(Context.NONE);
    }
}
