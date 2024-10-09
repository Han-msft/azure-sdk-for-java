// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.edgeorder.models.ResourceProviderDetails;

public final class ResourceProviderDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderDetails model = BinaryData.fromString("{\"resourceProviderNamespace\":\"riwflzlfb\"}")
            .toObject(ResourceProviderDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderDetails model = new ResourceProviderDetails();
        model = BinaryData.fromObject(model).toObject(ResourceProviderDetails.class);
    }
}
