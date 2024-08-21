// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import java.util.HashMap;
import java.util.Map;

public final class DatasetLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatasetLocation model = BinaryData.fromString(
            "{\"type\":\"DatasetLocation\",\"folderPath\":\"datadhgjnaqyqi\",\"fileName\":\"datalzmvcdsvmwbi\",\"\":{\"bxqichgybfzdqe\":\"datadtfobvfi\",\"ulrqtbht\":\"dataivycpzcvdi\"}}")
            .toObject(DatasetLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatasetLocation model = new DatasetLocation().withFolderPath("datadhgjnaqyqi")
            .withFileName("datalzmvcdsvmwbi")
            .withAdditionalProperties(mapOf("type", "DatasetLocation"));
        model = BinaryData.fromObject(model).toObject(DatasetLocation.class);
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
