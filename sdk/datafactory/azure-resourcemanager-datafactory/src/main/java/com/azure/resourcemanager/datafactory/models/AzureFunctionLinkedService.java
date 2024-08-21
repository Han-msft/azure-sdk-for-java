// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.AzureFunctionLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Azure Function linked service.
 */
@Fluent
public final class AzureFunctionLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "AzureFunction";

    /*
     * Azure Function linked service properties.
     */
    private AzureFunctionLinkedServiceTypeProperties innerTypeProperties
        = new AzureFunctionLinkedServiceTypeProperties();

    /**
     * Creates an instance of AzureFunctionLinkedService class.
     */
    public AzureFunctionLinkedService() {
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
     * Get the innerTypeProperties property: Azure Function linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureFunctionLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFunctionLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the functionAppUrl property: The endpoint of the Azure Function App. URL will be in the format
     * https://&lt;accountName&gt;.azurewebsites.net. Type: string (or Expression with resultType string).
     * 
     * @return the functionAppUrl value.
     */
    public Object functionAppUrl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().functionAppUrl();
    }

    /**
     * Set the functionAppUrl property: The endpoint of the Azure Function App. URL will be in the format
     * https://&lt;accountName&gt;.azurewebsites.net. Type: string (or Expression with resultType string).
     * 
     * @param functionAppUrl the functionAppUrl value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withFunctionAppUrl(Object functionAppUrl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withFunctionAppUrl(functionAppUrl);
        return this;
    }

    /**
     * Get the functionKey property: Function or Host key for Azure Function App.
     * 
     * @return the functionKey value.
     */
    public SecretBase functionKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().functionKey();
    }

    /**
     * Set the functionKey property: Function or Host key for Azure Function App.
     * 
     * @param functionKey the functionKey value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withFunctionKey(SecretBase functionKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withFunctionKey(functionKey);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
        return this;
    }

    /**
     * Get the resourceId property: Allowed token audiences for azure function. Type: string (or Expression with
     * resultType string).
     * 
     * @return the resourceId value.
     */
    public Object resourceId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().resourceId();
    }

    /**
     * Set the resourceId property: Allowed token audiences for azure function. Type: string (or Expression with
     * resultType string).
     * 
     * @param resourceId the resourceId value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withResourceId(Object resourceId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withResourceId(resourceId);
        return this;
    }

    /**
     * Get the authentication property: Type of authentication (Required to specify MSI) used to connect to
     * AzureFunction. Type: string (or Expression with resultType string).
     * 
     * @return the authentication value.
     */
    public Object authentication() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authentication();
    }

    /**
     * Set the authentication property: Type of authentication (Required to specify MSI) used to connect to
     * AzureFunction. Type: string (or Expression with resultType string).
     * 
     * @param authentication the authentication value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    public AzureFunctionLinkedService withAuthentication(Object authentication) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureFunctionLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthentication(authentication);
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
                    "Missing required property innerTypeProperties in model AzureFunctionLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureFunctionLinkedService.class);

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
     * Reads an instance of AzureFunctionLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFunctionLinkedService if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureFunctionLinkedService.
     */
    public static AzureFunctionLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFunctionLinkedService deserializedAzureFunctionLinkedService = new AzureFunctionLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureFunctionLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureFunctionLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.innerTypeProperties
                        = AzureFunctionLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureFunctionLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedAzureFunctionLinkedService;
        });
    }
}
