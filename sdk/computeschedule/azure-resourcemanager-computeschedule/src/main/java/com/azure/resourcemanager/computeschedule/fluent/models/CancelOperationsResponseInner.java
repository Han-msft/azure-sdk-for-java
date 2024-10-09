// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.computeschedule.models.ResourceOperation;
import java.io.IOException;
import java.util.List;

/**
 * This is the response from a cancel operations request.
 */
@Immutable
public final class CancelOperationsResponseInner implements JsonSerializable<CancelOperationsResponseInner> {
    /*
     * An array of resource operations that were successfully cancelled
     */
    private List<ResourceOperation> results;

    /**
     * Creates an instance of CancelOperationsResponseInner class.
     */
    private CancelOperationsResponseInner() {
    }

    /**
     * Get the results property: An array of resource operations that were successfully cancelled.
     * 
     * @return the results value.
     */
    public List<ResourceOperation> results() {
        return this.results;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (results() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property results in model CancelOperationsResponseInner"));
        } else {
            results().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CancelOperationsResponseInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("results", this.results, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CancelOperationsResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CancelOperationsResponseInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CancelOperationsResponseInner.
     */
    public static CancelOperationsResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CancelOperationsResponseInner deserializedCancelOperationsResponseInner
                = new CancelOperationsResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("results".equals(fieldName)) {
                    List<ResourceOperation> results = reader.readArray(reader1 -> ResourceOperation.fromJson(reader1));
                    deserializedCancelOperationsResponseInner.results = results;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCancelOperationsResponseInner;
        });
    }
}
