// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The ObservedHeader model.
 */
@Immutable
public final class ObservedHeader extends ObservedValue {

    /*
     * The headerName property.
     */
    @Generated
    private String headerName;

    /*
     * The headerValue property.
     */
    @Generated
    private String headerValue;

    /*
     * The firstSeen property.
     */
    @Generated
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    private Long count;

    /*
     * The recent property.
     */
    @Generated
    private Boolean recent;

    /**
     * Creates an instance of ObservedHeader class.
     */
    @Generated
    private ObservedHeader() {
    }

    /**
     * Get the headerName property: The headerName property.
     *
     * @return the headerName value.
     */
    @Generated
    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * Get the headerValue property: The headerValue property.
     *
     * @return the headerValue value.
     */
    @Generated
    public String getHeaderValue() {
        return this.headerValue;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    @Override
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    @Override
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    @Override
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the recent property: The recent property.
     *
     * @return the recent value.
     */
    @Generated
    @Override
    public Boolean isRecent() {
        return this.recent;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("firstSeen",
            getFirstSeen() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getFirstSeen()));
        jsonWriter.writeStringField("lastSeen",
            getLastSeen() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getLastSeen()));
        jsonWriter.writeNumberField("count", getCount());
        jsonWriter.writeBooleanField("recent", isRecent());
        jsonWriter.writeStringField("headerName", this.headerName);
        jsonWriter.writeStringField("headerValue", this.headerValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ObservedHeader from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ObservedHeader if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ObservedHeader.
     */
    @Generated
    public static ObservedHeader fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ObservedHeader deserializedObservedHeader = new ObservedHeader();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("firstSeen".equals(fieldName)) {
                    deserializedObservedHeader.firstSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastSeen".equals(fieldName)) {
                    deserializedObservedHeader.lastSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("count".equals(fieldName)) {
                    deserializedObservedHeader.count = reader.getNullable(JsonReader::getLong);
                } else if ("recent".equals(fieldName)) {
                    deserializedObservedHeader.recent = reader.getNullable(JsonReader::getBoolean);
                } else if ("headerName".equals(fieldName)) {
                    deserializedObservedHeader.headerName = reader.getString();
                } else if ("headerValue".equals(fieldName)) {
                    deserializedObservedHeader.headerValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedObservedHeader;
        });
    }
}
