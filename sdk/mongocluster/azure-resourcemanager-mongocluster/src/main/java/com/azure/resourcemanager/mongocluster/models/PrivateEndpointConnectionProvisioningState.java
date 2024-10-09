// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The current provisioning state.
 */
public final class PrivateEndpointConnectionProvisioningState
    extends ExpandableStringEnum<PrivateEndpointConnectionProvisioningState> {
    /**
     * Connection has been provisioned.
     */
    public static final PrivateEndpointConnectionProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Connection is being created.
     */
    public static final PrivateEndpointConnectionProvisioningState CREATING = fromString("Creating");

    /**
     * Connection is being deleted.
     */
    public static final PrivateEndpointConnectionProvisioningState DELETING = fromString("Deleting");

    /**
     * Connection provisioning has failed.
     */
    public static final PrivateEndpointConnectionProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of PrivateEndpointConnectionProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateEndpointConnectionProvisioningState() {
    }

    /**
     * Creates or finds a PrivateEndpointConnectionProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointConnectionProvisioningState.
     */
    public static PrivateEndpointConnectionProvisioningState fromString(String name) {
        return fromString(name, PrivateEndpointConnectionProvisioningState.class);
    }

    /**
     * Gets known PrivateEndpointConnectionProvisioningState values.
     * 
     * @return known PrivateEndpointConnectionProvisioningState values.
     */
    public static Collection<PrivateEndpointConnectionProvisioningState> values() {
        return values(PrivateEndpointConnectionProvisioningState.class);
    }
}
