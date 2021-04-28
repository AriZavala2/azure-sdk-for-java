// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Information about managed application. */
@JsonFlatten
@Fluent
public class ApplicationPatchable extends GenericResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationPatchable.class);

    /*
     * The plan information.
     */
    @JsonProperty(value = "plan")
    private PlanPatchable plan;

    /*
     * The kind of the managed application. Allowed values are MarketPlace and
     * ServiceCatalog.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * The managed resource group Id.
     */
    @JsonProperty(value = "properties.managedResourceGroupId")
    private String managedResourceGroupId;

    /*
     * The fully qualified path of managed application definition Id.
     */
    @JsonProperty(value = "properties.applicationDefinitionId")
    private String applicationDefinitionId;

    /*
     * Name and value pairs that define the managed application parameters. It
     * can be a JObject or a well formed JSON string.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /*
     * Name and value pairs that define the managed application outputs.
     */
    @JsonProperty(value = "properties.outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /*
     * The managed application provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the plan property: The plan information.
     *
     * @return the plan value.
     */
    public PlanPatchable plan() {
        return this.plan;
    }

    /**
     * Set the plan property: The plan information.
     *
     * @param plan the plan value to set.
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withPlan(PlanPatchable plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the kind property: The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @param kind the kind value to set.
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the managedResourceGroupId property: The managed resource group Id.
     *
     * @return the managedResourceGroupId value.
     */
    public String managedResourceGroupId() {
        return this.managedResourceGroupId;
    }

    /**
     * Set the managedResourceGroupId property: The managed resource group Id.
     *
     * @param managedResourceGroupId the managedResourceGroupId value to set.
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withManagedResourceGroupId(String managedResourceGroupId) {
        this.managedResourceGroupId = managedResourceGroupId;
        return this;
    }

    /**
     * Get the applicationDefinitionId property: The fully qualified path of managed application definition Id.
     *
     * @return the applicationDefinitionId value.
     */
    public String applicationDefinitionId() {
        return this.applicationDefinitionId;
    }

    /**
     * Set the applicationDefinitionId property: The fully qualified path of managed application definition Id.
     *
     * @param applicationDefinitionId the applicationDefinitionId value to set.
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withApplicationDefinitionId(String applicationDefinitionId) {
        this.applicationDefinitionId = applicationDefinitionId;
        return this;
    }

    /**
     * Get the parameters property: Name and value pairs that define the managed application parameters. It can be a
     * JObject or a well formed JSON string.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Name and value pairs that define the managed application parameters. It can be a
     * JObject or a well formed JSON string.
     *
     * @param parameters the parameters value to set.
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the outputs property: Name and value pairs that define the managed application outputs.
     *
     * @return the outputs value.
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get the provisioningState property: The managed application provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationPatchable withManagedBy(String managedBy) {
        super.withManagedBy(managedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationPatchable withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationPatchable withIdentity(Identity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationPatchable withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationPatchable withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (plan() != null) {
            plan().validate();
        }
    }
}