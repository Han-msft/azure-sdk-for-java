// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The updatable properties of the StandbyContainerGroupPoolResource.
 */
@Fluent
public final class StandbyContainerGroupPoolResourceUpdateProperties
    implements JsonSerializable<StandbyContainerGroupPoolResourceUpdateProperties> {
    /*
     * Specifies elasticity profile of standby container group pools.
     */
    private StandbyContainerGroupPoolElasticityProfile elasticityProfile;

    /*
     * Specifies container group properties of standby container group pools.
     */
    private ContainerGroupProperties containerGroupProperties;

    /**
     * Creates an instance of StandbyContainerGroupPoolResourceUpdateProperties class.
     */
    public StandbyContainerGroupPoolResourceUpdateProperties() {
    }

    /**
     * Get the elasticityProfile property: Specifies elasticity profile of standby container group pools.
     * 
     * @return the elasticityProfile value.
     */
    public StandbyContainerGroupPoolElasticityProfile elasticityProfile() {
        return this.elasticityProfile;
    }

    /**
     * Set the elasticityProfile property: Specifies elasticity profile of standby container group pools.
     * 
     * @param elasticityProfile the elasticityProfile value to set.
     * @return the StandbyContainerGroupPoolResourceUpdateProperties object itself.
     */
    public StandbyContainerGroupPoolResourceUpdateProperties
        withElasticityProfile(StandbyContainerGroupPoolElasticityProfile elasticityProfile) {
        this.elasticityProfile = elasticityProfile;
        return this;
    }

    /**
     * Get the containerGroupProperties property: Specifies container group properties of standby container group pools.
     * 
     * @return the containerGroupProperties value.
     */
    public ContainerGroupProperties containerGroupProperties() {
        return this.containerGroupProperties;
    }

    /**
     * Set the containerGroupProperties property: Specifies container group properties of standby container group pools.
     * 
     * @param containerGroupProperties the containerGroupProperties value to set.
     * @return the StandbyContainerGroupPoolResourceUpdateProperties object itself.
     */
    public StandbyContainerGroupPoolResourceUpdateProperties
        withContainerGroupProperties(ContainerGroupProperties containerGroupProperties) {
        this.containerGroupProperties = containerGroupProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (elasticityProfile() != null) {
            elasticityProfile().validate();
        }
        if (containerGroupProperties() != null) {
            containerGroupProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("elasticityProfile", this.elasticityProfile);
        jsonWriter.writeJsonField("containerGroupProperties", this.containerGroupProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StandbyContainerGroupPoolResourceUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StandbyContainerGroupPoolResourceUpdateProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StandbyContainerGroupPoolResourceUpdateProperties.
     */
    public static StandbyContainerGroupPoolResourceUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StandbyContainerGroupPoolResourceUpdateProperties deserializedStandbyContainerGroupPoolResourceUpdateProperties
                = new StandbyContainerGroupPoolResourceUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("elasticityProfile".equals(fieldName)) {
                    deserializedStandbyContainerGroupPoolResourceUpdateProperties.elasticityProfile
                        = StandbyContainerGroupPoolElasticityProfile.fromJson(reader);
                } else if ("containerGroupProperties".equals(fieldName)) {
                    deserializedStandbyContainerGroupPoolResourceUpdateProperties.containerGroupProperties
                        = ContainerGroupProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStandbyContainerGroupPoolResourceUpdateProperties;
        });
    }
}
