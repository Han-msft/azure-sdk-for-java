// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.OracleServiceCloudObjectDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OracleServiceCloudObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleServiceCloudObjectDataset model = BinaryData.fromString(
            "{\"type\":\"OracleServiceCloudObject\",\"typeProperties\":{\"tableName\":\"datakkv\"},\"description\":\"aehjjirvjq\",\"structure\":\"datavqmdmrac\",\"schema\":\"dataffdralihhs\",\"linkedServiceName\":{\"referenceName\":\"cygyzhcv\",\"parameters\":{\"dxrmyzvti\":\"datayrjl\"}},\"parameters\":{\"xoyjyhutwedigiv\":{\"type\":\"Float\",\"defaultValue\":\"datarubx\"},\"mcaxbqpmfhji\":{\"type\":\"Array\",\"defaultValue\":\"dataccxfnatn\"},\"lzvrchmy\":{\"type\":\"Array\",\"defaultValue\":\"datanbdqitghnm\"},\"h\":{\"type\":\"String\",\"defaultValue\":\"datarmwy\"}},\"annotations\":[\"dataplgqqqgrbr\",\"datahvipgt\"],\"folder\":{\"name\":\"aoylwhfm\"},\"\":{\"gypjixdmobadydw\":\"dataea\",\"wdvclsx\":\"datae\",\"xr\":\"dataqdchnzib\"}}")
            .toObject(OracleServiceCloudObjectDataset.class);
        Assertions.assertEquals("aehjjirvjq", model.description());
        Assertions.assertEquals("cygyzhcv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("xoyjyhutwedigiv").type());
        Assertions.assertEquals("aoylwhfm", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleServiceCloudObjectDataset model = new OracleServiceCloudObjectDataset().withDescription("aehjjirvjq")
            .withStructure("datavqmdmrac")
            .withSchema("dataffdralihhs")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("cygyzhcv")
                .withParameters(mapOf("dxrmyzvti", "datayrjl")))
            .withParameters(mapOf("xoyjyhutwedigiv",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datarubx"), "mcaxbqpmfhji",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("dataccxfnatn"), "lzvrchmy",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datanbdqitghnm"), "h",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datarmwy")))
            .withAnnotations(Arrays.asList("dataplgqqqgrbr", "datahvipgt"))
            .withFolder(new DatasetFolder().withName("aoylwhfm"))
            .withTableName("datakkv");
        model = BinaryData.fromObject(model).toObject(OracleServiceCloudObjectDataset.class);
        Assertions.assertEquals("aehjjirvjq", model.description());
        Assertions.assertEquals("cygyzhcv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("xoyjyhutwedigiv").type());
        Assertions.assertEquals("aoylwhfm", model.folder().name());
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
