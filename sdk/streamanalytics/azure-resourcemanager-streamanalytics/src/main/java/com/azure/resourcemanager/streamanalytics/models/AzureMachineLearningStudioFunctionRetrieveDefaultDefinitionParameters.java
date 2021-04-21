// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The parameters needed to retrieve the default function definition for an Azure Machine Learning Studio function. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "bindingType")
@JsonTypeName("Microsoft.MachineLearning/WebService")
@JsonFlatten
@Fluent
public class AzureMachineLearningStudioFunctionRetrieveDefaultDefinitionParameters
    extends FunctionRetrieveDefaultDefinitionParameters {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(AzureMachineLearningStudioFunctionRetrieveDefaultDefinitionParameters.class);

    /*
     * The Request-Response execute endpoint of the Azure Machine Learning
     * Studio. Find out more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs
     */
    @JsonProperty(value = "bindingRetrievalProperties.executeEndpoint")
    private String executeEndpoint;

    /*
     * The function type.
     */
    @JsonProperty(value = "bindingRetrievalProperties.udfType")
    private UdfType udfType;

    /**
     * Get the executeEndpoint property: The Request-Response execute endpoint of the Azure Machine Learning Studio.
     * Find out more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs.
     *
     * @return the executeEndpoint value.
     */
    public String executeEndpoint() {
        return this.executeEndpoint;
    }

    /**
     * Set the executeEndpoint property: The Request-Response execute endpoint of the Azure Machine Learning Studio.
     * Find out more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs.
     *
     * @param executeEndpoint the executeEndpoint value to set.
     * @return the AzureMachineLearningStudioFunctionRetrieveDefaultDefinitionParameters object itself.
     */
    public AzureMachineLearningStudioFunctionRetrieveDefaultDefinitionParameters withExecuteEndpoint(
        String executeEndpoint) {
        this.executeEndpoint = executeEndpoint;
        return this;
    }

    /**
     * Get the udfType property: The function type.
     *
     * @return the udfType value.
     */
    public UdfType udfType() {
        return this.udfType;
    }

    /**
     * Set the udfType property: The function type.
     *
     * @param udfType the udfType value to set.
     * @return the AzureMachineLearningStudioFunctionRetrieveDefaultDefinitionParameters object itself.
     */
    public AzureMachineLearningStudioFunctionRetrieveDefaultDefinitionParameters withUdfType(UdfType udfType) {
        this.udfType = udfType;
        return this;
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