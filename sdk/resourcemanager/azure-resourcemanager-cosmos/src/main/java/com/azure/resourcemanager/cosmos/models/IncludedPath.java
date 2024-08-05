// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The paths that are included in indexing.
 */
@Fluent
public final class IncludedPath implements JsonSerializable<IncludedPath> {
    /*
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard
     * (/path/*)
     */
    private String path;

    /*
     * List of indexes for this path
     */
    private List<Indexes> indexes;

    /**
     * Creates an instance of IncludedPath class.
     */
    public IncludedPath() {
    }

    /**
     * Get the path property: The path for which the indexing behavior applies to. Index paths typically start with root
     * and end with wildcard (/path/*).
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path for which the indexing behavior applies to. Index paths typically start with root
     * and end with wildcard (/path/*).
     * 
     * @param path the path value to set.
     * @return the IncludedPath object itself.
     */
    public IncludedPath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the indexes property: List of indexes for this path.
     * 
     * @return the indexes value.
     */
    public List<Indexes> indexes() {
        return this.indexes;
    }

    /**
     * Set the indexes property: List of indexes for this path.
     * 
     * @param indexes the indexes value to set.
     * @return the IncludedPath object itself.
     */
    public IncludedPath withIndexes(List<Indexes> indexes) {
        this.indexes = indexes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (indexes() != null) {
            indexes().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("path", this.path);
        jsonWriter.writeArrayField("indexes", this.indexes, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IncludedPath from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IncludedPath if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the IncludedPath.
     */
    public static IncludedPath fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IncludedPath deserializedIncludedPath = new IncludedPath();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("path".equals(fieldName)) {
                    deserializedIncludedPath.path = reader.getString();
                } else if ("indexes".equals(fieldName)) {
                    List<Indexes> indexes = reader.readArray(reader1 -> Indexes.fromJson(reader1));
                    deserializedIncludedPath.indexes = indexes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIncludedPath;
        });
    }
}
