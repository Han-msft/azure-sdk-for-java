// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face.generated;

import com.azure.ai.vision.face.models.LivenessSessionAuditEntry;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class GetLivenessSessionAuditEntriesTests extends FaceAdministrationClientTestBase {
    @Test
    @Disabled
    public void testGetLivenessSessionAuditEntriesTests() {
        // method invocation
        List<LivenessSessionAuditEntry> response
            = faceSessionClient.getLivenessSessionAuditEntries("b12e033e-bda7-4b83-a211-e721c661f30e", "0", 20);
    }
}
