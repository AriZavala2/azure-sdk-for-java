// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.fluent.ApplicationsClient;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceListInner;
import com.azure.resourcemanager.servicefabric.models.ApplicationResource;
import com.azure.resourcemanager.servicefabric.models.ApplicationResourceList;
import com.azure.resourcemanager.servicefabric.models.Applications;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ApplicationsImpl implements Applications {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationsImpl.class);

    private final ApplicationsClient innerClient;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    public ApplicationsImpl(
        ApplicationsClient innerClient, com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ApplicationResource get(String resourceGroupName, String clusterName, String applicationName) {
        ApplicationResourceInner inner = this.serviceClient().get(resourceGroupName, clusterName, applicationName);
        if (inner != null) {
            return new ApplicationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationResource> getWithResponse(
        String resourceGroupName, String clusterName, String applicationName, Context context) {
        Response<ApplicationResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, applicationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName);
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName, context);
    }

    public ApplicationResourceList list(String resourceGroupName, String clusterName) {
        ApplicationResourceListInner inner = this.serviceClient().list(resourceGroupName, clusterName);
        if (inner != null) {
            return new ApplicationResourceListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationResourceList> listWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<ApplicationResourceListInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationResourceListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationName, Context.NONE).getValue();
    }

    public Response<ApplicationResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationName, context);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationName, context);
    }

    private ApplicationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }

    public ApplicationResourceImpl define(String name) {
        return new ApplicationResourceImpl(name, this.manager());
    }
}