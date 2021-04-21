// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the SKU name and Azure pricing tier for auto scale v-core resource. */
@Fluent
public final class AutoScaleVCoreSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoScaleVCoreSku.class);

    /*
     * Name of the SKU level.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The name of the Azure pricing tier to which the SKU applies.
     */
    @JsonProperty(value = "tier")
    private VCoreSkuTier tier;

    /*
     * The capacity of an auto scale v-core resource.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: Name of the SKU level.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the SKU level.
     *
     * @param name the name value to set.
     * @return the AutoScaleVCoreSku object itself.
     */
    public AutoScaleVCoreSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The name of the Azure pricing tier to which the SKU applies.
     *
     * @return the tier value.
     */
    public VCoreSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The name of the Azure pricing tier to which the SKU applies.
     *
     * @param tier the tier value to set.
     * @return the AutoScaleVCoreSku object itself.
     */
    public AutoScaleVCoreSku withTier(VCoreSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: The capacity of an auto scale v-core resource.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The capacity of an auto scale v-core resource.
     *
     * @param capacity the capacity value to set.
     * @return the AutoScaleVCoreSku object itself.
     */
    public AutoScaleVCoreSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model AutoScaleVCoreSku"));
        }
    }
}