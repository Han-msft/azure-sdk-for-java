// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.generated;

import com.azure.ai.vision.face.administration.FaceAdministrationClientBuilder;
import com.azure.ai.vision.face.administration.LargePersonGroupClient;
import com.azure.ai.vision.face.models.LargePersonGroup;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.util.List;

public class GetLargePersonGroups {
    public static void main(String[] args) {
        LargePersonGroupClient largePersonGroupClient
            = new FaceAdministrationClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
                .largeFaceListId(Configuration.getGlobalConfiguration().get("LARGEFACELISTID"))
                .largePersonGroupId(Configuration.getGlobalConfiguration().get("LARGEPERSONGROUPID"))
                .buildLargePersonGroupClient();
        // BEGIN:com.azure.ai.vision.face.generated.largepersongroupgetlargepersongroups.getlargepersongroups
        List<LargePersonGroup> response
            = largePersonGroupClient.getLargePersonGroups("00000000-0000-0000-0000-000000000000", 20, true);
        // END:com.azure.ai.vision.face.generated.largepersongroupgetlargepersongroups.getlargepersongroups
    }
}
