// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fluidrelay.fluent.models.FluidRelayContainerProperties;

public final class FluidRelayContainerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FluidRelayContainerProperties model = BinaryData.fromString(
            "{\"frsTenantId\":\"ftyxolniw\",\"frsContainerId\":\"cukjf\",\"provisioningState\":\"Succeeded\",\"creationTime\":\"2021-03-19T13:58:34Z\",\"lastAccessTime\":\"2021-01-09T05:37:53Z\"}")
            .toObject(FluidRelayContainerProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FluidRelayContainerProperties model = new FluidRelayContainerProperties();
        model = BinaryData.fromObject(model).toObject(FluidRelayContainerProperties.class);
    }
}
