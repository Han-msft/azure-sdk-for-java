// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.StopHostsWhen;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ScalingPlanPooledSchedulesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"daysOfWeek\":[\"Wednesday\",\"Wednesday\"],\"rampUpStartTime\":{\"hour\":820394546,\"minute\":2117916425},\"rampUpLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampUpMinimumHostsPct\":420557504,\"rampUpCapacityThresholdPct\":1360307264,\"peakStartTime\":{\"hour\":521943782,\"minute\":630460158},\"peakLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampDownStartTime\":{\"hour\":296986917,\"minute\":1960012272},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":663204273,\"rampDownCapacityThresholdPct\":140049860,\"rampDownForceLogoffUsers\":false,\"rampDownStopHostsWhen\":\"ZeroActiveSessions\",\"rampDownWaitTimeMinutes\":1179154127,\"rampDownNotificationMessage\":\"gqkctotiowlxte\",\"offPeakStartTime\":{\"hour\":1865610143,\"minute\":234322459},\"offPeakLoadBalancingAlgorithm\":\"DepthFirst\"},\"id\":\"dtguk\",\"name\":\"anblwphqlkccu\",\"type\":\"gygqwah\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DesktopVirtualizationManager manager = DesktopVirtualizationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ScalingPlanPooledSchedule response = manager.scalingPlanPooledSchedules()
            .getWithResponse("ixkykxd", "sj", "emmucfxh", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(DayOfWeek.WEDNESDAY, response.daysOfWeek().get(0));
        Assertions.assertEquals(820394546, response.rampUpStartTime().hour());
        Assertions.assertEquals(2117916425, response.rampUpStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST,
            response.rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(420557504, response.rampUpMinimumHostsPct());
        Assertions.assertEquals(1360307264, response.rampUpCapacityThresholdPct());
        Assertions.assertEquals(521943782, response.peakStartTime().hour());
        Assertions.assertEquals(630460158, response.peakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST, response.peakLoadBalancingAlgorithm());
        Assertions.assertEquals(296986917, response.rampDownStartTime().hour());
        Assertions.assertEquals(1960012272, response.rampDownStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST,
            response.rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(663204273, response.rampDownMinimumHostsPct());
        Assertions.assertEquals(140049860, response.rampDownCapacityThresholdPct());
        Assertions.assertEquals(false, response.rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_ACTIVE_SESSIONS, response.rampDownStopHostsWhen());
        Assertions.assertEquals(1179154127, response.rampDownWaitTimeMinutes());
        Assertions.assertEquals("gqkctotiowlxte", response.rampDownNotificationMessage());
        Assertions.assertEquals(1865610143, response.offPeakStartTime().hour());
        Assertions.assertEquals(234322459, response.offPeakStartTime().minute());
        Assertions.assertEquals(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST,
            response.offPeakLoadBalancingAlgorithm());
    }
}
