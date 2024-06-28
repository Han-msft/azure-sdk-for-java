// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The compression method used for indexing and querying.
 */
public final class VectorSearchCompressionKind extends ExpandableStringEnum<VectorSearchCompressionKind> {
    /**
     * Scalar Quantization, a type of compression method. In scalar quantization, the original vectors values are
     * compressed to a narrower type by discretizing and representing each component of a vector using a reduced set of
     * quantized values, thereby reducing the overall data size.
     */
    public static final VectorSearchCompressionKind SCALAR_QUANTIZATION = fromString("scalarQuantization");

    /**
     * Binary Quantization, a type of compression method. In binary quantization, the original vectors values are
     * compressed to the narrower binary type by discretizing and representing each component of a vector using binary
     * values, thereby reducing the overall data size.
     */
    public static final VectorSearchCompressionKind BINARY_QUANTIZATION = fromString("binaryQuantization");

    /**
     * Creates a new instance of VectorSearchCompressionKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VectorSearchCompressionKind() {
    }

    /**
     * Creates or finds a VectorSearchCompressionKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VectorSearchCompressionKind.
     */
    public static VectorSearchCompressionKind fromString(String name) {
        return fromString(name, VectorSearchCompressionKind.class);
    }

    /**
     * Gets known VectorSearchCompressionKind values.
     * 
     * @return known VectorSearchCompressionKind values.
     */
    public static Collection<VectorSearchCompressionKind> values() {
        return values(VectorSearchCompressionKind.class);
    }
}
