// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SnowflakeImportCopyCommand;
import java.util.HashMap;
import java.util.Map;

public final class SnowflakeImportCopyCommandTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnowflakeImportCopyCommand model = BinaryData.fromString(
            "{\"type\":\"SnowflakeImportCopyCommand\",\"additionalCopyOptions\":{\"saqfnbxuw\":\"datahgyeoikxjpuwgg\"},\"additionalFormatOptions\":{\"egtsqzkzworuhhv\":\"databus\",\"bkgp\":\"dataeodcdjhf\",\"tyuvuzqtrfziub\":\"dataxusylgpznbklhw\"},\"storageIntegration\":\"datalvktjbmce\",\"\":{\"bwhjvonu\":\"dataukdawgz\",\"k\":\"datavygx\",\"jcjvdajxebm\":\"datatjoxocothsg\",\"nd\":\"dataiyrctfaabkukra\"}}")
            .toObject(SnowflakeImportCopyCommand.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnowflakeImportCopyCommand model
            = new SnowflakeImportCopyCommand().withAdditionalCopyOptions(mapOf("saqfnbxuw", "datahgyeoikxjpuwgg"))
                .withAdditionalFormatOptions(
                    mapOf("egtsqzkzworuhhv", "databus", "bkgp", "dataeodcdjhf", "tyuvuzqtrfziub", "dataxusylgpznbklhw"))
                .withStorageIntegration("datalvktjbmce");
        model = BinaryData.fromObject(model).toObject(SnowflakeImportCopyCommand.class);
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
