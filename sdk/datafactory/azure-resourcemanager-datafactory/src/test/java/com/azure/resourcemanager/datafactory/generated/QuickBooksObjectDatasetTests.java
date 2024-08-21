// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.QuickBooksObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class QuickBooksObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuickBooksObjectDataset model = BinaryData.fromString(
            "{\"type\":\"QuickBooksObject\",\"typeProperties\":{\"tableName\":\"datasyweohlmtsnvon\"},\"description\":\"ftswcd\",\"structure\":\"datanseptvdtic\",\"schema\":\"datafl\",\"linkedServiceName\":{\"referenceName\":\"zwkopxd\",\"parameters\":{\"kfzrxxf\":\"datawoqhgppwxn\",\"jzrfx\":\"dataduvqzjnnuww\"}},\"parameters\":{\"rxrjwyzrieitq\":{\"type\":\"Bool\",\"defaultValue\":\"dataqjkbkjc\"},\"pebfhlgeeh\":{\"type\":\"String\",\"defaultValue\":\"datauwtbdzqajxk\"}},\"annotations\":[\"datagplnl\",\"datarfe\",\"datazunbua\",\"datamoub\"],\"folder\":{\"name\":\"mi\"},\"\":{\"yt\":\"datarnobvvequ\"}}")
            .toObject(QuickBooksObjectDataset.class);
        Assertions.assertEquals("ftswcd", model.description());
        Assertions.assertEquals("zwkopxd", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("rxrjwyzrieitq").type());
        Assertions.assertEquals("mi", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuickBooksObjectDataset model = new QuickBooksObjectDataset().withDescription("ftswcd")
            .withStructure("datanseptvdtic")
            .withSchema("datafl")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("zwkopxd")
                .withParameters(mapOf("kfzrxxf", "datawoqhgppwxn", "jzrfx", "dataduvqzjnnuww")))
            .withParameters(mapOf("rxrjwyzrieitq",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataqjkbkjc"), "pebfhlgeeh",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datauwtbdzqajxk")))
            .withAnnotations(Arrays.asList("datagplnl", "datarfe", "datazunbua", "datamoub"))
            .withFolder(new DatasetFolder().withName("mi"))
            .withTableName("datasyweohlmtsnvon");
        model = BinaryData.fromObject(model).toObject(QuickBooksObjectDataset.class);
        Assertions.assertEquals("ftswcd", model.description());
        Assertions.assertEquals("zwkopxd", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("rxrjwyzrieitq").type());
        Assertions.assertEquals("mi", model.folder().name());
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
