// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.Office365Dataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class Office365DatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Office365Dataset model = BinaryData.fromString(
            "{\"type\":\"Office365Table\",\"typeProperties\":{\"tableName\":\"datauynf\",\"predicate\":\"datayvnhiysdhor\"},\"description\":\"lhr\",\"structure\":\"datakiwlwkfflaqwmwq\",\"schema\":\"datauf\",\"linkedServiceName\":{\"referenceName\":\"tea\",\"parameters\":{\"njtqbg\":\"datagefzj\",\"dbtqyh\":\"datasibthnvxwtdqtcb\"}},\"parameters\":{\"voawhgj\":{\"type\":\"Object\",\"defaultValue\":\"dataaujqgbbjv\"},\"he\":{\"type\":\"Bool\",\"defaultValue\":\"datacsloygsabdg\"},\"uyxtrvfdbqs\":{\"type\":\"Float\",\"defaultValue\":\"datasdunrkzvzuatqhg\"},\"avdhpiw\":{\"type\":\"String\",\"defaultValue\":\"datajbvitptpvsf\"}},\"annotations\":[\"datawkgjwb\",\"datafdwfbwxy\",\"datadqtmggcpdrmeg\",\"datajrzctwymz\"],\"folder\":{\"name\":\"qkkge\"},\"\":{\"lcaxsqcomjiqi\":\"dataphgliupqscoobk\",\"ziizmeqmdu\":\"datancevxxkdevpxi\"}}")
            .toObject(Office365Dataset.class);
        Assertions.assertEquals("lhr", model.description());
        Assertions.assertEquals("tea", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("voawhgj").type());
        Assertions.assertEquals("qkkge", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Office365Dataset model = new Office365Dataset().withDescription("lhr")
            .withStructure("datakiwlwkfflaqwmwq")
            .withSchema("datauf")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("tea")
                .withParameters(mapOf("njtqbg", "datagefzj", "dbtqyh", "datasibthnvxwtdqtcb")))
            .withParameters(mapOf("voawhgj",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("dataaujqgbbjv"), "he",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datacsloygsabdg"),
                "uyxtrvfdbqs",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datasdunrkzvzuatqhg"),
                "avdhpiw",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datajbvitptpvsf")))
            .withAnnotations(Arrays.asList("datawkgjwb", "datafdwfbwxy", "datadqtmggcpdrmeg", "datajrzctwymz"))
            .withFolder(new DatasetFolder().withName("qkkge"))
            .withTableName("datauynf")
            .withPredicate("datayvnhiysdhor");
        model = BinaryData.fromObject(model).toObject(Office365Dataset.class);
        Assertions.assertEquals("lhr", model.description());
        Assertions.assertEquals("tea", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("voawhgj").type());
        Assertions.assertEquals("qkkge", model.folder().name());
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
