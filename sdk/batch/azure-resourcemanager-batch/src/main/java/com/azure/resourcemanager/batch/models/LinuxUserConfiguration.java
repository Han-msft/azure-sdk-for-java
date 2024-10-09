// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties used to create a user account on a Linux node.
 */
@Fluent
public final class LinuxUserConfiguration implements JsonSerializable<LinuxUserConfiguration> {
    /*
     * The uid and gid properties must be specified together or not at all. If not specified the underlying operating
     * system picks the uid.
     */
    private Integer uid;

    /*
     * The uid and gid properties must be specified together or not at all. If not specified the underlying operating
     * system picks the gid.
     */
    private Integer gid;

    /*
     * The private key must not be password protected. The private key is used to automatically configure asymmetric-key
     * based authentication for SSH between nodes in a Linux pool when the pool's enableInterNodeCommunication property
     * is true (it is ignored if enableInterNodeCommunication is false). It does this by placing the key pair into the
     * user's .ssh directory. If not specified, password-less SSH is not configured between nodes (no modification of
     * the user's .ssh directory is done).
     */
    private String sshPrivateKey;

    /**
     * Creates an instance of LinuxUserConfiguration class.
     */
    public LinuxUserConfiguration() {
    }

    /**
     * Get the uid property: The uid and gid properties must be specified together or not at all. If not specified the
     * underlying operating system picks the uid.
     * 
     * @return the uid value.
     */
    public Integer uid() {
        return this.uid;
    }

    /**
     * Set the uid property: The uid and gid properties must be specified together or not at all. If not specified the
     * underlying operating system picks the uid.
     * 
     * @param uid the uid value to set.
     * @return the LinuxUserConfiguration object itself.
     */
    public LinuxUserConfiguration withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Get the gid property: The uid and gid properties must be specified together or not at all. If not specified the
     * underlying operating system picks the gid.
     * 
     * @return the gid value.
     */
    public Integer gid() {
        return this.gid;
    }

    /**
     * Set the gid property: The uid and gid properties must be specified together or not at all. If not specified the
     * underlying operating system picks the gid.
     * 
     * @param gid the gid value to set.
     * @return the LinuxUserConfiguration object itself.
     */
    public LinuxUserConfiguration withGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * Get the sshPrivateKey property: The private key must not be password protected. The private key is used to
     * automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool's
     * enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does
     * this by placing the key pair into the user's .ssh directory. If not specified, password-less SSH is not
     * configured between nodes (no modification of the user's .ssh directory is done).
     * 
     * @return the sshPrivateKey value.
     */
    public String sshPrivateKey() {
        return this.sshPrivateKey;
    }

    /**
     * Set the sshPrivateKey property: The private key must not be password protected. The private key is used to
     * automatically configure asymmetric-key based authentication for SSH between nodes in a Linux pool when the pool's
     * enableInterNodeCommunication property is true (it is ignored if enableInterNodeCommunication is false). It does
     * this by placing the key pair into the user's .ssh directory. If not specified, password-less SSH is not
     * configured between nodes (no modification of the user's .ssh directory is done).
     * 
     * @param sshPrivateKey the sshPrivateKey value to set.
     * @return the LinuxUserConfiguration object itself.
     */
    public LinuxUserConfiguration withSshPrivateKey(String sshPrivateKey) {
        this.sshPrivateKey = sshPrivateKey;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("uid", this.uid);
        jsonWriter.writeNumberField("gid", this.gid);
        jsonWriter.writeStringField("sshPrivateKey", this.sshPrivateKey);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinuxUserConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinuxUserConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinuxUserConfiguration.
     */
    public static LinuxUserConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinuxUserConfiguration deserializedLinuxUserConfiguration = new LinuxUserConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("uid".equals(fieldName)) {
                    deserializedLinuxUserConfiguration.uid = reader.getNullable(JsonReader::getInt);
                } else if ("gid".equals(fieldName)) {
                    deserializedLinuxUserConfiguration.gid = reader.getNullable(JsonReader::getInt);
                } else if ("sshPrivateKey".equals(fieldName)) {
                    deserializedLinuxUserConfiguration.sshPrivateKey = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinuxUserConfiguration;
        });
    }
}
