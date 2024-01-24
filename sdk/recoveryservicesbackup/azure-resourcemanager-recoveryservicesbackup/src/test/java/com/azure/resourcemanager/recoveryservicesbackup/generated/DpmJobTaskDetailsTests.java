// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class DpmJobTaskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DpmJobTaskDetails model = BinaryData.fromString(
            "{\"taskId\":\"jed\",\"startTime\":\"2021-07-02T03:11:42Z\",\"endTime\":\"2021-11-19T17:56:37Z\",\"duration\":\"PT45H23M33S\",\"status\":\"bcuiiz\"}")
            .toObject(DpmJobTaskDetails.class);
        Assertions.assertEquals("jed", model.taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-02T03:11:42Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-19T17:56:37Z"), model.endTime());
        Assertions.assertEquals(Duration.parse("PT45H23M33S"), model.duration());
        Assertions.assertEquals("bcuiiz", model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DpmJobTaskDetails model
            = new DpmJobTaskDetails().withTaskId("jed").withStartTime(OffsetDateTime.parse("2021-07-02T03:11:42Z"))
                .withEndTime(OffsetDateTime.parse("2021-11-19T17:56:37Z")).withDuration(Duration.parse("PT45H23M33S"))
                .withStatus("bcuiiz");
        model = BinaryData.fromObject(model).toObject(DpmJobTaskDetails.class);
        Assertions.assertEquals("jed", model.taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-02T03:11:42Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-19T17:56:37Z"), model.endTime());
        Assertions.assertEquals(Duration.parse("PT45H23M33S"), model.duration());
        Assertions.assertEquals("bcuiiz", model.status());
    }
}
