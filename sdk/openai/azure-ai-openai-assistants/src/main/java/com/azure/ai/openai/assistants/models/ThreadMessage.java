// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;

/**
 * A single, existing message within an assistant thread.
 */
@Immutable
public final class ThreadMessage implements JsonSerializable<ThreadMessage> {

    /*
     * The identifier, which can be referenced in API endpoints.
     */
    @Generated
    private final String id;

    /*
     * The object type, which is always 'thread.message'.
     */
    @Generated
    private final String object = "thread.message";

    /*
     * The Unix timestamp, in seconds, representing when this object was created.
     */
    @Generated
    private final long createdAt;

    /*
     * The ID of the thread that this message belongs to.
     */
    @Generated
    private final String threadId;

    /*
     * The role associated with the assistant thread message.
     */
    @Generated
    private final MessageRole role;

    /*
     * The list of content items associated with the assistant thread message.
     */
    @Generated
    private final List<MessageContent> content;

    /*
     * If applicable, the ID of the assistant that authored this message.
     */
    @Generated
    private String assistantId;

    /*
     * If applicable, the ID of the run associated with the authoring of this message.
     */
    @Generated
    private String runId;

    /*
     * A list of file IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can
     * access files.
     */
    @Generated
    private final List<String> fileIds;

    /*
     * A set of up to 16 key/value pairs that can be attached to an object, used for storing additional information
     * about that object in a structured format. Keys may be up to 64 characters in length and values may be up to 512
     * characters in length.
     */
    @Generated
    private final Map<String, String> metadata;

    /**
     * Get the id property: The identifier, which can be referenced in API endpoints.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the object property: The object type, which is always 'thread.message'.
     *
     * @return the object value.
     */
    @Generated
    public String getObject() {
        return this.object;
    }

    /**
     * Get the createdAt property: The Unix timestamp, in seconds, representing when this object was created.
     *
     * @return the createdAt value.
     */
    @Generated
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }

    /**
     * Get the threadId property: The ID of the thread that this message belongs to.
     *
     * @return the threadId value.
     */
    @Generated
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * Get the role property: The role associated with the assistant thread message.
     *
     * @return the role value.
     */
    @Generated
    public MessageRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The list of content items associated with the assistant thread message.
     *
     * @return the content value.
     */
    @Generated
    public List<MessageContent> getContent() {
        return this.content;
    }

    /**
     * Get the assistantId property: If applicable, the ID of the assistant that authored this message.
     *
     * @return the assistantId value.
     */
    @Generated
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * Get the runId property: If applicable, the ID of the run associated with the authoring of this message.
     *
     * @return the runId value.
     */
    @Generated
    public String getRunId() {
        return this.runId;
    }

    /**
     * Get the fileIds property: A list of file IDs that the assistant should use. Useful for tools like retrieval and
     * code_interpreter that can
     * access files.
     *
     * @return the fileIds value.
     */
    @Generated
    public List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * Get the metadata property: A set of up to 16 key/value pairs that can be attached to an object, used for storing
     * additional information about that object in a structured format. Keys may be up to 64 characters in length and
     * values may be up to 512 characters in length.
     *
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Creates an instance of ThreadMessage class.
     *
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param threadId the threadId value to set.
     * @param role the role value to set.
     * @param content the content value to set.
     * @param fileIds the fileIds value to set.
     * @param metadata the metadata value to set.
     */
    @Generated
    private ThreadMessage(String id, OffsetDateTime createdAt, String threadId, MessageRole role,
        List<MessageContent> content, List<String> fileIds, Map<String, String> metadata) {
        this.id = id;
        if (createdAt == null) {
            this.createdAt = 0L;
        } else {
            this.createdAt = createdAt.toEpochSecond();
        }
        this.threadId = threadId;
        this.role = role;
        this.content = content;
        this.fileIds = fileIds;
        this.metadata = metadata;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("object", this.object);
        jsonWriter.writeLongField("created_at", this.createdAt);
        jsonWriter.writeStringField("thread_id", this.threadId);
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        jsonWriter.writeArrayField("content", this.content, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("file_ids", this.fileIds, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("assistant_id", this.assistantId);
        jsonWriter.writeStringField("run_id", this.runId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ThreadMessage from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ThreadMessage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ThreadMessage.
     */
    @Generated
    public static ThreadMessage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime createdAt = null;
            String threadId = null;
            MessageRole role = null;
            List<MessageContent> content = null;
            List<String> fileIds = null;
            Map<String, String> metadata = null;
            String assistantId = null;
            String runId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("created_at".equals(fieldName)) {
                    createdAt = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("thread_id".equals(fieldName)) {
                    threadId = reader.getString();
                } else if ("role".equals(fieldName)) {
                    role = MessageRole.fromString(reader.getString());
                } else if ("content".equals(fieldName)) {
                    content = reader.readArray(reader1 -> MessageContent.fromJson(reader1));
                } else if ("file_ids".equals(fieldName)) {
                    fileIds = reader.readArray(reader1 -> reader1.getString());
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readMap(reader1 -> reader1.getString());
                } else if ("assistant_id".equals(fieldName)) {
                    assistantId = reader.getString();
                } else if ("run_id".equals(fieldName)) {
                    runId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ThreadMessage deserializedThreadMessage
                = new ThreadMessage(id, createdAt, threadId, role, content, fileIds, metadata);
            deserializedThreadMessage.assistantId = assistantId;
            deserializedThreadMessage.runId = runId;
            return deserializedThreadMessage;
        });
    }
}
