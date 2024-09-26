// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/**
 * Samples for BatchAccount SynchronizeAutoStorageKeys.
 */
public final class BatchAccountSynchronizeAutoStorageKeysSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/
     * BatchAccountSynchronizeAutoStorageKeys.json
     */
    /**
     * Sample code: BatchAccountSynchronizeAutoStorageKeys.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void batchAccountSynchronizeAutoStorageKeys(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.batchAccounts()
            .synchronizeAutoStorageKeysWithResponse("default-azurebatch-japaneast", "sampleacct",
                com.azure.core.util.Context.NONE);
    }
}
