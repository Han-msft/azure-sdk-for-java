// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The private link configuration provisioning state, which only appears in the response.
 */
public final class PrivateLinkConfigurationProvisioningState
    extends ExpandableStringEnum<PrivateLinkConfigurationProvisioningState> {
    /**
     * Static value InProgress for PrivateLinkConfigurationProvisioningState.
     */
    public static final PrivateLinkConfigurationProvisioningState IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Failed for PrivateLinkConfigurationProvisioningState.
     */
    public static final PrivateLinkConfigurationProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Succeeded for PrivateLinkConfigurationProvisioningState.
     */
    public static final PrivateLinkConfigurationProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for PrivateLinkConfigurationProvisioningState.
     */
    public static final PrivateLinkConfigurationProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Deleting for PrivateLinkConfigurationProvisioningState.
     */
    public static final PrivateLinkConfigurationProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of PrivateLinkConfigurationProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateLinkConfigurationProvisioningState() {
    }

    /**
     * Creates or finds a PrivateLinkConfigurationProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateLinkConfigurationProvisioningState.
     */
    public static PrivateLinkConfigurationProvisioningState fromString(String name) {
        return fromString(name, PrivateLinkConfigurationProvisioningState.class);
    }

    /**
     * Gets known PrivateLinkConfigurationProvisioningState values.
     * 
     * @return known PrivateLinkConfigurationProvisioningState values.
     */
    public static Collection<PrivateLinkConfigurationProvisioningState> values() {
        return values(PrivateLinkConfigurationProvisioningState.class);
    }
}
