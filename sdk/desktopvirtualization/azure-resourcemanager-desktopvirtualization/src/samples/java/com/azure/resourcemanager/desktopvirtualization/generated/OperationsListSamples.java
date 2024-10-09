// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-04-03/examples/
     * OperationDescription_List.json
     */
    /**
     * Sample code: OperationDescription_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        operationDescriptionList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
