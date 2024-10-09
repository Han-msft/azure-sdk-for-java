// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The parameters to provide for the Email channel.
 */
@Fluent
public final class EmailChannelProperties implements JsonSerializable<EmailChannelProperties> {
    /*
     * The email address
     */
    private String emailAddress;

    /*
     * Email channel auth method. 0 Password (Default); 1 Graph.
     */
    private EmailChannelAuthMethod authMethod;

    /*
     * The password for the email address. Value only returned through POST to the action Channel List API, otherwise
     * empty.
     */
    private String password;

    /*
     * The magic code for setting up the modern authentication.
     */
    private String magicCode;

    /*
     * Whether this channel is enabled for the bot
     */
    private boolean isEnabled;

    /**
     * Creates an instance of EmailChannelProperties class.
     */
    public EmailChannelProperties() {
    }

    /**
     * Get the emailAddress property: The email address.
     * 
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: The email address.
     * 
     * @param emailAddress the emailAddress value to set.
     * @return the EmailChannelProperties object itself.
     */
    public EmailChannelProperties withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the authMethod property: Email channel auth method. 0 Password (Default); 1 Graph.
     * 
     * @return the authMethod value.
     */
    public EmailChannelAuthMethod authMethod() {
        return this.authMethod;
    }

    /**
     * Set the authMethod property: Email channel auth method. 0 Password (Default); 1 Graph.
     * 
     * @param authMethod the authMethod value to set.
     * @return the EmailChannelProperties object itself.
     */
    public EmailChannelProperties withAuthMethod(EmailChannelAuthMethod authMethod) {
        this.authMethod = authMethod;
        return this;
    }

    /**
     * Get the password property: The password for the email address. Value only returned through POST to the action
     * Channel List API, otherwise empty.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password for the email address. Value only returned through POST to the action
     * Channel List API, otherwise empty.
     * 
     * @param password the password value to set.
     * @return the EmailChannelProperties object itself.
     */
    public EmailChannelProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the magicCode property: The magic code for setting up the modern authentication.
     * 
     * @return the magicCode value.
     */
    public String magicCode() {
        return this.magicCode;
    }

    /**
     * Set the magicCode property: The magic code for setting up the modern authentication.
     * 
     * @param magicCode the magicCode value to set.
     * @return the EmailChannelProperties object itself.
     */
    public EmailChannelProperties withMagicCode(String magicCode) {
        this.magicCode = magicCode;
        return this;
    }

    /**
     * Get the isEnabled property: Whether this channel is enabled for the bot.
     * 
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether this channel is enabled for the bot.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the EmailChannelProperties object itself.
     */
    public EmailChannelProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (emailAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property emailAddress in model EmailChannelProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EmailChannelProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("emailAddress", this.emailAddress);
        jsonWriter.writeBooleanField("isEnabled", this.isEnabled);
        jsonWriter.writeNumberField("authMethod", this.authMethod == null ? null : this.authMethod.toFloat());
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeStringField("magicCode", this.magicCode);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EmailChannelProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EmailChannelProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EmailChannelProperties.
     */
    public static EmailChannelProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EmailChannelProperties deserializedEmailChannelProperties = new EmailChannelProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("emailAddress".equals(fieldName)) {
                    deserializedEmailChannelProperties.emailAddress = reader.getString();
                } else if ("isEnabled".equals(fieldName)) {
                    deserializedEmailChannelProperties.isEnabled = reader.getBoolean();
                } else if ("authMethod".equals(fieldName)) {
                    deserializedEmailChannelProperties.authMethod = EmailChannelAuthMethod.fromFloat(reader.getFloat());
                } else if ("password".equals(fieldName)) {
                    deserializedEmailChannelProperties.password = reader.getString();
                } else if ("magicCode".equals(fieldName)) {
                    deserializedEmailChannelProperties.magicCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEmailChannelProperties;
        });
    }
}
