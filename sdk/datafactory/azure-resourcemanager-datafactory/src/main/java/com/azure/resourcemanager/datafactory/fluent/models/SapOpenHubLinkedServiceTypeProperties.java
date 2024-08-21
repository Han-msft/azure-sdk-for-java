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
 * Properties specific to SAP Business Warehouse Open Hub Destination linked service type.
 */
@Fluent
public final class SapOpenHubLinkedServiceTypeProperties
    implements JsonSerializable<SapOpenHubLinkedServiceTypeProperties> {
    /*
     * Host name of the SAP BW instance where the open hub destination is located. Type: string (or Expression with
     * resultType string).
     */
    private Object server;

    /*
     * System number of the BW system where the open hub destination is located. (Usually a two-digit decimal number
     * represented as a string.) Type: string (or Expression with resultType string).
     */
    private Object systemNumber;

    /*
     * Client ID of the client on the BW system where the open hub destination is located. (Usually a three-digit
     * decimal number represented as a string) Type: string (or Expression with resultType string).
     */
    private Object clientId;

    /*
     * Language of the BW system where the open hub destination is located. The default value is EN. Type: string (or
     * Expression with resultType string).
     */
    private Object language;

    /*
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     */
    private Object systemId;

    /*
     * Username to access the SAP BW server where the open hub destination is located. Type: string (or Expression with
     * resultType string).
     */
    private Object username;

    /*
     * Password to access the SAP BW server where the open hub destination is located.
     */
    private SecretBase password;

    /*
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     */
    private Object messageServer;

    /*
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     */
    private Object messageServerService;

    /*
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     */
    private Object logonGroup;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of SapOpenHubLinkedServiceTypeProperties class.
     */
    public SapOpenHubLinkedServiceTypeProperties() {
    }

    /**
     * Get the server property: Host name of the SAP BW instance where the open hub destination is located. Type: string
     * (or Expression with resultType string).
     * 
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: Host name of the SAP BW instance where the open hub destination is located. Type: string
     * (or Expression with resultType string).
     * 
     * @param server the server value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the systemNumber property: System number of the BW system where the open hub destination is located. (Usually
     * a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     * @return the systemNumber value.
     */
    public Object systemNumber() {
        return this.systemNumber;
    }

    /**
     * Set the systemNumber property: System number of the BW system where the open hub destination is located. (Usually
     * a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     * @param systemNumber the systemNumber value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withSystemNumber(Object systemNumber) {
        this.systemNumber = systemNumber;
        return this;
    }

    /**
     * Get the clientId property: Client ID of the client on the BW system where the open hub destination is located.
     * (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType
     * string).
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client ID of the client on the BW system where the open hub destination is located.
     * (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType
     * string).
     * 
     * @param clientId the clientId value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the language property: Language of the BW system where the open hub destination is located. The default value
     * is EN. Type: string (or Expression with resultType string).
     * 
     * @return the language value.
     */
    public Object language() {
        return this.language;
    }

    /**
     * Set the language property: Language of the BW system where the open hub destination is located. The default value
     * is EN. Type: string (or Expression with resultType string).
     * 
     * @param language the language value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withLanguage(Object language) {
        this.language = language;
        return this;
    }

    /**
     * Get the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @return the systemId value.
     */
    public Object systemId() {
        return this.systemId;
    }

    /**
     * Set the systemId property: SystemID of the SAP system where the table is located. Type: string (or Expression
     * with resultType string).
     * 
     * @param systemId the systemId value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withSystemId(Object systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * Get the username property: Username to access the SAP BW server where the open hub destination is located. Type:
     * string (or Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username to access the SAP BW server where the open hub destination is located. Type:
     * string (or Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the SAP BW server where the open hub destination is located.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the SAP BW server where the open hub destination is located.
     * 
     * @param password the password value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     * 
     * @return the messageServer value.
     */
    public Object messageServer() {
        return this.messageServer;
    }

    /**
     * Set the messageServer property: The hostname of the SAP Message Server. Type: string (or Expression with
     * resultType string).
     * 
     * @param messageServer the messageServer value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withMessageServer(Object messageServer) {
        this.messageServer = messageServer;
        return this;
    }

    /**
     * Get the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     * 
     * @return the messageServerService value.
     */
    public Object messageServerService() {
        return this.messageServerService;
    }

    /**
     * Set the messageServerService property: The service name or port number of the Message Server. Type: string (or
     * Expression with resultType string).
     * 
     * @param messageServerService the messageServerService value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withMessageServerService(Object messageServerService) {
        this.messageServerService = messageServerService;
        return this;
    }

    /**
     * Get the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     * 
     * @return the logonGroup value.
     */
    public Object logonGroup() {
        return this.logonGroup;
    }

    /**
     * Set the logonGroup property: The Logon Group for the SAP System. Type: string (or Expression with resultType
     * string).
     * 
     * @param logonGroup the logonGroup value to set.
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withLogonGroup(Object logonGroup) {
        this.logonGroup = logonGroup;
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
     * @return the SapOpenHubLinkedServiceTypeProperties object itself.
     */
    public SapOpenHubLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() != null) {
            password().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("server", this.server);
        jsonWriter.writeUntypedField("systemNumber", this.systemNumber);
        jsonWriter.writeUntypedField("clientId", this.clientId);
        jsonWriter.writeUntypedField("language", this.language);
        jsonWriter.writeUntypedField("systemId", this.systemId);
        jsonWriter.writeUntypedField("userName", this.username);
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeUntypedField("messageServer", this.messageServer);
        jsonWriter.writeUntypedField("messageServerService", this.messageServerService);
        jsonWriter.writeUntypedField("logonGroup", this.logonGroup);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SapOpenHubLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapOpenHubLinkedServiceTypeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SapOpenHubLinkedServiceTypeProperties.
     */
    public static SapOpenHubLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapOpenHubLinkedServiceTypeProperties deserializedSapOpenHubLinkedServiceTypeProperties
                = new SapOpenHubLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("server".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.server = reader.readUntyped();
                } else if ("systemNumber".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.systemNumber = reader.readUntyped();
                } else if ("clientId".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.clientId = reader.readUntyped();
                } else if ("language".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.language = reader.readUntyped();
                } else if ("systemId".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.systemId = reader.readUntyped();
                } else if ("userName".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.username = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.password = SecretBase.fromJson(reader);
                } else if ("messageServer".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.messageServer = reader.readUntyped();
                } else if ("messageServerService".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.messageServerService = reader.readUntyped();
                } else if ("logonGroup".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.logonGroup = reader.readUntyped();
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedSapOpenHubLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSapOpenHubLinkedServiceTypeProperties;
        });
    }
}
