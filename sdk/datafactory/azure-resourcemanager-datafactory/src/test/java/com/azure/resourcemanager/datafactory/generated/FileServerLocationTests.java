// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileServerLocation;

public final class FileServerLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileServerLocation model = BinaryData.fromString(
            "{\"type\":\"FileServerLocation\",\"folderPath\":\"datapxmib\",\"fileName\":\"datanupoyryefqmwovyz\",\"\":{\"kutnjillukkrehy\":\"datanomfpbjceegvyiez\",\"xfaryrvj\":\"datatmjoduifvu\"}}")
            .toObject(FileServerLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileServerLocation model
            = new FileServerLocation().withFolderPath("datapxmib").withFileName("datanupoyryefqmwovyz");
        model = BinaryData.fromObject(model).toObject(FileServerLocation.class);
    }
}
