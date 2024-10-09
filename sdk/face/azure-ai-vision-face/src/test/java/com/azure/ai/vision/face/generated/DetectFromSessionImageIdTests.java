// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.generated;

import com.azure.ai.vision.face.models.DetectFromSessionImageOptions;
import com.azure.ai.vision.face.models.FaceDetectionModel;
import com.azure.ai.vision.face.models.FaceDetectionResult;
import com.azure.ai.vision.face.models.FaceRecognitionModel;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class DetectFromSessionImageIdTests extends FaceAdministrationClientTestBase {
    @Test
    @Disabled
    public void testDetectFromSessionImageIdTests() {
        // method invocation
        List<FaceDetectionResult> response = faceSessionClient
            .detectFromSessionImage(new DetectFromSessionImageOptions("aa93ce80-9a9b-48bd-ae1a-1c7543841e92")
                .setDetectionModel(FaceDetectionModel.DETECTION_01)
                .setRecognitionModel(FaceRecognitionModel.RECOGNITION_03)
                .setReturnFaceId(true)
                .setReturnFaceAttributes(Arrays.asList())
                .setReturnFaceLandmarks(true)
                .setReturnRecognitionModel(true)
                .setFaceIdTimeToLive(60));
    }
}
