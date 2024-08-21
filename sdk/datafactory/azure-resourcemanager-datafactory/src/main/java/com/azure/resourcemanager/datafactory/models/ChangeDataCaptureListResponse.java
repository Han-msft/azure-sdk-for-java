// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.ChangeDataCaptureResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of change data capture resources.
 */
@Fluent
public final class ChangeDataCaptureListResponse implements JsonSerializable<ChangeDataCaptureListResponse> {
    /*
     * Lists all resources of type change data capture.
     */
    private List<ChangeDataCaptureResourceInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    private String nextLink;

    /**
     * Creates an instance of ChangeDataCaptureListResponse class.
     */
    public ChangeDataCaptureListResponse() {
    }

    /**
     * Get the value property: Lists all resources of type change data capture.
     * 
     * @return the value value.
     */
    public List<ChangeDataCaptureResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Lists all resources of type change data capture.
     * 
     * @param value the value value to set.
     * @return the ChangeDataCaptureListResponse object itself.
     */
    public ChangeDataCaptureListResponse withValue(List<ChangeDataCaptureResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ChangeDataCaptureListResponse object itself.
     */
    public ChangeDataCaptureListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model ChangeDataCaptureListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ChangeDataCaptureListResponse.class);

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
     * Reads an instance of ChangeDataCaptureListResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChangeDataCaptureListResponse if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChangeDataCaptureListResponse.
     */
    public static ChangeDataCaptureListResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChangeDataCaptureListResponse deserializedChangeDataCaptureListResponse
                = new ChangeDataCaptureListResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ChangeDataCaptureResourceInner> value
                        = reader.readArray(reader1 -> ChangeDataCaptureResourceInner.fromJson(reader1));
                    deserializedChangeDataCaptureListResponse.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedChangeDataCaptureListResponse.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChangeDataCaptureListResponse;
        });
    }
}
