// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Job endpoint definition.
 */
@Fluent
public final class JobService implements JsonSerializable<JobService> {
    /*
     * Endpoint type.
     */
    private String jobServiceType;

    /*
     * Port for endpoint.
     */
    private Integer port;

    /*
     * Url for endpoint.
     */
    private String endpoint;

    /*
     * Status of endpoint.
     */
    private String status;

    /*
     * Any error in the service.
     */
    private String errorMessage;

    /*
     * Additional properties to set on the endpoint.
     */
    private Map<String, String> properties;

    /*
     * Nodes that user would like to start the service on.
     * If Nodes is not set or set to null, the service will only be started on leader node.
     */
    private Nodes nodes;

    /**
     * Creates an instance of JobService class.
     */
    public JobService() {
    }

    /**
     * Get the jobServiceType property: Endpoint type.
     * 
     * @return the jobServiceType value.
     */
    public String jobServiceType() {
        return this.jobServiceType;
    }

    /**
     * Set the jobServiceType property: Endpoint type.
     * 
     * @param jobServiceType the jobServiceType value to set.
     * @return the JobService object itself.
     */
    public JobService withJobServiceType(String jobServiceType) {
        this.jobServiceType = jobServiceType;
        return this;
    }

    /**
     * Get the port property: Port for endpoint.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Port for endpoint.
     * 
     * @param port the port value to set.
     * @return the JobService object itself.
     */
    public JobService withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the endpoint property: Url for endpoint.
     * 
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: Url for endpoint.
     * 
     * @param endpoint the endpoint value to set.
     * @return the JobService object itself.
     */
    public JobService withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the status property: Status of endpoint.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the errorMessage property: Any error in the service.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the properties property: Additional properties to set on the endpoint.
     * 
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional properties to set on the endpoint.
     * 
     * @param properties the properties value to set.
     * @return the JobService object itself.
     */
    public JobService withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the nodes property: Nodes that user would like to start the service on.
     * If Nodes is not set or set to null, the service will only be started on leader node.
     * 
     * @return the nodes value.
     */
    public Nodes nodes() {
        return this.nodes;
    }

    /**
     * Set the nodes property: Nodes that user would like to start the service on.
     * If Nodes is not set or set to null, the service will only be started on leader node.
     * 
     * @param nodes the nodes value to set.
     * @return the JobService object itself.
     */
    public JobService withNodes(Nodes nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodes() != null) {
            nodes().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobServiceType", this.jobServiceType);
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeStringField("endpoint", this.endpoint);
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("nodes", this.nodes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobService if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the JobService.
     */
    public static JobService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobService deserializedJobService = new JobService();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobServiceType".equals(fieldName)) {
                    deserializedJobService.jobServiceType = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedJobService.port = reader.getNullable(JsonReader::getInt);
                } else if ("endpoint".equals(fieldName)) {
                    deserializedJobService.endpoint = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedJobService.status = reader.getString();
                } else if ("errorMessage".equals(fieldName)) {
                    deserializedJobService.errorMessage = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedJobService.properties = properties;
                } else if ("nodes".equals(fieldName)) {
                    deserializedJobService.nodes = Nodes.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobService;
        });
    }
}
