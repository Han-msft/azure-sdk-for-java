// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.edgeorder.models.StageDetails;
import java.io.IOException;
import java.util.List;

/**
 * Specifies the properties or parameters for an order. Order is a grouping of one or more order items.
 */
@Immutable
public final class OrderResourceInner extends ProxyResource {
    /*
     * Order properties
     */
    private OrderProperties innerProperties = new OrderProperties();

    /*
     * Represents resource creation and update time
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of OrderResourceInner class.
     */
    public OrderResourceInner() {
    }

    /**
     * Get the innerProperties property: Order properties.
     * 
     * @return the innerProperties value.
     */
    private OrderProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Represents resource creation and update time.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the orderItemIds property: List of order item ARM Ids which are part of an order.
     * 
     * @return the orderItemIds value.
     */
    public List<String> orderItemIds() {
        return this.innerProperties() == null ? null : this.innerProperties().orderItemIds();
    }

    /**
     * Get the currentStage property: Order current status.
     * 
     * @return the currentStage value.
     */
    public StageDetails currentStage() {
        return this.innerProperties() == null ? null : this.innerProperties().currentStage();
    }

    /**
     * Get the orderStageHistory property: Order status history.
     * 
     * @return the orderStageHistory value.
     */
    public List<StageDetails> orderStageHistory() {
        return this.innerProperties() == null ? null : this.innerProperties().orderStageHistory();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model OrderResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OrderResourceInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OrderResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OrderResourceInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OrderResourceInner.
     */
    public static OrderResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OrderResourceInner deserializedOrderResourceInner = new OrderResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedOrderResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedOrderResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedOrderResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedOrderResourceInner.innerProperties = OrderProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedOrderResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOrderResourceInner;
        });
    }
}
