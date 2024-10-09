// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

/**
 * Samples for Apps Delete.
 */
public final class AppsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/iotcentral/resource-manager/Microsoft.IoTCentral/preview/2021-11-01-preview/examples/Apps_Delete.
     * json
     */
    /**
     * Sample code: Apps_Delete.
     * 
     * @param manager Entry point to IotCentralManager.
     */
    public static void appsDelete(com.azure.resourcemanager.iotcentral.IotCentralManager manager) {
        manager.apps().delete("resRg", "myIoTCentralApp", com.azure.core.util.Context.NONE);
    }
}
