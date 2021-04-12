// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.DscCompilationJobsClient;
import com.azure.resourcemanager.automation.fluent.models.DscCompilationJobInner;
import com.azure.resourcemanager.automation.fluent.models.JobStreamInner;
import com.azure.resourcemanager.automation.models.DscCompilationJob;
import com.azure.resourcemanager.automation.models.DscCompilationJobs;
import com.azure.resourcemanager.automation.models.JobStream;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;

public final class DscCompilationJobsImpl implements DscCompilationJobs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DscCompilationJobsImpl.class);

    private final DscCompilationJobsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public DscCompilationJobsImpl(
        DscCompilationJobsClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DscCompilationJob get(String resourceGroupName, String automationAccountName, String compilationJobName) {
        DscCompilationJobInner inner =
            this.serviceClient().get(resourceGroupName, automationAccountName, compilationJobName);
        if (inner != null) {
            return new DscCompilationJobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DscCompilationJob> getWithResponse(
        String resourceGroupName, String automationAccountName, String compilationJobName, Context context) {
        Response<DscCompilationJobInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, compilationJobName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DscCompilationJobImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DscCompilationJob> listByAutomationAccount(
        String resourceGroupName, String automationAccountName) {
        PagedIterable<DscCompilationJobInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new DscCompilationJobImpl(inner1, this.manager()));
    }

    public PagedIterable<DscCompilationJob> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, String filter, Context context) {
        PagedIterable<DscCompilationJobInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, filter, context);
        return Utils.mapPage(inner, inner1 -> new DscCompilationJobImpl(inner1, this.manager()));
    }

    public JobStream getStream(String resourceGroupName, String automationAccountName, UUID jobId, String jobStreamId) {
        JobStreamInner inner =
            this.serviceClient().getStream(resourceGroupName, automationAccountName, jobId, jobStreamId);
        if (inner != null) {
            return new JobStreamImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobStream> getStreamWithResponse(
        String resourceGroupName, String automationAccountName, UUID jobId, String jobStreamId, Context context) {
        Response<JobStreamInner> inner =
            this
                .serviceClient()
                .getStreamWithResponse(resourceGroupName, automationAccountName, jobId, jobStreamId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobStreamImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DscCompilationJob getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String compilationJobName = Utils.getValueFromIdByName(id, "compilationjobs");
        if (compilationJobName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'compilationjobs'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, automationAccountName, compilationJobName, Context.NONE)
            .getValue();
    }

    public Response<DscCompilationJob> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String compilationJobName = Utils.getValueFromIdByName(id, "compilationjobs");
        if (compilationJobName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'compilationjobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, compilationJobName, context);
    }

    private DscCompilationJobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public DscCompilationJobImpl define(String name) {
        return new DscCompilationJobImpl(name, this.manager());
    }
}