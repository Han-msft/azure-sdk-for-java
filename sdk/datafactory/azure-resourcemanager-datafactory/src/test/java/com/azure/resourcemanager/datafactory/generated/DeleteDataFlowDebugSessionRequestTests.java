// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DeleteDataFlowDebugSessionRequest;
import org.junit.jupiter.api.Assertions;

public final class DeleteDataFlowDebugSessionRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeleteDataFlowDebugSessionRequest model
            = BinaryData.fromString("{\"sessionId\":\"npdwr\"}").toObject(DeleteDataFlowDebugSessionRequest.class);
        Assertions.assertEquals("npdwr", model.sessionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeleteDataFlowDebugSessionRequest model = new DeleteDataFlowDebugSessionRequest().withSessionId("npdwr");
        model = BinaryData.fromObject(model).toObject(DeleteDataFlowDebugSessionRequest.class);
        Assertions.assertEquals("npdwr", model.sessionId());
    }
}
