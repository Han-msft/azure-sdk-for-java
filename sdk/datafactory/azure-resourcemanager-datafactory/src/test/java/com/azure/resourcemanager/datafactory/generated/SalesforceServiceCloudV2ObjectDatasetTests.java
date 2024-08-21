// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudV2ObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SalesforceServiceCloudV2ObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudV2ObjectDataset model = BinaryData.fromString(
            "{\"type\":\"SalesforceServiceCloudV2Object\",\"typeProperties\":{\"objectApiName\":\"datazwncsjgfxvc\",\"reportId\":\"dataubyguq\"},\"description\":\"nmsvj\",\"structure\":\"datarpryyircbajxjr\",\"schema\":\"datayrkb\",\"linkedServiceName\":{\"referenceName\":\"atxkznlwlmbx\",\"parameters\":{\"kxiymzgrg\":\"dataevdayvx\",\"ybsps\":\"datajalrjwaezp\"}},\"parameters\":{\"suiwexpasckpg\":{\"type\":\"Bool\",\"defaultValue\":\"dataepzimfc\"},\"cmxtoejt\":{\"type\":\"Float\",\"defaultValue\":\"datayxbwslx\"},\"idkxz\":{\"type\":\"Int\",\"defaultValue\":\"datactm\"}},\"annotations\":[\"datauzntbpcadd\",\"datax\",\"datarxiperrplfm\",\"datavmjjfz\"],\"folder\":{\"name\":\"lbiqq\"},\"\":{\"symagbahdbtjmku\":\"datarxknfv\",\"bizrxhuq\":\"dataonrk\",\"cxgqtquirgopgza\":\"datavpanloqov\"}}")
            .toObject(SalesforceServiceCloudV2ObjectDataset.class);
        Assertions.assertEquals("nmsvj", model.description());
        Assertions.assertEquals("atxkznlwlmbx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("suiwexpasckpg").type());
        Assertions.assertEquals("lbiqq", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudV2ObjectDataset model = new SalesforceServiceCloudV2ObjectDataset()
            .withDescription("nmsvj")
            .withStructure("datarpryyircbajxjr")
            .withSchema("datayrkb")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("atxkznlwlmbx")
                .withParameters(mapOf("kxiymzgrg", "dataevdayvx", "ybsps", "datajalrjwaezp")))
            .withParameters(mapOf("suiwexpasckpg",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataepzimfc"), "cmxtoejt",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datayxbwslx"), "idkxz",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datactm")))
            .withAnnotations(Arrays.asList("datauzntbpcadd", "datax", "datarxiperrplfm", "datavmjjfz"))
            .withFolder(new DatasetFolder().withName("lbiqq"))
            .withObjectApiName("datazwncsjgfxvc")
            .withReportId("dataubyguq");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudV2ObjectDataset.class);
        Assertions.assertEquals("nmsvj", model.description());
        Assertions.assertEquals("atxkznlwlmbx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("suiwexpasckpg").type());
        Assertions.assertEquals("lbiqq", model.folder().name());
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
