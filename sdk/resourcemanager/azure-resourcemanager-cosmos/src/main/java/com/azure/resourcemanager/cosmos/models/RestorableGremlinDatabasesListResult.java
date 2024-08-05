// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.RestorableGremlinDatabaseGetResultInner;
import java.io.IOException;
import java.util.List;

/**
 * The List operation response, that contains the Gremlin database events and their properties.
 */
@Immutable
public final class RestorableGremlinDatabasesListResult
    implements JsonSerializable<RestorableGremlinDatabasesListResult> {
    /*
     * List of Gremlin database events and their properties.
     */
    private List<RestorableGremlinDatabaseGetResultInner> value;

    /**
     * Creates an instance of RestorableGremlinDatabasesListResult class.
     */
    public RestorableGremlinDatabasesListResult() {
    }

    /**
     * Get the value property: List of Gremlin database events and their properties.
     * 
     * @return the value value.
     */
    public List<RestorableGremlinDatabaseGetResultInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
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
     * Reads an instance of RestorableGremlinDatabasesListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableGremlinDatabasesListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorableGremlinDatabasesListResult.
     */
    public static RestorableGremlinDatabasesListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableGremlinDatabasesListResult deserializedRestorableGremlinDatabasesListResult
                = new RestorableGremlinDatabasesListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RestorableGremlinDatabaseGetResultInner> value
                        = reader.readArray(reader1 -> RestorableGremlinDatabaseGetResultInner.fromJson(reader1));
                    deserializedRestorableGremlinDatabasesListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableGremlinDatabasesListResult;
        });
    }
}
