// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FactoryIdentity;
import com.azure.resourcemanager.datafactory.models.FactoryIdentityType;
import com.azure.resourcemanager.datafactory.models.FactoryUpdateParameters;
import com.azure.resourcemanager.datafactory.models.PublicNetworkAccess;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FactoryUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FactoryUpdateParameters model = BinaryData.fromString(
            "{\"tags\":{\"bldngkpoc\":\"kouknvudwtiu\",\"npiucgygevqznty\":\"pazyxoegukg\"},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"391bb545-7add-41eb-9096-adaac7584b75\",\"tenantId\":\"6000084f-18a3-4c0c-b65d-eee9126178b4\",\"userAssignedIdentities\":{\"r\":\"datac\",\"dpydn\":\"dataj\",\"sjttgzfbish\":\"datayhxdeoejzicwi\",\"jdeyeamdpha\":\"databkh\"}},\"properties\":{\"publicNetworkAccess\":\"Disabled\"}}")
            .toObject(FactoryUpdateParameters.class);
        Assertions.assertEquals("kouknvudwtiu", model.tags().get("bldngkpoc"));
        Assertions.assertEquals(FactoryIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FactoryUpdateParameters model = new FactoryUpdateParameters()
            .withTags(mapOf("bldngkpoc", "kouknvudwtiu", "npiucgygevqznty", "pazyxoegukg"))
            .withIdentity(new FactoryIdentity().withType(FactoryIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(mapOf("r", "datac", "dpydn", "dataj", "sjttgzfbish", "datayhxdeoejzicwi",
                    "jdeyeamdpha", "databkh")))
            .withPublicNetworkAccess(PublicNetworkAccess.DISABLED);
        model = BinaryData.fromObject(model).toObject(FactoryUpdateParameters.class);
        Assertions.assertEquals("kouknvudwtiu", model.tags().get("bldngkpoc"));
        Assertions.assertEquals(FactoryIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
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
