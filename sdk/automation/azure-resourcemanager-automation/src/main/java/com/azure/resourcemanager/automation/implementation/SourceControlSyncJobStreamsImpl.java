// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.SourceControlSyncJobStreamsClient;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobStreamByIdInner;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobStreamInner;
import com.azure.resourcemanager.automation.models.SourceControlSyncJobStream;
import com.azure.resourcemanager.automation.models.SourceControlSyncJobStreamById;
import com.azure.resourcemanager.automation.models.SourceControlSyncJobStreams;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;

public final class SourceControlSyncJobStreamsImpl implements SourceControlSyncJobStreams {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceControlSyncJobStreamsImpl.class);

    private final SourceControlSyncJobStreamsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public SourceControlSyncJobStreamsImpl(
        SourceControlSyncJobStreamsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SourceControlSyncJobStream> listBySyncJob(
        String resourceGroupName, String automationAccountName, String sourceControlName, UUID sourceControlSyncJobId) {
        PagedIterable<SourceControlSyncJobStreamInner> inner =
            this
                .serviceClient()
                .listBySyncJob(resourceGroupName, automationAccountName, sourceControlName, sourceControlSyncJobId);
        return Utils.mapPage(inner, inner1 -> new SourceControlSyncJobStreamImpl(inner1, this.manager()));
    }

    public PagedIterable<SourceControlSyncJobStream> listBySyncJob(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        String filter,
        Context context) {
        PagedIterable<SourceControlSyncJobStreamInner> inner =
            this
                .serviceClient()
                .listBySyncJob(
                    resourceGroupName,
                    automationAccountName,
                    sourceControlName,
                    sourceControlSyncJobId,
                    filter,
                    context);
        return Utils.mapPage(inner, inner1 -> new SourceControlSyncJobStreamImpl(inner1, this.manager()));
    }

    public SourceControlSyncJobStreamById get(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        String streamId) {
        SourceControlSyncJobStreamByIdInner inner =
            this
                .serviceClient()
                .get(resourceGroupName, automationAccountName, sourceControlName, sourceControlSyncJobId, streamId);
        if (inner != null) {
            return new SourceControlSyncJobStreamByIdImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SourceControlSyncJobStreamById> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        UUID sourceControlSyncJobId,
        String streamId,
        Context context) {
        Response<SourceControlSyncJobStreamByIdInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName,
                    automationAccountName,
                    sourceControlName,
                    sourceControlSyncJobId,
                    streamId,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SourceControlSyncJobStreamByIdImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private SourceControlSyncJobStreamsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}