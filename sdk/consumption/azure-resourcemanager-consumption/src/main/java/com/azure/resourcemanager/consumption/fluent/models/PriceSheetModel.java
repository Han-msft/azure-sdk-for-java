// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.consumption.models.MeterDetails;
import com.azure.resourcemanager.consumption.models.PriceSheetProperties;
import java.io.IOException;
import java.util.List;

/**
 * price sheet result. It contains the pricesheet associated with billing period.
 */
@Immutable
public final class PriceSheetModel implements JsonSerializable<PriceSheetModel> {
    /*
     * Price sheet
     */
    private List<PriceSheetProperties> pricesheets;

    /*
     * The link (url) to the next page of results.
     */
    private String nextLink;

    /*
     * Pricesheet download details.
     */
    private MeterDetails download;

    /**
     * Creates an instance of PriceSheetModel class.
     */
    public PriceSheetModel() {
    }

    /**
     * Get the pricesheets property: Price sheet.
     * 
     * @return the pricesheets value.
     */
    public List<PriceSheetProperties> pricesheets() {
        return this.pricesheets;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the download property: Pricesheet download details.
     * 
     * @return the download value.
     */
    public MeterDetails download() {
        return this.download;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pricesheets() != null) {
            pricesheets().forEach(e -> e.validate());
        }
        if (download() != null) {
            download().validate();
        }
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
     * Reads an instance of PriceSheetModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PriceSheetModel if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PriceSheetModel.
     */
    public static PriceSheetModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PriceSheetModel deserializedPriceSheetModel = new PriceSheetModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("pricesheets".equals(fieldName)) {
                    List<PriceSheetProperties> pricesheets
                        = reader.readArray(reader1 -> PriceSheetProperties.fromJson(reader1));
                    deserializedPriceSheetModel.pricesheets = pricesheets;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPriceSheetModel.nextLink = reader.getString();
                } else if ("download".equals(fieldName)) {
                    deserializedPriceSheetModel.download = MeterDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPriceSheetModel;
        });
    }
}
