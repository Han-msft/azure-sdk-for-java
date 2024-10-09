// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure Firewall Autoscale Configuration parameters.
 */
@Fluent
public final class AzureFirewallAutoscaleConfiguration
    implements JsonSerializable<AzureFirewallAutoscaleConfiguration> {
    /*
     * The minimum number of capacity units for this azure firewall. Use null to reset the value to the service default.
     */
    private Integer minCapacity;

    /*
     * The maximum number of capacity units for this azure firewall. Use null to reset the value to the service default.
     */
    private Integer maxCapacity;

    /**
     * Creates an instance of AzureFirewallAutoscaleConfiguration class.
     */
    public AzureFirewallAutoscaleConfiguration() {
    }

    /**
     * Get the minCapacity property: The minimum number of capacity units for this azure firewall. Use null to reset the
     * value to the service default.
     * 
     * @return the minCapacity value.
     */
    public Integer minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: The minimum number of capacity units for this azure firewall. Use null to reset the
     * value to the service default.
     * 
     * @param minCapacity the minCapacity value to set.
     * @return the AzureFirewallAutoscaleConfiguration object itself.
     */
    public AzureFirewallAutoscaleConfiguration withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get the maxCapacity property: The maximum number of capacity units for this azure firewall. Use null to reset the
     * value to the service default.
     * 
     * @return the maxCapacity value.
     */
    public Integer maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * Set the maxCapacity property: The maximum number of capacity units for this azure firewall. Use null to reset the
     * value to the service default.
     * 
     * @param maxCapacity the maxCapacity value to set.
     * @return the AzureFirewallAutoscaleConfiguration object itself.
     */
    public AzureFirewallAutoscaleConfiguration withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
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
        jsonWriter.writeNumberField("minCapacity", this.minCapacity);
        jsonWriter.writeNumberField("maxCapacity", this.maxCapacity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFirewallAutoscaleConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallAutoscaleConfiguration if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFirewallAutoscaleConfiguration.
     */
    public static AzureFirewallAutoscaleConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallAutoscaleConfiguration deserializedAzureFirewallAutoscaleConfiguration
                = new AzureFirewallAutoscaleConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minCapacity".equals(fieldName)) {
                    deserializedAzureFirewallAutoscaleConfiguration.minCapacity
                        = reader.getNullable(JsonReader::getInt);
                } else if ("maxCapacity".equals(fieldName)) {
                    deserializedAzureFirewallAutoscaleConfiguration.maxCapacity
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallAutoscaleConfiguration;
        });
    }
}
