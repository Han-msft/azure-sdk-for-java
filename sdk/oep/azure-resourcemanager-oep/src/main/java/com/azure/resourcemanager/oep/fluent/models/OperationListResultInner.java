// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oep.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.oep.models.Operation;
import java.io.IOException;
import java.util.List;

/**
 * A list of REST API operations supported by an Azure Resource Provider. It contains an URL link to get the next set of
 * results.
 */
@Immutable
public final class OperationListResultInner implements JsonSerializable<OperationListResultInner> {
    /*
     * List of operations supported by the resource provider
     */
    private List<Operation> value;

    /*
     * URL to get the next set of operation list results (if there are any).
     */
    private String nextLink;

    /**
     * Creates an instance of OperationListResultInner class.
     */
    public OperationListResultInner() {
    }

    /**
     * Get the value property: List of operations supported by the resource provider.
     * 
     * @return the value value.
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results (if there are any).
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
     * Reads an instance of OperationListResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationListResultInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationListResultInner.
     */
    public static OperationListResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationListResultInner deserializedOperationListResultInner = new OperationListResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<Operation> value = reader.readArray(reader1 -> Operation.fromJson(reader1));
                    deserializedOperationListResultInner.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOperationListResultInner.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationListResultInner;
        });
    }
}
