// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Communication Services error response. */
@Fluent
public final class CommunicationErrorResponse {
    /*
     * The error property.
     */
    @JsonProperty(value = "error", required = true)
    private CommunicationError error;

    /** Creates an instance of CommunicationErrorResponse class. */
    public CommunicationErrorResponse() {}

    /**
     * Get the error property: The error property.
     *
     * @return the error value.
     */
    public CommunicationError getError() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     *
     * @param error the error value to set.
     * @return the CommunicationErrorResponse object itself.
     */
    public CommunicationErrorResponse setError(CommunicationError error) {
        this.error = error;
        return this;
    }
}
