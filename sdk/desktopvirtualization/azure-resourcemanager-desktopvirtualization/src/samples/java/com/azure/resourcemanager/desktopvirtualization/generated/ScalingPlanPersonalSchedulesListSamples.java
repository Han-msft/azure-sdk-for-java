// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

/**
 * Samples for ScalingPlanPersonalSchedules List.
 */
public final class ScalingPlanPersonalSchedulesListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-04-03/examples/
     * ScalingPlanPersonalSchedule_List.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesList(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules()
            .list("resourceGroup1", "scalingPlan", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
