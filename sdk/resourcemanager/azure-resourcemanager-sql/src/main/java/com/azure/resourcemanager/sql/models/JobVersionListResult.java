// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.fluent.models.JobVersionInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of job versions.
 */
@Immutable
public final class JobVersionListResult implements JsonSerializable<JobVersionListResult> {
    /*
     * Array of results.
     */
    private List<JobVersionInner> value;

    /*
     * Link to retrieve next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of JobVersionListResult class.
     */
    public JobVersionListResult() {
    }

    /**
     * Get the value property: Array of results.
     * 
     * @return the value value.
     */
    public List<JobVersionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
     * Reads an instance of JobVersionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobVersionListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobVersionListResult.
     */
    public static JobVersionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobVersionListResult deserializedJobVersionListResult = new JobVersionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<JobVersionInner> value = reader.readArray(reader1 -> JobVersionInner.fromJson(reader1));
                    deserializedJobVersionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedJobVersionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobVersionListResult;
        });
    }
}
