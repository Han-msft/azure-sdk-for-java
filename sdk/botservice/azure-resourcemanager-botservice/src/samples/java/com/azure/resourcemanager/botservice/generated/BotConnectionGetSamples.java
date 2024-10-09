// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

/**
 * Samples for BotConnection Get.
 */
public final class BotConnectionGetSamples {
    /*
     * x-ms-original-file:
     * specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/GetConnection.
     * json
     */
    /**
     * Sample code: Get Connection Setting.
     * 
     * @param manager Entry point to BotServiceManager.
     */
    public static void getConnectionSetting(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        manager.botConnections()
            .getWithResponse("OneResourceGroupName", "samplebotname", "sampleConnection",
                com.azure.core.util.Context.NONE);
    }
}
