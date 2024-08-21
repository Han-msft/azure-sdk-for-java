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

/**
 * Factory's git repo information.
 */
@Fluent
public final class FactoryRepoUpdate implements JsonSerializable<FactoryRepoUpdate> {
    /*
     * The factory resource id.
     */
    private String factoryResourceId;

    /*
     * Git repo information of the factory.
     */
    private FactoryRepoConfiguration repoConfiguration;

    /**
     * Creates an instance of FactoryRepoUpdate class.
     */
    public FactoryRepoUpdate() {
    }

    /**
     * Get the factoryResourceId property: The factory resource id.
     * 
     * @return the factoryResourceId value.
     */
    public String factoryResourceId() {
        return this.factoryResourceId;
    }

    /**
     * Set the factoryResourceId property: The factory resource id.
     * 
     * @param factoryResourceId the factoryResourceId value to set.
     * @return the FactoryRepoUpdate object itself.
     */
    public FactoryRepoUpdate withFactoryResourceId(String factoryResourceId) {
        this.factoryResourceId = factoryResourceId;
        return this;
    }

    /**
     * Get the repoConfiguration property: Git repo information of the factory.
     * 
     * @return the repoConfiguration value.
     */
    public FactoryRepoConfiguration repoConfiguration() {
        return this.repoConfiguration;
    }

    /**
     * Set the repoConfiguration property: Git repo information of the factory.
     * 
     * @param repoConfiguration the repoConfiguration value to set.
     * @return the FactoryRepoUpdate object itself.
     */
    public FactoryRepoUpdate withRepoConfiguration(FactoryRepoConfiguration repoConfiguration) {
        this.repoConfiguration = repoConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (repoConfiguration() != null) {
            repoConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("factoryResourceId", this.factoryResourceId);
        jsonWriter.writeJsonField("repoConfiguration", this.repoConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FactoryRepoUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FactoryRepoUpdate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FactoryRepoUpdate.
     */
    public static FactoryRepoUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FactoryRepoUpdate deserializedFactoryRepoUpdate = new FactoryRepoUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("factoryResourceId".equals(fieldName)) {
                    deserializedFactoryRepoUpdate.factoryResourceId = reader.getString();
                } else if ("repoConfiguration".equals(fieldName)) {
                    deserializedFactoryRepoUpdate.repoConfiguration = FactoryRepoConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFactoryRepoUpdate;
        });
    }
}
