// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.generated;

import com.azure.resourcemanager.computeschedule.models.ExecuteDeallocateRequest;
import com.azure.resourcemanager.computeschedule.models.ExecutionParameters;
import com.azure.resourcemanager.computeschedule.models.OptimizationPreference;
import com.azure.resourcemanager.computeschedule.models.Resources;
import com.azure.resourcemanager.computeschedule.models.RetryPolicy;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesExecuteDeallocate.
 */
public final class ScheduledActionsVirtualMachinesExecuteDeallocateSamples {
    /*
     * x-ms-original-file: 2024-08-15-preview/ScheduledActions_VirtualMachinesExecuteDeallocate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteDeallocate - generated by [MaximumSet] rule - generated by
     * [MaximumSet] rule.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void
        scheduledActionsVirtualMachinesExecuteDeallocateGeneratedByMaximumSetRuleGeneratedByMaximumSetRule(
            com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteDeallocateWithResponse("mklyzgztbivwzo", new ExecuteDeallocateRequest()
                .withExecutionParameters(
                    new ExecutionParameters().withOptimizationPreference(OptimizationPreference.COST)
                        .withRetryPolicy(new RetryPolicy().withRetryCount(30).withRetryWindowInMinutes(27)))
                .withResources(new Resources().withIds(Arrays.asList(
                    "/subscriptions/YourSubscriptionId/resourceGroups/YourResourceGroupName/providers/Microsoft.Compute/virtualMachines/testResource2")))
                .withCorrelationid("01080d2f-1dca-4610-afb4-dd25eddf1f3c1"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-08-15-preview/ScheduledActions_VirtualMachinesExecuteDeallocate_MinimumSet_Gen.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesExecuteDeallocate - generated by [MaximumSet] rule - generated by
     * [MinimumSet] rule.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void
        scheduledActionsVirtualMachinesExecuteDeallocateGeneratedByMaximumSetRuleGeneratedByMinimumSetRule(
            com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesExecuteDeallocateWithResponse("irbtacrhjgfpyvhvjo", new ExecuteDeallocateRequest()
                .withExecutionParameters(new ExecutionParameters())
                .withResources(new Resources().withIds(Arrays.asList(
                    "/subscriptions/YourSubscriptionId/resourceGroups/YourResourceGroupName/providers/Microsoft.Compute/virtualMachines/testResource2")))
                .withCorrelationid("01080d2f-1dca-4610-afb4-dd25eddf1f3c1"), com.azure.core.util.Context.NONE);
    }
}
