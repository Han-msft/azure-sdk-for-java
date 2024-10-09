// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.generated;

import com.azure.ai.vision.face.models.FaceTrainingResult;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class TrainLargePersonGroupTests extends FaceAdministrationClientTestBase {
    @Test
    @Disabled
    public void testTrainLargePersonGroupTests() {
        // method invocation
        SyncPoller<FaceTrainingResult, Void> response
            = setPlaybackSyncPollerPollInterval(largePersonGroupClient.beginTrain());

        // response assertion
        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED,
            response.waitForCompletion().getStatus());
    }
}
