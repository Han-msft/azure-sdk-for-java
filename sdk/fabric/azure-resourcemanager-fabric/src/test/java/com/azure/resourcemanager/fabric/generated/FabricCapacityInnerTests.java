// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.fabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fabric.fluent.models.FabricCapacityInner;
import com.azure.resourcemanager.fabric.models.CapacityAdministration;
import com.azure.resourcemanager.fabric.models.FabricCapacityProperties;
import com.azure.resourcemanager.fabric.models.RpSku;
import com.azure.resourcemanager.fabric.models.RpSkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FabricCapacityInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FabricCapacityInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Canceled\",\"state\":\"Provisioning\",\"administration\":{\"members\":[\"vgjxpybczm\"]}},\"sku\":{\"name\":\"hmtzopbsphrup\",\"tier\":\"Fabric\"},\"location\":\"sybbejhph\",\"tags\":{\"bmtqioq\":\"msxaobhd\",\"p\":\"zehtbmu\",\"hwlrx\":\"wnoi\"},\"id\":\"bqsoqijg\",\"name\":\"dmbpazlobcufpdz\",\"type\":\"rbt\"}")
            .toObject(FabricCapacityInner.class);
        Assertions.assertEquals("sybbejhph", model.location());
        Assertions.assertEquals("msxaobhd", model.tags().get("bmtqioq"));
        Assertions.assertEquals("vgjxpybczm", model.properties().administration().members().get(0));
        Assertions.assertEquals("hmtzopbsphrup", model.sku().name());
        Assertions.assertEquals(RpSkuTier.FABRIC, model.sku().tier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FabricCapacityInner model = new FabricCapacityInner().withLocation("sybbejhph")
            .withTags(mapOf("bmtqioq", "msxaobhd", "p", "zehtbmu", "hwlrx", "wnoi"))
            .withProperties(new FabricCapacityProperties()
                .withAdministration(new CapacityAdministration().withMembers(Arrays.asList("vgjxpybczm"))))
            .withSku(new RpSku().withName("hmtzopbsphrup").withTier(RpSkuTier.FABRIC));
        model = BinaryData.fromObject(model).toObject(FabricCapacityInner.class);
        Assertions.assertEquals("sybbejhph", model.location());
        Assertions.assertEquals("msxaobhd", model.tags().get("bmtqioq"));
        Assertions.assertEquals("vgjxpybczm", model.properties().administration().members().get(0));
        Assertions.assertEquals("hmtzopbsphrup", model.sku().name());
        Assertions.assertEquals(RpSkuTier.FABRIC, model.sku().tier());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
