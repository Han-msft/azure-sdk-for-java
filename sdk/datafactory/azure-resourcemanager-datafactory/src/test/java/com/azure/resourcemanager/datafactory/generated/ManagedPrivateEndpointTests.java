// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ConnectionStateProperties;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpoint model = BinaryData.fromString(
            "{\"connectionState\":{\"actionsRequired\":\"nt\",\"description\":\"yjuzkdb\",\"status\":\"o\"},\"fqdns\":[\"zvhqjwtrhtgvg\"],\"groupId\":\"c\",\"isReserved\":true,\"privateLinkResourceId\":\"lawjmjsmwrok\",\"provisioningState\":\"xfzzzwyjafitlhgu\",\"\":{\"mltx\":\"datachl\",\"fpafolpymwamxq\":\"datawhmozusgzvlnsnnj\",\"gdphtvdula\":\"datarag\"}}")
            .toObject(ManagedPrivateEndpoint.class);
        Assertions.assertEquals("zvhqjwtrhtgvg", model.fqdns().get(0));
        Assertions.assertEquals("c", model.groupId());
        Assertions.assertEquals("lawjmjsmwrok", model.privateLinkResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpoint model = new ManagedPrivateEndpoint().withConnectionState(new ConnectionStateProperties())
            .withFqdns(Arrays.asList("zvhqjwtrhtgvg"))
            .withGroupId("c")
            .withPrivateLinkResourceId("lawjmjsmwrok")
            .withAdditionalProperties(mapOf("isReserved", true, "provisioningState", "xfzzzwyjafitlhgu"));
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpoint.class);
        Assertions.assertEquals("zvhqjwtrhtgvg", model.fqdns().get(0));
        Assertions.assertEquals("c", model.groupId());
        Assertions.assertEquals("lawjmjsmwrok", model.privateLinkResourceId());
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
