// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

/**
 * Samples for StandbyContainerGroupPoolRuntimeViews ListByStandbyPool.
 */
public final class StandbyContainerGroupPoolRuntimeViewsListByStandbyPoolSamples {
    /*
     * x-ms-original-file: 2024-03-01/StandbyContainerGroupPoolRuntimeViews_ListByStandbyPool.json
     */
    /**
     * Sample code: StandbyContainerGroupPoolRuntimeViews_ListByStandbyPool.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void standbyContainerGroupPoolRuntimeViewsListByStandbyPool(
        com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        manager.standbyContainerGroupPoolRuntimeViews()
            .listByStandbyPool("rgstandbypool", "pool", com.azure.core.util.Context.NONE);
    }
}
