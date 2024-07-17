// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.resourcemanager.containerservice.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.containerservice.models.ConnectionStatus;
import com.azure.resourcemanager.containerservice.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections Update.
 */
public final class PrivateEndpointConnectionsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-05-01/examples/
     * PrivateEndpointConnectionsUpdate.json
     */
    /**
     * Sample code: Update Private Endpoint Connection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updatePrivateEndpointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .updateWithResponse("rg1", "clustername1", "privateendpointconnection1",
                new PrivateEndpointConnectionInner().withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(ConnectionStatus.APPROVED)),
                com.azure.core.util.Context.NONE);
    }
}
