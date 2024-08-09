// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyState;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * A server security alert policy.
 */
@Fluent
public final class ServerSecurityAlertPolicyInner extends ProxyResource {
    /*
     * SystemData of SecurityAlertPolicyResource.
     */
    private SystemData systemData;

    /*
     * Resource properties.
     */
    private SecurityAlertsPolicyProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ServerSecurityAlertPolicyInner class.
     */
    public ServerSecurityAlertPolicyInner() {
    }

    /**
     * Get the systemData property: SystemData of SecurityAlertPolicyResource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private SecurityAlertsPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the state property: Specifies the state of the policy, whether it is enabled or disabled or a policy has not
     * been applied yet on the specific database.
     * 
     * @return the state value.
     */
    public SecurityAlertPolicyState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Specifies the state of the policy, whether it is enabled or disabled or a policy has not
     * been applied yet on the specific database.
     * 
     * @param state the state value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withState(SecurityAlertPolicyState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAlertsPolicyProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force.
     * 
     * @return the disabledAlerts value.
     */
    public List<String> disabledAlerts() {
        return this.innerProperties() == null ? null : this.innerProperties().disabledAlerts();
    }

    /**
     * Set the disabledAlerts property: Specifies an array of alerts that are disabled. Allowed values are:
     * Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force.
     * 
     * @param disabledAlerts the disabledAlerts value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withDisabledAlerts(List<String> disabledAlerts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAlertsPolicyProperties();
        }
        this.innerProperties().withDisabledAlerts(disabledAlerts);
        return this;
    }

    /**
     * Get the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     * 
     * @return the emailAddresses value.
     */
    public List<String> emailAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().emailAddresses();
    }

    /**
     * Set the emailAddresses property: Specifies an array of e-mail addresses to which the alert is sent.
     * 
     * @param emailAddresses the emailAddresses value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withEmailAddresses(List<String> emailAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAlertsPolicyProperties();
        }
        this.innerProperties().withEmailAddresses(emailAddresses);
        return this;
    }

    /**
     * Get the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     * 
     * @return the emailAccountAdmins value.
     */
    public Boolean emailAccountAdmins() {
        return this.innerProperties() == null ? null : this.innerProperties().emailAccountAdmins();
    }

    /**
     * Set the emailAccountAdmins property: Specifies that the alert is sent to the account administrators.
     * 
     * @param emailAccountAdmins the emailAccountAdmins value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withEmailAccountAdmins(Boolean emailAccountAdmins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAlertsPolicyProperties();
        }
        this.innerProperties().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    /**
     * Get the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().storageEndpoint();
    }

    /**
     * Set the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withStorageEndpoint(String storageEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAlertsPolicyProperties();
        }
        this.innerProperties().withStorageEndpoint(storageEndpoint);
        return this;
    }

    /**
     * Get the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     * 
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountAccessKey();
    }

    /**
     * Set the storageAccountAccessKey property: Specifies the identifier key of the Threat Detection audit storage
     * account.
     * 
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAlertsPolicyProperties();
        }
        this.innerProperties().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    /**
     * Get the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionDays();
    }

    /**
     * Set the retentionDays property: Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     * @param retentionDays the retentionDays value to set.
     * @return the ServerSecurityAlertPolicyInner object itself.
     */
    public ServerSecurityAlertPolicyInner withRetentionDays(Integer retentionDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityAlertsPolicyProperties();
        }
        this.innerProperties().withRetentionDays(retentionDays);
        return this;
    }

    /**
     * Get the creationTime property: Specifies the UTC creation time of the policy.
     * 
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServerSecurityAlertPolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServerSecurityAlertPolicyInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServerSecurityAlertPolicyInner.
     */
    public static ServerSecurityAlertPolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServerSecurityAlertPolicyInner deserializedServerSecurityAlertPolicyInner
                = new ServerSecurityAlertPolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedServerSecurityAlertPolicyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedServerSecurityAlertPolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedServerSecurityAlertPolicyInner.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedServerSecurityAlertPolicyInner.systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedServerSecurityAlertPolicyInner.innerProperties
                        = SecurityAlertsPolicyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServerSecurityAlertPolicyInner;
        });
    }
}
