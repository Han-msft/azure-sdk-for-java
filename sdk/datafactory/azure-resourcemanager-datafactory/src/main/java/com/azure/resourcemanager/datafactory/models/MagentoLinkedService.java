// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.MagentoLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Magento server linked service.
 */
@Fluent
public final class MagentoLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "Magento";

    /*
     * Magento server linked service properties.
     */
    private MagentoLinkedServiceTypeProperties innerTypeProperties = new MagentoLinkedServiceTypeProperties();

    /**
     * Creates an instance of MagentoLinkedService class.
     */
    public MagentoLinkedService() {
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
     * Get the innerTypeProperties property: Magento server linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private MagentoLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MagentoLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MagentoLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MagentoLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MagentoLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MagentoLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the host property: The URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().host();
    }

    /**
     * Set the host property: The URL of the Magento instance. (i.e. 192.168.222.110/magento3).
     * 
     * @param host the host value to set.
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withHost(Object host) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MagentoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHost(host);
        return this;
    }

    /**
     * Get the accessToken property: The access token from Magento.
     * 
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessToken();
    }

    /**
     * Set the accessToken property: The access token from Magento.
     * 
     * @param accessToken the accessToken value to set.
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withAccessToken(SecretBase accessToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MagentoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessToken(accessToken);
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useEncryptedEndpoints();
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MagentoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseEncryptedEndpoints(useEncryptedEndpoints);
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useHostVerification();
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withUseHostVerification(Object useHostVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MagentoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseHostVerification(useHostVerification);
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().usePeerVerification();
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withUsePeerVerification(Object usePeerVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MagentoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsePeerVerification(usePeerVerification);
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
     * @return the MagentoLinkedService object itself.
     */
    public MagentoLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MagentoLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
                    "Missing required property innerTypeProperties in model MagentoLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MagentoLinkedService.class);

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
     * Reads an instance of MagentoLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MagentoLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MagentoLinkedService.
     */
    public static MagentoLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MagentoLinkedService deserializedMagentoLinkedService = new MagentoLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedMagentoLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedMagentoLinkedService.withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedMagentoLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedMagentoLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedMagentoLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedMagentoLinkedService.innerTypeProperties
                        = MagentoLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedMagentoLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMagentoLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedMagentoLinkedService;
        });
    }
}
