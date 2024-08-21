// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.QuickBooksLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * QuickBooks server linked service.
 */
@Fluent
public final class QuickBooksLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "QuickBooks";

    /*
     * QuickBooks server linked service properties.
     */
    private QuickBooksLinkedServiceTypeProperties innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();

    /**
     * Creates an instance of QuickBooksLinkedService class.
     */
    public QuickBooksLinkedService() {
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
     * Get the innerTypeProperties property: QuickBooks server linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private QuickBooksLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuickBooksLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuickBooksLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuickBooksLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuickBooksLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QuickBooksLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionProperties property: Properties used to connect to QuickBooks. It is mutually exclusive with
     * any other properties in the linked service. Type: object.
     * 
     * @return the connectionProperties value.
     */
    public Object connectionProperties() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionProperties();
    }

    /**
     * Set the connectionProperties property: Properties used to connect to QuickBooks. It is mutually exclusive with
     * any other properties in the linked service. Type: object.
     * 
     * @param connectionProperties the connectionProperties value to set.
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withConnectionProperties(Object connectionProperties) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionProperties(connectionProperties);
        return this;
    }

    /**
     * Get the endpoint property: The endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com).
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().endpoint();
    }

    /**
     * Set the endpoint property: The endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com).
     * 
     * @param endpoint the endpoint value to set.
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withEndpoint(Object endpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the companyId property: The company ID of the QuickBooks company to authorize.
     * 
     * @return the companyId value.
     */
    public Object companyId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().companyId();
    }

    /**
     * Set the companyId property: The company ID of the QuickBooks company to authorize.
     * 
     * @param companyId the companyId value to set.
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withCompanyId(Object companyId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCompanyId(companyId);
        return this;
    }

    /**
     * Get the consumerKey property: The consumer key for OAuth 1.0 authentication.
     * 
     * @return the consumerKey value.
     */
    public Object consumerKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().consumerKey();
    }

    /**
     * Set the consumerKey property: The consumer key for OAuth 1.0 authentication.
     * 
     * @param consumerKey the consumerKey value to set.
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withConsumerKey(Object consumerKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConsumerKey(consumerKey);
        return this;
    }

    /**
     * Get the consumerSecret property: The consumer secret for OAuth 1.0 authentication.
     * 
     * @return the consumerSecret value.
     */
    public SecretBase consumerSecret() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().consumerSecret();
    }

    /**
     * Set the consumerSecret property: The consumer secret for OAuth 1.0 authentication.
     * 
     * @param consumerSecret the consumerSecret value to set.
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withConsumerSecret(SecretBase consumerSecret) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConsumerSecret(consumerSecret);
        return this;
    }

    /**
     * Get the accessToken property: The access token for OAuth 1.0 authentication.
     * 
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessToken();
    }

    /**
     * Set the accessToken property: The access token for OAuth 1.0 authentication.
     * 
     * @param accessToken the accessToken value to set.
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withAccessToken(SecretBase accessToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessToken(accessToken);
        return this;
    }

    /**
     * Get the accessTokenSecret property: The access token secret for OAuth 1.0 authentication.
     * 
     * @return the accessTokenSecret value.
     */
    public SecretBase accessTokenSecret() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessTokenSecret();
    }

    /**
     * Set the accessTokenSecret property: The access token secret for OAuth 1.0 authentication.
     * 
     * @param accessTokenSecret the accessTokenSecret value to set.
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withAccessTokenSecret(SecretBase accessTokenSecret) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessTokenSecret(accessTokenSecret);
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
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseEncryptedEndpoints(useEncryptedEndpoints);
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
     * @return the QuickBooksLinkedService object itself.
     */
    public QuickBooksLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new QuickBooksLinkedServiceTypeProperties();
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
                    "Missing required property innerTypeProperties in model QuickBooksLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QuickBooksLinkedService.class);

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
     * Reads an instance of QuickBooksLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of QuickBooksLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the QuickBooksLinkedService.
     */
    public static QuickBooksLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QuickBooksLinkedService deserializedQuickBooksLinkedService = new QuickBooksLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedQuickBooksLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedQuickBooksLinkedService.withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedQuickBooksLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedQuickBooksLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedQuickBooksLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedQuickBooksLinkedService.innerTypeProperties
                        = QuickBooksLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedQuickBooksLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedQuickBooksLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedQuickBooksLinkedService;
        });
    }
}
