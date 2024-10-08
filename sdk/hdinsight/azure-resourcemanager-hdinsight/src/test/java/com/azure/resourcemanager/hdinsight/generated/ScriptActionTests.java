// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.ScriptAction;
import org.junit.jupiter.api.Assertions;

public final class ScriptActionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptAction model = BinaryData.fromString("{\"name\":\"rq\",\"uri\":\"b\",\"parameters\":\"oczvy\"}")
            .toObject(ScriptAction.class);
        Assertions.assertEquals("rq", model.name());
        Assertions.assertEquals("b", model.uri());
        Assertions.assertEquals("oczvy", model.parameters());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptAction model = new ScriptAction().withName("rq").withUri("b").withParameters("oczvy");
        model = BinaryData.fromObject(model).toObject(ScriptAction.class);
        Assertions.assertEquals("rq", model.name());
        Assertions.assertEquals("b", model.uri());
        Assertions.assertEquals("oczvy", model.parameters());
    }
}
