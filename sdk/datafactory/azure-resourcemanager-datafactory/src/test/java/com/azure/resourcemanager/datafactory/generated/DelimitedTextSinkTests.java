// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DelimitedTextSink;
import com.azure.resourcemanager.datafactory.models.DelimitedTextWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class DelimitedTextSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DelimitedTextSink model = BinaryData.fromString(
            "{\"type\":\"DelimitedTextSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"dataewrb\",\"disableMetricsCollection\":\"dataj\",\"copyBehavior\":\"dataflqwqcxyiqppacji\",\"metadata\":[{\"name\":\"dataacy\",\"value\":\"datatkxeijzg\"},{\"name\":\"dataaaxttexaugojv\",\"value\":\"dataezrwboba\"},{\"name\":\"datantenhnqtvxghbehh\",\"value\":\"dataotqorrvwlce\"},{\"name\":\"datalyugzl\",\"value\":\"datajirj\"}],\"\":{\"gevjman\":\"datasyfdsgrtkevimru\",\"vtzdtwxfjlpkoc\":\"datarvvjoklb\",\"uvwlfzjrjgla\":\"dataexfmqfuflu\"}},\"formatSettings\":{\"type\":\"DelimitedTextWriteSettings\",\"quoteAllText\":\"datagzscgslwujk\",\"fileExtension\":\"dataytpmlrjn\",\"maxRowsPerFile\":\"datamodsytq\",\"fileNamePrefix\":\"dataatujphqvfxvv\",\"\":{\"pfnwdrmz\":\"dataghxoxwpiqkk\",\"khnrgmgnvc\":\"datamtsmeaciy\",\"bvlsnchy\":\"datasvidkzb\"}},\"writeBatchSize\":\"datafom\",\"writeBatchTimeout\":\"datakh\",\"sinkRetryCount\":\"datatecsmocqwey\",\"sinkRetryWait\":\"dataakettmfcxviwf\",\"maxConcurrentConnections\":\"datajxxbsafqiwldu\",\"disableMetricsCollection\":\"datasyjzdasgkfz\",\"\":{\"lbddlnzmff\":\"dataqomuzohnpkof\",\"junmgd\":\"datavowlammvazvwzien\",\"cuzvbreh\":\"dataxeivrhjxdnkgztf\",\"seiidfpwbybmxf\":\"datatqggzahngn\"}}")
            .toObject(DelimitedTextSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DelimitedTextSink model = new DelimitedTextSink().withWriteBatchSize("datafom")
            .withWriteBatchTimeout("datakh")
            .withSinkRetryCount("datatecsmocqwey")
            .withSinkRetryWait("dataakettmfcxviwf")
            .withMaxConcurrentConnections("datajxxbsafqiwldu")
            .withDisableMetricsCollection("datasyjzdasgkfz")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("dataewrb")
                .withDisableMetricsCollection("dataj")
                .withCopyBehavior("dataflqwqcxyiqppacji")
                .withMetadata(Arrays.asList(new MetadataItem().withName("dataacy").withValue("datatkxeijzg"),
                    new MetadataItem().withName("dataaaxttexaugojv").withValue("dataezrwboba"),
                    new MetadataItem().withName("datantenhnqtvxghbehh").withValue("dataotqorrvwlce"),
                    new MetadataItem().withName("datalyugzl").withValue("datajirj")))
                .withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
            .withFormatSettings(new DelimitedTextWriteSettings().withQuoteAllText("datagzscgslwujk")
                .withFileExtension("dataytpmlrjn")
                .withMaxRowsPerFile("datamodsytq")
                .withFileNamePrefix("dataatujphqvfxvv"));
        model = BinaryData.fromObject(model).toObject(DelimitedTextSink.class);
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
