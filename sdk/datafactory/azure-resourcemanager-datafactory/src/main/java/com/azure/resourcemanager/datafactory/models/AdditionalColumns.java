// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specify the column name and value of additional columns. */
@Fluent
public final class AdditionalColumns {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdditionalColumns.class);

    /*
     * Additional column name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "name")
    private Object name;

    /*
     * Additional column value. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Get the name property: Additional column name. Type: string (or Expression with resultType string).
     *
     * @return the name value.
     */
    public Object name() {
        return this.name;
    }

    /**
     * Set the name property: Additional column name. Type: string (or Expression with resultType string).
     *
     * @param name the name value to set.
     * @return the AdditionalColumns object itself.
     */
    public AdditionalColumns withName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Additional column value. Type: string (or Expression with resultType string).
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Additional column value. Type: string (or Expression with resultType string).
     *
     * @param value the value value to set.
     * @return the AdditionalColumns object itself.
     */
    public AdditionalColumns withValue(Object value) {
        this.value = value;
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