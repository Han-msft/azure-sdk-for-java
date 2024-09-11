/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ComputeNodeDeallocateOption.
 */
public enum ComputeNodeDeallocateOption {
    /** Terminate running Task processes and requeue the Tasks. The Tasks will run again when a Compute Node is available. Deallocate the Compute Node as soon as Tasks have been terminated. */
    REQUEUE("requeue"),

    /** Terminate running Tasks. The Tasks will be completed with failureInfo indicating that they were terminated, and will not run again. Deallocate the Compute Node as soon as Tasks have been terminated. */
    TERMINATE("terminate"),

    /** Allow currently running Tasks to complete. Schedule no new Tasks while waiting. Deallocate the Compute Node when all Tasks have completed. */
    TASK_COMPLETION("taskcompletion"),

    /** Allow currently running Tasks to complete, then wait for all Task data retention periods to expire. Schedule no new Tasks while waiting. Deallocate the Compute Node when all Task retention periods have expired. */
    RETAINED_DATA("retaineddata");

    /** The actual serialized value for a ComputeNodeDeallocateOption instance. */
    private String value;

    ComputeNodeDeallocateOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeNodeDeallocateOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeDeallocateOption object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeDeallocateOption fromString(String value) {
        ComputeNodeDeallocateOption[] items = ComputeNodeDeallocateOption.values();
        for (ComputeNodeDeallocateOption item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
