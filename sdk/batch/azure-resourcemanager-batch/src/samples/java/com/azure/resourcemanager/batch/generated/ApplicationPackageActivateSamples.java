// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.resourcemanager.batch.models.ActivateApplicationPackageParameters;

/**
 * Samples for ApplicationPackage Activate.
 */
public final class ApplicationPackageActivateSamples {
    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-07-01/examples/ApplicationPackageActivate.json
     */
    /**
     * Sample code: ApplicationPackageActivate.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void applicationPackageActivate(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.applicationPackages()
            .activateWithResponse("default-azurebatch-japaneast", "sampleacct", "app1", "1",
                new ActivateApplicationPackageParameters().withFormat("zip"), com.azure.core.util.Context.NONE);
    }
}
