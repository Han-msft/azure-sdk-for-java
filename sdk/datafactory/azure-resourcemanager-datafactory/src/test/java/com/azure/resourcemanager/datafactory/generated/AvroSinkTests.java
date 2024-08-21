// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AvroSink;
import com.azure.resourcemanager.datafactory.models.AvroWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AvroSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvroSink model = BinaryData.fromString(
            "{\"type\":\"AvroSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"datayxdigkggzm\",\"disableMetricsCollection\":\"dataqhqeosxdsxi\",\"copyBehavior\":\"datafiottdawgkaohh\",\"metadata\":[{\"name\":\"datahypidzjjjfcyskpn\",\"value\":\"dataxoic\"},{\"name\":\"datasmfvltbocqhv\",\"value\":\"datam\"}],\"\":{\"rcl\":\"datavgrigjegrlgkoqb\",\"uvybe\":\"datarrtfmf\"}},\"formatSettings\":{\"type\":\"AvroWriteSettings\",\"recordName\":\"amshqvku\",\"recordNamespace\":\"zvzqhvzjdsn\",\"maxRowsPerFile\":\"datadbeanigozjrcx\",\"fileNamePrefix\":\"dataugjalmzpfyl\",\"\":{\"dxcizropzgjle\":\"datawwvzn\",\"bhqkvbins\":\"datacf\"}},\"writeBatchSize\":\"dataw\",\"writeBatchTimeout\":\"dataegoupdqeflvd\",\"sinkRetryCount\":\"dataqcqlexobeekzy\",\"sinkRetryWait\":\"datapatwbbf\",\"maxConcurrentConnections\":\"dataflhnwohlc\",\"disableMetricsCollection\":\"datahfuydgdhitavga\",\"\":{\"zeebdefepwkhr\":\"datapzlcvibpd\",\"qvnlhsxea\":\"datazzwgbbozivfo\",\"km\":\"dataxsqquvvscb\",\"ibwuzvmorsyi\":\"datahdukprq\"}}")
            .toObject(AvroSink.class);
        Assertions.assertEquals("amshqvku", model.formatSettings().recordName());
        Assertions.assertEquals("zvzqhvzjdsn", model.formatSettings().recordNamespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvroSink model = new AvroSink().withWriteBatchSize("dataw")
            .withWriteBatchTimeout("dataegoupdqeflvd")
            .withSinkRetryCount("dataqcqlexobeekzy")
            .withSinkRetryWait("datapatwbbf")
            .withMaxConcurrentConnections("dataflhnwohlc")
            .withDisableMetricsCollection("datahfuydgdhitavga")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("datayxdigkggzm")
                .withDisableMetricsCollection("dataqhqeosxdsxi")
                .withCopyBehavior("datafiottdawgkaohh")
                .withMetadata(Arrays.asList(new MetadataItem().withName("datahypidzjjjfcyskpn").withValue("dataxoic"),
                    new MetadataItem().withName("datasmfvltbocqhv").withValue("datam")))
                .withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
            .withFormatSettings(new AvroWriteSettings().withRecordName("amshqvku")
                .withRecordNamespace("zvzqhvzjdsn")
                .withMaxRowsPerFile("datadbeanigozjrcx")
                .withFileNamePrefix("dataugjalmzpfyl"));
        model = BinaryData.fromObject(model).toObject(AvroSink.class);
        Assertions.assertEquals("amshqvku", model.formatSettings().recordName());
        Assertions.assertEquals("zvzqhvzjdsn", model.formatSettings().recordNamespace());
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
