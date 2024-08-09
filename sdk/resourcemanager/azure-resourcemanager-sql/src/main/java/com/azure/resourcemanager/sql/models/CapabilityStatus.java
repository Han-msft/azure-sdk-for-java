// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

/**
 * The status of the capability.
 */
public enum CapabilityStatus {
    /**
     * Enum value Visible.
     */
    VISIBLE("Visible"),

    /**
     * Enum value Available.
     */
    AVAILABLE("Available"),

    /**
     * Enum value Default.
     */
    DEFAULT("Default"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled");

    /**
     * The actual serialized value for a CapabilityStatus instance.
     */
    private final String value;

    CapabilityStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CapabilityStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CapabilityStatus object, or null if unable to parse.
     */
    public static CapabilityStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        CapabilityStatus[] items = CapabilityStatus.values();
        for (CapabilityStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
