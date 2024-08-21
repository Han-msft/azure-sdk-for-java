// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * Microsoft Fabric LakeHouse linked service properties.
 */
@Fluent
public final class LakeHouseLinkedServiceTypeProperties
    implements JsonSerializable<LakeHouseLinkedServiceTypeProperties> {
    /*
     * The ID of Microsoft Fabric workspace. Type: string (or Expression with resultType string).
     */
    private Object workspaceId;

    /*
     * The ID of Microsoft Fabric LakeHouse artifact. Type: string (or Expression with resultType string).
     */
    private Object artifactId;

    /*
     * The ID of the application used to authenticate against Microsoft Fabric LakeHouse. Type: string (or Expression
     * with resultType string).
     */
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against Microsoft Fabric LakeHouse.
     */
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    private Object tenant;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /*
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for
     * key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     */
    private Object servicePrincipalCredentialType;

    /*
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is
     * 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If
     * servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be
     * AzureKeyVaultSecretReference.
     */
    private SecretBase servicePrincipalCredential;

    /**
     * Creates an instance of LakeHouseLinkedServiceTypeProperties class.
     */
    public LakeHouseLinkedServiceTypeProperties() {
    }

    /**
     * Get the workspaceId property: The ID of Microsoft Fabric workspace. Type: string (or Expression with resultType
     * string).
     * 
     * @return the workspaceId value.
     */
    public Object workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The ID of Microsoft Fabric workspace. Type: string (or Expression with resultType
     * string).
     * 
     * @param workspaceId the workspaceId value to set.
     * @return the LakeHouseLinkedServiceTypeProperties object itself.
     */
    public LakeHouseLinkedServiceTypeProperties withWorkspaceId(Object workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the artifactId property: The ID of Microsoft Fabric LakeHouse artifact. Type: string (or Expression with
     * resultType string).
     * 
     * @return the artifactId value.
     */
    public Object artifactId() {
        return this.artifactId;
    }

    /**
     * Set the artifactId property: The ID of Microsoft Fabric LakeHouse artifact. Type: string (or Expression with
     * resultType string).
     * 
     * @param artifactId the artifactId value to set.
     * @return the LakeHouseLinkedServiceTypeProperties object itself.
     */
    public LakeHouseLinkedServiceTypeProperties withArtifactId(Object artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against Microsoft Fabric
     * LakeHouse. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against Microsoft Fabric
     * LakeHouse. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the LakeHouseLinkedServiceTypeProperties object itself.
     */
    public LakeHouseLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against Microsoft Fabric
     * LakeHouse.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against Microsoft Fabric
     * LakeHouse.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the LakeHouseLinkedServiceTypeProperties object itself.
     */
    public LakeHouseLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
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
     * @return the LakeHouseLinkedServiceTypeProperties object itself.
     */
    public LakeHouseLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
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
     * @return the LakeHouseLinkedServiceTypeProperties object itself.
     */
    public LakeHouseLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     * 
     * @return the servicePrincipalCredentialType value.
     */
    public Object servicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType;
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     * 
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the LakeHouseLinkedServiceTypeProperties object itself.
     */
    public LakeHouseLinkedServiceTypeProperties
        withServicePrincipalCredentialType(Object servicePrincipalCredentialType) {
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @return the servicePrincipalCredential value.
     */
    public SecretBase servicePrincipalCredential() {
        return this.servicePrincipalCredential;
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the LakeHouseLinkedServiceTypeProperties object itself.
     */
    public LakeHouseLinkedServiceTypeProperties withServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (servicePrincipalCredential() != null) {
            servicePrincipalCredential().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("workspaceId", this.workspaceId);
        jsonWriter.writeUntypedField("artifactId", this.artifactId);
        jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
        jsonWriter.writeJsonField("servicePrincipalKey", this.servicePrincipalKey);
        jsonWriter.writeUntypedField("tenant", this.tenant);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        jsonWriter.writeUntypedField("servicePrincipalCredentialType", this.servicePrincipalCredentialType);
        jsonWriter.writeJsonField("servicePrincipalCredential", this.servicePrincipalCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LakeHouseLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LakeHouseLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LakeHouseLinkedServiceTypeProperties.
     */
    public static LakeHouseLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LakeHouseLinkedServiceTypeProperties deserializedLakeHouseLinkedServiceTypeProperties
                = new LakeHouseLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("workspaceId".equals(fieldName)) {
                    deserializedLakeHouseLinkedServiceTypeProperties.workspaceId = reader.readUntyped();
                } else if ("artifactId".equals(fieldName)) {
                    deserializedLakeHouseLinkedServiceTypeProperties.artifactId = reader.readUntyped();
                } else if ("servicePrincipalId".equals(fieldName)) {
                    deserializedLakeHouseLinkedServiceTypeProperties.servicePrincipalId = reader.readUntyped();
                } else if ("servicePrincipalKey".equals(fieldName)) {
                    deserializedLakeHouseLinkedServiceTypeProperties.servicePrincipalKey = SecretBase.fromJson(reader);
                } else if ("tenant".equals(fieldName)) {
                    deserializedLakeHouseLinkedServiceTypeProperties.tenant = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedLakeHouseLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else if ("servicePrincipalCredentialType".equals(fieldName)) {
                    deserializedLakeHouseLinkedServiceTypeProperties.servicePrincipalCredentialType
                        = reader.readUntyped();
                } else if ("servicePrincipalCredential".equals(fieldName)) {
                    deserializedLakeHouseLinkedServiceTypeProperties.servicePrincipalCredential
                        = SecretBase.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLakeHouseLinkedServiceTypeProperties;
        });
    }
}
