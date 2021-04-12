// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.DscCompilationJobInner;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** An immutable client-side representation of DscCompilationJob. */
public interface DscCompilationJob {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the configuration property: Gets or sets the configuration.
     *
     * @return the configuration value.
     */
    DscConfigurationAssociationProperty configuration();

    /**
     * Gets the startedBy property: Gets the compilation job started by.
     *
     * @return the startedBy value.
     */
    String startedBy();

    /**
     * Gets the jobId property: Gets the id of the job.
     *
     * @return the jobId value.
     */
    UUID jobId();

    /**
     * Gets the creationTime property: Gets the creation time of the job.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the provisioningState property: The current provisioning state of the job.
     *
     * @return the provisioningState value.
     */
    JobProvisioningState provisioningState();

    /**
     * Gets the runOn property: Gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @return the runOn value.
     */
    String runOn();

    /**
     * Gets the status property: Gets or sets the status of the job.
     *
     * @return the status value.
     */
    JobStatus status();

    /**
     * Gets the statusDetails property: Gets or sets the status details of the job.
     *
     * @return the statusDetails value.
     */
    String statusDetails();

    /**
     * Gets the startTime property: Gets the start time of the job.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: Gets the end time of the job.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the exception property: Gets the exception of the job.
     *
     * @return the exception value.
     */
    String exception();

    /**
     * Gets the lastModifiedTime property: Gets the last modified time of the job.
     *
     * @return the lastModifiedTime value.
     */
    OffsetDateTime lastModifiedTime();

    /**
     * Gets the lastStatusModifiedTime property: Gets the last status modified time of the job.
     *
     * @return the lastStatusModifiedTime value.
     */
    OffsetDateTime lastStatusModifiedTime();

    /**
     * Gets the parameters property: Gets or sets the parameters of the job.
     *
     * @return the parameters value.
     */
    Map<String, String> parameters();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.DscCompilationJobInner object.
     *
     * @return the inner object.
     */
    DscCompilationJobInner innerModel();

    /** The entirety of the DscCompilationJob definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithConfiguration,
            DefinitionStages.WithCreate {
    }
    /** The DscCompilationJob definition stages. */
    interface DefinitionStages {
        /** The first stage of the DscCompilationJob definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DscCompilationJob definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, automationAccountName.
             *
             * @param resourceGroupName Name of an Azure Resource group.
             * @param automationAccountName The name of the automation account.
             * @return the next definition stage.
             */
            WithConfiguration withExistingAutomationAccount(String resourceGroupName, String automationAccountName);
        }
        /** The stage of the DscCompilationJob definition allowing to specify configuration. */
        interface WithConfiguration {
            /**
             * Specifies the configuration property: Gets or sets the configuration..
             *
             * @param configuration Gets or sets the configuration.
             * @return the next definition stage.
             */
            WithCreate withConfiguration(DscConfigurationAssociationProperty configuration);
        }
        /**
         * The stage of the DscCompilationJob definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithName,
                DefinitionStages.WithParameters,
                DefinitionStages.WithIncrementNodeConfigurationBuild {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DscCompilationJob create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DscCompilationJob create(Context context);
        }
        /** The stage of the DscCompilationJob definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Gets or sets the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Gets or sets the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the DscCompilationJob definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the tags attached to the resource..
             *
             * @param tags Gets or sets the tags attached to the resource.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DscCompilationJob definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets name of the resource..
             *
             * @param name Gets or sets name of the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the DscCompilationJob definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: Gets or sets the parameters of the job..
             *
             * @param parameters Gets or sets the parameters of the job.
             * @return the next definition stage.
             */
            WithCreate withParameters(Map<String, String> parameters);
        }
        /** The stage of the DscCompilationJob definition allowing to specify incrementNodeConfigurationBuild. */
        interface WithIncrementNodeConfigurationBuild {
            /**
             * Specifies the incrementNodeConfigurationBuild property: If a new build version of NodeConfiguration is
             * required..
             *
             * @param incrementNodeConfigurationBuild If a new build version of NodeConfiguration is required.
             * @return the next definition stage.
             */
            WithCreate withIncrementNodeConfigurationBuild(Boolean incrementNodeConfigurationBuild);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DscCompilationJob refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DscCompilationJob refresh(Context context);
}