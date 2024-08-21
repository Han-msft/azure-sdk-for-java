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
import com.azure.resourcemanager.datafactory.models.DependencyReference;
import com.azure.resourcemanager.datafactory.models.RetryPolicy;
import com.azure.resourcemanager.datafactory.models.TumblingWindowFrequency;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Tumbling Window Trigger properties.
 */
@Fluent
public final class TumblingWindowTriggerTypeProperties
    implements JsonSerializable<TumblingWindowTriggerTypeProperties> {
    /*
     * The frequency of the time windows.
     */
    private TumblingWindowFrequency frequency;

    /*
     * The interval of the time windows. The minimum interval allowed is 15 Minutes.
     */
    private int interval;

    /*
     * The start time for the time period for the trigger during which events are fired for windows that are ready. Only
     * UTC time is currently supported.
     */
    private OffsetDateTime startTime;

    /*
     * The end time for the time period for the trigger during which events are fired for windows that are ready. Only
     * UTC time is currently supported.
     */
    private OffsetDateTime endTime;

    /*
     * Specifies how long the trigger waits past due time before triggering new run. It doesn't alter window start and
     * end time. The default is 0. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    private Object delay;

    /*
     * The max number of parallel time windows (ready for execution) for which a new run is triggered.
     */
    private int maxConcurrency;

    /*
     * Retry policy that will be applied for failed pipeline runs.
     */
    private RetryPolicy retryPolicy;

    /*
     * Triggers that this trigger depends on. Only tumbling window triggers are supported.
     */
    private List<DependencyReference> dependsOn;

    /**
     * Creates an instance of TumblingWindowTriggerTypeProperties class.
     */
    public TumblingWindowTriggerTypeProperties() {
    }

    /**
     * Get the frequency property: The frequency of the time windows.
     * 
     * @return the frequency value.
     */
    public TumblingWindowFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: The frequency of the time windows.
     * 
     * @param frequency the frequency value to set.
     * @return the TumblingWindowTriggerTypeProperties object itself.
     */
    public TumblingWindowTriggerTypeProperties withFrequency(TumblingWindowFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the interval property: The interval of the time windows. The minimum interval allowed is 15 Minutes.
     * 
     * @return the interval value.
     */
    public int interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval of the time windows. The minimum interval allowed is 15 Minutes.
     * 
     * @param interval the interval value to set.
     * @return the TumblingWindowTriggerTypeProperties object itself.
     */
    public TumblingWindowTriggerTypeProperties withInterval(int interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the startTime property: The start time for the time period for the trigger during which events are fired for
     * windows that are ready. Only UTC time is currently supported.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time for the time period for the trigger during which events are fired for
     * windows that are ready. Only UTC time is currently supported.
     * 
     * @param startTime the startTime value to set.
     * @return the TumblingWindowTriggerTypeProperties object itself.
     */
    public TumblingWindowTriggerTypeProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time for the time period for the trigger during which events are fired for
     * windows that are ready. Only UTC time is currently supported.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time for the time period for the trigger during which events are fired for
     * windows that are ready. Only UTC time is currently supported.
     * 
     * @param endTime the endTime value to set.
     * @return the TumblingWindowTriggerTypeProperties object itself.
     */
    public TumblingWindowTriggerTypeProperties withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the delay property: Specifies how long the trigger waits past due time before triggering new run. It doesn't
     * alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the delay value.
     */
    public Object delay() {
        return this.delay;
    }

    /**
     * Set the delay property: Specifies how long the trigger waits past due time before triggering new run. It doesn't
     * alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param delay the delay value to set.
     * @return the TumblingWindowTriggerTypeProperties object itself.
     */
    public TumblingWindowTriggerTypeProperties withDelay(Object delay) {
        this.delay = delay;
        return this;
    }

    /**
     * Get the maxConcurrency property: The max number of parallel time windows (ready for execution) for which a new
     * run is triggered.
     * 
     * @return the maxConcurrency value.
     */
    public int maxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the maxConcurrency property: The max number of parallel time windows (ready for execution) for which a new
     * run is triggered.
     * 
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the TumblingWindowTriggerTypeProperties object itself.
     */
    public TumblingWindowTriggerTypeProperties withMaxConcurrency(int maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * Get the retryPolicy property: Retry policy that will be applied for failed pipeline runs.
     * 
     * @return the retryPolicy value.
     */
    public RetryPolicy retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Set the retryPolicy property: Retry policy that will be applied for failed pipeline runs.
     * 
     * @param retryPolicy the retryPolicy value to set.
     * @return the TumblingWindowTriggerTypeProperties object itself.
     */
    public TumblingWindowTriggerTypeProperties withRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Get the dependsOn property: Triggers that this trigger depends on. Only tumbling window triggers are supported.
     * 
     * @return the dependsOn value.
     */
    public List<DependencyReference> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: Triggers that this trigger depends on. Only tumbling window triggers are supported.
     * 
     * @param dependsOn the dependsOn value to set.
     * @return the TumblingWindowTriggerTypeProperties object itself.
     */
    public TumblingWindowTriggerTypeProperties withDependsOn(List<DependencyReference> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frequency() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property frequency in model TumblingWindowTriggerTypeProperties"));
        }
        if (startTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property startTime in model TumblingWindowTriggerTypeProperties"));
        }
        if (retryPolicy() != null) {
            retryPolicy().validate();
        }
        if (dependsOn() != null) {
            dependsOn().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TumblingWindowTriggerTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("frequency", this.frequency == null ? null : this.frequency.toString());
        jsonWriter.writeIntField("interval", this.interval);
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeIntField("maxConcurrency", this.maxConcurrency);
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeUntypedField("delay", this.delay);
        jsonWriter.writeJsonField("retryPolicy", this.retryPolicy);
        jsonWriter.writeArrayField("dependsOn", this.dependsOn, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TumblingWindowTriggerTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TumblingWindowTriggerTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TumblingWindowTriggerTypeProperties.
     */
    public static TumblingWindowTriggerTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TumblingWindowTriggerTypeProperties deserializedTumblingWindowTriggerTypeProperties
                = new TumblingWindowTriggerTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("frequency".equals(fieldName)) {
                    deserializedTumblingWindowTriggerTypeProperties.frequency
                        = TumblingWindowFrequency.fromString(reader.getString());
                } else if ("interval".equals(fieldName)) {
                    deserializedTumblingWindowTriggerTypeProperties.interval = reader.getInt();
                } else if ("startTime".equals(fieldName)) {
                    deserializedTumblingWindowTriggerTypeProperties.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("maxConcurrency".equals(fieldName)) {
                    deserializedTumblingWindowTriggerTypeProperties.maxConcurrency = reader.getInt();
                } else if ("endTime".equals(fieldName)) {
                    deserializedTumblingWindowTriggerTypeProperties.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("delay".equals(fieldName)) {
                    deserializedTumblingWindowTriggerTypeProperties.delay = reader.readUntyped();
                } else if ("retryPolicy".equals(fieldName)) {
                    deserializedTumblingWindowTriggerTypeProperties.retryPolicy = RetryPolicy.fromJson(reader);
                } else if ("dependsOn".equals(fieldName)) {
                    List<DependencyReference> dependsOn
                        = reader.readArray(reader1 -> DependencyReference.fromJson(reader1));
                    deserializedTumblingWindowTriggerTypeProperties.dependsOn = dependsOn;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTumblingWindowTriggerTypeProperties;
        });
    }
}
