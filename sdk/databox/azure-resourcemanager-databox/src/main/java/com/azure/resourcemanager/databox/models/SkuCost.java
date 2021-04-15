// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes metadata for retrieving price info. */
@Immutable
public final class SkuCost {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuCost.class);

    /*
     * Meter id of the Sku.
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /*
     * The type of the meter.
     */
    @JsonProperty(value = "meterType", access = JsonProperty.Access.WRITE_ONLY)
    private String meterType;

    /*
     * Multiplier specifies the region specific value to be multiplied with 1$
     * guid. Eg: Our new regions will be using 1$ shipping guid with
     * appropriate multiplier specific to region.
     */
    @JsonProperty(value = "multiplier", access = JsonProperty.Access.WRITE_ONLY)
    private Double multiplier;

    /**
     * Get the meterId property: Meter id of the Sku.
     *
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the meterType property: The type of the meter.
     *
     * @return the meterType value.
     */
    public String meterType() {
        return this.meterType;
    }

    /**
     * Get the multiplier property: Multiplier specifies the region specific value to be multiplied with 1$ guid. Eg:
     * Our new regions will be using 1$ shipping guid with appropriate multiplier specific to region.
     *
     * @return the multiplier value.
     */
    public Double multiplier() {
        return this.multiplier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}