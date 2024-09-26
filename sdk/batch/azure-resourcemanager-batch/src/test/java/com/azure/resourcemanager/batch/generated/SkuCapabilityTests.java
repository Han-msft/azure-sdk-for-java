// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.SkuCapability;

public final class SkuCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuCapability model = BinaryData.fromString("{\"name\":\"xaqwoochcbonqv\",\"value\":\"vlrxnjeaseiph\"}")
            .toObject(SkuCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuCapability model = new SkuCapability();
        model = BinaryData.fromObject(model).toObject(SkuCapability.class);
    }
}
