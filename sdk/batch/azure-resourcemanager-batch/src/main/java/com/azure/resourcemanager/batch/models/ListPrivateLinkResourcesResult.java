// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.batch.fluent.models.PrivateLinkResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Values returned by the List operation.
 */
@Fluent
public final class ListPrivateLinkResourcesResult implements JsonSerializable<ListPrivateLinkResourcesResult> {
    /*
     * The collection of returned private link resources.
     */
    private List<PrivateLinkResourceInner> value;

    /*
     * The continuation token.
     */
    private String nextLink;

    /**
     * Creates an instance of ListPrivateLinkResourcesResult class.
     */
    public ListPrivateLinkResourcesResult() {
    }

    /**
     * Get the value property: The collection of returned private link resources.
     * 
     * @return the value value.
     */
    public List<PrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of returned private link resources.
     * 
     * @param value the value value to set.
     * @return the ListPrivateLinkResourcesResult object itself.
     */
    public ListPrivateLinkResourcesResult withValue(List<PrivateLinkResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The continuation token.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListPrivateLinkResourcesResult object itself.
     */
    public ListPrivateLinkResourcesResult withNextLink(String nextLink) {
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
     * Reads an instance of ListPrivateLinkResourcesResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListPrivateLinkResourcesResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListPrivateLinkResourcesResult.
     */
    public static ListPrivateLinkResourcesResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListPrivateLinkResourcesResult deserializedListPrivateLinkResourcesResult
                = new ListPrivateLinkResourcesResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PrivateLinkResourceInner> value
                        = reader.readArray(reader1 -> PrivateLinkResourceInner.fromJson(reader1));
                    deserializedListPrivateLinkResourcesResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedListPrivateLinkResourcesResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListPrivateLinkResourcesResult;
        });
    }
}
