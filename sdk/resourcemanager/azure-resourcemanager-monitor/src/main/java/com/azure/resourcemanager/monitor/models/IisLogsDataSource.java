// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Enables IIS logs to be collected by this data collection rule.
 */
@Fluent
public final class IisLogsDataSource implements JsonSerializable<IisLogsDataSource> {
    /*
     * IIS streams
     */
    private List<String> streams;

    /*
     * Absolute paths file location
     */
    private List<String> logDirectories;

    /*
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     */
    private String name;

    /**
     * Creates an instance of IisLogsDataSource class.
     */
    public IisLogsDataSource() {
    }

    /**
     * Get the streams property: IIS streams.
     * 
     * @return the streams value.
     */
    public List<String> streams() {
        return this.streams;
    }

    /**
     * Set the streams property: IIS streams.
     * 
     * @param streams the streams value to set.
     * @return the IisLogsDataSource object itself.
     */
    public IisLogsDataSource withStreams(List<String> streams) {
        this.streams = streams;
        return this;
    }

    /**
     * Get the logDirectories property: Absolute paths file location.
     * 
     * @return the logDirectories value.
     */
    public List<String> logDirectories() {
        return this.logDirectories;
    }

    /**
     * Set the logDirectories property: Absolute paths file location.
     * 
     * @param logDirectories the logDirectories value to set.
     * @return the IisLogsDataSource object itself.
     */
    public IisLogsDataSource withLogDirectories(List<String> logDirectories) {
        this.logDirectories = logDirectories;
        return this;
    }

    /**
     * Get the name property: A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     * @param name the name value to set.
     * @return the IisLogsDataSource object itself.
     */
    public IisLogsDataSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (streams() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property streams in model IisLogsDataSource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IisLogsDataSource.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("streams", this.streams, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("logDirectories", this.logDirectories,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IisLogsDataSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IisLogsDataSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IisLogsDataSource.
     */
    public static IisLogsDataSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IisLogsDataSource deserializedIisLogsDataSource = new IisLogsDataSource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("streams".equals(fieldName)) {
                    List<String> streams = reader.readArray(reader1 -> reader1.getString());
                    deserializedIisLogsDataSource.streams = streams;
                } else if ("logDirectories".equals(fieldName)) {
                    List<String> logDirectories = reader.readArray(reader1 -> reader1.getString());
                    deserializedIisLogsDataSource.logDirectories = logDirectories;
                } else if ("name".equals(fieldName)) {
                    deserializedIisLogsDataSource.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIisLogsDataSource;
        });
    }
}
