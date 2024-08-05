// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of a notebook workspace resource.
 */
@Immutable
public final class NotebookWorkspaceProperties implements JsonSerializable<NotebookWorkspaceProperties> {
    /*
     * Specifies the endpoint of Notebook server.
     */
    private String notebookServerEndpoint;

    /*
     * Status of the notebook workspace. Possible values are: Creating, Online, Deleting, Failed, Updating.
     */
    private String status;

    /**
     * Creates an instance of NotebookWorkspaceProperties class.
     */
    public NotebookWorkspaceProperties() {
    }

    /**
     * Get the notebookServerEndpoint property: Specifies the endpoint of Notebook server.
     * 
     * @return the notebookServerEndpoint value.
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }

    /**
     * Get the status property: Status of the notebook workspace. Possible values are: Creating, Online, Deleting,
     * Failed, Updating.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NotebookWorkspaceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NotebookWorkspaceProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NotebookWorkspaceProperties.
     */
    public static NotebookWorkspaceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NotebookWorkspaceProperties deserializedNotebookWorkspaceProperties = new NotebookWorkspaceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("notebookServerEndpoint".equals(fieldName)) {
                    deserializedNotebookWorkspaceProperties.notebookServerEndpoint = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedNotebookWorkspaceProperties.status = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNotebookWorkspaceProperties;
        });
    }
}
