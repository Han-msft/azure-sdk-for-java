// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.edgeorder.fluent.models.OrderItemResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * List of orderItems.
 */
@Fluent
public final class OrderItemResourceList implements JsonSerializable<OrderItemResourceList> {
    /*
     * List of order item resources.
     */
    private List<OrderItemResourceInner> value;

    /*
     * Link for the next set of order item resources.
     */
    private String nextLink;

    /**
     * Creates an instance of OrderItemResourceList class.
     */
    public OrderItemResourceList() {
    }

    /**
     * Get the value property: List of order item resources.
     * 
     * @return the value value.
     */
    public List<OrderItemResourceInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link for the next set of order item resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link for the next set of order item resources.
     * 
     * @param nextLink the nextLink value to set.
     * @return the OrderItemResourceList object itself.
     */
    public OrderItemResourceList withNextLink(String nextLink) {
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OrderItemResourceList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OrderItemResourceList if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OrderItemResourceList.
     */
    public static OrderItemResourceList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OrderItemResourceList deserializedOrderItemResourceList = new OrderItemResourceList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OrderItemResourceInner> value
                        = reader.readArray(reader1 -> OrderItemResourceInner.fromJson(reader1));
                    deserializedOrderItemResourceList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOrderItemResourceList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOrderItemResourceList;
        });
    }
}
