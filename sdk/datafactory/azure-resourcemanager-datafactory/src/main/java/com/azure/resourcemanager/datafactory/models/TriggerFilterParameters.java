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
 * Query parameters for triggers.
 */
@Fluent
public final class TriggerFilterParameters implements JsonSerializable<TriggerFilterParameters> {
    /*
     * The continuation token for getting the next page of results. Null for first page.
     */
    private String continuationToken;

    /*
     * The name of the parent TumblingWindowTrigger to get the child rerun triggers
     */
    private String parentTriggerName;

    /**
     * Creates an instance of TriggerFilterParameters class.
     */
    public TriggerFilterParameters() {
    }

    /**
     * Get the continuationToken property: The continuation token for getting the next page of results. Null for first
     * page.
     * 
     * @return the continuationToken value.
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: The continuation token for getting the next page of results. Null for first
     * page.
     * 
     * @param continuationToken the continuationToken value to set.
     * @return the TriggerFilterParameters object itself.
     */
    public TriggerFilterParameters withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the parentTriggerName property: The name of the parent TumblingWindowTrigger to get the child rerun triggers.
     * 
     * @return the parentTriggerName value.
     */
    public String parentTriggerName() {
        return this.parentTriggerName;
    }

    /**
     * Set the parentTriggerName property: The name of the parent TumblingWindowTrigger to get the child rerun triggers.
     * 
     * @param parentTriggerName the parentTriggerName value to set.
     * @return the TriggerFilterParameters object itself.
     */
    public TriggerFilterParameters withParentTriggerName(String parentTriggerName) {
        this.parentTriggerName = parentTriggerName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("continuationToken", this.continuationToken);
        jsonWriter.writeStringField("parentTriggerName", this.parentTriggerName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TriggerFilterParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TriggerFilterParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TriggerFilterParameters.
     */
    public static TriggerFilterParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TriggerFilterParameters deserializedTriggerFilterParameters = new TriggerFilterParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("continuationToken".equals(fieldName)) {
                    deserializedTriggerFilterParameters.continuationToken = reader.getString();
                } else if ("parentTriggerName".equals(fieldName)) {
                    deserializedTriggerFilterParameters.parentTriggerName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTriggerFilterParameters;
        });
    }
}
