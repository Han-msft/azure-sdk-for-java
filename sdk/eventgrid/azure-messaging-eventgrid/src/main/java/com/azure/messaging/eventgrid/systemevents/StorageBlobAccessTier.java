// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The access tier of the blob.
 */
public final class StorageBlobAccessTier extends ExpandableStringEnum<StorageBlobAccessTier> {
    /**
     * The blob is in access tier Hot.
     */
    public static final StorageBlobAccessTier HOT = fromString("Hot");

    /**
     * The blob is in access tier Cool.
     */
    public static final StorageBlobAccessTier COOL = fromString("Cool");

    /**
     * The blob is in access tier Cold.
     */
    public static final StorageBlobAccessTier COLD = fromString("Cold");

    /**
     * The blob is in access tier Archive.
     */
    public static final StorageBlobAccessTier ARCHIVE = fromString("Archive");

    /**
     * The blob is in access tier Default(Inferred).
     */
    public static final StorageBlobAccessTier DEFAULT = fromString("Default");

    /**
     * Creates a new instance of StorageBlobAccessTier value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StorageBlobAccessTier() {
    }

    /**
     * Creates or finds a StorageBlobAccessTier from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StorageBlobAccessTier.
     */
    public static StorageBlobAccessTier fromString(String name) {
        return fromString(name, StorageBlobAccessTier.class);
    }

    /**
     * Gets known StorageBlobAccessTier values.
     * 
     * @return known StorageBlobAccessTier values.
     */
    public static Collection<StorageBlobAccessTier> values() {
        return values(StorageBlobAccessTier.class);
    }
}
