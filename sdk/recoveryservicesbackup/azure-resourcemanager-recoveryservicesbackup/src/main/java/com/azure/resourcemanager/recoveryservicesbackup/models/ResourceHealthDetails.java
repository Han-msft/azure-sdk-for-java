// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Health Details for backup items.
 */
@Immutable
public class ResourceHealthDetails {
    /*
     * Health Code
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private Integer code;

    /*
     * Health Title
     */
    @JsonProperty(value = "title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /*
     * Health Message
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Health Recommended Actions
     */
    @JsonProperty(value = "recommendations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> recommendations;

    /**
     * Creates an instance of ResourceHealthDetails class.
     */
    public ResourceHealthDetails() {
    }

    /**
     * Get the code property: Health Code.
     * 
     * @return the code value.
     */
    public Integer code() {
        return this.code;
    }

    /**
     * Get the title property: Health Title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Get the message property: Health Message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the recommendations property: Health Recommended Actions.
     * 
     * @return the recommendations value.
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
