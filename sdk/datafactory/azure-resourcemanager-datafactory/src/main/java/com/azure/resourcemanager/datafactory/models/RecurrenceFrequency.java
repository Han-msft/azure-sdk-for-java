// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enumerates possible frequency option for the schedule trigger.
 */
public final class RecurrenceFrequency extends ExpandableStringEnum<RecurrenceFrequency> {
    /**
     * Static value NotSpecified for RecurrenceFrequency.
     */
    public static final RecurrenceFrequency NOT_SPECIFIED = fromString("NotSpecified");

    /**
     * Static value Minute for RecurrenceFrequency.
     */
    public static final RecurrenceFrequency MINUTE = fromString("Minute");

    /**
     * Static value Hour for RecurrenceFrequency.
     */
    public static final RecurrenceFrequency HOUR = fromString("Hour");

    /**
     * Static value Day for RecurrenceFrequency.
     */
    public static final RecurrenceFrequency DAY = fromString("Day");

    /**
     * Static value Week for RecurrenceFrequency.
     */
    public static final RecurrenceFrequency WEEK = fromString("Week");

    /**
     * Static value Month for RecurrenceFrequency.
     */
    public static final RecurrenceFrequency MONTH = fromString("Month");

    /**
     * Static value Year for RecurrenceFrequency.
     */
    public static final RecurrenceFrequency YEAR = fromString("Year");

    /**
     * Creates a new instance of RecurrenceFrequency value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RecurrenceFrequency() {
    }

    /**
     * Creates or finds a RecurrenceFrequency from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RecurrenceFrequency.
     */
    public static RecurrenceFrequency fromString(String name) {
        return fromString(name, RecurrenceFrequency.class);
    }

    /**
     * Gets known RecurrenceFrequency values.
     * 
     * @return known RecurrenceFrequency values.
     */
    public static Collection<RecurrenceFrequency> values() {
        return values(RecurrenceFrequency.class);
    }
}
