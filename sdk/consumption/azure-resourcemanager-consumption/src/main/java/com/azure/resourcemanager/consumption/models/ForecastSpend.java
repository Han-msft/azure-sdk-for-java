// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The forecasted cost which is being tracked for a budget.
 */
@Immutable
public final class ForecastSpend implements JsonSerializable<ForecastSpend> {
    /*
     * The forecasted cost for the total time period which is being tracked by the budget. This value is only provided
     * if the budget contains a forecast alert type.
     */
    private BigDecimal amount;

    /*
     * The unit of measure for the budget amount.
     */
    private String unit;

    /**
     * Creates an instance of ForecastSpend class.
     */
    public ForecastSpend() {
    }

    /**
     * Get the amount property: The forecasted cost for the total time period which is being tracked by the budget. This
     * value is only provided if the budget contains a forecast alert type.
     * 
     * @return the amount value.
     */
    public BigDecimal amount() {
        return this.amount;
    }

    /**
     * Get the unit property: The unit of measure for the budget amount.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ForecastSpend from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ForecastSpend if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ForecastSpend.
     */
    public static ForecastSpend fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ForecastSpend deserializedForecastSpend = new ForecastSpend();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("amount".equals(fieldName)) {
                    deserializedForecastSpend.amount
                        = reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString()));
                } else if ("unit".equals(fieldName)) {
                    deserializedForecastSpend.unit = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedForecastSpend;
        });
    }
}
