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
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * Azure Data Lake Analytics linked service properties.
 */
@Fluent
public final class AzureDataLakeAnalyticsLinkedServiceTypeProperties
    implements JsonSerializable<AzureDataLakeAnalyticsLinkedServiceTypeProperties> {
    /*
     * The Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     */
    private Object accountName;

    /*
     * The ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or
     * Expression with resultType string).
     */
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against the Azure Data Lake Analytics account.
     */
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    private Object tenant;

    /*
     * Data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or Expression
     * with resultType string).
     */
    private Object subscriptionId;

    /*
     * Data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or
     * Expression with resultType string).
     */
    private Object resourceGroupName;

    /*
     * Azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     */
    private Object dataLakeAnalyticsUri;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of AzureDataLakeAnalyticsLinkedServiceTypeProperties class.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties() {
    }

    /**
     * Get the accountName property: The Azure Data Lake Analytics account name. Type: string (or Expression with
     * resultType string).
     * 
     * @return the accountName value.
     */
    public Object accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The Azure Data Lake Analytics account name. Type: string (or Expression with
     * resultType string).
     * 
     * @param accountName the accountName value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Analytics account. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Analytics account. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Analytics account.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Analytics account.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the subscriptionId property: Data Lake Analytics account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     * 
     * @return the subscriptionId value.
     */
    public Object subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Data Lake Analytics account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     * 
     * @return the resourceGroupName value.
     */
    public Object resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     * 
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the dataLakeAnalyticsUri property: Azure Data Lake Analytics URI Type: string (or Expression with resultType
     * string).
     * 
     * @return the dataLakeAnalyticsUri value.
     */
    public Object dataLakeAnalyticsUri() {
        return this.dataLakeAnalyticsUri;
    }

    /**
     * Set the dataLakeAnalyticsUri property: Azure Data Lake Analytics URI Type: string (or Expression with resultType
     * string).
     * 
     * @param dataLakeAnalyticsUri the dataLakeAnalyticsUri value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withDataLakeAnalyticsUri(Object dataLakeAnalyticsUri) {
        this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureDataLakeAnalyticsLinkedServiceTypeProperties object itself.
     */
    public AzureDataLakeAnalyticsLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property accountName in model AzureDataLakeAnalyticsLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (tenant() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property tenant in model AzureDataLakeAnalyticsLinkedServiceTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(AzureDataLakeAnalyticsLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("accountName", this.accountName);
        jsonWriter.writeUntypedField("tenant", this.tenant);
        jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
        jsonWriter.writeJsonField("servicePrincipalKey", this.servicePrincipalKey);
        jsonWriter.writeUntypedField("subscriptionId", this.subscriptionId);
        jsonWriter.writeUntypedField("resourceGroupName", this.resourceGroupName);
        jsonWriter.writeUntypedField("dataLakeAnalyticsUri", this.dataLakeAnalyticsUri);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDataLakeAnalyticsLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDataLakeAnalyticsLinkedServiceTypeProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureDataLakeAnalyticsLinkedServiceTypeProperties.
     */
    public static AzureDataLakeAnalyticsLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDataLakeAnalyticsLinkedServiceTypeProperties deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties
                = new AzureDataLakeAnalyticsLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("accountName".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties.accountName = reader.readUntyped();
                } else if ("tenant".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties.tenant = reader.readUntyped();
                } else if ("servicePrincipalId".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties.servicePrincipalId
                        = reader.readUntyped();
                } else if ("servicePrincipalKey".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties.servicePrincipalKey
                        = SecretBase.fromJson(reader);
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties.subscriptionId = reader.readUntyped();
                } else if ("resourceGroupName".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties.resourceGroupName
                        = reader.readUntyped();
                } else if ("dataLakeAnalyticsUri".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties.dataLakeAnalyticsUri
                        = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties.encryptedCredential
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureDataLakeAnalyticsLinkedServiceTypeProperties;
        });
    }
}
