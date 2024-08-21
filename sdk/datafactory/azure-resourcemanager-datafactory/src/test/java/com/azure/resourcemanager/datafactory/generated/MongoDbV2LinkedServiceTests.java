// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.MongoDbV2LinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MongoDbV2LinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2LinkedService model = BinaryData.fromString(
            "{\"type\":\"MongoDbV2\",\"typeProperties\":{\"connectionString\":\"datasjwnwn\",\"database\":\"datad\"},\"version\":\"fgtmu\",\"connectVia\":{\"referenceName\":\"lhnxqvzzi\",\"parameters\":{\"eftugiwsvlf\":\"datafuwcajyezlkui\"}},\"description\":\"bpnrgnxwrfu\",\"parameters\":{\"qcjclvbqovkz\":{\"type\":\"Array\",\"defaultValue\":\"datafzuvuoxzy\"}},\"annotations\":[\"datatphnazpgv\",\"datacubxlmqh\",\"datadbqrlb\",\"datahzyfuupqkr\"],\"\":{\"vbkkgqf\":\"datajpc\",\"hw\":\"datawgphhpwx\",\"pxftyifadsliif\":\"datafqzwysmsqqmdajsq\",\"snxmfooin\":\"datarbsrpjspbi\"}}")
            .toObject(MongoDbV2LinkedService.class);
        Assertions.assertEquals("fgtmu", model.version());
        Assertions.assertEquals("lhnxqvzzi", model.connectVia().referenceName());
        Assertions.assertEquals("bpnrgnxwrfu", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("qcjclvbqovkz").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2LinkedService model = new MongoDbV2LinkedService().withVersion("fgtmu")
            .withConnectVia(new IntegrationRuntimeReference().withReferenceName("lhnxqvzzi")
                .withParameters(mapOf("eftugiwsvlf", "datafuwcajyezlkui")))
            .withDescription("bpnrgnxwrfu")
            .withParameters(mapOf("qcjclvbqovkz",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datafzuvuoxzy")))
            .withAnnotations(Arrays.asList("datatphnazpgv", "datacubxlmqh", "datadbqrlb", "datahzyfuupqkr"))
            .withConnectionString("datasjwnwn")
            .withDatabase("datad");
        model = BinaryData.fromObject(model).toObject(MongoDbV2LinkedService.class);
        Assertions.assertEquals("fgtmu", model.version());
        Assertions.assertEquals("lhnxqvzzi", model.connectVia().referenceName());
        Assertions.assertEquals("bpnrgnxwrfu", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("qcjclvbqovkz").type());
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
