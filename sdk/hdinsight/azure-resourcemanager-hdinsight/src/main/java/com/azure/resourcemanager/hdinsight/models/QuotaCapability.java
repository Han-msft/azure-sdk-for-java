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
import java.util.List;

/**
 * The regional quota capability.
 */
@Fluent
public final class QuotaCapability implements JsonSerializable<QuotaCapability> {
    /*
     * The number of cores used in the subscription.
     */
    private Long coresUsed;

    /*
     * The number of cores that the subscription allowed.
     */
    private Long maxCoresAllowed;

    /*
     * The list of region quota capabilities.
     */
    private List<RegionalQuotaCapability> regionalQuotas;

    /**
     * Creates an instance of QuotaCapability class.
     */
    public QuotaCapability() {
    }

    /**
     * Get the coresUsed property: The number of cores used in the subscription.
     * 
     * @return the coresUsed value.
     */
    public Long coresUsed() {
        return this.coresUsed;
    }

    /**
     * Set the coresUsed property: The number of cores used in the subscription.
     * 
     * @param coresUsed the coresUsed value to set.
     * @return the QuotaCapability object itself.
     */
    public QuotaCapability withCoresUsed(Long coresUsed) {
        this.coresUsed = coresUsed;
        return this;
    }

    /**
     * Get the maxCoresAllowed property: The number of cores that the subscription allowed.
     * 
     * @return the maxCoresAllowed value.
     */
    public Long maxCoresAllowed() {
        return this.maxCoresAllowed;
    }

    /**
     * Set the maxCoresAllowed property: The number of cores that the subscription allowed.
     * 
     * @param maxCoresAllowed the maxCoresAllowed value to set.
     * @return the QuotaCapability object itself.
     */
    public QuotaCapability withMaxCoresAllowed(Long maxCoresAllowed) {
        this.maxCoresAllowed = maxCoresAllowed;
        return this;
    }

    /**
     * Get the regionalQuotas property: The list of region quota capabilities.
     * 
     * @return the regionalQuotas value.
     */
    public List<RegionalQuotaCapability> regionalQuotas() {
        return this.regionalQuotas;
    }

    /**
     * Set the regionalQuotas property: The list of region quota capabilities.
     * 
     * @param regionalQuotas the regionalQuotas value to set.
     * @return the QuotaCapability object itself.
     */
    public QuotaCapability withRegionalQuotas(List<RegionalQuotaCapability> regionalQuotas) {
        this.regionalQuotas = regionalQuotas;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (regionalQuotas() != null) {
            regionalQuotas().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("coresUsed", this.coresUsed);
        jsonWriter.writeNumberField("maxCoresAllowed", this.maxCoresAllowed);
        jsonWriter.writeArrayField("regionalQuotas", this.regionalQuotas,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QuotaCapability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuotaCapability if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the QuotaCapability.
     */
    public static QuotaCapability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuotaCapability deserializedQuotaCapability = new QuotaCapability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("coresUsed".equals(fieldName)) {
                    deserializedQuotaCapability.coresUsed = reader.getNullable(JsonReader::getLong);
                } else if ("maxCoresAllowed".equals(fieldName)) {
                    deserializedQuotaCapability.maxCoresAllowed = reader.getNullable(JsonReader::getLong);
                } else if ("regionalQuotas".equals(fieldName)) {
                    List<RegionalQuotaCapability> regionalQuotas
                        = reader.readArray(reader1 -> RegionalQuotaCapability.fromJson(reader1));
                    deserializedQuotaCapability.regionalQuotas = regionalQuotas;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedQuotaCapability;
        });
    }
}
