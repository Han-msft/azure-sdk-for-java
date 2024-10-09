// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.resourcemanager.consumption.models.Datagrain;

/**
 * Samples for ReservationsSummaries ListByReservationOrder.
 */
public final class ReservationsSummariesListByReservationOrderSamples {
    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * ReservationSummariesMonthly.json
     */
    /**
     * Sample code: ReservationSummariesMonthly.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void reservationSummariesMonthly(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.reservationsSummaries()
            .listByReservationOrder("00000000-0000-0000-0000-000000000000", Datagrain.MONTHLY, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2021-10-01/examples/
     * ReservationSummariesDaily.json
     */
    /**
     * Sample code: ReservationSummariesDaily.
     * 
     * @param manager Entry point to ConsumptionManager.
     */
    public static void reservationSummariesDaily(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.reservationsSummaries()
            .listByReservationOrder("00000000-0000-0000-0000-000000000000", Datagrain.DAILY,
                "properties/usageDate ge 2017-10-01 AND properties/usageDate le 2017-11-20",
                com.azure.core.util.Context.NONE);
    }
}
