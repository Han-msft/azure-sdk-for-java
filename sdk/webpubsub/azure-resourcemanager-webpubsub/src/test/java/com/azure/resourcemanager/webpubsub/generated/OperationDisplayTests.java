// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model = BinaryData.fromString(
            "{\"provider\":\"ozkrwfndiodjpslw\",\"resource\":\"dpvwryoqpsoaccta\",\"operation\":\"kljla\",\"description\":\"cr\"}")
            .toObject(OperationDisplay.class);
        Assertions.assertEquals("ozkrwfndiodjpslw", model.provider());
        Assertions.assertEquals("dpvwryoqpsoaccta", model.resource());
        Assertions.assertEquals("kljla", model.operation());
        Assertions.assertEquals("cr", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model = new OperationDisplay().withProvider("ozkrwfndiodjpslw")
            .withResource("dpvwryoqpsoaccta")
            .withOperation("kljla")
            .withDescription("cr");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("ozkrwfndiodjpslw", model.provider());
        Assertions.assertEquals("dpvwryoqpsoaccta", model.resource());
        Assertions.assertEquals("kljla", model.operation());
        Assertions.assertEquals("cr", model.description());
    }
}
