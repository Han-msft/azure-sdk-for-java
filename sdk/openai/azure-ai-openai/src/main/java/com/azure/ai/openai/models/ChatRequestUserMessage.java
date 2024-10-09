// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * A request chat message representing user input to the assistant.
 */
@Fluent
public final class ChatRequestUserMessage extends ChatRequestMessage {

    /*
     * The contents of the user message, with available input types varying by selected model.
     */
    @Generated
    private final BinaryData content;

    private final String stringContent;

    private final List<ChatMessageContentItem> chatMessageContentItems;

    /*
     * An optional name for the participant.
     */
    @Generated
    private String name;

    /**
     * Creates an instance of ChatRequestUserMessage class.
     *
     * @param content the content value to set.
     */
    private ChatRequestUserMessage(BinaryData content) {
        this.content = content;
        this.stringContent = null;
        this.chatMessageContentItems = null;
    }

    /**
     * Creates a new instance of ChatRequestUserMessage using plain text content.
     *
     * @param content The plain text content associated with the message.
     */
    public ChatRequestUserMessage(String content) {
        this.content = BinaryData.fromString(content);
        this.stringContent = content;
        this.chatMessageContentItems = null;
    }

    /**
     * Creates a new instance of ChatRequestUserMessage using a collection of structured content.
     *
     * @param content The collection of structured content associated with the message.
     */
    public ChatRequestUserMessage(ChatMessageContentItem[] content) {
        this.content = BinaryData.fromObject(content);
        this.chatMessageContentItems = Arrays.asList(content);
        this.stringContent = null;
    }

    /**
     * Creates a new instance of ChatRequestUserMessage using a collection of structured content.
     *
     * @param content The collection of structured content associated with the message.
     */
    public ChatRequestUserMessage(List<ChatMessageContentItem> content) {
        this.content = BinaryData.fromObject(content);
        this.stringContent = null;
        this.chatMessageContentItems = content;
    }

    /**
     * Get the content property: The contents of the user message, with available input types varying by selected model.
     *
     * @return the content value.
     */
    @Generated
    public BinaryData getContent() {
        return this.content;
    }

    /**
     * Get the name property: An optional name for the participant.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: An optional name for the participant.
     *
     * @param name the name value to set.
     * @return the ChatRequestUserMessage object itself.
     */
    @Generated
    public ChatRequestUserMessage setName(String name) {
        this.name = name;
        return this;
    }

    /*
     * The chat role associated with this message.
     */
    @Generated
    private ChatRole role = ChatRole.USER;

    /**
     * Get the role property: The chat role associated with this message.
     *
     * @return the role value.
     */
    @Generated
    @Override
    public ChatRole getRole() {
        return this.role;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (stringContent != null) {
            jsonWriter.writeStringField("content", stringContent);
        } else if (chatMessageContentItems != null) {
            jsonWriter.writeArrayField("content", chatMessageContentItems, JsonWriter::writeJson);
        }
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatRequestUserMessage from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatRequestUserMessage if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatRequestUserMessage.
     */
    public static ChatRequestUserMessage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BinaryData content = null;
            ChatRole role = ChatRole.USER;
            String name = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("content".equals(fieldName)) {
                    if (reader.currentToken() == JsonToken.STRING) {
                        content = BinaryData.fromString(reader.getString());
                    } else if (reader.currentToken() == JsonToken.START_ARRAY) {
                        content = BinaryData.fromObject(
                            reader.readArray(arrayReader -> arrayReader.readObject(ChatMessageContentItem::fromJson)));
                    } else if (reader.currentToken() == JsonToken.NULL) {
                        content = null;
                    } else {
                        throw new IllegalStateException("Unexpected 'content' type found when deserializing"
                            + " ChatRequestUserMessage JSON object: " + reader.currentToken());
                    }
                } else if ("role".equals(fieldName)) {
                    role = ChatRole.fromString(reader.getString());
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ChatRequestUserMessage deserializedChatRequestUserMessage = new ChatRequestUserMessage(content);
            deserializedChatRequestUserMessage.role = role;
            deserializedChatRequestUserMessage.name = name;
            return deserializedChatRequestUserMessage;
        });
    }
}
