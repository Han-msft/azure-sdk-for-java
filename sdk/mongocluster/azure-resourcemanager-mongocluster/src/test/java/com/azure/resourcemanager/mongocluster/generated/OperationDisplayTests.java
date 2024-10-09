// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.models.OperationDisplay;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model = BinaryData.fromString(
            "{\"provider\":\"cdm\",\"resource\":\"rcryuanzwuxzdxta\",\"operation\":\"lhmwhfpmrqobm\",\"description\":\"kknryrtihf\"}")
            .toObject(OperationDisplay.class);
    }
}
