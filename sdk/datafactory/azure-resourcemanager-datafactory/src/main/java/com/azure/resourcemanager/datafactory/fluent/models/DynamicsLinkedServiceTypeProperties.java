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
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.io.IOException;

/**
 * Dynamics linked service properties.
 */
@Fluent
public final class DynamicsLinkedServiceTypeProperties
    implements JsonSerializable<DynamicsLinkedServiceTypeProperties> {
    /*
     * The deployment type of the Dynamics instance. 'Online' for Dynamics Online and 'OnPremisesWithIfd' for Dynamics
     * on-premises with Ifd. Type: string (or Expression with resultType string).
     */
    private Object deploymentType;

    /*
     * The host name of the on-premises Dynamics server. The property is required for on-prem and not allowed for
     * online. Type: string (or Expression with resultType string).
     */
    private Object hostname;

    /*
     * The port of on-premises Dynamics server. The property is required for on-prem and not allowed for online. Default
     * is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     */
    private Object port;

    /*
     * The URL to the Microsoft Dynamics server. The property is required for on-line and not allowed for on-prem. Type:
     * string (or Expression with resultType string).
     */
    private Object serviceUri;

    /*
     * The organization name of the Dynamics instance. The property is required for on-prem and required for online when
     * there are more than one Dynamics instances associated with the user. Type: string (or Expression with resultType
     * string).
     */
    private Object organizationName;

    /*
     * The authentication type to connect to Dynamics server. 'Office365' for online scenario, 'Ifd' for on-premises
     * with Ifd scenario, 'AADServicePrincipal' for Server-To-Server authentication in online scenario, 'Active
     * Directory' for Dynamics on-premises with IFD. Type: string (or Expression with resultType string).
     */
    private Object authenticationType;

    /*
     * The Active Directory domain that will verify user credentials. Type: string (or Expression with resultType
     * string).
     */
    private Object domain;

    /*
     * User name to access the Dynamics instance. Type: string (or Expression with resultType string).
     */
    private Object username;

    /*
     * Password to access the Dynamics instance.
     */
    private SecretBase password;

    /*
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string
     * (or Expression with resultType string).
     */
    private Object servicePrincipalId;

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

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    private CredentialReference credential;

    /**
     * Creates an instance of DynamicsLinkedServiceTypeProperties class.
     */
    public DynamicsLinkedServiceTypeProperties() {
    }

    /**
     * Get the deploymentType property: The deployment type of the Dynamics instance. 'Online' for Dynamics Online and
     * 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     * @return the deploymentType value.
     */
    public Object deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: The deployment type of the Dynamics instance. 'Online' for Dynamics Online and
     * 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     * @param deploymentType the deploymentType value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withDeploymentType(Object deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the hostname property: The host name of the on-premises Dynamics server. The property is required for on-prem
     * and not allowed for online. Type: string (or Expression with resultType string).
     * 
     * @return the hostname value.
     */
    public Object hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the on-premises Dynamics server. The property is required for on-prem
     * and not allowed for online. Type: string (or Expression with resultType string).
     * 
     * @param hostname the hostname value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withHostname(Object hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port property: The port of on-premises Dynamics server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The port of on-premises Dynamics server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param port the port value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the serviceUri property: The URL to the Microsoft Dynamics server. The property is required for on-line and
     * not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     * @return the serviceUri value.
     */
    public Object serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The URL to the Microsoft Dynamics server. The property is required for on-line and
     * not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     * @param serviceUri the serviceUri value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withServiceUri(Object serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the organizationName property: The organization name of the Dynamics instance. The property is required for
     * on-prem and required for online when there are more than one Dynamics instances associated with the user. Type:
     * string (or Expression with resultType string).
     * 
     * @return the organizationName value.
     */
    public Object organizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organization name of the Dynamics instance. The property is required for
     * on-prem and required for online when there are more than one Dynamics instances associated with the user. Type:
     * string (or Expression with resultType string).
     * 
     * @param organizationName the organizationName value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withOrganizationName(Object organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario, 'Active Directory' for Dynamics on-premises with IFD. Type: string (or
     * Expression with resultType string).
     * 
     * @return the authenticationType value.
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario, 'Active Directory' for Dynamics on-premises with IFD. Type: string (or
     * Expression with resultType string).
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the domain property: The Active Directory domain that will verify user credentials. Type: string (or
     * Expression with resultType string).
     * 
     * @return the domain value.
     */
    public Object domain() {
        return this.domain;
    }

    /**
     * Set the domain property: The Active Directory domain that will verify user credentials. Type: string (or
     * Expression with resultType string).
     * 
     * @param domain the domain value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the username property: User name to access the Dynamics instance. Type: string (or Expression with resultType
     * string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: User name to access the Dynamics instance. Type: string (or Expression with resultType
     * string).
     * 
     * @param username the username value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the Dynamics instance.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the Dynamics instance.
     * 
     * @param password the password value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
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
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties
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
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
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
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the DynamicsLinkedServiceTypeProperties object itself.
     */
    public DynamicsLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deploymentType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property deploymentType in model DynamicsLinkedServiceTypeProperties"));
        }
        if (authenticationType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property authenticationType in model DynamicsLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (servicePrincipalCredential() != null) {
            servicePrincipalCredential().validate();
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DynamicsLinkedServiceTypeProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("deploymentType", this.deploymentType);
        jsonWriter.writeUntypedField("authenticationType", this.authenticationType);
        jsonWriter.writeUntypedField("hostName", this.hostname);
        jsonWriter.writeUntypedField("port", this.port);
        jsonWriter.writeUntypedField("serviceUri", this.serviceUri);
        jsonWriter.writeUntypedField("organizationName", this.organizationName);
        jsonWriter.writeUntypedField("domain", this.domain);
        jsonWriter.writeUntypedField("username", this.username);
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
        jsonWriter.writeUntypedField("servicePrincipalCredentialType", this.servicePrincipalCredentialType);
        jsonWriter.writeJsonField("servicePrincipalCredential", this.servicePrincipalCredential);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        jsonWriter.writeJsonField("credential", this.credential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DynamicsLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DynamicsLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DynamicsLinkedServiceTypeProperties.
     */
    public static DynamicsLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DynamicsLinkedServiceTypeProperties deserializedDynamicsLinkedServiceTypeProperties
                = new DynamicsLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deploymentType".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.deploymentType = reader.readUntyped();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.authenticationType = reader.readUntyped();
                } else if ("hostName".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.hostname = reader.readUntyped();
                } else if ("port".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.port = reader.readUntyped();
                } else if ("serviceUri".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.serviceUri = reader.readUntyped();
                } else if ("organizationName".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.organizationName = reader.readUntyped();
                } else if ("domain".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.domain = reader.readUntyped();
                } else if ("username".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("servicePrincipalId".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.servicePrincipalId = reader.readUntyped();
                } else if ("servicePrincipalCredentialType".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.servicePrincipalCredentialType
                        = reader.readUntyped();
                } else if ("servicePrincipalCredential".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.servicePrincipalCredential
                        = SecretBase.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else if ("credential".equals(fieldName)) {
                    deserializedDynamicsLinkedServiceTypeProperties.credential = CredentialReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDynamicsLinkedServiceTypeProperties;
        });
    }
}
