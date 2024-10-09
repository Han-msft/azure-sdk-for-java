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
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPersonalSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHandlingOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SetStartVMOnConnect;
import com.azure.resourcemanager.desktopvirtualization.models.StartupBehavior;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ScalingPlanPersonalSchedulesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"daysOfWeek\":[\"Thursday\",\"Friday\",\"Thursday\",\"Wednesday\"],\"rampUpStartTime\":{\"hour\":1304447311,\"minute\":718390639},\"rampUpAutoStartHosts\":\"All\",\"rampUpStartVMOnConnect\":\"Enable\",\"rampUpActionOnDisconnect\":\"Hibernate\",\"rampUpMinutesToWaitOnDisconnect\":1691318308,\"rampUpActionOnLogoff\":\"Hibernate\",\"rampUpMinutesToWaitOnLogoff\":355623092,\"peakStartTime\":{\"hour\":143922465,\"minute\":1101353538},\"peakStartVMOnConnect\":\"Enable\",\"peakActionOnDisconnect\":\"Deallocate\",\"peakMinutesToWaitOnDisconnect\":2104491949,\"peakActionOnLogoff\":\"None\",\"peakMinutesToWaitOnLogoff\":834790015,\"rampDownStartTime\":{\"hour\":755029786,\"minute\":862092448},\"rampDownStartVMOnConnect\":\"Enable\",\"rampDownActionOnDisconnect\":\"None\",\"rampDownMinutesToWaitOnDisconnect\":36520302,\"rampDownActionOnLogoff\":\"None\",\"rampDownMinutesToWaitOnLogoff\":536933568,\"offPeakStartTime\":{\"hour\":2089748283,\"minute\":1377606972},\"offPeakStartVMOnConnect\":\"Disable\",\"offPeakActionOnDisconnect\":\"Deallocate\",\"offPeakMinutesToWaitOnDisconnect\":203587565,\"offPeakActionOnLogoff\":\"Deallocate\",\"offPeakMinutesToWaitOnLogoff\":367147351},\"id\":\"jpvuaurkihcirld\",\"name\":\"fx\",\"type\":\"dcoxnbk\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DesktopVirtualizationManager manager = DesktopVirtualizationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ScalingPlanPersonalSchedule response = manager.scalingPlanPersonalSchedules()
            .getWithResponse("hkgmnsg", "pxycphdr", "jjkhvyomaclu", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(DayOfWeek.THURSDAY, response.daysOfWeek().get(0));
        Assertions.assertEquals(1304447311, response.rampUpStartTime().hour());
        Assertions.assertEquals(718390639, response.rampUpStartTime().minute());
        Assertions.assertEquals(StartupBehavior.ALL, response.rampUpAutoStartHosts());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, response.rampUpStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, response.rampUpActionOnDisconnect());
        Assertions.assertEquals(1691318308, response.rampUpMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, response.rampUpActionOnLogoff());
        Assertions.assertEquals(355623092, response.rampUpMinutesToWaitOnLogoff());
        Assertions.assertEquals(143922465, response.peakStartTime().hour());
        Assertions.assertEquals(1101353538, response.peakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, response.peakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, response.peakActionOnDisconnect());
        Assertions.assertEquals(2104491949, response.peakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, response.peakActionOnLogoff());
        Assertions.assertEquals(834790015, response.peakMinutesToWaitOnLogoff());
        Assertions.assertEquals(755029786, response.rampDownStartTime().hour());
        Assertions.assertEquals(862092448, response.rampDownStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, response.rampDownStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, response.rampDownActionOnDisconnect());
        Assertions.assertEquals(36520302, response.rampDownMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, response.rampDownActionOnLogoff());
        Assertions.assertEquals(536933568, response.rampDownMinutesToWaitOnLogoff());
        Assertions.assertEquals(2089748283, response.offPeakStartTime().hour());
        Assertions.assertEquals(1377606972, response.offPeakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, response.offPeakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, response.offPeakActionOnDisconnect());
        Assertions.assertEquals(203587565, response.offPeakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, response.offPeakActionOnLogoff());
        Assertions.assertEquals(367147351, response.offPeakMinutesToWaitOnLogoff());
    }
}
