// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyVirtualMachinePoolResourceInner;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolElasticityProfile;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceListResult;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceProperties;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StandbyVirtualMachinePoolResourceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyVirtualMachinePoolResourceListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":4988388139114001122},\"virtualMachineState\":\"Deallocated\",\"attachedVirtualMachineScaleSetId\":\"rljdouskcqv\",\"provisioningState\":\"Succeeded\"},\"location\":\"cjdkwtnhxbnjbi\",\"tags\":{\"nzl\":\"rglssainqpj\",\"pee\":\"jfm\",\"yqduujit\":\"vmgxsab\",\"rwpdappdsbdkvwrw\":\"jczdzevndh\"},\"id\":\"feusnhut\",\"name\":\"eltmrldhugjzzdat\",\"type\":\"xhocdgeablgphuti\"},{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":8186282377812445874},\"virtualMachineState\":\"Deallocated\",\"attachedVirtualMachineScaleSetId\":\"zwyiftyhxhur\",\"provisioningState\":\"Canceled\"},\"location\":\"yxolniwp\",\"tags\":{\"awxklr\":\"kjfkg\",\"ypnddhsgcb\":\"plwckbas\",\"jkot\":\"cph\",\"wyqkgfgibm\":\"nqgoulzndli\"},\"id\":\"dgak\",\"name\":\"qsrxybzqqed\",\"type\":\"ytb\"},{\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":5546315024826838939},\"virtualMachineState\":\"Running\",\"attachedVirtualMachineScaleSetId\":\"lmmnkzsmodmglo\",\"provisioningState\":\"Failed\"},\"location\":\"kwtmutduqktapspw\",\"tags\":{\"vqwhbmdgbbjfd\":\"ertumkdo\",\"q\":\"gmbmbexppbh\"},\"id\":\"rolfpfp\",\"name\":\"algbquxigjyjg\",\"type\":\"jaoyfhrtx\"}],\"nextLink\":\"n\"}")
            .toObject(StandbyVirtualMachinePoolResourceListResult.class);
        Assertions.assertEquals("cjdkwtnhxbnjbi", model.value().get(0).location());
        Assertions.assertEquals("rglssainqpj", model.value().get(0).tags().get("nzl"));
        Assertions.assertEquals(4988388139114001122L,
            model.value().get(0).properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.DEALLOCATED,
            model.value().get(0).properties().virtualMachineState());
        Assertions.assertEquals("rljdouskcqv", model.value().get(0).properties().attachedVirtualMachineScaleSetId());
        Assertions.assertEquals("n", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyVirtualMachinePoolResourceListResult model
            = new StandbyVirtualMachinePoolResourceListResult().withValue(Arrays
                .asList(
                    new StandbyVirtualMachinePoolResourceInner().withLocation("cjdkwtnhxbnjbi")
                        .withTags(mapOf("nzl", "rglssainqpj", "pee", "jfm", "yqduujit", "vmgxsab", "rwpdappdsbdkvwrw",
                            "jczdzevndh"))
                        .withProperties(new StandbyVirtualMachinePoolResourceProperties()
                            .withElasticityProfile(new StandbyVirtualMachinePoolElasticityProfile()
                                .withMaxReadyCapacity(4988388139114001122L))
                            .withVirtualMachineState(VirtualMachineState.DEALLOCATED)
                            .withAttachedVirtualMachineScaleSetId("rljdouskcqv")),
                    new StandbyVirtualMachinePoolResourceInner().withLocation("yxolniwp")
                        .withTags(mapOf("awxklr", "kjfkg", "ypnddhsgcb", "plwckbas", "jkot", "cph", "wyqkgfgibm",
                            "nqgoulzndli"))
                        .withProperties(new StandbyVirtualMachinePoolResourceProperties()
                            .withElasticityProfile(new StandbyVirtualMachinePoolElasticityProfile()
                                .withMaxReadyCapacity(8186282377812445874L))
                            .withVirtualMachineState(VirtualMachineState.DEALLOCATED)
                            .withAttachedVirtualMachineScaleSetId("zwyiftyhxhur")),
                    new StandbyVirtualMachinePoolResourceInner().withLocation("kwtmutduqktapspw")
                        .withTags(mapOf("vqwhbmdgbbjfd", "ertumkdo", "q", "gmbmbexppbh"))
                        .withProperties(new StandbyVirtualMachinePoolResourceProperties()
                            .withElasticityProfile(new StandbyVirtualMachinePoolElasticityProfile()
                                .withMaxReadyCapacity(5546315024826838939L))
                            .withVirtualMachineState(VirtualMachineState.RUNNING)
                            .withAttachedVirtualMachineScaleSetId("lmmnkzsmodmglo"))))
                .withNextLink("n");
        model = BinaryData.fromObject(model).toObject(StandbyVirtualMachinePoolResourceListResult.class);
        Assertions.assertEquals("cjdkwtnhxbnjbi", model.value().get(0).location());
        Assertions.assertEquals("rglssainqpj", model.value().get(0).tags().get("nzl"));
        Assertions.assertEquals(4988388139114001122L,
            model.value().get(0).properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.DEALLOCATED,
            model.value().get(0).properties().virtualMachineState());
        Assertions.assertEquals("rljdouskcqv", model.value().get(0).properties().attachedVirtualMachineScaleSetId());
        Assertions.assertEquals("n", model.nextLink());
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
