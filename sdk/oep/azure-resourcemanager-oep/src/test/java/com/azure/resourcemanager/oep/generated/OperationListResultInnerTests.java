// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oep.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oep.fluent.models.OperationListResultInner;

public final class OperationListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"udccsnhsjc\",\"isDataAction\":false,\"display\":{\"provider\":\"kryhtnapczwlokj\",\"resource\":\"mkkvnip\",\"operation\":\"xzjnchgejs\",\"description\":\"dmailzydehojw\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"name\":\"npmqnjaqwixjspro\",\"isDataAction\":true,\"display\":{\"provider\":\"tegjvwmf\",\"resource\":\"t\",\"operation\":\"mdvpjhulsu\",\"description\":\"mkjozkrwf\"},\"origin\":\"system\",\"actionType\":\"Internal\"}],\"nextLink\":\"pslwejdpvw\"}")
            .toObject(OperationListResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResultInner model = new OperationListResultInner();
        model = BinaryData.fromObject(model).toObject(OperationListResultInner.class);
    }
}
