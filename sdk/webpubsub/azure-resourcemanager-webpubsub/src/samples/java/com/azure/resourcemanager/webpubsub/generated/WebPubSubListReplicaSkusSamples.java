// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/**
 * Samples for WebPubSub ListReplicaSkus.
 */
public final class WebPubSubListReplicaSkusSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/stable/2024-03-01/examples/
     * WebPubSub_ListReplicaSkus.json
     */
    /**
     * Sample code: WebPubSub_ListReplicaSkus.
     * 
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubListReplicaSkus(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager.webPubSubs()
            .listReplicaSkusWithResponse("myResourceGroup", "myWebPubSubService", "myWebPubSubService-eastus",
                com.azure.core.util.Context.NONE);
    }
}
