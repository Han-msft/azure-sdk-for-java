// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicelinker.models.DryrunParameters;
import com.azure.resourcemanager.servicelinker.models.DryrunPatch;

public final class DryrunPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DryrunPatch model = BinaryData.fromString(
            "{\"properties\":{\"parameters\":{\"actionName\":\"DryrunParameters\"},\"prerequisiteResults\":[{\"type\":\"DryrunPrerequisiteResult\"},{\"type\":\"DryrunPrerequisiteResult\"}],\"operationPreviews\":[{\"name\":\"ypl\",\"operationType\":\"configAuth\",\"description\":\"asy\",\"action\":\"nddhsgcbacph\",\"scope\":\"koty\"},{\"name\":\"gou\",\"operationType\":\"configAuth\",\"description\":\"likwyqkgfgib\",\"action\":\"dgak\",\"scope\":\"s\"},{\"name\":\"yb\",\"operationType\":\"configAuth\",\"description\":\"dqytbciqfouflmm\",\"action\":\"zsm\",\"scope\":\"mglougpbkw\"},{\"name\":\"utduqktapspwgcu\",\"operationType\":\"configConnection\",\"description\":\"mkdo\",\"action\":\"qw\",\"scope\":\"mdgbbjfdd\"}],\"provisioningState\":\"bmbexppbhtqqro\"}}")
            .toObject(DryrunPatch.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DryrunPatch model = new DryrunPatch().withParameters(new DryrunParameters());
        model = BinaryData.fromObject(model).toObject(DryrunPatch.class);
    }
}
