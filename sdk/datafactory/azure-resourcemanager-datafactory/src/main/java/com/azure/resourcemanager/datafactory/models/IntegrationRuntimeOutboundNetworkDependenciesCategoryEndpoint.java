// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Azure-SSIS integration runtime outbound network dependency endpoints for one category.
 */
@Fluent
public final class IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint
    implements JsonSerializable<IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint> {
    /*
     * The category of outbound network dependency.
     */
    private String category;

    /*
     * The endpoints for outbound network dependency.
     */
    private List<IntegrationRuntimeOutboundNetworkDependenciesEndpoint> endpoints;

    /**
     * Creates an instance of IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint class.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint() {
    }

    /**
     * Get the category property: The category of outbound network dependency.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category of outbound network dependency.
     * 
     * @param category the category value to set.
     * @return the IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint object itself.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints for outbound network dependency.
     * 
     * @return the endpoints value.
     */
    public List<IntegrationRuntimeOutboundNetworkDependenciesEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints for outbound network dependency.
     * 
     * @param endpoints the endpoints value to set.
     * @return the IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint object itself.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint
        withEndpoints(List<IntegrationRuntimeOutboundNetworkDependenciesEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("category", this.category);
        jsonWriter.writeArrayField("endpoints", this.endpoints, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint.
     */
    public static IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint deserializedIntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint
                = new IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("category".equals(fieldName)) {
                    deserializedIntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint.category
                        = reader.getString();
                } else if ("endpoints".equals(fieldName)) {
                    List<IntegrationRuntimeOutboundNetworkDependenciesEndpoint> endpoints = reader
                        .readArray(reader1 -> IntegrationRuntimeOutboundNetworkDependenciesEndpoint.fromJson(reader1));
                    deserializedIntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint.endpoints = endpoints;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint;
        });
    }
}
