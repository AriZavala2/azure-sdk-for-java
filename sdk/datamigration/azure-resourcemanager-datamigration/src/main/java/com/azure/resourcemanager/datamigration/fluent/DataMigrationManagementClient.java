// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for DataMigrationManagementClient class. */
public interface DataMigrationManagementClient {
    /**
     * Gets Identifier of the subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ResourceSkusClient object to access its operations.
     *
     * @return the ResourceSkusClient object.
     */
    ResourceSkusClient getResourceSkus();

    /**
     * Gets the ServicesClient object to access its operations.
     *
     * @return the ServicesClient object.
     */
    ServicesClient getServices();

    /**
     * Gets the TasksClient object to access its operations.
     *
     * @return the TasksClient object.
     */
    TasksClient getTasks();

    /**
     * Gets the ProjectsClient object to access its operations.
     *
     * @return the ProjectsClient object.
     */
    ProjectsClient getProjects();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();
}