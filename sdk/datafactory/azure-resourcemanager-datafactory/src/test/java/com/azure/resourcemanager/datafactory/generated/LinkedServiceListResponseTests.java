// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.LinkedServiceResourceInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.azure.resourcemanager.datafactory.models.LinkedServiceListResponse;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LinkedServiceListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinkedServiceListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"type\":\"LinkedService\",\"version\":\"o\",\"connectVia\":{\"referenceName\":\"bnxknalaulppg\",\"parameters\":{\"igvpgylg\":\"datapnapnyiropuh\",\"medjvcslynqwwncw\":\"datagit\",\"pkteo\":\"datazhxgktrmgucn\",\"pfqbuaceopzf\":\"datallwptfdy\"}},\"description\":\"hhuao\",\"parameters\":{\"lzdahzxctobgbkdm\":{\"type\":\"SecureString\",\"defaultValue\":\"dataeqx\"},\"qjhhkxbpv\":{\"type\":\"String\",\"defaultValue\":\"datapostmgrcfbunrm\"}},\"annotations\":[\"datajhxxjyn\"],\"\":{\"xqzvszjfa\":\"dataivkrtsw\",\"ivetvtcq\":\"datavjfdx\"}},\"name\":\"tdo\",\"type\":\"cbxvwvxyslqbh\",\"etag\":\"xoblytkbl\",\"id\":\"ewwwfbkrvrnsv\"},{\"properties\":{\"type\":\"LinkedService\",\"version\":\"q\",\"connectVia\":{\"referenceName\":\"hxcr\",\"parameters\":{\"cgjbirxbp\":\"dataovasrruvwbhsqfsu\",\"dtws\":\"databsrfbj\"}},\"description\":\"t\",\"parameters\":{\"mqtaruoujmkcjh\":{\"type\":\"String\",\"defaultValue\":\"datazbexilzznfqqnvw\"},\"ervnaenqpehi\":{\"type\":\"Array\",\"defaultValue\":\"datatjrybnwjewgdr\"}},\"annotations\":[\"dataygmi\",\"datathnzd\"],\"\":{\"nayqi\":\"datal\"}},\"name\":\"nduhavhqlkthum\",\"type\":\"olbgycduiertgccy\",\"etag\":\"aolps\",\"id\":\"qlfmmdnbb\"}],\"nextLink\":\"zpswiydmc\"}")
            .toObject(LinkedServiceListResponse.class);
        Assertions.assertEquals("ewwwfbkrvrnsv", model.value().get(0).id());
        Assertions.assertEquals("o", model.value().get(0).properties().version());
        Assertions.assertEquals("bnxknalaulppg", model.value().get(0).properties().connectVia().referenceName());
        Assertions.assertEquals("hhuao", model.value().get(0).properties().description());
        Assertions.assertEquals(ParameterType.SECURE_STRING,
            model.value().get(0).properties().parameters().get("lzdahzxctobgbkdm").type());
        Assertions.assertEquals("zpswiydmc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinkedServiceListResponse model = new LinkedServiceListResponse().withValue(Arrays.asList(
            new LinkedServiceResourceInner().withId("ewwwfbkrvrnsv")
                .withProperties(new LinkedService().withVersion("o")
                    .withConnectVia(new IntegrationRuntimeReference().withReferenceName("bnxknalaulppg")
                        .withParameters(mapOf("igvpgylg", "datapnapnyiropuh", "medjvcslynqwwncw", "datagit", "pkteo",
                            "datazhxgktrmgucn", "pfqbuaceopzf", "datallwptfdy")))
                    .withDescription("hhuao")
                    .withParameters(mapOf("lzdahzxctobgbkdm",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("dataeqx"),
                        "qjhhkxbpv",
                        new ParameterSpecification().withType(ParameterType.STRING)
                            .withDefaultValue("datapostmgrcfbunrm")))
                    .withAnnotations(Arrays.asList("datajhxxjyn"))
                    .withAdditionalProperties(mapOf("type", "LinkedService"))),
            new LinkedServiceResourceInner().withId("qlfmmdnbb")
                .withProperties(new LinkedService().withVersion("q")
                    .withConnectVia(new IntegrationRuntimeReference().withReferenceName("hxcr")
                        .withParameters(mapOf("cgjbirxbp", "dataovasrruvwbhsqfsu", "dtws", "databsrfbj")))
                    .withDescription("t")
                    .withParameters(mapOf("mqtaruoujmkcjh",
                        new ParameterSpecification().withType(ParameterType.STRING)
                            .withDefaultValue("datazbexilzznfqqnvw"),
                        "ervnaenqpehi",
                        new ParameterSpecification().withType(ParameterType.ARRAY)
                            .withDefaultValue("datatjrybnwjewgdr")))
                    .withAnnotations(Arrays.asList("dataygmi", "datathnzd"))
                    .withAdditionalProperties(mapOf("type", "LinkedService")))))
            .withNextLink("zpswiydmc");
        model = BinaryData.fromObject(model).toObject(LinkedServiceListResponse.class);
        Assertions.assertEquals("ewwwfbkrvrnsv", model.value().get(0).id());
        Assertions.assertEquals("o", model.value().get(0).properties().version());
        Assertions.assertEquals("bnxknalaulppg", model.value().get(0).properties().connectVia().referenceName());
        Assertions.assertEquals("hhuao", model.value().get(0).properties().description());
        Assertions.assertEquals(ParameterType.SECURE_STRING,
            model.value().get(0).properties().parameters().get("lzdahzxctobgbkdm").type());
        Assertions.assertEquals("zpswiydmc", model.nextLink());
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
