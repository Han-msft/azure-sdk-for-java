// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Properties of managed integration runtime operation result.
 */
@Fluent
public final class ManagedIntegrationRuntimeOperationResult
    implements JsonSerializable<ManagedIntegrationRuntimeOperationResult> {
    /*
     * The operation type. Could be start or stop.
     */
    private String type;

    /*
     * The start time of the operation.
     */
    private OffsetDateTime startTime;

    /*
     * The operation result.
     */
    private String result;

    /*
     * The error code.
     */
    private String errorCode;

    /*
     * Managed integration runtime error parameters.
     */
    private List<String> parameters;

    /*
     * The activity id for the operation request.
     */
    private String activityId;

    /*
     * Properties of managed integration runtime operation result.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of ManagedIntegrationRuntimeOperationResult class.
     */
    public ManagedIntegrationRuntimeOperationResult() {
    }

    /**
     * Get the type property: The operation type. Could be start or stop.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the startTime property: The start time of the operation.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the result property: The operation result.
     * 
     * @return the result value.
     */
    public String result() {
        return this.result;
    }

    /**
     * Get the errorCode property: The error code.
     * 
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get the parameters property: Managed integration runtime error parameters.
     * 
     * @return the parameters value.
     */
    public List<String> parameters() {
        return this.parameters;
    }

    /**
     * Get the activityId property: The activity id for the operation request.
     * 
     * @return the activityId value.
     */
    public String activityId() {
        return this.activityId;
    }

    /**
     * Get the additionalProperties property: Properties of managed integration runtime operation result.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Properties of managed integration runtime operation result.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the ManagedIntegrationRuntimeOperationResult object itself.
     */
    public ManagedIntegrationRuntimeOperationResult withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedIntegrationRuntimeOperationResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedIntegrationRuntimeOperationResult if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedIntegrationRuntimeOperationResult.
     */
    public static ManagedIntegrationRuntimeOperationResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedIntegrationRuntimeOperationResult deserializedManagedIntegrationRuntimeOperationResult
                = new ManagedIntegrationRuntimeOperationResult();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeOperationResult.type = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeOperationResult.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("result".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeOperationResult.result = reader.getString();
                } else if ("errorCode".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeOperationResult.errorCode = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    List<String> parameters = reader.readArray(reader1 -> reader1.getString());
                    deserializedManagedIntegrationRuntimeOperationResult.parameters = parameters;
                } else if ("activityId".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeOperationResult.activityId = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedManagedIntegrationRuntimeOperationResult.additionalProperties = additionalProperties;

            return deserializedManagedIntegrationRuntimeOperationResult;
        });
    }
}
