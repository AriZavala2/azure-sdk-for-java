// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The parameters used to create a new compute policy. */
@JsonFlatten
@Fluent
public class CreateOrUpdateComputePolicyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CreateOrUpdateComputePolicyParameters.class);

    /*
     * The AAD object identifier for the entity to create a policy for.
     */
    @JsonProperty(value = "properties.objectId", required = true)
    private UUID objectId;

    /*
     * The type of AAD object the object identifier refers to.
     */
    @JsonProperty(value = "properties.objectType", required = true)
    private AadObjectType objectType;

    /*
     * The maximum degree of parallelism per job this user can use to submit
     * jobs. This property, the min priority per job property, or both must be
     * passed.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelismPerJob")
    private Integer maxDegreeOfParallelismPerJob;

    /*
     * The minimum priority per job this user can use to submit jobs. This
     * property, the max degree of parallelism per job property, or both must
     * be passed.
     */
    @JsonProperty(value = "properties.minPriorityPerJob")
    private Integer minPriorityPerJob;

    /**
     * Get the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @param objectId the objectId value to set.
     * @return the CreateOrUpdateComputePolicyParameters object itself.
     */
    public CreateOrUpdateComputePolicyParameters withObjectId(UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the objectType property: The type of AAD object the object identifier refers to.
     *
     * @return the objectType value.
     */
    public AadObjectType objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: The type of AAD object the object identifier refers to.
     *
     * @param objectType the objectType value to set.
     * @return the CreateOrUpdateComputePolicyParameters object itself.
     */
    public CreateOrUpdateComputePolicyParameters withObjectType(AadObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs. This property, the min priority per job property, or both must be passed.
     *
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Set the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs. This property, the min priority per job property, or both must be passed.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set.
     * @return the CreateOrUpdateComputePolicyParameters object itself.
     */
    public CreateOrUpdateComputePolicyParameters withMaxDegreeOfParallelismPerJob(
        Integer maxDegreeOfParallelismPerJob) {
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        return this;
    }

    /**
     * Get the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs. This property,
     * the max degree of parallelism per job property, or both must be passed.
     *
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Set the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs. This property,
     * the max degree of parallelism per job property, or both must be passed.
     *
     * @param minPriorityPerJob the minPriorityPerJob value to set.
     * @return the CreateOrUpdateComputePolicyParameters object itself.
     */
    public CreateOrUpdateComputePolicyParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        this.minPriorityPerJob = minPriorityPerJob;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (objectId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property objectId in model CreateOrUpdateComputePolicyParameters"));
        }
        if (objectType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property objectType in model CreateOrUpdateComputePolicyParameters"));
        }
    }
}