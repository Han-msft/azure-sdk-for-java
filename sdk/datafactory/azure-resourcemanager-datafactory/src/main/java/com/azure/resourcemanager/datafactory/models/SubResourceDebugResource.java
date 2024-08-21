// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure Data Factory nested debug resource.
 */
@Fluent
public class SubResourceDebugResource implements JsonSerializable<SubResourceDebugResource> {
    /*
     * The resource name.
     */
    private String name;

    /**
     * Creates an instance of SubResourceDebugResource class.
     */
    public SubResourceDebugResource() {
    }

    /**
     * Get the name property: The resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource name.
     * 
     * @param name the name value to set.
     * @return the SubResourceDebugResource object itself.
     */
    public SubResourceDebugResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubResourceDebugResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubResourceDebugResource if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubResourceDebugResource.
     */
    public static SubResourceDebugResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubResourceDebugResource deserializedSubResourceDebugResource = new SubResourceDebugResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSubResourceDebugResource.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubResourceDebugResource;
        });
    }
}
