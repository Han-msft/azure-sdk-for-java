// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.batch.fluent.models.OperationInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the request to list REST API operations. It contains a list of operations and a URL nextLink to get the
 * next set of results.
 */
@Fluent
public final class OperationListResult implements JsonSerializable<OperationListResult> {
    /*
     * The list of operations supported by the resource provider.
     */
    private List<OperationInner> value;

    /*
     * The URL to get the next set of operation list results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of OperationListResult class.
     */
    public OperationListResult() {
    }

    /**
     * Get the value property: The list of operations supported by the resource provider.
     * 
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of operations supported by the resource provider.
     * 
     * @param value the value value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of operation list results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of operation list results if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationListResult.
     */
    public static OperationListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationListResult deserializedOperationListResult = new OperationListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OperationInner> value = reader.readArray(reader1 -> OperationInner.fromJson(reader1));
                    deserializedOperationListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOperationListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationListResult;
        });
    }
}
