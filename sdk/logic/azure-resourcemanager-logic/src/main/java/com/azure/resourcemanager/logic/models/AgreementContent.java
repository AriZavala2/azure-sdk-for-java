// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The integration account agreement content. */
@Fluent
public final class AgreementContent {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgreementContent.class);

    /*
     * The AS2 agreement content.
     */
    @JsonProperty(value = "aS2")
    private AS2AgreementContent aS2;

    /*
     * The X12 agreement content.
     */
    @JsonProperty(value = "x12")
    private X12AgreementContent x12;

    /*
     * The EDIFACT agreement content.
     */
    @JsonProperty(value = "edifact")
    private EdifactAgreementContent edifact;

    /**
     * Get the aS2 property: The AS2 agreement content.
     *
     * @return the aS2 value.
     */
    public AS2AgreementContent aS2() {
        return this.aS2;
    }

    /**
     * Set the aS2 property: The AS2 agreement content.
     *
     * @param aS2 the aS2 value to set.
     * @return the AgreementContent object itself.
     */
    public AgreementContent withAS2(AS2AgreementContent aS2) {
        this.aS2 = aS2;
        return this;
    }

    /**
     * Get the x12 property: The X12 agreement content.
     *
     * @return the x12 value.
     */
    public X12AgreementContent x12() {
        return this.x12;
    }

    /**
     * Set the x12 property: The X12 agreement content.
     *
     * @param x12 the x12 value to set.
     * @return the AgreementContent object itself.
     */
    public AgreementContent withX12(X12AgreementContent x12) {
        this.x12 = x12;
        return this;
    }

    /**
     * Get the edifact property: The EDIFACT agreement content.
     *
     * @return the edifact value.
     */
    public EdifactAgreementContent edifact() {
        return this.edifact;
    }

    /**
     * Set the edifact property: The EDIFACT agreement content.
     *
     * @param edifact the edifact value to set.
     * @return the AgreementContent object itself.
     */
    public AgreementContent withEdifact(EdifactAgreementContent edifact) {
        this.edifact = edifact;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aS2() != null) {
            aS2().validate();
        }
        if (x12() != null) {
            x12().validate();
        }
        if (edifact() != null) {
            edifact().validate();
        }
    }
}