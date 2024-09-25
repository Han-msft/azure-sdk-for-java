// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * This is the request for hibernate.
 */
@Fluent
public final class SubmitHibernateRequest implements JsonSerializable<SubmitHibernateRequest> {
    /*
     * The schedule for the request
     */
    private Schedule schedule;

    /*
     * The execution parameters for the request
     */
    private ExecutionParameters executionParameters;

    /*
     * The resources for the request
     */
    private Resources resources;

    /*
     * Correlationid item
     */
    private String correlationid;

    /**
     * Creates an instance of SubmitHibernateRequest class.
     */
    public SubmitHibernateRequest() {
    }

    /**
     * Get the schedule property: The schedule for the request.
     * 
     * @return the schedule value.
     */
    public Schedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The schedule for the request.
     * 
     * @param schedule the schedule value to set.
     * @return the SubmitHibernateRequest object itself.
     */
    public SubmitHibernateRequest withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the executionParameters property: The execution parameters for the request.
     * 
     * @return the executionParameters value.
     */
    public ExecutionParameters executionParameters() {
        return this.executionParameters;
    }

    /**
     * Set the executionParameters property: The execution parameters for the request.
     * 
     * @param executionParameters the executionParameters value to set.
     * @return the SubmitHibernateRequest object itself.
     */
    public SubmitHibernateRequest withExecutionParameters(ExecutionParameters executionParameters) {
        this.executionParameters = executionParameters;
        return this;
    }

    /**
     * Get the resources property: The resources for the request.
     * 
     * @return the resources value.
     */
    public Resources resources() {
        return this.resources;
    }

    /**
     * Set the resources property: The resources for the request.
     * 
     * @param resources the resources value to set.
     * @return the SubmitHibernateRequest object itself.
     */
    public SubmitHibernateRequest withResources(Resources resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the correlationid property: Correlationid item.
     * 
     * @return the correlationid value.
     */
    public String correlationid() {
        return this.correlationid;
    }

    /**
     * Set the correlationid property: Correlationid item.
     * 
     * @param correlationid the correlationid value to set.
     * @return the SubmitHibernateRequest object itself.
     */
    public SubmitHibernateRequest withCorrelationid(String correlationid) {
        this.correlationid = correlationid;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedule() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property schedule in model SubmitHibernateRequest"));
        } else {
            schedule().validate();
        }
        if (executionParameters() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property executionParameters in model SubmitHibernateRequest"));
        } else {
            executionParameters().validate();
        }
        if (resources() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resources in model SubmitHibernateRequest"));
        } else {
            resources().validate();
        }
        if (correlationid() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property correlationid in model SubmitHibernateRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SubmitHibernateRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("schedule", this.schedule);
        jsonWriter.writeJsonField("executionParameters", this.executionParameters);
        jsonWriter.writeJsonField("resources", this.resources);
        jsonWriter.writeStringField("correlationid", this.correlationid);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubmitHibernateRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubmitHibernateRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SubmitHibernateRequest.
     */
    public static SubmitHibernateRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubmitHibernateRequest deserializedSubmitHibernateRequest = new SubmitHibernateRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schedule".equals(fieldName)) {
                    deserializedSubmitHibernateRequest.schedule = Schedule.fromJson(reader);
                } else if ("executionParameters".equals(fieldName)) {
                    deserializedSubmitHibernateRequest.executionParameters = ExecutionParameters.fromJson(reader);
                } else if ("resources".equals(fieldName)) {
                    deserializedSubmitHibernateRequest.resources = Resources.fromJson(reader);
                } else if ("correlationid".equals(fieldName)) {
                    deserializedSubmitHibernateRequest.correlationid = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubmitHibernateRequest;
        });
    }
}
