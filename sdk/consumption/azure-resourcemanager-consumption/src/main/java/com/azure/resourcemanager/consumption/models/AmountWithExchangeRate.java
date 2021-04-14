// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** Reseller details. */
@Immutable
public final class AmountWithExchangeRate extends Amount {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AmountWithExchangeRate.class);

    /*
     * Exchange Rate.
     */
    @JsonProperty(value = "exchangeRate", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal exchangeRate;

    /*
     * Exchange rate month.
     */
    @JsonProperty(value = "exchangeRateMonth", access = JsonProperty.Access.WRITE_ONLY)
    private Float exchangeRateMonth;

    /**
     * Get the exchangeRate property: Exchange Rate.
     *
     * @return the exchangeRate value.
     */
    public BigDecimal exchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Get the exchangeRateMonth property: Exchange rate month.
     *
     * @return the exchangeRateMonth value.
     */
    public Float exchangeRateMonth() {
        return this.exchangeRateMonth;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}