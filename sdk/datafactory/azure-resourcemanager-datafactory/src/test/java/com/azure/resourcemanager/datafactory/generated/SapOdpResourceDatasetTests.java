// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SapOdpResourceDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SapOdpResourceDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapOdpResourceDataset model = BinaryData.fromString(
            "{\"type\":\"SapOdpResource\",\"typeProperties\":{\"context\":\"datawuuqbmenxcqsxwc\",\"objectName\":\"dataykc\"},\"description\":\"dek\",\"structure\":\"datanjre\",\"schema\":\"dataptedeuenthshnfi\",\"linkedServiceName\":{\"referenceName\":\"gpgpkkhpjnglaqlm\",\"parameters\":{\"ecpvfpnrzikvo\":\"datamtrdlpxiww\",\"ivxdifbwblijhp\":\"dataloeohy\"}},\"parameters\":{\"xr\":{\"type\":\"SecureString\",\"defaultValue\":\"dataoyxontbwdq\"},\"fewxatktwjrppi\":{\"type\":\"String\",\"defaultValue\":\"dataqrrldxfua\"},\"jklwjp\":{\"type\":\"Array\",\"defaultValue\":\"datarqvelrmdcizhvksb\"}},\"annotations\":[\"datancw\",\"datasmpyeyzolbfnfly\"],\"folder\":{\"name\":\"uduiqoom\"},\"\":{\"liyznghuqzgp\":\"datakqwopws\",\"fy\":\"dataglkfvdwrgav\"}}")
            .toObject(SapOdpResourceDataset.class);
        Assertions.assertEquals("dek", model.description());
        Assertions.assertEquals("gpgpkkhpjnglaqlm", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("xr").type());
        Assertions.assertEquals("uduiqoom", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapOdpResourceDataset model = new SapOdpResourceDataset().withDescription("dek")
            .withStructure("datanjre")
            .withSchema("dataptedeuenthshnfi")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("gpgpkkhpjnglaqlm")
                .withParameters(mapOf("ecpvfpnrzikvo", "datamtrdlpxiww", "ivxdifbwblijhp", "dataloeohy")))
            .withParameters(mapOf("xr",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("dataoyxontbwdq"),
                "fewxatktwjrppi",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataqrrldxfua"), "jklwjp",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datarqvelrmdcizhvksb")))
            .withAnnotations(Arrays.asList("datancw", "datasmpyeyzolbfnfly"))
            .withFolder(new DatasetFolder().withName("uduiqoom"))
            .withContext("datawuuqbmenxcqsxwc")
            .withObjectName("dataykc");
        model = BinaryData.fromObject(model).toObject(SapOdpResourceDataset.class);
        Assertions.assertEquals("dek", model.description());
        Assertions.assertEquals("gpgpkkhpjnglaqlm", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("xr").type());
        Assertions.assertEquals("uduiqoom", model.folder().name());
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
