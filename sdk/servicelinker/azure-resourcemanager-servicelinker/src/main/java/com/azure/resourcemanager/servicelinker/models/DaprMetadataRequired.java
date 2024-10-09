// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The value indicating whether the metadata is required or not.
 */
public final class DaprMetadataRequired extends ExpandableStringEnum<DaprMetadataRequired> {
    /**
     * Static value true for DaprMetadataRequired.
     */
    public static final DaprMetadataRequired TRUE = fromString("true");

    /**
     * Static value false for DaprMetadataRequired.
     */
    public static final DaprMetadataRequired FALSE = fromString("false");

    /**
     * Creates a new instance of DaprMetadataRequired value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DaprMetadataRequired() {
    }

    /**
     * Creates or finds a DaprMetadataRequired from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DaprMetadataRequired.
     */
    public static DaprMetadataRequired fromString(String name) {
        return fromString(name, DaprMetadataRequired.class);
    }

    /**
     * Gets known DaprMetadataRequired values.
     * 
     * @return known DaprMetadataRequired values.
     */
    public static Collection<DaprMetadataRequired> values() {
        return values(DaprMetadataRequired.class);
    }
}
