// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The auto scaler properties. */
@Immutable
public final class AksServiceResponseAutoScaler extends AutoScaler {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AksServiceResponseAutoScaler.class);

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseAutoScaler withAutoscaleEnabled(Boolean autoscaleEnabled) {
        super.withAutoscaleEnabled(autoscaleEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseAutoScaler withMinReplicas(Integer minReplicas) {
        super.withMinReplicas(minReplicas);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseAutoScaler withMaxReplicas(Integer maxReplicas) {
        super.withMaxReplicas(maxReplicas);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseAutoScaler withTargetUtilization(Integer targetUtilization) {
        super.withTargetUtilization(targetUtilization);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AksServiceResponseAutoScaler withRefreshPeriodInSeconds(Integer refreshPeriodInSeconds) {
        super.withRefreshPeriodInSeconds(refreshPeriodInSeconds);
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