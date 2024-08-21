// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The regional quota capacity.
 */
@Fluent
public final class RegionalQuotaCapability implements JsonSerializable<RegionalQuotaCapability> {
    /*
     * The region name.
     */
    private String regionName;

    /*
     * The number of cores used in the region.
     */
    private Long coresUsed;

    /*
     * The number of cores available in the region.
     */
    private Long coresAvailable;

    /**
     * Creates an instance of RegionalQuotaCapability class.
     */
    public RegionalQuotaCapability() {
    }

    /**
     * Get the regionName property: The region name.
     * 
     * @return the regionName value.
     */
    public String regionName() {
        return this.regionName;
    }

    /**
     * Set the regionName property: The region name.
     * 
     * @param regionName the regionName value to set.
     * @return the RegionalQuotaCapability object itself.
     */
    public RegionalQuotaCapability withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * Get the coresUsed property: The number of cores used in the region.
     * 
     * @return the coresUsed value.
     */
    public Long coresUsed() {
        return this.coresUsed;
    }

    /**
     * Set the coresUsed property: The number of cores used in the region.
     * 
     * @param coresUsed the coresUsed value to set.
     * @return the RegionalQuotaCapability object itself.
     */
    public RegionalQuotaCapability withCoresUsed(Long coresUsed) {
        this.coresUsed = coresUsed;
        return this;
    }

    /**
     * Get the coresAvailable property: The number of cores available in the region.
     * 
     * @return the coresAvailable value.
     */
    public Long coresAvailable() {
        return this.coresAvailable;
    }

    /**
     * Set the coresAvailable property: The number of cores available in the region.
     * 
     * @param coresAvailable the coresAvailable value to set.
     * @return the RegionalQuotaCapability object itself.
     */
    public RegionalQuotaCapability withCoresAvailable(Long coresAvailable) {
        this.coresAvailable = coresAvailable;
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
        jsonWriter.writeStringField("regionName", this.regionName);
        jsonWriter.writeNumberField("coresUsed", this.coresUsed);
        jsonWriter.writeNumberField("coresAvailable", this.coresAvailable);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegionalQuotaCapability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegionalQuotaCapability if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegionalQuotaCapability.
     */
    public static RegionalQuotaCapability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegionalQuotaCapability deserializedRegionalQuotaCapability = new RegionalQuotaCapability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("regionName".equals(fieldName)) {
                    deserializedRegionalQuotaCapability.regionName = reader.getString();
                } else if ("coresUsed".equals(fieldName)) {
                    deserializedRegionalQuotaCapability.coresUsed = reader.getNullable(JsonReader::getLong);
                } else if ("coresAvailable".equals(fieldName)) {
                    deserializedRegionalQuotaCapability.coresAvailable = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegionalQuotaCapability;
        });
    }
}
