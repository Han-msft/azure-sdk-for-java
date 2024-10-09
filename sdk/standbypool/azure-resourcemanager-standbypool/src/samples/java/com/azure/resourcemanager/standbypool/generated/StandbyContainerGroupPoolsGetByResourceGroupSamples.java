// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

/**
 * Samples for StandbyContainerGroupPools GetByResourceGroup.
 */
public final class StandbyContainerGroupPoolsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-03-01/StandbyContainerGroupPools_Get.json
     */
    /**
     * Sample code: StandbyContainerGroupPools_Get.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void standbyContainerGroupPoolsGet(com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        manager.standbyContainerGroupPools()
            .getByResourceGroupWithResponse("rgstandbypool", "pool", com.azure.core.util.Context.NONE);
    }
}
