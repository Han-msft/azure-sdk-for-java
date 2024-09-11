/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import org.joda.time.Period;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Pool in the Azure Batch service.
 */
public class CloudPool {
    /**
     * A string that uniquely identifies the Pool within the Account.
     * The ID can contain any combination of alphanumeric characters including
     * hyphens and underscores, and cannot contain more than 64 characters. The
     * ID is case-preserving and case-insensitive (that is, you may not have
     * two IDs within an Account that differ only by case).
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The display name for the Pool.
     * The display name need not be unique and can contain any Unicode
     * characters up to a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The URL of the Pool.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The ETag of the Pool.
     * This is an opaque string. You can use it to detect whether the Pool has
     * changed between requests. In particular, you can be pass the ETag when
     * updating a Pool to specify that your changes should take effect only if
     * nobody else has modified the Pool in the meantime.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The last modified time of the Pool.
     * This is the last time at which the Pool level data, such as the
     * targetDedicatedNodes or enableAutoscale settings, changed. It does not
     * factor in node-level changes such as a Compute Node changing state.
     */
    @JsonProperty(value = "lastModified")
    private DateTime lastModified;

    /**
     * The creation time of the Pool.
     */
    @JsonProperty(value = "creationTime")
    private DateTime creationTime;

    /**
     * The current state of the Pool.
     * Possible values include: 'active', 'deleting'.
     */
    @JsonProperty(value = "state")
    private PoolState state;

    /**
     * The time at which the Pool entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime")
    private DateTime stateTransitionTime;

    /**
     * Whether the Pool is resizing.
     * Possible values include: 'steady', 'resizing', 'stopping'.
     */
    @JsonProperty(value = "allocationState")
    private AllocationState allocationState;

    /**
     * The time at which the Pool entered its current allocation state.
     */
    @JsonProperty(value = "allocationStateTransitionTime")
    private DateTime allocationStateTransitionTime;

    /**
     * The size of virtual machines in the Pool. All virtual machines in a Pool
     * are the same size.
     * For information about available sizes of virtual machines in Pools, see
     * Choose a VM size for Compute Nodes in an Azure Batch Pool
     * (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /**
     * The virtual machine configuration for the Pool.
     * This property must be specified.
     */
    @JsonProperty(value = "virtualMachineConfiguration")
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /**
     * The timeout for allocation of Compute Nodes to the Pool.
     * This is the timeout for the most recent resize operation. (The initial
     * sizing when the Pool is created counts as a resize.) The default value
     * is 15 minutes.
     */
    @JsonProperty(value = "resizeTimeout")
    private Period resizeTimeout;

    /**
     * A list of errors encountered while performing the last resize on the
     * Pool.
     * This property is set only if one or more errors occurred during the last
     * Pool resize, and only when the Pool allocationState is Steady.
     */
    @JsonProperty(value = "resizeErrors")
    private List<ResizeError> resizeErrors;

    /**
     * The number of dedicated Compute Nodes currently in the Pool.
     */
    @JsonProperty(value = "currentDedicatedNodes")
    private Integer currentDedicatedNodes;

    /**
     * The number of Spot/Low-priority Compute Nodes currently in the Pool.
     * Spot/Low-priority Compute Nodes which have been preempted are included
     * in this count.
     */
    @JsonProperty(value = "currentLowPriorityNodes")
    private Integer currentLowPriorityNodes;

    /**
     * The desired number of dedicated Compute Nodes in the Pool.
     */
    @JsonProperty(value = "targetDedicatedNodes")
    private Integer targetDedicatedNodes;

    /**
     * The desired number of Spot/Low-priority Compute Nodes in the Pool.
     */
    @JsonProperty(value = "targetLowPriorityNodes")
    private Integer targetLowPriorityNodes;

    /**
     * Whether the Pool size should automatically adjust over time.
     * If false, at least one of targetDedicatedNodes and
     * targetLowPriorityNodes must be specified. If true, the autoScaleFormula
     * property is required and the Pool automatically resizes according to the
     * formula. The default value is false.
     */
    @JsonProperty(value = "enableAutoScale")
    private Boolean enableAutoScale;

    /**
     * A formula for the desired number of Compute Nodes in the Pool.
     * This property is set only if the Pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @JsonProperty(value = "autoScaleFormula")
    private String autoScaleFormula;

    /**
     * The time interval at which to automatically adjust the Pool size
     * according to the autoscale formula.
     * This property is set only if the Pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @JsonProperty(value = "autoScaleEvaluationInterval")
    private Period autoScaleEvaluationInterval;

    /**
     * The results and errors from the last execution of the autoscale formula.
     * This property is set only if the Pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @JsonProperty(value = "autoScaleRun")
    private AutoScaleRun autoScaleRun;

    /**
     * Whether the Pool permits direct communication between Compute Nodes.
     * This imposes restrictions on which Compute Nodes can be assigned to the
     * Pool. Specifying this value can reduce the chance of the requested
     * number of Compute Nodes to be allocated in the Pool.
     */
    @JsonProperty(value = "enableInterNodeCommunication")
    private Boolean enableInterNodeCommunication;

    /**
     * The network configuration for the Pool.
     */
    @JsonProperty(value = "networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    /**
     * A Task specified to run on each Compute Node as it joins the Pool.
     */
    @JsonProperty(value = "startTask")
    private StartTask startTask;

    /**
     * The list of Certificates to be installed on each Compute Node in the
     * Pool.
     * For Windows Nodes, the Batch service installs the Certificates to the
     * specified Certificate store and location. For Linux Compute Nodes, the
     * Certificates are stored in a directory inside the Task working directory
     * and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the
     * Task to query for this location. For Certificates with visibility of
     * 'remoteUser', a 'certs' directory is created in the user's home
     * directory (e.g., /home/{user-name}/certs) and Certificates are placed in
     * that directory.
     *
     * Warning: This property is deprecated and will be removed after February,
     * 2024. Please use the [Azure KeyVault
     * Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide)
     * instead.
     */
    @JsonProperty(value = "certificateReferences")
    private List<CertificateReference> certificateReferences;

    /**
     * The list of Packages to be installed on each Compute Node in the Pool.
     * Changes to Package references affect all new Nodes joining the Pool, but
     * do not affect Compute Nodes that are already in the Pool until they are
     * rebooted or reimaged. There is a maximum of 10 Package references on any
     * given Pool.
     */
    @JsonProperty(value = "applicationPackageReferences")
    private List<ApplicationPackageReference> applicationPackageReferences;

    /**
     * The number of task slots that can be used to run concurrent tasks on a
     * single compute node in the pool.
     * The default value is 1. The maximum value is the smaller of 4 times the
     * number of cores of the vmSize of the pool or 256.
     */
    @JsonProperty(value = "taskSlotsPerNode")
    private Integer taskSlotsPerNode;

    /**
     * How Tasks are distributed across Compute Nodes in a Pool.
     * If not specified, the default is spread.
     */
    @JsonProperty(value = "taskSchedulingPolicy")
    private TaskSchedulingPolicy taskSchedulingPolicy;

    /**
     * The list of user Accounts to be created on each Compute Node in the
     * Pool.
     */
    @JsonProperty(value = "userAccounts")
    private List<UserAccount> userAccounts;

    /**
     * A list of name-value pairs associated with the Pool as metadata.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Utilization and resource usage statistics for the entire lifetime of the
     * Pool.
     * This property is populated only if the CloudPool was retrieved with an
     * expand clause including the 'stats' attribute; otherwise it is null. The
     * statistics may not be immediately available. The Batch service performs
     * periodic roll-up of statistics. The typical delay is about 30 minutes.
     */
    @JsonProperty(value = "stats")
    private PoolStatistics stats;

    /**
     * A list of file systems to mount on each node in the pool.
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     */
    @JsonProperty(value = "mountConfiguration")
    private List<MountConfiguration> mountConfiguration;

    /**
     * The identity of the Batch pool, if configured.
     * The list of user identities associated with the Batch pool. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "identity")
    private BatchPoolIdentity identity;

    /**
     * The desired node communication mode for the pool.
     * If omitted, the default value is Default. Possible values include:
     * 'default', 'classic', 'simplified'.
     */
    @JsonProperty(value = "targetNodeCommunicationMode")
    private NodeCommunicationMode targetNodeCommunicationMode;

    /**
     * The current state of the pool communication mode.
     * Possible values include: 'default', 'classic', 'simplified'.
     */
    @JsonProperty(value = "currentNodeCommunicationMode", access = JsonProperty.Access.WRITE_ONLY)
    private NodeCommunicationMode currentNodeCommunicationMode;

    /**
     * The upgrade policy for the Pool.
     * Describes an upgrade policy - automatic, manual, or rolling.
     */
    @JsonProperty(value = "upgradePolicy")
    private UpgradePolicy upgradePolicy;

    /**
     * The user-specified tags associated with the pool.
     * The user-defined tags to be associated with the Azure Batch Pool. When
     * specified, these tags are propagated to the backing Azure resources
     * associated with the pool. This property can only be specified when the
     * Batch account was created with the poolAllocationMode property set to
     * 'UserSubscription'.
     */
    @JsonProperty(value = "resourceTags")
    private Map<String, String> resourceTags;

    /**
     * Get the ID can contain any combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is case-preserving and case-insensitive (that is, you may not have two IDs within an Account that differ only by case).
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID can contain any combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is case-preserving and case-insensitive (that is, you may not have two IDs within an Account that differ only by case).
     *
     * @param id the id value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get this is an opaque string. You can use it to detect whether the Pool has changed between requests. In particular, you can be pass the ETag when updating a Pool to specify that your changes should take effect only if nobody else has modified the Pool in the meantime.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set this is an opaque string. You can use it to detect whether the Pool has changed between requests. In particular, you can be pass the ETag when updating a Pool to specify that your changes should take effect only if nobody else has modified the Pool in the meantime.
     *
     * @param eTag the eTag value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get this is the last time at which the Pool level data, such as the targetDedicatedNodes or enableAutoscale settings, changed. It does not factor in node-level changes such as a Compute Node changing state.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set this is the last time at which the Pool level data, such as the targetDedicatedNodes or enableAutoscale settings, changed. It does not factor in node-level changes such as a Compute Node changing state.
     *
     * @param lastModified the lastModified value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime value.
     *
     * @param creationTime the creationTime value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get possible values include: 'active', 'deleting'.
     *
     * @return the state value
     */
    public PoolState state() {
        return this.state;
    }

    /**
     * Set possible values include: 'active', 'deleting'.
     *
     * @param state the state value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withState(PoolState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateTransitionTime value.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the stateTransitionTime value.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get possible values include: 'steady', 'resizing', 'stopping'.
     *
     * @return the allocationState value
     */
    public AllocationState allocationState() {
        return this.allocationState;
    }

    /**
     * Set possible values include: 'steady', 'resizing', 'stopping'.
     *
     * @param allocationState the allocationState value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAllocationState(AllocationState allocationState) {
        this.allocationState = allocationState;
        return this;
    }

    /**
     * Get the allocationStateTransitionTime value.
     *
     * @return the allocationStateTransitionTime value
     */
    public DateTime allocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }

    /**
     * Set the allocationStateTransitionTime value.
     *
     * @param allocationStateTransitionTime the allocationStateTransitionTime value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAllocationStateTransitionTime(DateTime allocationStateTransitionTime) {
        this.allocationStateTransitionTime = allocationStateTransitionTime;
        return this;
    }

    /**
     * Get for information about available sizes of virtual machines in Pools, see Choose a VM size for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set for information about available sizes of virtual machines in Pools, see Choose a VM size for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @param vmSize the vmSize value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get this property must be specified.
     *
     * @return the virtualMachineConfiguration value
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set this property must be specified.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get this is the timeout for the most recent resize operation. (The initial sizing when the Pool is created counts as a resize.) The default value is 15 minutes.
     *
     * @return the resizeTimeout value
     */
    public Period resizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set this is the timeout for the most recent resize operation. (The initial sizing when the Pool is created counts as a resize.) The default value is 15 minutes.
     *
     * @param resizeTimeout the resizeTimeout value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get this property is set only if one or more errors occurred during the last Pool resize, and only when the Pool allocationState is Steady.
     *
     * @return the resizeErrors value
     */
    public List<ResizeError> resizeErrors() {
        return this.resizeErrors;
    }

    /**
     * Set this property is set only if one or more errors occurred during the last Pool resize, and only when the Pool allocationState is Steady.
     *
     * @param resizeErrors the resizeErrors value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withResizeErrors(List<ResizeError> resizeErrors) {
        this.resizeErrors = resizeErrors;
        return this;
    }

    /**
     * Get the currentDedicatedNodes value.
     *
     * @return the currentDedicatedNodes value
     */
    public Integer currentDedicatedNodes() {
        return this.currentDedicatedNodes;
    }

    /**
     * Set the currentDedicatedNodes value.
     *
     * @param currentDedicatedNodes the currentDedicatedNodes value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCurrentDedicatedNodes(Integer currentDedicatedNodes) {
        this.currentDedicatedNodes = currentDedicatedNodes;
        return this;
    }

    /**
     * Get spot/Low-priority Compute Nodes which have been preempted are included in this count.
     *
     * @return the currentLowPriorityNodes value
     */
    public Integer currentLowPriorityNodes() {
        return this.currentLowPriorityNodes;
    }

    /**
     * Set spot/Low-priority Compute Nodes which have been preempted are included in this count.
     *
     * @param currentLowPriorityNodes the currentLowPriorityNodes value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCurrentLowPriorityNodes(Integer currentLowPriorityNodes) {
        this.currentLowPriorityNodes = currentLowPriorityNodes;
        return this;
    }

    /**
     * Get the targetDedicatedNodes value.
     *
     * @return the targetDedicatedNodes value
     */
    public Integer targetDedicatedNodes() {
        return this.targetDedicatedNodes;
    }

    /**
     * Set the targetDedicatedNodes value.
     *
     * @param targetDedicatedNodes the targetDedicatedNodes value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withTargetDedicatedNodes(Integer targetDedicatedNodes) {
        this.targetDedicatedNodes = targetDedicatedNodes;
        return this;
    }

    /**
     * Get the targetLowPriorityNodes value.
     *
     * @return the targetLowPriorityNodes value
     */
    public Integer targetLowPriorityNodes() {
        return this.targetLowPriorityNodes;
    }

    /**
     * Set the targetLowPriorityNodes value.
     *
     * @param targetLowPriorityNodes the targetLowPriorityNodes value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withTargetLowPriorityNodes(Integer targetLowPriorityNodes) {
        this.targetLowPriorityNodes = targetLowPriorityNodes;
        return this;
    }

    /**
     * Get if false, at least one of targetDedicatedNodes and targetLowPriorityNodes must be specified. If true, the autoScaleFormula property is required and the Pool automatically resizes according to the formula. The default value is false.
     *
     * @return the enableAutoScale value
     */
    public Boolean enableAutoScale() {
        return this.enableAutoScale;
    }

    /**
     * Set if false, at least one of targetDedicatedNodes and targetLowPriorityNodes must be specified. If true, the autoScaleFormula property is required and the Pool automatically resizes according to the formula. The default value is false.
     *
     * @param enableAutoScale the enableAutoScale value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withEnableAutoScale(Boolean enableAutoScale) {
        this.enableAutoScale = enableAutoScale;
        return this;
    }

    /**
     * Get this property is set only if the Pool automatically scales, i.e. enableAutoScale is true.
     *
     * @return the autoScaleFormula value
     */
    public String autoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * Set this property is set only if the Pool automatically scales, i.e. enableAutoScale is true.
     *
     * @param autoScaleFormula the autoScaleFormula value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAutoScaleFormula(String autoScaleFormula) {
        this.autoScaleFormula = autoScaleFormula;
        return this;
    }

    /**
     * Get this property is set only if the Pool automatically scales, i.e. enableAutoScale is true.
     *
     * @return the autoScaleEvaluationInterval value
     */
    public Period autoScaleEvaluationInterval() {
        return this.autoScaleEvaluationInterval;
    }

    /**
     * Set this property is set only if the Pool automatically scales, i.e. enableAutoScale is true.
     *
     * @param autoScaleEvaluationInterval the autoScaleEvaluationInterval value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAutoScaleEvaluationInterval(Period autoScaleEvaluationInterval) {
        this.autoScaleEvaluationInterval = autoScaleEvaluationInterval;
        return this;
    }

    /**
     * Get this property is set only if the Pool automatically scales, i.e. enableAutoScale is true.
     *
     * @return the autoScaleRun value
     */
    public AutoScaleRun autoScaleRun() {
        return this.autoScaleRun;
    }

    /**
     * Set this property is set only if the Pool automatically scales, i.e. enableAutoScale is true.
     *
     * @param autoScaleRun the autoScaleRun value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAutoScaleRun(AutoScaleRun autoScaleRun) {
        this.autoScaleRun = autoScaleRun;
        return this;
    }

    /**
     * Get this imposes restrictions on which Compute Nodes can be assigned to the Pool. Specifying this value can reduce the chance of the requested number of Compute Nodes to be allocated in the Pool.
     *
     * @return the enableInterNodeCommunication value
     */
    public Boolean enableInterNodeCommunication() {
        return this.enableInterNodeCommunication;
    }

    /**
     * Set this imposes restrictions on which Compute Nodes can be assigned to the Pool. Specifying this value can reduce the chance of the requested number of Compute Nodes to be allocated in the Pool.
     *
     * @param enableInterNodeCommunication the enableInterNodeCommunication value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withEnableInterNodeCommunication(Boolean enableInterNodeCommunication) {
        this.enableInterNodeCommunication = enableInterNodeCommunication;
        return this;
    }

    /**
     * Get the networkConfiguration value.
     *
     * @return the networkConfiguration value
     */
    public NetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration value.
     *
     * @param networkConfiguration the networkConfiguration value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the startTask value.
     *
     * @return the startTask value
     */
    public StartTask startTask() {
        return this.startTask;
    }

    /**
     * Set the startTask value.
     *
     * @param startTask the startTask value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withStartTask(StartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get for Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location. For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     Warning: This property is deprecated and will be removed after February, 2024. Please use the [Azure KeyVault Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     *
     * @return the certificateReferences value
     */
    public List<CertificateReference> certificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set for Windows Nodes, the Batch service installs the Certificates to the specified Certificate store and location. For Linux Compute Nodes, the Certificates are stored in a directory inside the Task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the Task to query for this location. For Certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and Certificates are placed in that directory.
     Warning: This property is deprecated and will be removed after February, 2024. Please use the [Azure KeyVault Extension](https://learn.microsoft.com/azure/batch/batch-certificate-migration-guide) instead.
     *
     * @param certificateReferences the certificateReferences value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCertificateReferences(List<CertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get changes to Package references affect all new Nodes joining the Pool, but do not affect Compute Nodes that are already in the Pool until they are rebooted or reimaged. There is a maximum of 10 Package references on any given Pool.
     *
     * @return the applicationPackageReferences value
     */
    public List<ApplicationPackageReference> applicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set changes to Package references affect all new Nodes joining the Pool, but do not affect Compute Nodes that are already in the Pool until they are rebooted or reimaged. There is a maximum of 10 Package references on any given Pool.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get the default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     *
     * @return the taskSlotsPerNode value
     */
    public Integer taskSlotsPerNode() {
        return this.taskSlotsPerNode;
    }

    /**
     * Set the default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     *
     * @param taskSlotsPerNode the taskSlotsPerNode value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withTaskSlotsPerNode(Integer taskSlotsPerNode) {
        this.taskSlotsPerNode = taskSlotsPerNode;
        return this;
    }

    /**
     * Get if not specified, the default is spread.
     *
     * @return the taskSchedulingPolicy value
     */
    public TaskSchedulingPolicy taskSchedulingPolicy() {
        return this.taskSchedulingPolicy;
    }

    /**
     * Set if not specified, the default is spread.
     *
     * @param taskSchedulingPolicy the taskSchedulingPolicy value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withTaskSchedulingPolicy(TaskSchedulingPolicy taskSchedulingPolicy) {
        this.taskSchedulingPolicy = taskSchedulingPolicy;
        return this;
    }

    /**
     * Get the userAccounts value.
     *
     * @return the userAccounts value
     */
    public List<UserAccount> userAccounts() {
        return this.userAccounts;
    }

    /**
     * Set the userAccounts value.
     *
     * @param userAccounts the userAccounts value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withUserAccounts(List<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get this property is populated only if the CloudPool was retrieved with an expand clause including the 'stats' attribute; otherwise it is null. The statistics may not be immediately available. The Batch service performs periodic roll-up of statistics. The typical delay is about 30 minutes.
     *
     * @return the stats value
     */
    public PoolStatistics stats() {
        return this.stats;
    }

    /**
     * Set this property is populated only if the CloudPool was retrieved with an expand clause including the 'stats' attribute; otherwise it is null. The statistics may not be immediately available. The Batch service performs periodic roll-up of statistics. The typical delay is about 30 minutes.
     *
     * @param stats the stats value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withStats(PoolStatistics stats) {
        this.stats = stats;
        return this;
    }

    /**
     * Get this supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     *
     * @return the mountConfiguration value
     */
    public List<MountConfiguration> mountConfiguration() {
        return this.mountConfiguration;
    }

    /**
     * Set this supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     *
     * @param mountConfiguration the mountConfiguration value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withMountConfiguration(List<MountConfiguration> mountConfiguration) {
        this.mountConfiguration = mountConfiguration;
        return this;
    }

    /**
     * Get the list of user identities associated with the Batch pool. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the identity value
     */
    public BatchPoolIdentity identity() {
        return this.identity;
    }

    /**
     * Set the list of user identities associated with the Batch pool. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param identity the identity value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withIdentity(BatchPoolIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get if omitted, the default value is Default. Possible values include: 'default', 'classic', 'simplified'.
     *
     * @return the targetNodeCommunicationMode value
     */
    public NodeCommunicationMode targetNodeCommunicationMode() {
        return this.targetNodeCommunicationMode;
    }

    /**
     * Set if omitted, the default value is Default. Possible values include: 'default', 'classic', 'simplified'.
     *
     * @param targetNodeCommunicationMode the targetNodeCommunicationMode value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withTargetNodeCommunicationMode(NodeCommunicationMode targetNodeCommunicationMode) {
        this.targetNodeCommunicationMode = targetNodeCommunicationMode;
        return this;
    }

    /**
     * Get possible values include: 'default', 'classic', 'simplified'.
     *
     * @return the currentNodeCommunicationMode value
     */
    public NodeCommunicationMode currentNodeCommunicationMode() {
        return this.currentNodeCommunicationMode;
    }

    /**
     * Get describes an upgrade policy - automatic, manual, or rolling.
     *
     * @return the upgradePolicy value
     */
    public UpgradePolicy upgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set describes an upgrade policy - automatic, manual, or rolling.
     *
     * @param upgradePolicy the upgradePolicy value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withUpgradePolicy(UpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get the user-defined tags to be associated with the Azure Batch Pool. When specified, these tags are propagated to the backing Azure resources associated with the pool. This property can only be specified when the Batch account was created with the poolAllocationMode property set to 'UserSubscription'.
     *
     * @return the resourceTags value
     */
    public Map<String, String> resourceTags() {
        return this.resourceTags;
    }

    /**
     * Set the user-defined tags to be associated with the Azure Batch Pool. When specified, these tags are propagated to the backing Azure resources associated with the pool. This property can only be specified when the Batch account was created with the poolAllocationMode property set to 'UserSubscription'.
     *
     * @param resourceTags the resourceTags value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withResourceTags(Map<String, String> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }

}
