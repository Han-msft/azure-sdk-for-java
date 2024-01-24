// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.JobResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.Job;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class JobResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"jobType\":\"Job\",\"entityFriendlyName\":\"iotwmcdytdxwit\",\"backupManagementType\":\"Invalid\",\"operation\":\"awgqwgxhni\",\"status\":\"x\",\"startTime\":\"2021-09-13T09:37:01Z\",\"endTime\":\"2021-04-10T12:35:25Z\",\"activityId\":\"gklwn\"},\"eTag\":\"hjdauwhvylwz\",\"location\":\"tdhxujznbmpowuwp\",\"tags\":{\"alupjm\":\"lve\",\"iplrbpbewtghfgb\":\"hfxobbcswsrtj\",\"wxzvlvqhjkb\":\"c\",\"iebwwaloayqcgwrt\":\"gibtnm\"},\"id\":\"j\",\"name\":\"zg\",\"type\":\"yzm\"}")
            .toObject(JobResourceInner.class);
        Assertions.assertEquals("tdhxujznbmpowuwp", model.location());
        Assertions.assertEquals("lve", model.tags().get("alupjm"));
        Assertions.assertEquals("iotwmcdytdxwit", model.properties().entityFriendlyName());
        Assertions.assertEquals(BackupManagementType.INVALID, model.properties().backupManagementType());
        Assertions.assertEquals("awgqwgxhni", model.properties().operation());
        Assertions.assertEquals("x", model.properties().status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-13T09:37:01Z"), model.properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-10T12:35:25Z"), model.properties().endTime());
        Assertions.assertEquals("gklwn", model.properties().activityId());
        Assertions.assertEquals("hjdauwhvylwz", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobResourceInner model = new JobResourceInner().withLocation("tdhxujznbmpowuwp")
            .withTags(mapOf("alupjm", "lve", "iplrbpbewtghfgb", "hfxobbcswsrtj", "wxzvlvqhjkb", "c", "iebwwaloayqcgwrt",
                "gibtnm"))
            .withProperties(new Job().withEntityFriendlyName("iotwmcdytdxwit")
                .withBackupManagementType(BackupManagementType.INVALID).withOperation("awgqwgxhni").withStatus("x")
                .withStartTime(OffsetDateTime.parse("2021-09-13T09:37:01Z"))
                .withEndTime(OffsetDateTime.parse("2021-04-10T12:35:25Z")).withActivityId("gklwn"))
            .withEtag("hjdauwhvylwz");
        model = BinaryData.fromObject(model).toObject(JobResourceInner.class);
        Assertions.assertEquals("tdhxujznbmpowuwp", model.location());
        Assertions.assertEquals("lve", model.tags().get("alupjm"));
        Assertions.assertEquals("iotwmcdytdxwit", model.properties().entityFriendlyName());
        Assertions.assertEquals(BackupManagementType.INVALID, model.properties().backupManagementType());
        Assertions.assertEquals("awgqwgxhni", model.properties().operation());
        Assertions.assertEquals("x", model.properties().status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-13T09:37:01Z"), model.properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-10T12:35:25Z"), model.properties().endTime());
        Assertions.assertEquals("gklwn", model.properties().activityId());
        Assertions.assertEquals("hjdauwhvylwz", model.etag());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
