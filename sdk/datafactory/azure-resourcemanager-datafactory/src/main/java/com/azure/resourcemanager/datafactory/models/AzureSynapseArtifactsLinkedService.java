// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSynapseArtifactsLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Azure Synapse Analytics (Artifacts) linked service.
 */
@Fluent
public final class AzureSynapseArtifactsLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "AzureSynapseArtifacts";

    /*
     * Azure Synapse Analytics (Artifacts) linked service properties.
     */
    private AzureSynapseArtifactsLinkedServiceTypeProperties innerTypeProperties
        = new AzureSynapseArtifactsLinkedServiceTypeProperties();

    /**
     * Creates an instance of AzureSynapseArtifactsLinkedService class.
     */
    public AzureSynapseArtifactsLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Azure Synapse Analytics (Artifacts) linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureSynapseArtifactsLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseArtifactsLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseArtifactsLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseArtifactsLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseArtifactsLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseArtifactsLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the endpoint property: https://&lt;workspacename&gt;.dev.azuresynapse.net, Azure Synapse Analytics workspace
     * URL. Type: string (or Expression with resultType string).
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().endpoint();
    }

    /**
     * Set the endpoint property: https://&lt;workspacename&gt;.dev.azuresynapse.net, Azure Synapse Analytics workspace
     * URL. Type: string (or Expression with resultType string).
     * 
     * @param endpoint the endpoint value to set.
     * @return the AzureSynapseArtifactsLinkedService object itself.
     */
    public AzureSynapseArtifactsLinkedService withEndpoint(Object endpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSynapseArtifactsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the authentication property: Required to specify MSI, if using system assigned managed identity as
     * authentication method. Type: string (or Expression with resultType string).
     * 
     * @return the authentication value.
     */
    public Object authentication() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authentication();
    }

    /**
     * Set the authentication property: Required to specify MSI, if using system assigned managed identity as
     * authentication method. Type: string (or Expression with resultType string).
     * 
     * @param authentication the authentication value to set.
     * @return the AzureSynapseArtifactsLinkedService object itself.
     */
    public AzureSynapseArtifactsLinkedService withAuthentication(Object authentication) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSynapseArtifactsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthentication(authentication);
        return this;
    }

    /**
     * Get the workspaceResourceId property: The resource ID of the Synapse workspace. The format should be:
     * /subscriptions/{subscriptionID}/resourceGroups/{resourceGroup}/providers/Microsoft.Synapse/workspaces/{workspaceName}.
     * Type: string (or Expression with resultType string).
     * 
     * @return the workspaceResourceId value.
     */
    public Object workspaceResourceId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().workspaceResourceId();
    }

    /**
     * Set the workspaceResourceId property: The resource ID of the Synapse workspace. The format should be:
     * /subscriptions/{subscriptionID}/resourceGroups/{resourceGroup}/providers/Microsoft.Synapse/workspaces/{workspaceName}.
     * Type: string (or Expression with resultType string).
     * 
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the AzureSynapseArtifactsLinkedService object itself.
     */
    public AzureSynapseArtifactsLinkedService withWorkspaceResourceId(Object workspaceResourceId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureSynapseArtifactsLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withWorkspaceResourceId(workspaceResourceId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model AzureSynapseArtifactsLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureSynapseArtifactsLinkedService.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", version());
        jsonWriter.writeJsonField("connectVia", connectVia());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureSynapseArtifactsLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureSynapseArtifactsLinkedService if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureSynapseArtifactsLinkedService.
     */
    public static AzureSynapseArtifactsLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureSynapseArtifactsLinkedService deserializedAzureSynapseArtifactsLinkedService
                = new AzureSynapseArtifactsLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedAzureSynapseArtifactsLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedAzureSynapseArtifactsLinkedService
                        .withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureSynapseArtifactsLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureSynapseArtifactsLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureSynapseArtifactsLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedAzureSynapseArtifactsLinkedService.innerTypeProperties
                        = AzureSynapseArtifactsLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureSynapseArtifactsLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureSynapseArtifactsLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedAzureSynapseArtifactsLinkedService;
        });
    }
}
