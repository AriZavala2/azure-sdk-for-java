// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of exposure control feature values. */
@Fluent
public final class ExposureControlBatchResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExposureControlBatchResponseInner.class);

    /*
     * List of exposure control feature values.
     */
    @JsonProperty(value = "exposureControlResponses", required = true)
    private List<ExposureControlResponseInner> exposureControlResponses;

    /**
     * Get the exposureControlResponses property: List of exposure control feature values.
     *
     * @return the exposureControlResponses value.
     */
    public List<ExposureControlResponseInner> exposureControlResponses() {
        return this.exposureControlResponses;
    }

    /**
     * Set the exposureControlResponses property: List of exposure control feature values.
     *
     * @param exposureControlResponses the exposureControlResponses value to set.
     * @return the ExposureControlBatchResponseInner object itself.
     */
    public ExposureControlBatchResponseInner withExposureControlResponses(
        List<ExposureControlResponseInner> exposureControlResponses) {
        this.exposureControlResponses = exposureControlResponses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exposureControlResponses() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property exposureControlResponses in model"
                            + " ExposureControlBatchResponseInner"));
        } else {
            exposureControlResponses().forEach(e -> e.validate());
        }
    }
}