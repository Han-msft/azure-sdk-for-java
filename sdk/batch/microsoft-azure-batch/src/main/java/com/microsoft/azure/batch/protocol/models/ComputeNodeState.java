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
 * Defines values for ComputeNodeState.
 */
public enum ComputeNodeState {
    /** The Compute Node is not currently running a Task. */
    IDLE("idle"),

    /** The Compute Node is rebooting. */
    REBOOTING("rebooting"),

    /** The Compute Node is reimaging. */
    REIMAGING("reimaging"),

    /** The Compute Node is running one or more Tasks (other than a StartTask). */
    RUNNING("running"),

    /** The Compute Node cannot be used for Task execution due to errors. */
    UNUSABLE("unusable"),

    /** The Batch service has obtained the underlying virtual machine from Azure Compute, but it has not yet started to join the Pool. */
    CREATING("creating"),

    /** The Batch service is starting on the underlying virtual machine. */
    STARTING("starting"),

    /** The StartTask has started running on the Compute Node, but waitForSuccess is set and the StartTask has not yet completed. */
    WAITING_FOR_START_TASK("waitingforstarttask"),

    /** The StartTask has failed on the Compute Node (and exhausted all retries), and waitForSuccess is set. The Compute Node is not usable for running Tasks. */
    START_TASK_FAILED("starttaskfailed"),

    /** The Batch service has lost contact with the Compute Node, and does not know its true state. */
    UNKNOWN("unknown"),

    /** The Compute Node is leaving the Pool, either because the user explicitly removed it or because the Pool is resizing or autoscaling down. */
    LEAVING_POOL("leavingpool"),

    /** The Compute Node is not currently running a Task, and scheduling of new Tasks to the Compute Node is disabled. */
    OFFLINE("offline"),

    /** The Spot/Low-priority Compute Node has been preempted. Tasks which were running on the Compute Node when it was preempted will be rescheduled when another Compute Node becomes available. */
    PREEMPTED("preempted"),

    /** The Compute Node is undergoing an OS upgrade operation. */
    UPGRADING_OS("upgradingos"),

    /** The Compute Node is deallocated. */
    DEALLOCATED("deallocated"),

    /** The Compute Node is deallocating. */
    DEALLOCATING("deallocating");

    /** The actual serialized value for a ComputeNodeState instance. */
    private String value;

    ComputeNodeState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeNodeState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeState object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeState fromString(String value) {
        ComputeNodeState[] items = ComputeNodeState.values();
        for (ComputeNodeState item : items) {
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
