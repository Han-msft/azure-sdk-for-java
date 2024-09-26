// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

/**
 * The type of identity used for the Batch Pool.
 */
public enum PoolIdentityType {
    /**
     * Enum value UserAssigned.
     */
    USER_ASSIGNED("UserAssigned"),

    /**
     * Enum value None.
     */
    NONE("None");

    /**
     * The actual serialized value for a PoolIdentityType instance.
     */
    private final String value;

    PoolIdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PoolIdentityType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed PoolIdentityType object, or null if unable to parse.
     */
    public static PoolIdentityType fromString(String value) {
        if (value == null) {
            return null;
        }
        PoolIdentityType[] items = PoolIdentityType.values();
        for (PoolIdentityType item : items) {
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
