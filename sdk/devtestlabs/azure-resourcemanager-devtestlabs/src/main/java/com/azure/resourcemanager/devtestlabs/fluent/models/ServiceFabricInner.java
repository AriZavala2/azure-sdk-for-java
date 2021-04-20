// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A Service Fabric. */
@JsonFlatten
@Fluent
public class ServiceFabricInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceFabricInner.class);

    /*
     * The backing service fabric resource's id
     */
    @JsonProperty(value = "properties.externalServiceFabricId")
    private String externalServiceFabricId;

    /*
     * The resource id of the environment under which the service fabric
     * resource is present
     */
    @JsonProperty(value = "properties.environmentId")
    private String environmentId;

    /*
     * The applicable schedule for the virtual machine.
     */
    @JsonProperty(value = "properties.applicableSchedule", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicableScheduleInner applicableSchedule;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the externalServiceFabricId property: The backing service fabric resource's id.
     *
     * @return the externalServiceFabricId value.
     */
    public String externalServiceFabricId() {
        return this.externalServiceFabricId;
    }

    /**
     * Set the externalServiceFabricId property: The backing service fabric resource's id.
     *
     * @param externalServiceFabricId the externalServiceFabricId value to set.
     * @return the ServiceFabricInner object itself.
     */
    public ServiceFabricInner withExternalServiceFabricId(String externalServiceFabricId) {
        this.externalServiceFabricId = externalServiceFabricId;
        return this;
    }

    /**
     * Get the environmentId property: The resource id of the environment under which the service fabric resource is
     * present.
     *
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: The resource id of the environment under which the service fabric resource is
     * present.
     *
     * @param environmentId the environmentId value to set.
     * @return the ServiceFabricInner object itself.
     */
    public ServiceFabricInner withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get the applicableSchedule property: The applicable schedule for the virtual machine.
     *
     * @return the applicableSchedule value.
     */
    public ApplicableScheduleInner applicableSchedule() {
        return this.applicableSchedule;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceFabricInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceFabricInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicableSchedule() != null) {
            applicableSchedule().validate();
        }
    }
}