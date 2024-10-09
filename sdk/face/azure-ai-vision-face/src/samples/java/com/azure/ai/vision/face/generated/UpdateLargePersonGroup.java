// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.generated;

import com.azure.ai.vision.face.administration.FaceAdministrationClientBuilder;
import com.azure.ai.vision.face.administration.LargePersonGroupClient;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class UpdateLargePersonGroup {
    public static void main(String[] args) {
        LargePersonGroupClient largePersonGroupClient
            = new FaceAdministrationClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .largePersonGroupId("your_large_person_group_id")
                .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
                .largeFaceListId(Configuration.getGlobalConfiguration().get("LARGEFACELISTID"))
                .buildLargePersonGroupClient();
        // BEGIN:com.azure.ai.vision.face.generated.largepersongroupupdate.updatelargepersongroup
        largePersonGroupClient.update("your_large_person_group_name", "your_user_data");
        // END:com.azure.ai.vision.face.generated.largepersongroupupdate.updatelargepersongroup
    }
}
