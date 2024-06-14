// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Determines how the stand-by scheme should be provided.
 */
public final class ResourcePredictionsProfileType extends ExpandableStringEnum<ResourcePredictionsProfileType> {
    /**
     * Static value Manual for ResourcePredictionsProfileType.
     */
    public static final ResourcePredictionsProfileType MANUAL = fromString("Manual");

    /**
     * Static value Automatic for ResourcePredictionsProfileType.
     */
    public static final ResourcePredictionsProfileType AUTOMATIC = fromString("Automatic");

    /**
     * Creates a new instance of ResourcePredictionsProfileType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourcePredictionsProfileType() {
    }

    /**
     * Creates or finds a ResourcePredictionsProfileType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResourcePredictionsProfileType.
     */
    public static ResourcePredictionsProfileType fromString(String name) {
        return fromString(name, ResourcePredictionsProfileType.class);
    }

    /**
     * Gets known ResourcePredictionsProfileType values.
     * 
     * @return known ResourcePredictionsProfileType values.
     */
    public static Collection<ResourcePredictionsProfileType> values() {
        return values(ResourcePredictionsProfileType.class);
    }
}
