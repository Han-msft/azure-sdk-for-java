// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Ssis folder.
 */
@Fluent
public final class SsisFolder extends SsisObjectMetadata {
    /*
     * Type of metadata.
     */
    private SsisObjectMetadataType type = SsisObjectMetadataType.FOLDER;

    /**
     * Creates an instance of SsisFolder class.
     */
    public SsisFolder() {
    }

    /**
     * Get the type property: Type of metadata.
     * 
     * @return the type value.
     */
    @Override
    public SsisObjectMetadataType type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsisFolder withId(Long id) {
        super.withId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsisFolder withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsisFolder withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("id", id());
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SsisFolder from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SsisFolder if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SsisFolder.
     */
    public static SsisFolder fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SsisFolder deserializedSsisFolder = new SsisFolder();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSsisFolder.withId(reader.getNullable(JsonReader::getLong));
                } else if ("name".equals(fieldName)) {
                    deserializedSsisFolder.withName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedSsisFolder.withDescription(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedSsisFolder.type = SsisObjectMetadataType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSsisFolder;
        });
    }
}
