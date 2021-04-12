// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of RunAs credential to use for hybrid worker. */
@Fluent
public final class RunAsCredentialAssociationProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunAsCredentialAssociationProperty.class);

    /*
     * Gets or sets the name of the credential.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name property: Gets or sets the name of the credential.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the credential.
     *
     * @param name the name value to set.
     * @return the RunAsCredentialAssociationProperty object itself.
     */
    public RunAsCredentialAssociationProperty withName(String name) {
        this.name = name;
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