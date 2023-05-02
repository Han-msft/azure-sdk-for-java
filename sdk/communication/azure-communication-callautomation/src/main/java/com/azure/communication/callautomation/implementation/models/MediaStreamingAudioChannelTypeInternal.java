// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Audio channel type to stream, eg. unmixed audio, mixed audio. */
public final class MediaStreamingAudioChannelTypeInternal
        extends ExpandableStringEnum<MediaStreamingAudioChannelTypeInternal> {
    /** Static value mixed for MediaStreamingAudioChannelTypeInternal. */
    public static final MediaStreamingAudioChannelTypeInternal MIXED = fromString("mixed");

    /** Static value unmixed for MediaStreamingAudioChannelTypeInternal. */
    public static final MediaStreamingAudioChannelTypeInternal UNMIXED = fromString("unmixed");

    /**
     * Creates a new instance of MediaStreamingAudioChannelTypeInternal value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MediaStreamingAudioChannelTypeInternal() {}

    /**
     * Creates or finds a MediaStreamingAudioChannelTypeInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MediaStreamingAudioChannelTypeInternal.
     */
    @JsonCreator
    public static MediaStreamingAudioChannelTypeInternal fromString(String name) {
        return fromString(name, MediaStreamingAudioChannelTypeInternal.class);
    }

    /**
     * Gets known MediaStreamingAudioChannelTypeInternal values.
     *
     * @return known MediaStreamingAudioChannelTypeInternal values.
     */
    public static Collection<MediaStreamingAudioChannelTypeInternal> values() {
        return values(MediaStreamingAudioChannelTypeInternal.class);
    }
}
