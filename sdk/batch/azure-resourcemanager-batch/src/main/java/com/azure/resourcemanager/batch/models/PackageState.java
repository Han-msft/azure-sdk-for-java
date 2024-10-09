// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

/**
 * The current state of the application package.
 */
public enum PackageState {
    /**
     * Enum value Pending.
     */
    PENDING("Pending"),

    /**
     * Enum value Active.
     */
    ACTIVE("Active");

    /**
     * The actual serialized value for a PackageState instance.
     */
    private final String value;

    PackageState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PackageState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed PackageState object, or null if unable to parse.
     */
    public static PackageState fromString(String value) {
        if (value == null) {
            return null;
        }
        PackageState[] items = PackageState.values();
        for (PackageState item : items) {
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
