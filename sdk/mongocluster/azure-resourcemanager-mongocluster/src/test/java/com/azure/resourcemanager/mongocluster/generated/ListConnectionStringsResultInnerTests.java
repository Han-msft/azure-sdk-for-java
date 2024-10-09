// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.fluent.models.ListConnectionStringsResultInner;

public final class ListConnectionStringsResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListConnectionStringsResultInner model = BinaryData.fromString(
            "{\"connectionStrings\":[{\"connectionString\":\"qduujitcjczdz\",\"description\":\"ndhkrw\",\"name\":\"appd\"},{\"connectionString\":\"dkvwrwjfe\",\"description\":\"nhutjeltmrldhugj\",\"name\":\"datqxhocdgeabl\"},{\"connectionString\":\"huticndvkao\",\"description\":\"yiftyhxhuro\",\"name\":\"tyxolniwpwc\"}]}")
            .toObject(ListConnectionStringsResultInner.class);
    }
}
