// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.consumption.fluent.models.ReservationDetailInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of listing reservation details.
 */
@Immutable
public final class ReservationDetailsListResult implements JsonSerializable<ReservationDetailsListResult> {
    /*
     * The list of reservation details.
     */
    private List<ReservationDetailInner> value;

    /*
     * The link (url) to the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ReservationDetailsListResult class.
     */
    public ReservationDetailsListResult() {
    }

    /**
     * Get the value property: The list of reservation details.
     * 
     * @return the value value.
     */
    public List<ReservationDetailInner> value() {
        return this.value;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
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
     * Reads an instance of ReservationDetailsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReservationDetailsListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReservationDetailsListResult.
     */
    public static ReservationDetailsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReservationDetailsListResult deserializedReservationDetailsListResult = new ReservationDetailsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ReservationDetailInner> value
                        = reader.readArray(reader1 -> ReservationDetailInner.fromJson(reader1));
                    deserializedReservationDetailsListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedReservationDetailsListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReservationDetailsListResult;
        });
    }
}
