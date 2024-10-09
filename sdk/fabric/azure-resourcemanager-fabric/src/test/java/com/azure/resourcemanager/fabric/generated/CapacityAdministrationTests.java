// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.fabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fabric.models.CapacityAdministration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CapacityAdministrationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapacityAdministration model = BinaryData.fromString("{\"members\":[\"jywif\",\"qes\",\"agdfmglzlh\"]}")
            .toObject(CapacityAdministration.class);
        Assertions.assertEquals("jywif", model.members().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapacityAdministration model
            = new CapacityAdministration().withMembers(Arrays.asList("jywif", "qes", "agdfmglzlh"));
        model = BinaryData.fromObject(model).toObject(CapacityAdministration.class);
        Assertions.assertEquals("jywif", model.members().get(0));
    }
}
