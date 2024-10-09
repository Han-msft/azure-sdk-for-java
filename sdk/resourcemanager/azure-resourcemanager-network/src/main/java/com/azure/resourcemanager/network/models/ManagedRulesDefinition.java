// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Allow to exclude some variable satisfy the condition for the WAF check.
 */
@Fluent
public final class ManagedRulesDefinition implements JsonSerializable<ManagedRulesDefinition> {
    /*
     * The exceptions that are applied on the policy.
     */
    private List<ExceptionEntry> exceptions;

    /*
     * The Exclusions that are applied on the policy.
     */
    private List<OwaspCrsExclusionEntry> exclusions;

    /*
     * The managed rule sets that are associated with the policy.
     */
    private List<ManagedRuleSet> managedRuleSets;

    /**
     * Creates an instance of ManagedRulesDefinition class.
     */
    public ManagedRulesDefinition() {
    }

    /**
     * Get the exceptions property: The exceptions that are applied on the policy.
     * 
     * @return the exceptions value.
     */
    public List<ExceptionEntry> exceptions() {
        return this.exceptions;
    }

    /**
     * Set the exceptions property: The exceptions that are applied on the policy.
     * 
     * @param exceptions the exceptions value to set.
     * @return the ManagedRulesDefinition object itself.
     */
    public ManagedRulesDefinition withExceptions(List<ExceptionEntry> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

    /**
     * Get the exclusions property: The Exclusions that are applied on the policy.
     * 
     * @return the exclusions value.
     */
    public List<OwaspCrsExclusionEntry> exclusions() {
        return this.exclusions;
    }

    /**
     * Set the exclusions property: The Exclusions that are applied on the policy.
     * 
     * @param exclusions the exclusions value to set.
     * @return the ManagedRulesDefinition object itself.
     */
    public ManagedRulesDefinition withExclusions(List<OwaspCrsExclusionEntry> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Get the managedRuleSets property: The managed rule sets that are associated with the policy.
     * 
     * @return the managedRuleSets value.
     */
    public List<ManagedRuleSet> managedRuleSets() {
        return this.managedRuleSets;
    }

    /**
     * Set the managedRuleSets property: The managed rule sets that are associated with the policy.
     * 
     * @param managedRuleSets the managedRuleSets value to set.
     * @return the ManagedRulesDefinition object itself.
     */
    public ManagedRulesDefinition withManagedRuleSets(List<ManagedRuleSet> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exceptions() != null) {
            exceptions().forEach(e -> e.validate());
        }
        if (exclusions() != null) {
            exclusions().forEach(e -> e.validate());
        }
        if (managedRuleSets() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property managedRuleSets in model ManagedRulesDefinition"));
        } else {
            managedRuleSets().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedRulesDefinition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("managedRuleSets", this.managedRuleSets,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("exceptions", this.exceptions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("exclusions", this.exclusions, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedRulesDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedRulesDefinition if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedRulesDefinition.
     */
    public static ManagedRulesDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedRulesDefinition deserializedManagedRulesDefinition = new ManagedRulesDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("managedRuleSets".equals(fieldName)) {
                    List<ManagedRuleSet> managedRuleSets
                        = reader.readArray(reader1 -> ManagedRuleSet.fromJson(reader1));
                    deserializedManagedRulesDefinition.managedRuleSets = managedRuleSets;
                } else if ("exceptions".equals(fieldName)) {
                    List<ExceptionEntry> exceptions = reader.readArray(reader1 -> ExceptionEntry.fromJson(reader1));
                    deserializedManagedRulesDefinition.exceptions = exceptions;
                } else if ("exclusions".equals(fieldName)) {
                    List<OwaspCrsExclusionEntry> exclusions
                        = reader.readArray(reader1 -> OwaspCrsExclusionEntry.fromJson(reader1));
                    deserializedManagedRulesDefinition.exclusions = exclusions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedRulesDefinition;
        });
    }
}
