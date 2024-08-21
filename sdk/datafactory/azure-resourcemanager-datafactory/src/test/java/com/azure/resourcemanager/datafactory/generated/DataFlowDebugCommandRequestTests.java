// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugCommandPayload;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugCommandRequest;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugCommandType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DataFlowDebugCommandRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowDebugCommandRequest model = BinaryData.fromString(
            "{\"sessionId\":\"afgfugsnn\",\"command\":\"executeExpressionQuery\",\"commandPayload\":{\"streamName\":\"tefypococtfjgti\",\"rowLimits\":1163986546,\"columns\":[\"uyturml\"],\"expression\":\"owolbaui\"}}")
            .toObject(DataFlowDebugCommandRequest.class);
        Assertions.assertEquals("afgfugsnn", model.sessionId());
        Assertions.assertEquals(DataFlowDebugCommandType.EXECUTE_EXPRESSION_QUERY, model.command());
        Assertions.assertEquals("tefypococtfjgti", model.commandPayload().streamName());
        Assertions.assertEquals(1163986546, model.commandPayload().rowLimits());
        Assertions.assertEquals("uyturml", model.commandPayload().columns().get(0));
        Assertions.assertEquals("owolbaui", model.commandPayload().expression());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowDebugCommandRequest model = new DataFlowDebugCommandRequest().withSessionId("afgfugsnn")
            .withCommand(DataFlowDebugCommandType.EXECUTE_EXPRESSION_QUERY)
            .withCommandPayload(new DataFlowDebugCommandPayload().withStreamName("tefypococtfjgti")
                .withRowLimits(1163986546)
                .withColumns(Arrays.asList("uyturml"))
                .withExpression("owolbaui"));
        model = BinaryData.fromObject(model).toObject(DataFlowDebugCommandRequest.class);
        Assertions.assertEquals("afgfugsnn", model.sessionId());
        Assertions.assertEquals(DataFlowDebugCommandType.EXECUTE_EXPRESSION_QUERY, model.command());
        Assertions.assertEquals("tefypococtfjgti", model.commandPayload().streamName());
        Assertions.assertEquals(1163986546, model.commandPayload().rowLimits());
        Assertions.assertEquals("uyturml", model.commandPayload().columns().get(0));
        Assertions.assertEquals("owolbaui", model.commandPayload().expression());
    }
}
