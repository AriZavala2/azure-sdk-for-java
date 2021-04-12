// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.attestation.fluent.AttestationProvidersClient;
import com.azure.resourcemanager.attestation.fluent.models.AttestationProviderInner;
import com.azure.resourcemanager.attestation.fluent.models.AttestationProviderListResultInner;
import com.azure.resourcemanager.attestation.models.AttestationProvider;
import com.azure.resourcemanager.attestation.models.AttestationProviderListResult;
import com.azure.resourcemanager.attestation.models.AttestationProviders;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AttestationProvidersImpl implements AttestationProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AttestationProvidersImpl.class);

    private final AttestationProvidersClient innerClient;

    private final com.azure.resourcemanager.attestation.AttestationManager serviceManager;

    public AttestationProvidersImpl(
        AttestationProvidersClient innerClient,
        com.azure.resourcemanager.attestation.AttestationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AttestationProvider getByResourceGroup(String resourceGroupName, String providerName) {
        AttestationProviderInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, providerName);
        if (inner != null) {
            return new AttestationProviderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AttestationProvider> getByResourceGroupWithResponse(
        String resourceGroupName, String providerName, Context context) {
        Response<AttestationProviderInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, providerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttestationProviderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String providerName) {
        this.serviceClient().delete(resourceGroupName, providerName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String providerName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, providerName, context);
    }

    public AttestationProviderListResult list() {
        AttestationProviderListResultInner inner = this.serviceClient().list();
        if (inner != null) {
            return new AttestationProviderListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AttestationProviderListResult> listWithResponse(Context context) {
        Response<AttestationProviderListResultInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttestationProviderListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AttestationProviderListResult listByResourceGroup(String resourceGroupName) {
        AttestationProviderListResultInner inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        if (inner != null) {
            return new AttestationProviderListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AttestationProviderListResult> listByResourceGroupWithResponse(
        String resourceGroupName, Context context) {
        Response<AttestationProviderListResultInner> inner =
            this.serviceClient().listByResourceGroupWithResponse(resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttestationProviderListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AttestationProviderListResult listDefault() {
        AttestationProviderListResultInner inner = this.serviceClient().listDefault();
        if (inner != null) {
            return new AttestationProviderListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AttestationProviderListResult> listDefaultWithResponse(Context context) {
        Response<AttestationProviderListResultInner> inner = this.serviceClient().listDefaultWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttestationProviderListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AttestationProvider getDefaultByLocation(String location) {
        AttestationProviderInner inner = this.serviceClient().getDefaultByLocation(location);
        if (inner != null) {
            return new AttestationProviderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AttestationProvider> getDefaultByLocationWithResponse(String location, Context context) {
        Response<AttestationProviderInner> inner =
            this.serviceClient().getDefaultByLocationWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttestationProviderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AttestationProvider getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String providerName = Utils.getValueFromIdByName(id, "attestationProviders");
        if (providerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attestationProviders'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, providerName, Context.NONE).getValue();
    }

    public Response<AttestationProvider> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String providerName = Utils.getValueFromIdByName(id, "attestationProviders");
        if (providerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attestationProviders'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, providerName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String providerName = Utils.getValueFromIdByName(id, "attestationProviders");
        if (providerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attestationProviders'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, providerName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String providerName = Utils.getValueFromIdByName(id, "attestationProviders");
        if (providerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attestationProviders'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, providerName, context);
    }

    private AttestationProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.attestation.AttestationManager manager() {
        return this.serviceManager;
    }

    public AttestationProviderImpl define(String name) {
        return new AttestationProviderImpl(name, this.manager());
    }
}