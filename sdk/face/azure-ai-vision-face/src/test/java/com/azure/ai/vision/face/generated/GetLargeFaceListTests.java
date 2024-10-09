// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.generated;

import com.azure.ai.vision.face.models.FaceRecognitionModel;
import com.azure.ai.vision.face.models.LargeFaceList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class GetLargeFaceListTests extends FaceAdministrationClientTestBase {
    @Test
    @Disabled
    public void testGetLargeFaceListTests() {
        // method invocation
        LargeFaceList response = largeFaceListClient.get(true);

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "name"
        Assertions.assertEquals("your_large_face_list_name", response.getName());
        // verify property "userData"
        Assertions.assertEquals("your_user_data", response.getUserData());
        // verify property "recognitionModel"
        Assertions.assertEquals(FaceRecognitionModel.RECOGNITION_01, response.getRecognitionModel());
        // verify property "largeFaceListId"
        Assertions.assertEquals("your_large_face_list_id", response.getLargeFaceListId());
    }
}
