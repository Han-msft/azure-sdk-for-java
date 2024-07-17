// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservice.models.MaintenanceWindow;
import com.azure.resourcemanager.containerservice.models.TimeInWeek;
import com.azure.resourcemanager.containerservice.models.TimeSpan;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Properties used to configure planned maintenance for a Managed Cluster.
 */
@Fluent
public final class MaintenanceConfigurationProperties {
    /*
     * If two array entries specify the same day of the week, the applied configuration is the union of times in both
     * entries.
     */
    @JsonProperty(value = "timeInWeek")
    private List<TimeInWeek> timeInWeek;

    /*
     * Time slots on which upgrade is not allowed.
     */
    @JsonProperty(value = "notAllowedTime")
    private List<TimeSpan> notAllowedTime;

    /*
     * Maintenance window for the maintenance configuration.
     */
    @JsonProperty(value = "maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /**
     * Creates an instance of MaintenanceConfigurationProperties class.
     */
    public MaintenanceConfigurationProperties() {
    }

    /**
     * Get the timeInWeek property: If two array entries specify the same day of the week, the applied configuration is
     * the union of times in both entries.
     *
     * @return the timeInWeek value.
     */
    public List<TimeInWeek> timeInWeek() {
        return this.timeInWeek;
    }

    /**
     * Set the timeInWeek property: If two array entries specify the same day of the week, the applied configuration is
     * the union of times in both entries.
     *
     * @param timeInWeek the timeInWeek value to set.
     * @return the MaintenanceConfigurationProperties object itself.
     */
    public MaintenanceConfigurationProperties withTimeInWeek(List<TimeInWeek> timeInWeek) {
        this.timeInWeek = timeInWeek;
        return this;
    }

    /**
     * Get the notAllowedTime property: Time slots on which upgrade is not allowed.
     *
     * @return the notAllowedTime value.
     */
    public List<TimeSpan> notAllowedTime() {
        return this.notAllowedTime;
    }

    /**
     * Set the notAllowedTime property: Time slots on which upgrade is not allowed.
     *
     * @param notAllowedTime the notAllowedTime value to set.
     * @return the MaintenanceConfigurationProperties object itself.
     */
    public MaintenanceConfigurationProperties withNotAllowedTime(List<TimeSpan> notAllowedTime) {
        this.notAllowedTime = notAllowedTime;
        return this;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window for the maintenance configuration.
     *
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: Maintenance window for the maintenance configuration.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the MaintenanceConfigurationProperties object itself.
     */
    public MaintenanceConfigurationProperties withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeInWeek() != null) {
            timeInWeek().forEach(e -> e.validate());
        }
        if (notAllowedTime() != null) {
            notAllowedTime().forEach(e -> e.validate());
        }
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
    }
}
