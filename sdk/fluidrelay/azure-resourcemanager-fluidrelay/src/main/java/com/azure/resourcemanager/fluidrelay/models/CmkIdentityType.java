// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.models;

/**
 * Values can be SystemAssigned or UserAssigned.
 */
public enum CmkIdentityType {
    /**
     * Enum value SystemAssigned.
     */
    SYSTEM_ASSIGNED("SystemAssigned"),

    /**
     * Enum value UserAssigned.
     */
    USER_ASSIGNED("UserAssigned");

    /**
     * The actual serialized value for a CmkIdentityType instance.
     */
    private final String value;

    CmkIdentityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CmkIdentityType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CmkIdentityType object, or null if unable to parse.
     */
    public static CmkIdentityType fromString(String value) {
        if (value == null) {
            return null;
        }
        CmkIdentityType[] items = CmkIdentityType.values();
        for (CmkIdentityType item : items) {
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
