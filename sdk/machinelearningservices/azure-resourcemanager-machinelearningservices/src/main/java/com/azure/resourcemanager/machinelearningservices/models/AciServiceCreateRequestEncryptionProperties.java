// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The encryption properties. */
@Immutable
public final class AciServiceCreateRequestEncryptionProperties extends EncryptionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AciServiceCreateRequestEncryptionProperties.class);

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequestEncryptionProperties withVaultBaseUrl(String vaultBaseUrl) {
        super.withVaultBaseUrl(vaultBaseUrl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequestEncryptionProperties withKeyName(String keyName) {
        super.withKeyName(keyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AciServiceCreateRequestEncryptionProperties withKeyVersion(String keyVersion) {
        super.withKeyVersion(keyVersion);
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