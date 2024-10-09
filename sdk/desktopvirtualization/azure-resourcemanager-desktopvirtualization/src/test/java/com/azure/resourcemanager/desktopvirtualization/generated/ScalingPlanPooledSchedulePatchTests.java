// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledSchedulePatch;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.StopHostsWhen;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScalingPlanPooledSchedulePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPlanPooledSchedulePatch model = BinaryData.fromString(
            "{\"properties\":{\"daysOfWeek\":[\"Saturday\",\"Friday\",\"Wednesday\"],\"rampUpStartTime\":{\"hour\":45872869,\"minute\":1362552050},\"rampUpLoadBalancingAlgorithm\":\"DepthFirst\",\"rampUpMinimumHostsPct\":25295953,\"rampUpCapacityThresholdPct\":104296969,\"peakStartTime\":{\"hour\":109250802,\"minute\":643648278},\"peakLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownStartTime\":{\"hour\":314739755,\"minute\":1952282875},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":2139040680,\"rampDownCapacityThresholdPct\":1504289199,\"rampDownForceLogoffUsers\":true,\"rampDownStopHostsWhen\":\"ZeroSessions\",\"rampDownWaitTimeMinutes\":131354519,\"rampDownNotificationMessage\":\"ixisxyawjoy\",\"offPeakStartTime\":{\"hour\":1772436776,\"minute\":21633228},\"offPeakLoadBalancingAlgorithm\":\"DepthFirst\"},\"id\":\"pkii\",\"name\":\"zyexzn\",\"type\":\"lixhnrztfol\"}")
            .toObject(ScalingPlanPooledSchedulePatch.class);
        Assertions.assertEquals(DayOfWeek.SATURDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(45872869, model.rampUpStartTime().hour());
        Assertions.assertEquals(1362552050, model.rampUpStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(25295953, model.rampUpMinimumHostsPct());
        Assertions.assertEquals(104296969, model.rampUpCapacityThresholdPct());
        Assertions.assertEquals(109250802, model.peakStartTime().hour());
        Assertions.assertEquals(643648278, model.peakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.peakLoadBalancingAlgorithm());
        Assertions.assertEquals(314739755, model.rampDownStartTime().hour());
        Assertions.assertEquals(1952282875, model.rampDownStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(2139040680, model.rampDownMinimumHostsPct());
        Assertions.assertEquals(1504289199, model.rampDownCapacityThresholdPct());
        Assertions.assertEquals(true, model.rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_SESSIONS, model.rampDownStopHostsWhen());
        Assertions.assertEquals(131354519, model.rampDownWaitTimeMinutes());
        Assertions.assertEquals("ixisxyawjoy", model.rampDownNotificationMessage());
        Assertions.assertEquals(1772436776, model.offPeakStartTime().hour());
        Assertions.assertEquals(21633228, model.offPeakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.offPeakLoadBalancingAlgorithm());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPlanPooledSchedulePatch model = new ScalingPlanPooledSchedulePatch()
            .withDaysOfWeek(Arrays.asList(DayOfWeek.SATURDAY, DayOfWeek.FRIDAY, DayOfWeek.WEDNESDAY))
            .withRampUpStartTime(new Time().withHour(45872869).withMinute(1362552050))
            .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
            .withRampUpMinimumHostsPct(25295953)
            .withRampUpCapacityThresholdPct(104296969)
            .withPeakStartTime(new Time().withHour(109250802).withMinute(643648278))
            .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
            .withRampDownStartTime(new Time().withHour(314739755).withMinute(1952282875))
            .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
            .withRampDownMinimumHostsPct(2139040680)
            .withRampDownCapacityThresholdPct(1504289199)
            .withRampDownForceLogoffUsers(true)
            .withRampDownStopHostsWhen(StopHostsWhen.ZERO_SESSIONS)
            .withRampDownWaitTimeMinutes(131354519)
            .withRampDownNotificationMessage("ixisxyawjoy")
            .withOffPeakStartTime(new Time().withHour(1772436776).withMinute(21633228))
            .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST);
        model = BinaryData.fromObject(model).toObject(ScalingPlanPooledSchedulePatch.class);
        Assertions.assertEquals(DayOfWeek.SATURDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(45872869, model.rampUpStartTime().hour());
        Assertions.assertEquals(1362552050, model.rampUpStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(25295953, model.rampUpMinimumHostsPct());
        Assertions.assertEquals(104296969, model.rampUpCapacityThresholdPct());
        Assertions.assertEquals(109250802, model.peakStartTime().hour());
        Assertions.assertEquals(643648278, model.peakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.peakLoadBalancingAlgorithm());
        Assertions.assertEquals(314739755, model.rampDownStartTime().hour());
        Assertions.assertEquals(1952282875, model.rampDownStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(2139040680, model.rampDownMinimumHostsPct());
        Assertions.assertEquals(1504289199, model.rampDownCapacityThresholdPct());
        Assertions.assertEquals(true, model.rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_SESSIONS, model.rampDownStopHostsWhen());
        Assertions.assertEquals(131354519, model.rampDownWaitTimeMinutes());
        Assertions.assertEquals("ixisxyawjoy", model.rampDownNotificationMessage());
        Assertions.assertEquals(1772436776, model.offPeakStartTime().hour());
        Assertions.assertEquals(21633228, model.offPeakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.offPeakLoadBalancingAlgorithm());
    }
}
