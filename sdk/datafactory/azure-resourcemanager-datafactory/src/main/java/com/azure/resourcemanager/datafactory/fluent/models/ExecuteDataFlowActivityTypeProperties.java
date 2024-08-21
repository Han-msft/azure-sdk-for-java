// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.ContinuationSettingsReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import java.io.IOException;

/**
 * Execute data flow activity properties.
 */
@Fluent
public class ExecuteDataFlowActivityTypeProperties implements JsonSerializable<ExecuteDataFlowActivityTypeProperties> {
    /*
     * Data flow reference.
     */
    private DataFlowReference dataFlow;

    /*
     * Staging info for execute data flow activity.
     */
    private DataFlowStagingInfo staging;

    /*
     * The integration runtime reference.
     */
    private IntegrationRuntimeReference integrationRuntime;

    /*
     * Continuation settings for execute data flow activity.
     */
    private ContinuationSettingsReference continuationSettings;

    /*
     * Compute properties for data flow activity.
     */
    private ExecuteDataFlowActivityTypePropertiesCompute compute;

    /*
     * Trace level setting used for data flow monitoring output. Supported values are: 'coarse', 'fine', and 'none'.
     * Type: string (or Expression with resultType string)
     */
    private Object traceLevel;

    /*
     * Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type:
     * boolean (or Expression with resultType boolean)
     */
    private Object continueOnError;

    /*
     * Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed
     * concurrently. Type: boolean (or Expression with resultType boolean)
     */
    private Object runConcurrently;

    /*
     * Specify number of parallel staging for sources applicable to the sink. Type: integer (or Expression with
     * resultType integer)
     */
    private Object sourceStagingConcurrency;

    /**
     * Creates an instance of ExecuteDataFlowActivityTypeProperties class.
     */
    public ExecuteDataFlowActivityTypeProperties() {
    }

    /**
     * Get the dataFlow property: Data flow reference.
     * 
     * @return the dataFlow value.
     */
    public DataFlowReference dataFlow() {
        return this.dataFlow;
    }

    /**
     * Set the dataFlow property: Data flow reference.
     * 
     * @param dataFlow the dataFlow value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withDataFlow(DataFlowReference dataFlow) {
        this.dataFlow = dataFlow;
        return this;
    }

    /**
     * Get the staging property: Staging info for execute data flow activity.
     * 
     * @return the staging value.
     */
    public DataFlowStagingInfo staging() {
        return this.staging;
    }

    /**
     * Set the staging property: Staging info for execute data flow activity.
     * 
     * @param staging the staging value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withStaging(DataFlowStagingInfo staging) {
        this.staging = staging;
        return this;
    }

    /**
     * Get the integrationRuntime property: The integration runtime reference.
     * 
     * @return the integrationRuntime value.
     */
    public IntegrationRuntimeReference integrationRuntime() {
        return this.integrationRuntime;
    }

    /**
     * Set the integrationRuntime property: The integration runtime reference.
     * 
     * @param integrationRuntime the integrationRuntime value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties
        withIntegrationRuntime(IntegrationRuntimeReference integrationRuntime) {
        this.integrationRuntime = integrationRuntime;
        return this;
    }

    /**
     * Get the continuationSettings property: Continuation settings for execute data flow activity.
     * 
     * @return the continuationSettings value.
     */
    public ContinuationSettingsReference continuationSettings() {
        return this.continuationSettings;
    }

    /**
     * Set the continuationSettings property: Continuation settings for execute data flow activity.
     * 
     * @param continuationSettings the continuationSettings value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties
        withContinuationSettings(ContinuationSettingsReference continuationSettings) {
        this.continuationSettings = continuationSettings;
        return this;
    }

    /**
     * Get the compute property: Compute properties for data flow activity.
     * 
     * @return the compute value.
     */
    public ExecuteDataFlowActivityTypePropertiesCompute compute() {
        return this.compute;
    }

    /**
     * Set the compute property: Compute properties for data flow activity.
     * 
     * @param compute the compute value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withCompute(ExecuteDataFlowActivityTypePropertiesCompute compute) {
        this.compute = compute;
        return this;
    }

    /**
     * Get the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     * 
     * @return the traceLevel value.
     */
    public Object traceLevel() {
        return this.traceLevel;
    }

    /**
     * Set the traceLevel property: Trace level setting used for data flow monitoring output. Supported values are:
     * 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string).
     * 
     * @param traceLevel the traceLevel value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withTraceLevel(Object traceLevel) {
        this.traceLevel = traceLevel;
        return this;
    }

    /**
     * Get the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the continueOnError value.
     */
    public Object continueOnError() {
        return this.continueOnError;
    }

    /**
     * Set the continueOnError property: Continue on error setting used for data flow execution. Enables processing to
     * continue if a sink fails. Type: boolean (or Expression with resultType boolean).
     * 
     * @param continueOnError the continueOnError value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withContinueOnError(Object continueOnError) {
        this.continueOnError = continueOnError;
        return this;
    }

    /**
     * Get the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the runConcurrently value.
     */
    public Object runConcurrently() {
        return this.runConcurrently;
    }

    /**
     * Set the runConcurrently property: Concurrent run setting used for data flow execution. Allows sinks with the same
     * save order to be processed concurrently. Type: boolean (or Expression with resultType boolean).
     * 
     * @param runConcurrently the runConcurrently value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withRunConcurrently(Object runConcurrently) {
        this.runConcurrently = runConcurrently;
        return this;
    }

    /**
     * Get the sourceStagingConcurrency property: Specify number of parallel staging for sources applicable to the sink.
     * Type: integer (or Expression with resultType integer).
     * 
     * @return the sourceStagingConcurrency value.
     */
    public Object sourceStagingConcurrency() {
        return this.sourceStagingConcurrency;
    }

    /**
     * Set the sourceStagingConcurrency property: Specify number of parallel staging for sources applicable to the sink.
     * Type: integer (or Expression with resultType integer).
     * 
     * @param sourceStagingConcurrency the sourceStagingConcurrency value to set.
     * @return the ExecuteDataFlowActivityTypeProperties object itself.
     */
    public ExecuteDataFlowActivityTypeProperties withSourceStagingConcurrency(Object sourceStagingConcurrency) {
        this.sourceStagingConcurrency = sourceStagingConcurrency;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataFlow() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property dataFlow in model ExecuteDataFlowActivityTypeProperties"));
        } else {
            dataFlow().validate();
        }
        if (staging() != null) {
            staging().validate();
        }
        if (integrationRuntime() != null) {
            integrationRuntime().validate();
        }
        if (continuationSettings() != null) {
            continuationSettings().validate();
        }
        if (compute() != null) {
            compute().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExecuteDataFlowActivityTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("dataFlow", this.dataFlow);
        jsonWriter.writeJsonField("staging", this.staging);
        jsonWriter.writeJsonField("integrationRuntime", this.integrationRuntime);
        jsonWriter.writeJsonField("continuationSettings", this.continuationSettings);
        jsonWriter.writeJsonField("compute", this.compute);
        jsonWriter.writeUntypedField("traceLevel", this.traceLevel);
        jsonWriter.writeUntypedField("continueOnError", this.continueOnError);
        jsonWriter.writeUntypedField("runConcurrently", this.runConcurrently);
        jsonWriter.writeUntypedField("sourceStagingConcurrency", this.sourceStagingConcurrency);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExecuteDataFlowActivityTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExecuteDataFlowActivityTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExecuteDataFlowActivityTypeProperties.
     */
    public static ExecuteDataFlowActivityTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExecuteDataFlowActivityTypeProperties deserializedExecuteDataFlowActivityTypeProperties
                = new ExecuteDataFlowActivityTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataFlow".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.dataFlow = DataFlowReference.fromJson(reader);
                } else if ("staging".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.staging = DataFlowStagingInfo.fromJson(reader);
                } else if ("integrationRuntime".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.integrationRuntime
                        = IntegrationRuntimeReference.fromJson(reader);
                } else if ("continuationSettings".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.continuationSettings
                        = ContinuationSettingsReference.fromJson(reader);
                } else if ("compute".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.compute
                        = ExecuteDataFlowActivityTypePropertiesCompute.fromJson(reader);
                } else if ("traceLevel".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.traceLevel = reader.readUntyped();
                } else if ("continueOnError".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.continueOnError = reader.readUntyped();
                } else if ("runConcurrently".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.runConcurrently = reader.readUntyped();
                } else if ("sourceStagingConcurrency".equals(fieldName)) {
                    deserializedExecuteDataFlowActivityTypeProperties.sourceStagingConcurrency = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExecuteDataFlowActivityTypeProperties;
        });
    }
}
