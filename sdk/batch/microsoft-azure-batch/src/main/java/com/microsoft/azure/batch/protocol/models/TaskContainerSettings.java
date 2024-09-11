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
 * The container settings for a Task.
 */
public class TaskContainerSettings {
    /**
     * Additional options to the container create command.
     * These additional options are supplied as arguments to the "docker
     * create" command, in addition to those controlled by the Batch Service.
     */
    @JsonProperty(value = "containerRunOptions")
    private String containerRunOptions;

    /**
     * The Image to use to create the container in which the Task will run.
     * This is the full Image reference, as would be specified to "docker
     * pull". If no tag is provided as part of the Image name, the tag
     * ":latest" is used as a default.
     */
    @JsonProperty(value = "imageName", required = true)
    private String imageName;

    /**
     * The private registry which contains the container Image.
     * This setting can be omitted if was already provided at Pool creation.
     */
    @JsonProperty(value = "registry")
    private ContainerRegistry registry;

    /**
     * The location of the container Task working directory.
     * The default is 'taskWorkingDirectory'. Possible values include:
     * 'taskWorkingDirectory', 'containerImageDefault'.
     */
    @JsonProperty(value = "workingDirectory")
    private ContainerWorkingDirectory workingDirectory;

    /**
     * The paths you want to mounted to container task.
     * If this array is null or be not present, container task will mount
     * entire temporary disk drive in windows (or AZ_BATCH_NODE_ROOT_DIR in
     * Linux). It won't' mount any data paths into container if this array is
     * set as empty.
     */
    @JsonProperty(value = "containerHostBatchBindMounts")
    private List<ContainerHostBatchBindMountEntry> containerHostBatchBindMounts;

    /**
     * Get these additional options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch Service.
     *
     * @return the containerRunOptions value
     */
    public String containerRunOptions() {
        return this.containerRunOptions;
    }

    /**
     * Set these additional options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch Service.
     *
     * @param containerRunOptions the containerRunOptions value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withContainerRunOptions(String containerRunOptions) {
        this.containerRunOptions = containerRunOptions;
        return this;
    }

    /**
     * Get this is the full Image reference, as would be specified to "docker pull". If no tag is provided as part of the Image name, the tag ":latest" is used as a default.
     *
     * @return the imageName value
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set this is the full Image reference, as would be specified to "docker pull". If no tag is provided as part of the Image name, the tag ":latest" is used as a default.
     *
     * @param imageName the imageName value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get this setting can be omitted if was already provided at Pool creation.
     *
     * @return the registry value
     */
    public ContainerRegistry registry() {
        return this.registry;
    }

    /**
     * Set this setting can be omitted if was already provided at Pool creation.
     *
     * @param registry the registry value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withRegistry(ContainerRegistry registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get the default is 'taskWorkingDirectory'. Possible values include: 'taskWorkingDirectory', 'containerImageDefault'.
     *
     * @return the workingDirectory value
     */
    public ContainerWorkingDirectory workingDirectory() {
        return this.workingDirectory;
    }

    /**
     * Set the default is 'taskWorkingDirectory'. Possible values include: 'taskWorkingDirectory', 'containerImageDefault'.
     *
     * @param workingDirectory the workingDirectory value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withWorkingDirectory(ContainerWorkingDirectory workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }

    /**
     * Get if this array is null or be not present, container task will mount entire temporary disk drive in windows (or AZ_BATCH_NODE_ROOT_DIR in Linux). It won't' mount any data paths into container if this array is set as empty.
     *
     * @return the containerHostBatchBindMounts value
     */
    public List<ContainerHostBatchBindMountEntry> containerHostBatchBindMounts() {
        return this.containerHostBatchBindMounts;
    }

    /**
     * Set if this array is null or be not present, container task will mount entire temporary disk drive in windows (or AZ_BATCH_NODE_ROOT_DIR in Linux). It won't' mount any data paths into container if this array is set as empty.
     *
     * @param containerHostBatchBindMounts the containerHostBatchBindMounts value to set
     * @return the TaskContainerSettings object itself.
     */
    public TaskContainerSettings withContainerHostBatchBindMounts(List<ContainerHostBatchBindMountEntry> containerHostBatchBindMounts) {
        this.containerHostBatchBindMounts = containerHostBatchBindMounts;
        return this;
    }

}
