// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Determines who has admin permissions to the Azure DevOps pool.
 */
public final class AzureDevOpsPermissionType extends ExpandableStringEnum<AzureDevOpsPermissionType> {
    /**
     * Pool will inherit permissions from the project or organization.
     */
    public static final AzureDevOpsPermissionType INHERIT = fromString("Inherit");

    /**
     * Only the pool creator will be an admin of the pool.
     */
    public static final AzureDevOpsPermissionType CREATOR_ONLY = fromString("CreatorOnly");

    /**
     * Only the specified accounts will be admins of the pool.
     */
    public static final AzureDevOpsPermissionType SPECIFIC_ACCOUNTS = fromString("SpecificAccounts");

    /**
     * Creates a new instance of AzureDevOpsPermissionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureDevOpsPermissionType() {
    }

    /**
     * Creates or finds a AzureDevOpsPermissionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureDevOpsPermissionType.
     */
    public static AzureDevOpsPermissionType fromString(String name) {
        return fromString(name, AzureDevOpsPermissionType.class);
    }

    /**
     * Gets known AzureDevOpsPermissionType values.
     * 
     * @return known AzureDevOpsPermissionType values.
     */
    public static Collection<AzureDevOpsPermissionType> values() {
        return values(AzureDevOpsPermissionType.class);
    }
}
