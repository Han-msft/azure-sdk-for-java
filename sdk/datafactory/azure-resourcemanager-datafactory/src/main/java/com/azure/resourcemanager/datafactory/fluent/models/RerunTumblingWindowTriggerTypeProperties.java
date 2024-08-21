// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Rerun Trigger properties.
 */
@Fluent
public final class RerunTumblingWindowTriggerTypeProperties
    implements JsonSerializable<RerunTumblingWindowTriggerTypeProperties> {
    /*
     * The parent trigger reference.
     */
    private Object parentTrigger;

    /*
     * The start time for the time period for which restatement is initiated. Only UTC time is currently supported.
     */
    private OffsetDateTime requestedStartTime;

    /*
     * The end time for the time period for which restatement is initiated. Only UTC time is currently supported.
     */
    private OffsetDateTime requestedEndTime;

    /*
     * The max number of parallel time windows (ready for execution) for which a rerun is triggered.
     */
    private int rerunConcurrency;

    /**
     * Creates an instance of RerunTumblingWindowTriggerTypeProperties class.
     */
    public RerunTumblingWindowTriggerTypeProperties() {
    }

    /**
     * Get the parentTrigger property: The parent trigger reference.
     * 
     * @return the parentTrigger value.
     */
    public Object parentTrigger() {
        return this.parentTrigger;
    }

    /**
     * Set the parentTrigger property: The parent trigger reference.
     * 
     * @param parentTrigger the parentTrigger value to set.
     * @return the RerunTumblingWindowTriggerTypeProperties object itself.
     */
    public RerunTumblingWindowTriggerTypeProperties withParentTrigger(Object parentTrigger) {
        this.parentTrigger = parentTrigger;
        return this;
    }

    /**
     * Get the requestedStartTime property: The start time for the time period for which restatement is initiated. Only
     * UTC time is currently supported.
     * 
     * @return the requestedStartTime value.
     */
    public OffsetDateTime requestedStartTime() {
        return this.requestedStartTime;
    }

    /**
     * Set the requestedStartTime property: The start time for the time period for which restatement is initiated. Only
     * UTC time is currently supported.
     * 
     * @param requestedStartTime the requestedStartTime value to set.
     * @return the RerunTumblingWindowTriggerTypeProperties object itself.
     */
    public RerunTumblingWindowTriggerTypeProperties withRequestedStartTime(OffsetDateTime requestedStartTime) {
        this.requestedStartTime = requestedStartTime;
        return this;
    }

    /**
     * Get the requestedEndTime property: The end time for the time period for which restatement is initiated. Only UTC
     * time is currently supported.
     * 
     * @return the requestedEndTime value.
     */
    public OffsetDateTime requestedEndTime() {
        return this.requestedEndTime;
    }

    /**
     * Set the requestedEndTime property: The end time for the time period for which restatement is initiated. Only UTC
     * time is currently supported.
     * 
     * @param requestedEndTime the requestedEndTime value to set.
     * @return the RerunTumblingWindowTriggerTypeProperties object itself.
     */
    public RerunTumblingWindowTriggerTypeProperties withRequestedEndTime(OffsetDateTime requestedEndTime) {
        this.requestedEndTime = requestedEndTime;
        return this;
    }

    /**
     * Get the rerunConcurrency property: The max number of parallel time windows (ready for execution) for which a
     * rerun is triggered.
     * 
     * @return the rerunConcurrency value.
     */
    public int rerunConcurrency() {
        return this.rerunConcurrency;
    }

    /**
     * Set the rerunConcurrency property: The max number of parallel time windows (ready for execution) for which a
     * rerun is triggered.
     * 
     * @param rerunConcurrency the rerunConcurrency value to set.
     * @return the RerunTumblingWindowTriggerTypeProperties object itself.
     */
    public RerunTumblingWindowTriggerTypeProperties withRerunConcurrency(int rerunConcurrency) {
        this.rerunConcurrency = rerunConcurrency;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parentTrigger() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property parentTrigger in model RerunTumblingWindowTriggerTypeProperties"));
        }
        if (requestedStartTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property requestedStartTime in model RerunTumblingWindowTriggerTypeProperties"));
        }
        if (requestedEndTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property requestedEndTime in model RerunTumblingWindowTriggerTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RerunTumblingWindowTriggerTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("parentTrigger", this.parentTrigger);
        jsonWriter.writeStringField("requestedStartTime",
            this.requestedStartTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.requestedStartTime));
        jsonWriter.writeStringField("requestedEndTime",
            this.requestedEndTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.requestedEndTime));
        jsonWriter.writeIntField("rerunConcurrency", this.rerunConcurrency);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RerunTumblingWindowTriggerTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RerunTumblingWindowTriggerTypeProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RerunTumblingWindowTriggerTypeProperties.
     */
    public static RerunTumblingWindowTriggerTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RerunTumblingWindowTriggerTypeProperties deserializedRerunTumblingWindowTriggerTypeProperties
                = new RerunTumblingWindowTriggerTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("parentTrigger".equals(fieldName)) {
                    deserializedRerunTumblingWindowTriggerTypeProperties.parentTrigger = reader.readUntyped();
                } else if ("requestedStartTime".equals(fieldName)) {
                    deserializedRerunTumblingWindowTriggerTypeProperties.requestedStartTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("requestedEndTime".equals(fieldName)) {
                    deserializedRerunTumblingWindowTriggerTypeProperties.requestedEndTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("rerunConcurrency".equals(fieldName)) {
                    deserializedRerunTumblingWindowTriggerTypeProperties.rerunConcurrency = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRerunTumblingWindowTriggerTypeProperties;
        });
    }
}
