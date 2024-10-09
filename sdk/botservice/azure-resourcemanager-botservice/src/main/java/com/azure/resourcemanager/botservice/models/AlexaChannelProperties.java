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
 * The parameters to provide for the Alexa channel.
 */
@Fluent
public final class AlexaChannelProperties implements JsonSerializable<AlexaChannelProperties> {
    /*
     * The Alexa skill Id
     */
    private String alexaSkillId;

    /*
     * Url fragment used in part of the Uri configured in Alexa
     */
    private String urlFragment;

    /*
     * Full Uri used to configured the skill in Alexa
     */
    private String serviceEndpointUri;

    /*
     * Whether this channel is enabled for the bot
     */
    private boolean isEnabled;

    /**
     * Creates an instance of AlexaChannelProperties class.
     */
    public AlexaChannelProperties() {
    }

    /**
     * Get the alexaSkillId property: The Alexa skill Id.
     * 
     * @return the alexaSkillId value.
     */
    public String alexaSkillId() {
        return this.alexaSkillId;
    }

    /**
     * Set the alexaSkillId property: The Alexa skill Id.
     * 
     * @param alexaSkillId the alexaSkillId value to set.
     * @return the AlexaChannelProperties object itself.
     */
    public AlexaChannelProperties withAlexaSkillId(String alexaSkillId) {
        this.alexaSkillId = alexaSkillId;
        return this;
    }

    /**
     * Get the urlFragment property: Url fragment used in part of the Uri configured in Alexa.
     * 
     * @return the urlFragment value.
     */
    public String urlFragment() {
        return this.urlFragment;
    }

    /**
     * Get the serviceEndpointUri property: Full Uri used to configured the skill in Alexa.
     * 
     * @return the serviceEndpointUri value.
     */
    public String serviceEndpointUri() {
        return this.serviceEndpointUri;
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
     * @return the AlexaChannelProperties object itself.
     */
    public AlexaChannelProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (alexaSkillId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property alexaSkillId in model AlexaChannelProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AlexaChannelProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("alexaSkillId", this.alexaSkillId);
        jsonWriter.writeBooleanField("isEnabled", this.isEnabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AlexaChannelProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AlexaChannelProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AlexaChannelProperties.
     */
    public static AlexaChannelProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AlexaChannelProperties deserializedAlexaChannelProperties = new AlexaChannelProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alexaSkillId".equals(fieldName)) {
                    deserializedAlexaChannelProperties.alexaSkillId = reader.getString();
                } else if ("isEnabled".equals(fieldName)) {
                    deserializedAlexaChannelProperties.isEnabled = reader.getBoolean();
                } else if ("urlFragment".equals(fieldName)) {
                    deserializedAlexaChannelProperties.urlFragment = reader.getString();
                } else if ("serviceEndpointUri".equals(fieldName)) {
                    deserializedAlexaChannelProperties.serviceEndpointUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAlexaChannelProperties;
        });
    }
}
