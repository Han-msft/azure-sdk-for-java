/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an upgrade policy - automatic, manual, or rolling.
 */
public class UpgradePolicy {
    /**
     * Specifies the mode of an upgrade to virtual machines in the scale
     * set.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br
     * /&gt; **Manual** - You  control the application of updates to virtual
     * machines in the scale set. You do this by using the manualUpgrade
     * action.&lt;br /&gt;&lt;br /&gt; **Automatic** - All virtual machines in
     * the scale set are automatically updated at the same time.&lt;br
     * /&gt;&lt;br /&gt; **Rolling** - Scale set performs updates in batches
     * with an optional pause time in between.
     * Possible values include: 'automatic', 'manual', 'rolling'.
     */
    @JsonProperty(value = "mode", required = true)
    private UpgradeMode mode;

    /**
     * Configuration parameters used for performing automatic OS Upgrade.
     * The configuration parameters used for performing automatic OS upgrade.
     */
    @JsonProperty(value = "automaticOSUpgradePolicy")
    private AutomaticOSUpgradePolicy automaticOSUpgradePolicy;

    /**
     * The configuration parameters used while performing a rolling upgrade.
     */
    @JsonProperty(value = "rollingUpgradePolicy")
    private RollingUpgradePolicy rollingUpgradePolicy;

    /**
     * Get possible values include: 'automatic', 'manual', 'rolling'.
     *
     * @return the mode value
     */
    public UpgradeMode mode() {
        return this.mode;
    }

    /**
     * Set possible values include: 'automatic', 'manual', 'rolling'.
     *
     * @param mode the mode value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withMode(UpgradeMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the configuration parameters used for performing automatic OS upgrade.
     *
     * @return the automaticOSUpgradePolicy value
     */
    public AutomaticOSUpgradePolicy automaticOSUpgradePolicy() {
        return this.automaticOSUpgradePolicy;
    }

    /**
     * Set the configuration parameters used for performing automatic OS upgrade.
     *
     * @param automaticOSUpgradePolicy the automaticOSUpgradePolicy value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withAutomaticOSUpgradePolicy(AutomaticOSUpgradePolicy automaticOSUpgradePolicy) {
        this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
        return this;
    }

    /**
     * Get the rollingUpgradePolicy value.
     *
     * @return the rollingUpgradePolicy value
     */
    public RollingUpgradePolicy rollingUpgradePolicy() {
        return this.rollingUpgradePolicy;
    }

    /**
     * Set the rollingUpgradePolicy value.
     *
     * @param rollingUpgradePolicy the rollingUpgradePolicy value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withRollingUpgradePolicy(RollingUpgradePolicy rollingUpgradePolicy) {
        this.rollingUpgradePolicy = rollingUpgradePolicy;
        return this;
    }

}
