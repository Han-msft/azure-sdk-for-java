// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.trustedsigning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.trustedsigning.models.RevokeCertificate;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class RevokeCertificateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RevokeCertificate model = BinaryData.fromString(
            "{\"serialNumber\":\"rtumkdosvq\",\"thumbprint\":\"hbmdgbbjfdd\",\"effectiveAt\":\"2021-09-14T17:27:38Z\",\"reason\":\"bmbexppbhtqqro\",\"remarks\":\"p\"}")
            .toObject(RevokeCertificate.class);
        Assertions.assertEquals("rtumkdosvq", model.serialNumber());
        Assertions.assertEquals("hbmdgbbjfdd", model.thumbprint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-14T17:27:38Z"), model.effectiveAt());
        Assertions.assertEquals("bmbexppbhtqqro", model.reason());
        Assertions.assertEquals("p", model.remarks());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RevokeCertificate model = new RevokeCertificate().withSerialNumber("rtumkdosvq")
            .withThumbprint("hbmdgbbjfdd")
            .withEffectiveAt(OffsetDateTime.parse("2021-09-14T17:27:38Z"))
            .withReason("bmbexppbhtqqro")
            .withRemarks("p");
        model = BinaryData.fromObject(model).toObject(RevokeCertificate.class);
        Assertions.assertEquals("rtumkdosvq", model.serialNumber());
        Assertions.assertEquals("hbmdgbbjfdd", model.thumbprint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-14T17:27:38Z"), model.effectiveAt());
        Assertions.assertEquals("bmbexppbhtqqro", model.reason());
        Assertions.assertEquals("p", model.remarks());
    }
}
