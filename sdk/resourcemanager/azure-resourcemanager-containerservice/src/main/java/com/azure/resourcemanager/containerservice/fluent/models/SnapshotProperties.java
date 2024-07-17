// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservice.models.CreationData;
import com.azure.resourcemanager.containerservice.models.OSSku;
import com.azure.resourcemanager.containerservice.models.OSType;
import com.azure.resourcemanager.containerservice.models.SnapshotType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties used to configure a node pool snapshot.
 */
@Fluent
public final class SnapshotProperties {
    /*
     * CreationData to be used to specify the source agent pool resource ID to create this snapshot.
     */
    @JsonProperty(value = "creationData")
    private CreationData creationData;

    /*
     * The type of a snapshot. The default is NodePool.
     */
    @JsonProperty(value = "snapshotType")
    private SnapshotType snapshotType;

    /*
     * The version of Kubernetes.
     */
    @JsonProperty(value = "kubernetesVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String kubernetesVersion;

    /*
     * The version of node image.
     */
    @JsonProperty(value = "nodeImageVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeImageVersion;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private OSType osType;

    /*
     * Specifies the OS SKU used by the agent pool. The default is Ubuntu if OSType is Linux. The default is Windows2019
     * when Kubernetes <= 1.24 or Windows2022 when Kubernetes >= 1.25 if OSType is Windows.
     */
    @JsonProperty(value = "osSku", access = JsonProperty.Access.WRITE_ONLY)
    private OSSku osSku;

    /*
     * The size of the VM.
     */
    @JsonProperty(value = "vmSize", access = JsonProperty.Access.WRITE_ONLY)
    private String vmSize;

    /*
     * Whether to use a FIPS-enabled OS.
     */
    @JsonProperty(value = "enableFIPS", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean enableFips;

    /**
     * Creates an instance of SnapshotProperties class.
     */
    public SnapshotProperties() {
    }

    /**
     * Get the creationData property: CreationData to be used to specify the source agent pool resource ID to create
     * this snapshot.
     * 
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: CreationData to be used to specify the source agent pool resource ID to create
     * this snapshot.
     * 
     * @param creationData the creationData value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get the snapshotType property: The type of a snapshot. The default is NodePool.
     * 
     * @return the snapshotType value.
     */
    public SnapshotType snapshotType() {
        return this.snapshotType;
    }

    /**
     * Set the snapshotType property: The type of a snapshot. The default is NodePool.
     * 
     * @param snapshotType the snapshotType value to set.
     * @return the SnapshotProperties object itself.
     */
    public SnapshotProperties withSnapshotType(SnapshotType snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * Get the kubernetesVersion property: The version of Kubernetes.
     * 
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Get the nodeImageVersion property: The version of node image.
     * 
     * @return the nodeImageVersion value.
     */
    public String nodeImageVersion() {
        return this.nodeImageVersion;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Get the osSku property: Specifies the OS SKU used by the agent pool. The default is Ubuntu if OSType is Linux.
     * The default is Windows2019 when Kubernetes &lt;= 1.24 or Windows2022 when Kubernetes &gt;= 1.25 if OSType is
     * Windows.
     * 
     * @return the osSku value.
     */
    public OSSku osSku() {
        return this.osSku;
    }

    /**
     * Get the vmSize property: The size of the VM.
     * 
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Get the enableFips property: Whether to use a FIPS-enabled OS.
     * 
     * @return the enableFips value.
     */
    public Boolean enableFips() {
        return this.enableFips;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (creationData() != null) {
            creationData().validate();
        }
    }
}
