// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The managed integration runtime node status.
 */
public final class ManagedIntegrationRuntimeNodeStatus
    extends ExpandableStringEnum<ManagedIntegrationRuntimeNodeStatus> {
    /**
     * Static value Starting for ManagedIntegrationRuntimeNodeStatus.
     */
    public static final ManagedIntegrationRuntimeNodeStatus STARTING = fromString("Starting");

    /**
     * Static value Available for ManagedIntegrationRuntimeNodeStatus.
     */
    public static final ManagedIntegrationRuntimeNodeStatus AVAILABLE = fromString("Available");

    /**
     * Static value Recycling for ManagedIntegrationRuntimeNodeStatus.
     */
    public static final ManagedIntegrationRuntimeNodeStatus RECYCLING = fromString("Recycling");

    /**
     * Static value Unavailable for ManagedIntegrationRuntimeNodeStatus.
     */
    public static final ManagedIntegrationRuntimeNodeStatus UNAVAILABLE = fromString("Unavailable");

    /**
     * Creates a new instance of ManagedIntegrationRuntimeNodeStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedIntegrationRuntimeNodeStatus() {
    }

    /**
     * Creates or finds a ManagedIntegrationRuntimeNodeStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagedIntegrationRuntimeNodeStatus.
     */
    public static ManagedIntegrationRuntimeNodeStatus fromString(String name) {
        return fromString(name, ManagedIntegrationRuntimeNodeStatus.class);
    }

    /**
     * Gets known ManagedIntegrationRuntimeNodeStatus values.
     * 
     * @return known ManagedIntegrationRuntimeNodeStatus values.
     */
    public static Collection<ManagedIntegrationRuntimeNodeStatus> values() {
        return values(ManagedIntegrationRuntimeNodeStatus.class);
    }
}
