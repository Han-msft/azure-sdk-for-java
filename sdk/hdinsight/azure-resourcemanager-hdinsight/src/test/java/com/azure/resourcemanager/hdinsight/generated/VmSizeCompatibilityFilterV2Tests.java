// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.FilterMode;
import com.azure.resourcemanager.hdinsight.models.OSType;
import com.azure.resourcemanager.hdinsight.models.VmSizeCompatibilityFilterV2;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VmSizeCompatibilityFilterV2Tests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmSizeCompatibilityFilterV2 model = BinaryData.fromString(
            "{\"filterMode\":\"Recommend\",\"regions\":[\"jlpijnkrx\",\"rddh\",\"ratiz\"],\"clusterFlavors\":[\"nasx\",\"ft\",\"zq\"],\"nodeTypes\":[\"f\",\"wesgogczh\",\"nnxk\"],\"clusterVersions\":[\"nyhmossxkkgthr\",\"gh\",\"jbdhqxvc\"],\"osType\":[\"Windows\",\"Windows\",\"Linux\",\"Windows\"],\"vmSizes\":[\"bshrnsvbuswd\",\"z\",\"ybycnunvj\",\"rtkfawnopq\"],\"espApplied\":\"kyzirtxdyux\",\"computeIsolationSupported\":\"jntpsewgioilqu\"}")
            .toObject(VmSizeCompatibilityFilterV2.class);
        Assertions.assertEquals(FilterMode.RECOMMEND, model.filterMode());
        Assertions.assertEquals("jlpijnkrx", model.regions().get(0));
        Assertions.assertEquals("nasx", model.clusterFlavors().get(0));
        Assertions.assertEquals("f", model.nodeTypes().get(0));
        Assertions.assertEquals("nyhmossxkkgthr", model.clusterVersions().get(0));
        Assertions.assertEquals(OSType.WINDOWS, model.osType().get(0));
        Assertions.assertEquals("bshrnsvbuswd", model.vmSizes().get(0));
        Assertions.assertEquals("kyzirtxdyux", model.espApplied());
        Assertions.assertEquals("jntpsewgioilqu", model.computeIsolationSupported());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmSizeCompatibilityFilterV2 model = new VmSizeCompatibilityFilterV2().withFilterMode(FilterMode.RECOMMEND)
            .withRegions(Arrays.asList("jlpijnkrx", "rddh", "ratiz"))
            .withClusterFlavors(Arrays.asList("nasx", "ft", "zq"))
            .withNodeTypes(Arrays.asList("f", "wesgogczh", "nnxk"))
            .withClusterVersions(Arrays.asList("nyhmossxkkgthr", "gh", "jbdhqxvc"))
            .withOsType(Arrays.asList(OSType.WINDOWS, OSType.WINDOWS, OSType.LINUX, OSType.WINDOWS))
            .withVmSizes(Arrays.asList("bshrnsvbuswd", "z", "ybycnunvj", "rtkfawnopq"))
            .withEspApplied("kyzirtxdyux")
            .withComputeIsolationSupported("jntpsewgioilqu");
        model = BinaryData.fromObject(model).toObject(VmSizeCompatibilityFilterV2.class);
        Assertions.assertEquals(FilterMode.RECOMMEND, model.filterMode());
        Assertions.assertEquals("jlpijnkrx", model.regions().get(0));
        Assertions.assertEquals("nasx", model.clusterFlavors().get(0));
        Assertions.assertEquals("f", model.nodeTypes().get(0));
        Assertions.assertEquals("nyhmossxkkgthr", model.clusterVersions().get(0));
        Assertions.assertEquals(OSType.WINDOWS, model.osType().get(0));
        Assertions.assertEquals("bshrnsvbuswd", model.vmSizes().get(0));
        Assertions.assertEquals("kyzirtxdyux", model.espApplied());
        Assertions.assertEquals("jntpsewgioilqu", model.computeIsolationSupported());
    }
}
