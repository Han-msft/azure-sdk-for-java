// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Cancelled\",\"privateEndpoint\":{\"id\":\"theotusiv\"},\"groupIds\":[\"cciqihnhungbwjz\"],\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"gxg\",\"actionsRequired\":\"pemvtzfkufubljof\"}}")
            .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("gxg", model.privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model
            = new PrivateEndpointConnectionProperties().withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateLinkServiceConnectionStatus.DISCONNECTED)
                    .withDescription("gxg"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("gxg", model.privateLinkServiceConnectionState().description());
    }
}
