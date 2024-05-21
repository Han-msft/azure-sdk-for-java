// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The representation of a single prompt completion as part of an overall chat completions request.
 * Generally, `n` choices are generated per provided prompt with a default value of 1.
 * Token limits and other settings may limit the number of choices generated.
 */
@Immutable
public final class ChatChoice implements JsonSerializable<ChatChoice> {

    /*
     * The chat message for a given chat completions prompt.
     */
    @Generated
    private ChatResponseMessage message;

    /*
     * The ordered index associated with this chat completions choice.
     */
    @Generated
    private final int index;

    /*
     * The reason that this chat completions choice completed its generated.
     */
    @Generated
    private final CompletionsFinishReason finishReason;

    /*
     * The delta message content for a streaming response.
     */
    @Generated
    private ChatResponseMessage delta;

    /**
     * Get the message property: The chat message for a given chat completions prompt.
     *
     * @return the message value.
     */
    @Generated
    public ChatResponseMessage getMessage() {
        return this.message;
    }

    /**
     * Get the index property: The ordered index associated with this chat completions choice.
     *
     * @return the index value.
     */
    @Generated
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the finishReason property: The reason that this chat completions choice completed its generated.
     *
     * @return the finishReason value.
     */
    @Generated
    public CompletionsFinishReason getFinishReason() {
        return this.finishReason;
    }

    /**
     * Get the delta property: The delta message content for a streaming response.
     *
     * @return the delta value.
     */
    @Generated
    public ChatResponseMessage getDelta() {
        return this.delta;
    }

    /*
     * Information about the content filtering category (hate, sexual, violence, self_harm), if it
     * has been detected, as well as the severity level (very_low, low, medium, high-scale that
     * determines the intensity and risk level of harmful content) and if it has been filtered or not.
     */
    @Generated
    private ContentFilterResultsForChoice contentFilterResults;

    /**
     * Get the contentFilterResults property: Information about the content filtering category (hate, sexual, violence,
     * self_harm), if it
     * has been detected, as well as the severity level (very_low, low, medium, high-scale that
     * determines the intensity and risk level of harmful content) and if it has been filtered or not.
     *
     * @return the contentFilterResults value.
     */
    @Generated
    public ContentFilterResultsForChoice getContentFilterResults() {
        return this.contentFilterResults;
    }

    /*
     * The reason the model stopped generating tokens, together with any applicable details.
     * This structured representation replaces 'finish_reason' for some models.
     */
    @Generated
    private ChatFinishDetails finishDetails;

    /*
     * Represents the output results of Azure OpenAI enhancements to chat completions, as configured via the matching
     * input
     * provided in the request. This supplementary information is only available when using Azure OpenAI and only when
     * the
     * request is configured to use enhancements.
     */
    @Generated
    private AzureChatEnhancements enhancements;

    /**
     * Get the finishDetails property: The reason the model stopped generating tokens, together with any applicable
     * details.
     * This structured representation replaces 'finish_reason' for some models.
     *
     * @return the finishDetails value.
     */
    @Generated
    public ChatFinishDetails getFinishDetails() {
        return this.finishDetails;
    }

    /**
     * Get the enhancements property: Represents the output results of Azure OpenAI enhancements to chat completions, as
     * configured via the matching input
     * provided in the request. This supplementary information is only available when using Azure OpenAI and only when
     * the
     * request is configured to use enhancements.
     *
     * @return the enhancements value.
     */
    @Generated
    public AzureChatEnhancements getEnhancements() {
        return this.enhancements;
    }

    /*
     * The log probability information for this choice, as enabled via the 'logprobs' request option.
     */
    @Generated
    private final ChatChoiceLogProbabilityInfo logprobs;

    /**
     * Creates an instance of ChatChoice class.
     *
     * @param logprobs the logprobs value to set.
     * @param index the index value to set.
     * @param finishReason the finishReason value to set.
     */
    @Generated
    private ChatChoice(ChatChoiceLogProbabilityInfo logprobs, int index, CompletionsFinishReason finishReason) {
        this.logprobs = logprobs;
        this.index = index;
        this.finishReason = finishReason;
    }

    /**
     * Get the logprobs property: The log probability information for this choice, as enabled via the 'logprobs' request
     * option.
     *
     * @return the logprobs value.
     */
    @Generated
    public ChatChoiceLogProbabilityInfo getLogprobs() {
        return this.logprobs;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("logprobs", this.logprobs);
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeStringField("finish_reason", this.finishReason == null ? null : this.finishReason.toString());
        jsonWriter.writeJsonField("message", this.message);
        jsonWriter.writeJsonField("finish_details", this.finishDetails);
        jsonWriter.writeJsonField("delta", this.delta);
        jsonWriter.writeJsonField("content_filter_results", this.contentFilterResults);
        jsonWriter.writeJsonField("enhancements", this.enhancements);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatChoice from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatChoice if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatChoice.
     */
    @Generated
    public static ChatChoice fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatChoiceLogProbabilityInfo logprobs = null;
            int index = 0;
            CompletionsFinishReason finishReason = null;
            ChatResponseMessage message = null;
            ChatFinishDetails finishDetails = null;
            ChatResponseMessage delta = null;
            ContentFilterResultsForChoice contentFilterResults = null;
            AzureChatEnhancements enhancements = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("logprobs".equals(fieldName)) {
                    logprobs = ChatChoiceLogProbabilityInfo.fromJson(reader);
                } else if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("finish_reason".equals(fieldName)) {
                    finishReason = CompletionsFinishReason.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    message = ChatResponseMessage.fromJson(reader);
                } else if ("finish_details".equals(fieldName)) {
                    finishDetails = ChatFinishDetails.fromJson(reader);
                } else if ("delta".equals(fieldName)) {
                    delta = ChatResponseMessage.fromJson(reader);
                } else if ("content_filter_results".equals(fieldName)) {
                    contentFilterResults = ContentFilterResultsForChoice.fromJson(reader);
                } else if ("enhancements".equals(fieldName)) {
                    enhancements = AzureChatEnhancements.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            ChatChoice deserializedChatChoice = new ChatChoice(logprobs, index, finishReason);
            deserializedChatChoice.message = message;
            deserializedChatChoice.finishDetails = finishDetails;
            deserializedChatChoice.delta = delta;
            deserializedChatChoice.contentFilterResults = contentFilterResults;
            deserializedChatChoice.enhancements = enhancements;
            return deserializedChatChoice;
        });
    }
}
