// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.Transformation;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TransformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Transformation model = BinaryData.fromString(
            "{\"name\":\"i\",\"description\":\"cqibzj\",\"dataset\":{\"referenceName\":\"weebiphryv\",\"parameters\":{\"atjhdhzybspijhf\":\"dataqwoqs\",\"hsusmmor\":\"datazgdkkagvwu\",\"mriprlk\":\"datamzhwilzzhni\",\"cxiv\":\"dataneyttl\"}},\"linkedService\":{\"referenceName\":\"kutpu\",\"parameters\":{\"xynbpvzlqywa\":\"datawjfl\",\"njc\":\"datay\",\"u\":\"datahmocgjshg\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"wvixq\",\"datasetParameters\":\"datagljkybsj\",\"parameters\":{\"nrbctbhpjhxpcvrd\":\"datarvtz\",\"it\":\"datay\"},\"\":{\"zjahwriuomz\":\"dataqady\"}}}")
            .toObject(Transformation.class);
        Assertions.assertEquals("i", model.name());
        Assertions.assertEquals("cqibzj", model.description());
        Assertions.assertEquals("weebiphryv", model.dataset().referenceName());
        Assertions.assertEquals("kutpu", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("wvixq", model.flowlet().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Transformation model = new Transformation().withName("i")
            .withDescription("cqibzj")
            .withDataset(new DatasetReference().withReferenceName("weebiphryv")
                .withParameters(mapOf("atjhdhzybspijhf", "dataqwoqs", "hsusmmor", "datazgdkkagvwu", "mriprlk",
                    "datamzhwilzzhni", "cxiv", "dataneyttl")))
            .withLinkedService(new LinkedServiceReference().withReferenceName("kutpu")
                .withParameters(mapOf("xynbpvzlqywa", "datawjfl", "njc", "datay", "u", "datahmocgjshg")))
            .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                .withReferenceName("wvixq")
                .withDatasetParameters("datagljkybsj")
                .withParameters(mapOf("nrbctbhpjhxpcvrd", "datarvtz", "it", "datay"))
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(Transformation.class);
        Assertions.assertEquals("i", model.name());
        Assertions.assertEquals("cqibzj", model.description());
        Assertions.assertEquals("weebiphryv", model.dataset().referenceName());
        Assertions.assertEquals("kutpu", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("wvixq", model.flowlet().referenceName());
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
