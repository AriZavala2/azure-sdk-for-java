// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of the runbook property type. */
@Fluent
public final class ContentHash {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContentHash.class);

    /*
     * Gets or sets the content hash algorithm used to hash the content.
     */
    @JsonProperty(value = "algorithm", required = true)
    private String algorithm;

    /*
     * Gets or sets expected hash value of the content.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the algorithm property: Gets or sets the content hash algorithm used to hash the content.
     *
     * @return the algorithm value.
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm property: Gets or sets the content hash algorithm used to hash the content.
     *
     * @param algorithm the algorithm value to set.
     * @return the ContentHash object itself.
     */
    public ContentHash withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the value property: Gets or sets expected hash value of the content.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets expected hash value of the content.
     *
     * @param value the value value to set.
     * @return the ContentHash object itself.
     */
    public ContentHash withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (algorithm() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property algorithm in model ContentHash"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model ContentHash"));
        }
    }
}