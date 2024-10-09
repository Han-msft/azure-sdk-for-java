// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHandlingOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SetStartVMOnConnect;
import com.azure.resourcemanager.desktopvirtualization.models.StartupBehavior;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;

/**
 * Samples for ScalingPlanPersonalSchedules Create.
 */
public final class ScalingPlanPersonalSchedulesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-04-03/examples/
     * ScalingPlanPersonalSchedule_Create.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesCreate(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules()
            .define("scalingPlanScheduleWeekdays1")
            .withExistingScalingPlan("resourceGroup1", "scalingPlan1")
            .withDaysOfWeek(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY))
            .withRampUpStartTime(new Time().withHour(6).withMinute(0))
            .withRampUpAutoStartHosts(StartupBehavior.ALL)
            .withRampUpStartVMOnConnect(SetStartVMOnConnect.ENABLE)
            .withRampUpActionOnDisconnect(SessionHandlingOperation.NONE)
            .withRampUpMinutesToWaitOnDisconnect(10)
            .withRampUpActionOnLogoff(SessionHandlingOperation.NONE)
            .withRampUpMinutesToWaitOnLogoff(10)
            .withPeakStartTime(new Time().withHour(8).withMinute(0))
            .withPeakStartVMOnConnect(SetStartVMOnConnect.ENABLE)
            .withPeakActionOnDisconnect(SessionHandlingOperation.NONE)
            .withPeakMinutesToWaitOnDisconnect(10)
            .withPeakActionOnLogoff(SessionHandlingOperation.DEALLOCATE)
            .withPeakMinutesToWaitOnLogoff(10)
            .withRampDownStartTime(new Time().withHour(18).withMinute(0))
            .withRampDownStartVMOnConnect(SetStartVMOnConnect.ENABLE)
            .withRampDownActionOnDisconnect(SessionHandlingOperation.NONE)
            .withRampDownMinutesToWaitOnDisconnect(10)
            .withRampDownActionOnLogoff(SessionHandlingOperation.DEALLOCATE)
            .withRampDownMinutesToWaitOnLogoff(10)
            .withOffPeakStartTime(new Time().withHour(20).withMinute(0))
            .withOffPeakStartVMOnConnect(SetStartVMOnConnect.ENABLE)
            .withOffPeakActionOnDisconnect(SessionHandlingOperation.NONE)
            .withOffPeakMinutesToWaitOnDisconnect(10)
            .withOffPeakActionOnLogoff(SessionHandlingOperation.DEALLOCATE)
            .withOffPeakMinutesToWaitOnLogoff(10)
            .create();
    }
}
