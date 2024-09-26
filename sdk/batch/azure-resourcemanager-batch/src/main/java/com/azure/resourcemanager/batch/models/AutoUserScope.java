// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

/**
 * The scope for the auto user
 * 
 * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation
 * between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or
 * if certificates have been specified on the pool which should not be accessible by normal tasks but should be
 * accessible by start tasks.
 */
public enum AutoUserScope {
    /**
     * Enum value Task.
     */
    TASK("Task"),

    /**
     * Enum value Pool.
     */
    POOL("Pool");

    /**
     * The actual serialized value for a AutoUserScope instance.
     */
    private final String value;

    AutoUserScope(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutoUserScope instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AutoUserScope object, or null if unable to parse.
     */
    public static AutoUserScope fromString(String value) {
        if (value == null) {
            return null;
        }
        AutoUserScope[] items = AutoUserScope.values();
        for (AutoUserScope item : items) {
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
