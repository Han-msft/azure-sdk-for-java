// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FtpReadSettings;

public final class FtpReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FtpReadSettings model = BinaryData.fromString(
            "{\"type\":\"FtpReadSettings\",\"recursive\":\"datajtcpdtd\",\"wildcardFolderPath\":\"datay\",\"wildcardFileName\":\"datazbasjckaki\",\"enablePartitionDiscovery\":\"datakajmnvbigmn\",\"partitionRootPath\":\"dataqdyco\",\"deleteFilesAfterCompletion\":\"datagkxxpkl\",\"fileListPath\":\"datavbcgs\",\"useBinaryTransfer\":\"datadaypx\",\"disableChunking\":\"dataedftkigmj\",\"maxConcurrentConnections\":\"datattvzyvzixmu\",\"disableMetricsCollection\":\"dataidivbbrtzf\",\"\":{\"uc\":\"datantnoegxoq\",\"aiexisa\":\"dataidytw\",\"oukaffzzf\":\"dataygi\",\"orvigrxmptu\":\"dataivfiypfvwyzjsi\"}}")
            .toObject(FtpReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FtpReadSettings model = new FtpReadSettings().withMaxConcurrentConnections("datattvzyvzixmu")
            .withDisableMetricsCollection("dataidivbbrtzf")
            .withRecursive("datajtcpdtd")
            .withWildcardFolderPath("datay")
            .withWildcardFileName("datazbasjckaki")
            .withEnablePartitionDiscovery("datakajmnvbigmn")
            .withPartitionRootPath("dataqdyco")
            .withDeleteFilesAfterCompletion("datagkxxpkl")
            .withFileListPath("datavbcgs")
            .withUseBinaryTransfer("datadaypx")
            .withDisableChunking("dataedftkigmj");
        model = BinaryData.fromObject(model).toObject(FtpReadSettings.class);
    }
}
