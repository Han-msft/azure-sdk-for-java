// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.DataAvailabilityStatus;
import com.azure.resourcemanager.machinelearning.models.FeaturesetVersionBackfillRequest;
import com.azure.resourcemanager.machinelearning.models.FeatureWindow;
import com.azure.resourcemanager.machinelearning.models.MaterializationComputeResource;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FeaturesetVersionBackfillRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FeaturesetVersionBackfillRequest model = BinaryData.fromString(
            "{\"displayName\":\"bwzohmnrxxbs\",\"description\":\"klinhmdptysprq\",\"featureWindow\":{\"featureWindowStart\":\"2021-03-17T04:51:43Z\",\"featureWindowEnd\":\"2021-09-05T11:06:21Z\"},\"dataAvailabilityStatus\":[\"Incomplete\",\"Incomplete\"],\"jobId\":\"vjgp\",\"tags\":{\"qvapcohhoucq\":\"fiqwoy\",\"jxcx\":\"q\",\"tzqdd\":\"rzdcgdzbenribcaw\",\"mzwcjjncqt\":\"jwfljhznamtua\"},\"resource\":{\"instanceType\":\"izvg\"},\"sparkConfiguration\":{\"ngrebwg\":\"tzuuvb\",\"x\":\"ahttzlswvajqfut\"},\"properties\":{\"aohcmbuocn\":\"zasunwqrjzfrgq\",\"hmbpyryxamebly\":\"r\",\"kmrocxne\":\"yvk\",\"mtodl\":\"v\"}}")
            .toObject(FeaturesetVersionBackfillRequest.class);
        Assertions.assertEquals("bwzohmnrxxbs", model.displayName());
        Assertions.assertEquals("klinhmdptysprq", model.description());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-17T04:51:43Z"),
            model.featureWindow().featureWindowStart());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-05T11:06:21Z"), model.featureWindow().featureWindowEnd());
        Assertions.assertEquals(DataAvailabilityStatus.INCOMPLETE, model.dataAvailabilityStatus().get(0));
        Assertions.assertEquals("vjgp", model.jobId());
        Assertions.assertEquals("fiqwoy", model.tags().get("qvapcohhoucq"));
        Assertions.assertEquals("izvg", model.resource().instanceType());
        Assertions.assertEquals("tzuuvb", model.sparkConfiguration().get("ngrebwg"));
        Assertions.assertEquals("zasunwqrjzfrgq", model.properties().get("aohcmbuocn"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FeaturesetVersionBackfillRequest model = new FeaturesetVersionBackfillRequest().withDisplayName("bwzohmnrxxbs")
            .withDescription("klinhmdptysprq")
            .withFeatureWindow(new FeatureWindow().withFeatureWindowStart(OffsetDateTime.parse("2021-03-17T04:51:43Z"))
                .withFeatureWindowEnd(OffsetDateTime.parse("2021-09-05T11:06:21Z")))
            .withDataAvailabilityStatus(
                Arrays.asList(DataAvailabilityStatus.INCOMPLETE, DataAvailabilityStatus.INCOMPLETE))
            .withJobId("vjgp")
            .withTags(mapOf("qvapcohhoucq", "fiqwoy", "jxcx", "q", "tzqdd", "rzdcgdzbenribcaw", "mzwcjjncqt",
                "jwfljhznamtua"))
            .withResource(new MaterializationComputeResource().withInstanceType("izvg"))
            .withSparkConfiguration(mapOf("ngrebwg", "tzuuvb", "x", "ahttzlswvajqfut"))
            .withProperties(
                mapOf("aohcmbuocn", "zasunwqrjzfrgq", "hmbpyryxamebly", "r", "kmrocxne", "yvk", "mtodl", "v"));
        model = BinaryData.fromObject(model).toObject(FeaturesetVersionBackfillRequest.class);
        Assertions.assertEquals("bwzohmnrxxbs", model.displayName());
        Assertions.assertEquals("klinhmdptysprq", model.description());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-17T04:51:43Z"),
            model.featureWindow().featureWindowStart());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-05T11:06:21Z"), model.featureWindow().featureWindowEnd());
        Assertions.assertEquals(DataAvailabilityStatus.INCOMPLETE, model.dataAvailabilityStatus().get(0));
        Assertions.assertEquals("vjgp", model.jobId());
        Assertions.assertEquals("fiqwoy", model.tags().get("qvapcohhoucq"));
        Assertions.assertEquals("izvg", model.resource().instanceType());
        Assertions.assertEquals("tzuuvb", model.sparkConfiguration().get("ngrebwg"));
        Assertions.assertEquals("zasunwqrjzfrgq", model.properties().get("aohcmbuocn"));
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
