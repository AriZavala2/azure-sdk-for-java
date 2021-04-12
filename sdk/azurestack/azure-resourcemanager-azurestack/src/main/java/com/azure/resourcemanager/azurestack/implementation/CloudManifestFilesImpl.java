// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.fluent.CloudManifestFilesClient;
import com.azure.resourcemanager.azurestack.fluent.models.CloudManifestFileResponseInner;
import com.azure.resourcemanager.azurestack.models.CloudManifestFileResponse;
import com.azure.resourcemanager.azurestack.models.CloudManifestFiles;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CloudManifestFilesImpl implements CloudManifestFiles {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudManifestFilesImpl.class);

    private final CloudManifestFilesClient innerClient;

    private final com.azure.resourcemanager.azurestack.AzureStackManager serviceManager;

    public CloudManifestFilesImpl(
        CloudManifestFilesClient innerClient, com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CloudManifestFileResponse list() {
        CloudManifestFileResponseInner inner = this.serviceClient().list();
        if (inner != null) {
            return new CloudManifestFileResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CloudManifestFileResponse> listWithResponse(Context context) {
        Response<CloudManifestFileResponseInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CloudManifestFileResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CloudManifestFileResponse get(String verificationVersion) {
        CloudManifestFileResponseInner inner = this.serviceClient().get(verificationVersion);
        if (inner != null) {
            return new CloudManifestFileResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CloudManifestFileResponse> getWithResponse(
        String verificationVersion, String versionCreationDate, Context context) {
        Response<CloudManifestFileResponseInner> inner =
            this.serviceClient().getWithResponse(verificationVersion, versionCreationDate, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CloudManifestFileResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private CloudManifestFilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurestack.AzureStackManager manager() {
        return this.serviceManager;
    }
}