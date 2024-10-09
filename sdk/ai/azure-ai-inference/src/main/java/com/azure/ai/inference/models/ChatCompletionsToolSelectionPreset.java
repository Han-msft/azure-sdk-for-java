// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.inference.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Represents a generic policy for how a chat completions tool may be selected.
 */
public final class ChatCompletionsToolSelectionPreset extends ExpandableStringEnum<ChatCompletionsToolSelectionPreset> {

    /**
     * Specifies that the model may either use any of the tools provided in this chat completions request or
     * instead return a standard chat completions response as if no tools were provided.
     */
    @Generated
    public static final ChatCompletionsToolSelectionPreset AUTO = fromString("auto");

    /**
     * Specifies that the model should not respond with a tool call and should instead provide a standard chat
     * completions response. Response content may still be influenced by the provided tool definitions.
     */
    @Generated
    public static final ChatCompletionsToolSelectionPreset NONE = fromString("none");

    /**
     * Specifies that the model should respond with a call to one or more tools.
     */
    @Generated
    public static final ChatCompletionsToolSelectionPreset REQUIRED = fromString("required");

    /**
     * Creates a new instance of ChatCompletionsToolSelectionPreset value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ChatCompletionsToolSelectionPreset() {
    }

    /**
     * Creates or finds a ChatCompletionsToolSelectionPreset from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChatCompletionsToolSelectionPreset.
     */
    @Generated
    public static ChatCompletionsToolSelectionPreset fromString(String name) {
        return fromString(name, ChatCompletionsToolSelectionPreset.class);
    }

    /**
     * Gets known ChatCompletionsToolSelectionPreset values.
     *
     * @return known ChatCompletionsToolSelectionPreset values.
     */
    @Generated
    public static Collection<ChatCompletionsToolSelectionPreset> values() {
        return values(ChatCompletionsToolSelectionPreset.class);
    }
}
