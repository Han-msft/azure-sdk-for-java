// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.ClusterIdentity;
import com.azure.resourcemanager.hdinsight.models.ClusterPatchParameters;
import com.azure.resourcemanager.hdinsight.models.ResourceIdentityType;
import com.azure.resourcemanager.hdinsight.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPatchParameters model = BinaryData.fromString(
            "{\"tags\":{\"iplbpodxunkbebxm\":\"bogqxndlkzgxhu\",\"oievseotgqrlltm\":\"byyntwlrbqt\",\"jefuzmuvpbttdumo\":\"wlauwzizxbmpg\",\"xe\":\"p\"},\"identity\":{\"principalId\":\"zbtbhj\",\"tenantId\":\"lkfg\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"zfikd\":{\"principalId\":\"el\",\"clientId\":\"hsd\",\"tenantId\":\"t\"}}}}")
            .toObject(ClusterPatchParameters.class);
        Assertions.assertEquals("bogqxndlkzgxhu", model.tags().get("iplbpodxunkbebxm"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("t", model.identity().userAssignedIdentities().get("zfikd").tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPatchParameters model = new ClusterPatchParameters()
            .withTags(mapOf("iplbpodxunkbebxm", "bogqxndlkzgxhu", "oievseotgqrlltm", "byyntwlrbqt", "jefuzmuvpbttdumo",
                "wlauwzizxbmpg", "xe", "p"))
            .withIdentity(new ClusterIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(mapOf("zfikd", new UserAssignedIdentity().withTenantId("t"))));
        model = BinaryData.fromObject(model).toObject(ClusterPatchParameters.class);
        Assertions.assertEquals("bogqxndlkzgxhu", model.tags().get("iplbpodxunkbebxm"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("t", model.identity().userAssignedIdentities().get("zfikd").tenantId());
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
