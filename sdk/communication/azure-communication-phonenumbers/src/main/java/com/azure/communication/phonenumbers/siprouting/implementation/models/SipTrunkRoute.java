// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.siprouting.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a trunk route for routing calls. */
@Fluent
public final class SipTrunkRoute {
    /*
     * Gets or sets description of the route.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Gets or sets name of the route.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Gets or sets regex number pattern for routing calls. .NET regex format is supported.
     * The regex should match only digits with an optional '+' prefix without spaces.
     * I.e. "^\+[1-9][0-9]{3,23}$".
     */
    @JsonProperty(value = "numberPattern", required = true)
    private String numberPattern;

    /*
     * Gets or sets list of SIP trunks for routing calls. Trunks are represented as FQDN.
     */
    @JsonProperty(value = "trunks")
    private List<String> trunks;

    /**
     * Get the description property: Gets or sets description of the route.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets description of the route.
     *
     * @param description the description value to set.
     * @return the SipTrunkRoute object itself.
     */
    public SipTrunkRoute setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the name property: Gets or sets name of the route.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets name of the route.
     *
     * @param name the name value to set.
     * @return the SipTrunkRoute object itself.
     */
    public SipTrunkRoute setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the numberPattern property: Gets or sets regex number pattern for routing calls. .NET regex format is
     * supported. The regex should match only digits with an optional '+' prefix without spaces. I.e.
     * "^\+[1-9][0-9]{3,23}$".
     *
     * @return the numberPattern value.
     */
    public String getNumberPattern() {
        return this.numberPattern;
    }

    /**
     * Set the numberPattern property: Gets or sets regex number pattern for routing calls. .NET regex format is
     * supported. The regex should match only digits with an optional '+' prefix without spaces. I.e.
     * "^\+[1-9][0-9]{3,23}$".
     *
     * @param numberPattern the numberPattern value to set.
     * @return the SipTrunkRoute object itself.
     */
    public SipTrunkRoute setNumberPattern(String numberPattern) {
        this.numberPattern = numberPattern;
        return this;
    }

    /**
     * Get the trunks property: Gets or sets list of SIP trunks for routing calls. Trunks are represented as FQDN.
     *
     * @return the trunks value.
     */
    public List<String> getTrunks() {
        return this.trunks;
    }

    /**
     * Set the trunks property: Gets or sets list of SIP trunks for routing calls. Trunks are represented as FQDN.
     *
     * @param trunks the trunks value to set.
     * @return the SipTrunkRoute object itself.
     */
    public SipTrunkRoute setTrunks(List<String> trunks) {
        this.trunks = trunks;
        return this;
    }
}
