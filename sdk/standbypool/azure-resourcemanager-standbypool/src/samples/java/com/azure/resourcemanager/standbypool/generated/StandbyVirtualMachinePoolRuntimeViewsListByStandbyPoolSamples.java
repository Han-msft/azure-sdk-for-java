// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

/**
 * Samples for StandbyVirtualMachinePoolRuntimeViews ListByStandbyPool.
 */
public final class StandbyVirtualMachinePoolRuntimeViewsListByStandbyPoolSamples {
    /*
     * x-ms-original-file: 2024-03-01/StandbyVirtualMachinePoolRuntimeViews_ListByStandbyPool.json
     */
    /**
     * Sample code: StandbyVirtualMachinePoolRuntimeViews_ListByStandbyPool.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void standbyVirtualMachinePoolRuntimeViewsListByStandbyPool(
        com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        manager.standbyVirtualMachinePoolRuntimeViews()
            .listByStandbyPool("rgstandbypool", "pool", com.azure.core.util.Context.NONE);
    }
}
