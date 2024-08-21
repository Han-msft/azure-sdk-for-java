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
import com.azure.resourcemanager.datafactory.fluent.models.FactoryInner;
import java.io.IOException;
import java.util.List;

/**
 * A list of factory resources.
 */
@Fluent
public final class FactoryListResponse implements JsonSerializable<FactoryListResponse> {
    /*
     * List of factories.
     */
    private List<FactoryInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    private String nextLink;

    /**
     * Creates an instance of FactoryListResponse class.
     */
    public FactoryListResponse() {
    }

    /**
     * Get the value property: List of factories.
     * 
     * @return the value value.
     */
    public List<FactoryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of factories.
     * 
     * @param value the value value to set.
     * @return the FactoryListResponse object itself.
     */
    public FactoryListResponse withValue(List<FactoryInner> value) {
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
     * @return the FactoryListResponse object itself.
     */
    public FactoryListResponse withNextLink(String nextLink) {
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
                .log(new IllegalArgumentException("Missing required property value in model FactoryListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FactoryListResponse.class);

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
     * Reads an instance of FactoryListResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FactoryListResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FactoryListResponse.
     */
    public static FactoryListResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FactoryListResponse deserializedFactoryListResponse = new FactoryListResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<FactoryInner> value = reader.readArray(reader1 -> FactoryInner.fromJson(reader1));
                    deserializedFactoryListResponse.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedFactoryListResponse.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFactoryListResponse;
        });
    }
}
