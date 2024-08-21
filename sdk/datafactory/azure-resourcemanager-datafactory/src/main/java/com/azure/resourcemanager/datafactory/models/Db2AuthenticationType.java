// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * AuthenticationType to be used for connection. It is mutually exclusive with connectionString property.
 */
public final class Db2AuthenticationType extends ExpandableStringEnum<Db2AuthenticationType> {
    /**
     * Static value Basic for Db2AuthenticationType.
     */
    public static final Db2AuthenticationType BASIC = fromString("Basic");

    /**
     * Creates a new instance of Db2AuthenticationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Db2AuthenticationType() {
    }

    /**
     * Creates or finds a Db2AuthenticationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Db2AuthenticationType.
     */
    public static Db2AuthenticationType fromString(String name) {
        return fromString(name, Db2AuthenticationType.class);
    }

    /**
     * Gets known Db2AuthenticationType values.
     * 
     * @return known Db2AuthenticationType values.
     */
    public static Collection<Db2AuthenticationType> values() {
        return values(Db2AuthenticationType.class);
    }
}
