// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.EffectiveRoutesParameters;

/**
 * Samples for VirtualHubs GetEffectiveVirtualHubRoutes.
 */
public final class VirtualHubsGetEffectiveVirtualHubRoutesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * EffectiveRoutesListForRouteTable.json
     */
    /**
     * Sample code: Effective Routes for a Route Table resource.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void effectiveRoutesForARouteTableResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualHubs()
            .getEffectiveVirtualHubRoutes("rg1", "virtualHub1", new EffectiveRoutesParameters().withResourceId(
                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/hubRouteTables/hubRouteTable1")
                .withVirtualWanResourceType("RouteTable"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * EffectiveRoutesListForConnection.json
     */
    /**
     * Sample code: Effective Routes for a Connection resource.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void effectiveRoutesForAConnectionResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualHubs()
            .getEffectiveVirtualHubRoutes("rg1", "virtualHub1", new EffectiveRoutesParameters().withResourceId(
                "/subscriptions/subid/resourceGroups/resourceGroupName/providers/Microsoft.Network/expressRouteGateways/expressRouteGatewayName/expressRouteConnections/connectionName")
                .withVirtualWanResourceType("ExpressRouteConnection"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-03-01/examples/
     * EffectiveRoutesListForVirtualHub.json
     */
    /**
     * Sample code: Effective Routes for the Virtual Hub.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void effectiveRoutesForTheVirtualHub(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualHubs()
            .getEffectiveVirtualHubRoutes("rg1", "virtualHub1", null, com.azure.core.util.Context.NONE);
    }
}
