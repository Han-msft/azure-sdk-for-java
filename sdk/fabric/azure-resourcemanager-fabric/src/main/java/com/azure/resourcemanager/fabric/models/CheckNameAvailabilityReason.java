// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.fabric.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Possible reasons for a name not being available.
 */
public final class CheckNameAvailabilityReason extends ExpandableStringEnum<CheckNameAvailabilityReason> {
    /**
     * Static value Invalid for CheckNameAvailabilityReason.
     */
    public static final CheckNameAvailabilityReason INVALID = fromString("Invalid");

    /**
     * Static value AlreadyExists for CheckNameAvailabilityReason.
     */
    public static final CheckNameAvailabilityReason ALREADY_EXISTS = fromString("AlreadyExists");

    /**
     * Creates a new instance of CheckNameAvailabilityReason value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CheckNameAvailabilityReason() {
    }

    /**
     * Creates or finds a CheckNameAvailabilityReason from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CheckNameAvailabilityReason.
     */
    public static CheckNameAvailabilityReason fromString(String name) {
        return fromString(name, CheckNameAvailabilityReason.class);
    }

    /**
     * Gets known CheckNameAvailabilityReason values.
     * 
     * @return known CheckNameAvailabilityReason values.
     */
    public static Collection<CheckNameAvailabilityReason> values() {
        return values(CheckNameAvailabilityReason.class);
    }
}
