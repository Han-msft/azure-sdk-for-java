// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.SqlServerLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * SQL Server linked service.
 */
@Fluent
public final class SqlServerLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "SqlServer";

    /*
     * SQL Server linked service properties.
     */
    private SqlServerLinkedServiceTypeProperties innerTypeProperties = new SqlServerLinkedServiceTypeProperties();

    /**
     * Creates an instance of SqlServerLinkedService class.
     */
    public SqlServerLinkedService() {
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
     * Get the innerTypeProperties property: SQL Server linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SqlServerLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlServerLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionString();
    }

    /**
     * Set the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withConnectionString(Object connectionString) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the authenticationType property: The type used for authentication. Type: string.
     * 
     * @return the authenticationType value.
     */
    public SqlServerAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The type used for authentication. Type: string.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withAuthenticationType(SqlServerAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: The on-premises Windows authentication user name. Type: string (or Expression with
     * resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The on-premises Windows authentication user name. Type: string (or Expression with
     * resultType string).
     * 
     * @param username the username value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The on-premises Windows authentication password.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The on-premises Windows authentication password.
     * 
     * @param password the password value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
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
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the alwaysEncryptedSettings property: Sql always encrypted properties.
     * 
     * @return the alwaysEncryptedSettings value.
     */
    public SqlAlwaysEncryptedProperties alwaysEncryptedSettings() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().alwaysEncryptedSettings();
    }

    /**
     * Set the alwaysEncryptedSettings property: Sql always encrypted properties.
     * 
     * @param alwaysEncryptedSettings the alwaysEncryptedSettings value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withAlwaysEncryptedSettings(SqlAlwaysEncryptedProperties alwaysEncryptedSettings) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAlwaysEncryptedSettings(alwaysEncryptedSettings);
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
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
        return this;
    }

    /**
     * Get the server property: The name or network address of the instance of SQL Server to which to connect, used by
     * recommended version. Type: string (or Expression with resultType string).
     * 
     * @return the server value.
     */
    public Object server() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().server();
    }

    /**
     * Set the server property: The name or network address of the instance of SQL Server to which to connect, used by
     * recommended version. Type: string (or Expression with resultType string).
     * 
     * @param server the server value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withServer(Object server) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServer(server);
        return this;
    }

    /**
     * Get the database property: The name of the database, used by recommended version. Type: string (or Expression
     * with resultType string).
     * 
     * @return the database value.
     */
    public Object database() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().database();
    }

    /**
     * Set the database property: The name of the database, used by recommended version. Type: string (or Expression
     * with resultType string).
     * 
     * @param database the database value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withDatabase(Object database) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDatabase(database);
        return this;
    }

    /**
     * Get the encrypt property: Indicate whether TLS encryption is required for all data sent between the client and
     * server, used by recommended version. Possible values are true/yes/mandatory, false/no/optional and strict. Type:
     * string (or Expression with resultType string).
     * 
     * @return the encrypt value.
     */
    public Object encrypt() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encrypt();
    }

    /**
     * Set the encrypt property: Indicate whether TLS encryption is required for all data sent between the client and
     * server, used by recommended version. Possible values are true/yes/mandatory, false/no/optional and strict. Type:
     * string (or Expression with resultType string).
     * 
     * @param encrypt the encrypt value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withEncrypt(Object encrypt) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncrypt(encrypt);
        return this;
    }

    /**
     * Get the trustServerCertificate property: Indicate whether the channel will be encrypted while bypassing walking
     * the certificate chain to validate trust, used by recommended version. Type: Boolean (or Expression with
     * resultType boolean).
     * 
     * @return the trustServerCertificate value.
     */
    public Object trustServerCertificate() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().trustServerCertificate();
    }

    /**
     * Set the trustServerCertificate property: Indicate whether the channel will be encrypted while bypassing walking
     * the certificate chain to validate trust, used by recommended version. Type: Boolean (or Expression with
     * resultType boolean).
     * 
     * @param trustServerCertificate the trustServerCertificate value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withTrustServerCertificate(Object trustServerCertificate) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTrustServerCertificate(trustServerCertificate);
        return this;
    }

    /**
     * Get the hostnameInCertificate property: The host name to use when validating the server certificate for the
     * connection. When not specified, the server name from the Data Source is used for certificate validation, used by
     * recommended version. Type: string (or Expression with resultType string).
     * 
     * @return the hostnameInCertificate value.
     */
    public Object hostnameInCertificate() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().hostnameInCertificate();
    }

    /**
     * Set the hostnameInCertificate property: The host name to use when validating the server certificate for the
     * connection. When not specified, the server name from the Data Source is used for certificate validation, used by
     * recommended version. Type: string (or Expression with resultType string).
     * 
     * @param hostnameInCertificate the hostnameInCertificate value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withHostnameInCertificate(Object hostnameInCertificate) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHostnameInCertificate(hostnameInCertificate);
        return this;
    }

    /**
     * Get the applicationIntent property: The application workload type when connecting to a server, used by
     * recommended version. Possible values are ReadOnly and ReadWrite. Type: string (or Expression with resultType
     * string).
     * 
     * @return the applicationIntent value.
     */
    public Object applicationIntent() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().applicationIntent();
    }

    /**
     * Set the applicationIntent property: The application workload type when connecting to a server, used by
     * recommended version. Possible values are ReadOnly and ReadWrite. Type: string (or Expression with resultType
     * string).
     * 
     * @param applicationIntent the applicationIntent value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withApplicationIntent(Object applicationIntent) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withApplicationIntent(applicationIntent);
        return this;
    }

    /**
     * Get the connectTimeout property: The length of time (in seconds) to wait for a connection to the server before
     * terminating the attempt and generating an error, used by recommended version. Type: integer (or Expression with
     * resultType integer).
     * 
     * @return the connectTimeout value.
     */
    public Object connectTimeout() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectTimeout();
    }

    /**
     * Set the connectTimeout property: The length of time (in seconds) to wait for a connection to the server before
     * terminating the attempt and generating an error, used by recommended version. Type: integer (or Expression with
     * resultType integer).
     * 
     * @param connectTimeout the connectTimeout value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withConnectTimeout(Object connectTimeout) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectTimeout(connectTimeout);
        return this;
    }

    /**
     * Get the connectRetryCount property: The number of re-connections attempted after identifying that there was an
     * idle connection failure, used by recommended version. This must be an integer between 0 and 255. Type: integer
     * (or Expression with resultType integer).
     * 
     * @return the connectRetryCount value.
     */
    public Object connectRetryCount() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectRetryCount();
    }

    /**
     * Set the connectRetryCount property: The number of re-connections attempted after identifying that there was an
     * idle connection failure, used by recommended version. This must be an integer between 0 and 255. Type: integer
     * (or Expression with resultType integer).
     * 
     * @param connectRetryCount the connectRetryCount value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withConnectRetryCount(Object connectRetryCount) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectRetryCount(connectRetryCount);
        return this;
    }

    /**
     * Get the connectRetryInterval property: The amount of time (in seconds) between each re-connection attempt after
     * identifying that there was an idle connection failure, used by recommended version. This must be an integer
     * between 1 and 60. Type: integer (or Expression with resultType integer).
     * 
     * @return the connectRetryInterval value.
     */
    public Object connectRetryInterval() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectRetryInterval();
    }

    /**
     * Set the connectRetryInterval property: The amount of time (in seconds) between each re-connection attempt after
     * identifying that there was an idle connection failure, used by recommended version. This must be an integer
     * between 1 and 60. Type: integer (or Expression with resultType integer).
     * 
     * @param connectRetryInterval the connectRetryInterval value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withConnectRetryInterval(Object connectRetryInterval) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectRetryInterval(connectRetryInterval);
        return this;
    }

    /**
     * Get the loadBalanceTimeout property: The minimum time, in seconds, for the connection to live in the connection
     * pool before being destroyed, used by recommended version. Type: integer (or Expression with resultType integer).
     * 
     * @return the loadBalanceTimeout value.
     */
    public Object loadBalanceTimeout() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().loadBalanceTimeout();
    }

    /**
     * Set the loadBalanceTimeout property: The minimum time, in seconds, for the connection to live in the connection
     * pool before being destroyed, used by recommended version. Type: integer (or Expression with resultType integer).
     * 
     * @param loadBalanceTimeout the loadBalanceTimeout value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withLoadBalanceTimeout(Object loadBalanceTimeout) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withLoadBalanceTimeout(loadBalanceTimeout);
        return this;
    }

    /**
     * Get the commandTimeout property: The default wait time (in seconds) before terminating the attempt to execute a
     * command and generating an error, used by recommended version. Type: integer (or Expression with resultType
     * integer).
     * 
     * @return the commandTimeout value.
     */
    public Object commandTimeout() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().commandTimeout();
    }

    /**
     * Set the commandTimeout property: The default wait time (in seconds) before terminating the attempt to execute a
     * command and generating an error, used by recommended version. Type: integer (or Expression with resultType
     * integer).
     * 
     * @param commandTimeout the commandTimeout value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withCommandTimeout(Object commandTimeout) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCommandTimeout(commandTimeout);
        return this;
    }

    /**
     * Get the integratedSecurity property: Indicate whether User ID and Password are specified in the connection (when
     * false) or whether the current Windows account credentials are used for authentication (when true), used by
     * recommended version. Type: Boolean (or Expression with resultType boolean).
     * 
     * @return the integratedSecurity value.
     */
    public Object integratedSecurity() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().integratedSecurity();
    }

    /**
     * Set the integratedSecurity property: Indicate whether User ID and Password are specified in the connection (when
     * false) or whether the current Windows account credentials are used for authentication (when true), used by
     * recommended version. Type: Boolean (or Expression with resultType boolean).
     * 
     * @param integratedSecurity the integratedSecurity value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withIntegratedSecurity(Object integratedSecurity) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withIntegratedSecurity(integratedSecurity);
        return this;
    }

    /**
     * Get the failoverPartner property: The name or address of the partner server to connect to if the primary server
     * is down, used by recommended version. Type: string (or Expression with resultType string).
     * 
     * @return the failoverPartner value.
     */
    public Object failoverPartner() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().failoverPartner();
    }

    /**
     * Set the failoverPartner property: The name or address of the partner server to connect to if the primary server
     * is down, used by recommended version. Type: string (or Expression with resultType string).
     * 
     * @param failoverPartner the failoverPartner value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withFailoverPartner(Object failoverPartner) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withFailoverPartner(failoverPartner);
        return this;
    }

    /**
     * Get the maxPoolSize property: The maximum number of connections allowed in the connection pool for this specific
     * connection string, used by recommended version. Type: integer (or Expression with resultType integer).
     * 
     * @return the maxPoolSize value.
     */
    public Object maxPoolSize() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().maxPoolSize();
    }

    /**
     * Set the maxPoolSize property: The maximum number of connections allowed in the connection pool for this specific
     * connection string, used by recommended version. Type: integer (or Expression with resultType integer).
     * 
     * @param maxPoolSize the maxPoolSize value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withMaxPoolSize(Object maxPoolSize) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMaxPoolSize(maxPoolSize);
        return this;
    }

    /**
     * Get the minPoolSize property: The minimum number of connections allowed in the connection pool for this specific
     * connection string, used by recommended version. Type: integer (or Expression with resultType integer).
     * 
     * @return the minPoolSize value.
     */
    public Object minPoolSize() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().minPoolSize();
    }

    /**
     * Set the minPoolSize property: The minimum number of connections allowed in the connection pool for this specific
     * connection string, used by recommended version. Type: integer (or Expression with resultType integer).
     * 
     * @param minPoolSize the minPoolSize value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withMinPoolSize(Object minPoolSize) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMinPoolSize(minPoolSize);
        return this;
    }

    /**
     * Get the multipleActiveResultSets property: When true, an application can maintain multiple active result sets
     * (MARS). When false, an application must process or cancel all result sets from one batch before it can execute
     * any other batch on that connection, used by recommended version. Type: Boolean (or Expression with resultType
     * boolean).
     * 
     * @return the multipleActiveResultSets value.
     */
    public Object multipleActiveResultSets() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().multipleActiveResultSets();
    }

    /**
     * Set the multipleActiveResultSets property: When true, an application can maintain multiple active result sets
     * (MARS). When false, an application must process or cancel all result sets from one batch before it can execute
     * any other batch on that connection, used by recommended version. Type: Boolean (or Expression with resultType
     * boolean).
     * 
     * @param multipleActiveResultSets the multipleActiveResultSets value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withMultipleActiveResultSets(Object multipleActiveResultSets) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMultipleActiveResultSets(multipleActiveResultSets);
        return this;
    }

    /**
     * Get the multiSubnetFailover property: If your application is connecting to an AlwaysOn availability group (AG) on
     * different subnets, setting MultiSubnetFailover=true provides faster detection of and connection to the
     * (currently) active server, used by recommended version. Type: Boolean (or Expression with resultType boolean).
     * 
     * @return the multiSubnetFailover value.
     */
    public Object multiSubnetFailover() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().multiSubnetFailover();
    }

    /**
     * Set the multiSubnetFailover property: If your application is connecting to an AlwaysOn availability group (AG) on
     * different subnets, setting MultiSubnetFailover=true provides faster detection of and connection to the
     * (currently) active server, used by recommended version. Type: Boolean (or Expression with resultType boolean).
     * 
     * @param multiSubnetFailover the multiSubnetFailover value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withMultiSubnetFailover(Object multiSubnetFailover) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withMultiSubnetFailover(multiSubnetFailover);
        return this;
    }

    /**
     * Get the packetSize property: The size in bytes of the network packets used to communicate with an instance of
     * server, used by recommended version. Type: integer (or Expression with resultType integer).
     * 
     * @return the packetSize value.
     */
    public Object packetSize() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packetSize();
    }

    /**
     * Set the packetSize property: The size in bytes of the network packets used to communicate with an instance of
     * server, used by recommended version. Type: integer (or Expression with resultType integer).
     * 
     * @param packetSize the packetSize value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withPacketSize(Object packetSize) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPacketSize(packetSize);
        return this;
    }

    /**
     * Get the pooling property: Indicate whether the connection will be pooled or explicitly opened every time that the
     * connection is requested, used by recommended version. Type: Boolean (or Expression with resultType boolean).
     * 
     * @return the pooling value.
     */
    public Object pooling() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().pooling();
    }

    /**
     * Set the pooling property: Indicate whether the connection will be pooled or explicitly opened every time that the
     * connection is requested, used by recommended version. Type: Boolean (or Expression with resultType boolean).
     * 
     * @param pooling the pooling value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService withPooling(Object pooling) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SqlServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPooling(pooling);
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
                    "Missing required property innerTypeProperties in model SqlServerLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SqlServerLinkedService.class);

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
     * Reads an instance of SqlServerLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlServerLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SqlServerLinkedService.
     */
    public static SqlServerLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlServerLinkedService deserializedSqlServerLinkedService = new SqlServerLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedSqlServerLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedSqlServerLinkedService.withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedSqlServerLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedSqlServerLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedSqlServerLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedSqlServerLinkedService.innerTypeProperties
                        = SqlServerLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedSqlServerLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSqlServerLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedSqlServerLinkedService;
        });
    }
}
