// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.models.CurrentSpend;

public final class CurrentSpendTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CurrentSpend model = BinaryData.fromString("{\"unit\":\"hdzhlrqj\"}").toObject(CurrentSpend.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CurrentSpend model = new CurrentSpend();
        model = BinaryData.fromObject(model).toObject(CurrentSpend.class);
    }
}
