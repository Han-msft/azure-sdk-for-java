// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

/**
 * Gets the reason that a Batch account name could not be used. The Reason element is only returned if NameAvailable is
 * false.
 */
public enum NameAvailabilityReason {
    /**
     * Enum value Invalid.
     */
    INVALID("Invalid"),

    /**
     * Enum value AlreadyExists.
     */
    ALREADY_EXISTS("AlreadyExists");

    /**
     * The actual serialized value for a NameAvailabilityReason instance.
     */
    private final String value;

    NameAvailabilityReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NameAvailabilityReason instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed NameAvailabilityReason object, or null if unable to parse.
     */
    public static NameAvailabilityReason fromString(String value) {
        if (value == null) {
            return null;
        }
        NameAvailabilityReason[] items = NameAvailabilityReason.values();
        for (NameAvailabilityReason item : items) {
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
