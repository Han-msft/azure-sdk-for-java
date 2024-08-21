// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.hdinsight.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.hdinsight.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model = BinaryData.fromString(
            "{\"properties\":{\"privateEndpoint\":{\"id\":\"ncblylpst\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"hxsrzdzucersc\",\"actionsRequired\":\"t\"},\"linkIdentifier\":\"vfiwjmygtdss\",\"provisioningState\":\"InProgress\"},\"id\":\"mweriofzpy\",\"name\":\"semwabnet\",\"type\":\"hhszh\"}")
            .toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.PENDING,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("hxsrzdzucersc", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("t", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model
            = new PrivateEndpointConnectionInner().withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateLinkServiceConnectionStatus.PENDING)
                    .withDescription("hxsrzdzucersc")
                    .withActionsRequired("t"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.PENDING,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("hxsrzdzucersc", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("t", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
