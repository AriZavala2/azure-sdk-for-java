// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.fluent.models.PeeringServiceProviderInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The paginated list of peering service providers. */
@Fluent
public final class PeeringServiceProviderListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringServiceProviderListResult.class);

    /*
     * The list of peering service providers.
     */
    @JsonProperty(value = "value")
    private List<PeeringServiceProviderInner> value;

    /*
     * The link to fetch the next page of peering service providers.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of peering service providers.
     *
     * @return the value value.
     */
    public List<PeeringServiceProviderInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of peering service providers.
     *
     * @param value the value value to set.
     * @return the PeeringServiceProviderListResult object itself.
     */
    public PeeringServiceProviderListResult withValue(List<PeeringServiceProviderInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to fetch the next page of peering service providers.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to fetch the next page of peering service providers.
     *
     * @param nextLink the nextLink value to set.
     * @return the PeeringServiceProviderListResult object itself.
     */
    public PeeringServiceProviderListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}