// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.AutoscaleTimeAndCapacity;
import org.junit.jupiter.api.Assertions;

public final class AutoscaleTimeAndCapacityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutoscaleTimeAndCapacity model = BinaryData
            .fromString("{\"time\":\"sounqecanoaeu\",\"minInstanceCount\":453736827,\"maxInstanceCount\":2029190304}")
            .toObject(AutoscaleTimeAndCapacity.class);
        Assertions.assertEquals("sounqecanoaeu", model.time());
        Assertions.assertEquals(453736827, model.minInstanceCount());
        Assertions.assertEquals(2029190304, model.maxInstanceCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutoscaleTimeAndCapacity model = new AutoscaleTimeAndCapacity().withTime("sounqecanoaeu")
            .withMinInstanceCount(453736827)
            .withMaxInstanceCount(2029190304);
        model = BinaryData.fromObject(model).toObject(AutoscaleTimeAndCapacity.class);
        Assertions.assertEquals("sounqecanoaeu", model.time());
        Assertions.assertEquals(453736827, model.minInstanceCount());
        Assertions.assertEquals(2029190304, model.maxInstanceCount());
    }
}
