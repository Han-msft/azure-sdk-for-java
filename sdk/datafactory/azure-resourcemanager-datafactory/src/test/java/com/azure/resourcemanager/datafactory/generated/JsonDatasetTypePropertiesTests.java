// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.JsonDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import java.util.HashMap;
import java.util.Map;

public final class JsonDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonDatasetTypeProperties model = BinaryData.fromString(
            "{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"datalfnisyxg\",\"fileName\":\"databmtredscnns\",\"\":{\"wtzqzcloyhy\":\"datayyuvtzrxzhclec\",\"wbyorjplbchych\":\"datapgidhzgyresgzsdt\",\"fbqvumkxqj\":\"datakvy\",\"t\":\"dataiuepmaxfnzlpqmp\"}},\"encodingName\":\"datafvulb\",\"compression\":{\"type\":\"datartux\",\"level\":\"datarhfcaeooifqdyw\",\"\":{\"corkfrocgbmxl\":\"dataobhahqmomf\",\"zezbjes\":\"dataj\"}}}")
            .toObject(JsonDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonDatasetTypeProperties model = new JsonDatasetTypeProperties()
            .withLocation(new DatasetLocation().withFolderPath("datalfnisyxg")
                .withFileName("databmtredscnns")
                .withAdditionalProperties(mapOf("type", "DatasetLocation")))
            .withEncodingName("datafvulb")
            .withCompression(new DatasetCompression().withType("datartux")
                .withLevel("datarhfcaeooifqdyw")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(JsonDatasetTypeProperties.class);
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
