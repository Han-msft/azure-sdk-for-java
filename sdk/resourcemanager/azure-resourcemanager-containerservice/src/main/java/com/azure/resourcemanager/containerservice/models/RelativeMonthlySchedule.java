// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * For schedules like: 'recur every month on the first Monday' or 'recur every 3 months on last Friday'.
 */
@Fluent
public final class RelativeMonthlySchedule {
    /*
     * Specifies the number of months between each set of occurrences.
     */
    @JsonProperty(value = "intervalMonths", required = true)
    private int intervalMonths;

    /*
     * Specifies on which week of the month the dayOfWeek applies.
     */
    @JsonProperty(value = "weekIndex", required = true)
    private Type weekIndex;

    /*
     * Specifies on which day of the week the maintenance occurs.
     */
    @JsonProperty(value = "dayOfWeek", required = true)
    private WeekDay dayOfWeek;

    /**
     * Creates an instance of RelativeMonthlySchedule class.
     */
    public RelativeMonthlySchedule() {
    }

    /**
     * Get the intervalMonths property: Specifies the number of months between each set of occurrences.
     * 
     * @return the intervalMonths value.
     */
    public int intervalMonths() {
        return this.intervalMonths;
    }

    /**
     * Set the intervalMonths property: Specifies the number of months between each set of occurrences.
     * 
     * @param intervalMonths the intervalMonths value to set.
     * @return the RelativeMonthlySchedule object itself.
     */
    public RelativeMonthlySchedule withIntervalMonths(int intervalMonths) {
        this.intervalMonths = intervalMonths;
        return this;
    }

    /**
     * Get the weekIndex property: Specifies on which week of the month the dayOfWeek applies.
     * 
     * @return the weekIndex value.
     */
    public Type weekIndex() {
        return this.weekIndex;
    }

    /**
     * Set the weekIndex property: Specifies on which week of the month the dayOfWeek applies.
     * 
     * @param weekIndex the weekIndex value to set.
     * @return the RelativeMonthlySchedule object itself.
     */
    public RelativeMonthlySchedule withWeekIndex(Type weekIndex) {
        this.weekIndex = weekIndex;
        return this;
    }

    /**
     * Get the dayOfWeek property: Specifies on which day of the week the maintenance occurs.
     * 
     * @return the dayOfWeek value.
     */
    public WeekDay dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: Specifies on which day of the week the maintenance occurs.
     * 
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the RelativeMonthlySchedule object itself.
     */
    public RelativeMonthlySchedule withDayOfWeek(WeekDay dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (weekIndex() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property weekIndex in model RelativeMonthlySchedule"));
        }
        if (dayOfWeek() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property dayOfWeek in model RelativeMonthlySchedule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RelativeMonthlySchedule.class);
}
