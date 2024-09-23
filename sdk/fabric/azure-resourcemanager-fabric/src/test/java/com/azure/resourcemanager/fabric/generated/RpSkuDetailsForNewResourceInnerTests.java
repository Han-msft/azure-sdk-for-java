// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.fabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fabric.fluent.models.RpSkuDetailsForNewResourceInner;
import org.junit.jupiter.api.Assertions;

public final class RpSkuDetailsForNewResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RpSkuDetailsForNewResourceInner model = BinaryData.fromString(
            "{\"resourceType\":\"gakeqsr\",\"name\":\"yb\",\"locations\":[\"qedqytbciqfoufl\",\"mnkzsmod\",\"glougpbk\",\"tmut\"]}")
            .toObject(RpSkuDetailsForNewResourceInner.class);
        Assertions.assertEquals("gakeqsr", model.resourceType());
        Assertions.assertEquals("yb", model.name());
        Assertions.assertEquals("qedqytbciqfoufl", model.locations().get(0));
    }
}
