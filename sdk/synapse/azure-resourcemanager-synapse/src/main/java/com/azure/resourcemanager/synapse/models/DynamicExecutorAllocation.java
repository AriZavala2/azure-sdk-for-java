// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Dynamic Executor Allocation Properties. */
@Fluent
public final class DynamicExecutorAllocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DynamicExecutorAllocation.class);

    /*
     * Indicates whether Dynamic Executor Allocation is enabled or not.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the enabled property: Indicates whether Dynamic Executor Allocation is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether Dynamic Executor Allocation is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the DynamicExecutorAllocation object itself.
     */
    public DynamicExecutorAllocation withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}