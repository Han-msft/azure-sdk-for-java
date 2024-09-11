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
 * The set of changes to be made to a Job.
 */
public class JobPatchParameter {
    /**
     * The priority of the Job.
     * Priority values can range from -1000 to 1000, with -1000 being the
     * lowest priority and 1000 being the highest priority. If omitted, the
     * priority of the Job is left unchanged.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * The maximum number of tasks that can be executed in parallel for the
     * job.
     * The value of maxParallelTasks must be -1 or greater than 0 if specified.
     * If not specified, the default value is -1, which means there's no limit
     * to the number of tasks that can be run at once. You can update a job's
     * maxParallelTasks after it has been created using the update job API.
     */
    @JsonProperty(value = "maxParallelTasks")
    private Integer maxParallelTasks;

    /**
     * Whether Tasks in this job can be preempted by other high priority jobs.
     * If the value is set to True, other high priority jobs submitted to the
     * system will take precedence and will be able requeue tasks from this
     * job. You can update a job's allowTaskPreemption after it has been
     * created using the update job API.
     */
    @JsonProperty(value = "allowTaskPreemption")
    private Boolean allowTaskPreemption;

    /**
     * The action the Batch service should take when all Tasks in the Job are
     * in the completed state.
     * If omitted, the completion behavior is left unchanged. You may not
     * change the value from terminatejob to noaction - that is, once you have
     * engaged automatic Job termination, you cannot turn it off again. If you
     * try to do this, the request fails with an 'invalid property value' error
     * response; if you are calling the REST API directly, the HTTP status code
     * is 400 (Bad Request). Possible values include: 'noAction',
     * 'terminateJob'.
     */
    @JsonProperty(value = "onAllTasksComplete")
    private OnAllTasksComplete onAllTasksComplete;

    /**
     * The execution constraints for the Job.
     * If omitted, the existing execution constraints are left unchanged.
     */
    @JsonProperty(value = "constraints")
    private JobConstraints constraints;

    /**
     * The Pool on which the Batch service runs the Job's Tasks.
     * You may change the Pool for a Job only when the Job is disabled. The
     * Patch Job call will fail if you include the poolInfo element and the Job
     * is not disabled. If you specify an autoPoolSpecification in the
     * poolInfo, only the keepAlive property of the autoPoolSpecification can
     * be updated, and then only if the autoPoolSpecification has a
     * poolLifetimeOption of Job (other job properties can be updated as
     * normal). If omitted, the Job continues to run on its current Pool.
     */
    @JsonProperty(value = "poolInfo")
    private PoolInformation poolInfo;

    /**
     * The network configuration for the Job.
     */
    @JsonProperty(value = "networkConfiguration")
    private JobNetworkConfiguration networkConfiguration;

    /**
     * A list of name-value pairs associated with the Job as metadata.
     * If omitted, the existing Job metadata is left unchanged.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Get priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. If omitted, the priority of the Job is left unchanged.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. If omitted, the priority of the Job is left unchanged.
     *
     * @param priority the priority value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the value of maxParallelTasks must be -1 or greater than 0 if specified. If not specified, the default value is -1, which means there's no limit to the number of tasks that can be run at once. You can update a job's maxParallelTasks after it has been created using the update job API.
     *
     * @return the maxParallelTasks value
     */
    public Integer maxParallelTasks() {
        return this.maxParallelTasks;
    }

    /**
     * Set the value of maxParallelTasks must be -1 or greater than 0 if specified. If not specified, the default value is -1, which means there's no limit to the number of tasks that can be run at once. You can update a job's maxParallelTasks after it has been created using the update job API.
     *
     * @param maxParallelTasks the maxParallelTasks value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withMaxParallelTasks(Integer maxParallelTasks) {
        this.maxParallelTasks = maxParallelTasks;
        return this;
    }

    /**
     * Get if the value is set to True, other high priority jobs submitted to the system will take precedence and will be able requeue tasks from this job. You can update a job's allowTaskPreemption after it has been created using the update job API.
     *
     * @return the allowTaskPreemption value
     */
    public Boolean allowTaskPreemption() {
        return this.allowTaskPreemption;
    }

    /**
     * Set if the value is set to True, other high priority jobs submitted to the system will take precedence and will be able requeue tasks from this job. You can update a job's allowTaskPreemption after it has been created using the update job API.
     *
     * @param allowTaskPreemption the allowTaskPreemption value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withAllowTaskPreemption(Boolean allowTaskPreemption) {
        this.allowTaskPreemption = allowTaskPreemption;
        return this;
    }

    /**
     * Get if omitted, the completion behavior is left unchanged. You may not change the value from terminatejob to noaction - that is, once you have engaged automatic Job termination, you cannot turn it off again. If you try to do this, the request fails with an 'invalid property value' error response; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). Possible values include: 'noAction', 'terminateJob'.
     *
     * @return the onAllTasksComplete value
     */
    public OnAllTasksComplete onAllTasksComplete() {
        return this.onAllTasksComplete;
    }

    /**
     * Set if omitted, the completion behavior is left unchanged. You may not change the value from terminatejob to noaction - that is, once you have engaged automatic Job termination, you cannot turn it off again. If you try to do this, the request fails with an 'invalid property value' error response; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). Possible values include: 'noAction', 'terminateJob'.
     *
     * @param onAllTasksComplete the onAllTasksComplete value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withOnAllTasksComplete(OnAllTasksComplete onAllTasksComplete) {
        this.onAllTasksComplete = onAllTasksComplete;
        return this;
    }

    /**
     * Get if omitted, the existing execution constraints are left unchanged.
     *
     * @return the constraints value
     */
    public JobConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set if omitted, the existing execution constraints are left unchanged.
     *
     * @param constraints the constraints value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withConstraints(JobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get you may change the Pool for a Job only when the Job is disabled. The Patch Job call will fail if you include the poolInfo element and the Job is not disabled. If you specify an autoPoolSpecification in the poolInfo, only the keepAlive property of the autoPoolSpecification can be updated, and then only if the autoPoolSpecification has a poolLifetimeOption of Job (other job properties can be updated as normal). If omitted, the Job continues to run on its current Pool.
     *
     * @return the poolInfo value
     */
    public PoolInformation poolInfo() {
        return this.poolInfo;
    }

    /**
     * Set you may change the Pool for a Job only when the Job is disabled. The Patch Job call will fail if you include the poolInfo element and the Job is not disabled. If you specify an autoPoolSpecification in the poolInfo, only the keepAlive property of the autoPoolSpecification can be updated, and then only if the autoPoolSpecification has a poolLifetimeOption of Job (other job properties can be updated as normal). If omitted, the Job continues to run on its current Pool.
     *
     * @param poolInfo the poolInfo value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withPoolInfo(PoolInformation poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    /**
     * Get the networkConfiguration value.
     *
     * @return the networkConfiguration value
     */
    public JobNetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration value.
     *
     * @param networkConfiguration the networkConfiguration value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withNetworkConfiguration(JobNetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get if omitted, the existing Job metadata is left unchanged.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set if omitted, the existing Job metadata is left unchanged.
     *
     * @param metadata the metadata value to set
     * @return the JobPatchParameter object itself.
     */
    public JobPatchParameter withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

}
