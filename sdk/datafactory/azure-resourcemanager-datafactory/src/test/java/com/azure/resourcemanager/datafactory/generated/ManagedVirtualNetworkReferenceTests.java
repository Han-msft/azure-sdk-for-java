// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkReference;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkReferenceType;
import org.junit.jupiter.api.Assertions;

public final class ManagedVirtualNetworkReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedVirtualNetworkReference model
            = BinaryData.fromString("{\"type\":\"ManagedVirtualNetworkReference\",\"referenceName\":\"pzeqacdldtz\"}")
                .toObject(ManagedVirtualNetworkReference.class);
        Assertions.assertEquals(ManagedVirtualNetworkReferenceType.MANAGED_VIRTUAL_NETWORK_REFERENCE, model.type());
        Assertions.assertEquals("pzeqacdldtz", model.referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedVirtualNetworkReference model = new ManagedVirtualNetworkReference()
            .withType(ManagedVirtualNetworkReferenceType.MANAGED_VIRTUAL_NETWORK_REFERENCE)
            .withReferenceName("pzeqacdldtz");
        model = BinaryData.fromObject(model).toObject(ManagedVirtualNetworkReference.class);
        Assertions.assertEquals(ManagedVirtualNetworkReferenceType.MANAGED_VIRTUAL_NETWORK_REFERENCE, model.type());
        Assertions.assertEquals("pzeqacdldtz", model.referenceName());
    }
}
