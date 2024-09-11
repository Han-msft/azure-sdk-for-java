/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The disk encryption configuration applied on compute nodes in the pool. Disk
 * encryption configuration is not supported on Linux pool created with Azure
 * Compute Gallery Image.
 */
public class DiskEncryptionConfiguration {
    /**
     * The list of disk targets Batch Service will encrypt on the compute node.
     * The list of disk targets Batch Service will encrypt on the compute node.
     */
    @JsonProperty(value = "targets")
    private List<DiskEncryptionTarget> targets;

    /**
     * Get the list of disk targets Batch Service will encrypt on the compute node.
     *
     * @return the targets value
     */
    public List<DiskEncryptionTarget> targets() {
        return this.targets;
    }

    /**
     * Set the list of disk targets Batch Service will encrypt on the compute node.
     *
     * @param targets the targets value to set
     * @return the DiskEncryptionConfiguration object itself.
     */
    public DiskEncryptionConfiguration withTargets(List<DiskEncryptionTarget> targets) {
        this.targets = targets;
        return this;
    }

}
