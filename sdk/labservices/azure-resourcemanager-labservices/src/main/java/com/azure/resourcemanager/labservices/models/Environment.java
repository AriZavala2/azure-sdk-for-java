// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.labservices.fluent.models.EnvironmentInner;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Environment. */
public interface Environment {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the resourceSets property: The set of a VM and the setting id it was created for.
     *
     * @return the resourceSets value.
     */
    ResourceSet resourceSets();

    /**
     * Gets the claimedByUserObjectId property: The AAD object Id of the user who has claimed the environment.
     *
     * @return the claimedByUserObjectId value.
     */
    String claimedByUserObjectId();

    /**
     * Gets the claimedByUserPrincipalId property: The user principal Id of the user who has claimed the environment.
     *
     * @return the claimedByUserPrincipalId value.
     */
    String claimedByUserPrincipalId();

    /**
     * Gets the claimedByUsername property: The name or email address of the user who has claimed the environment.
     *
     * @return the claimedByUsername value.
     */
    String claimedByUsername();

    /**
     * Gets the isClaimed property: Is the environment claimed or not.
     *
     * @return the isClaimed value.
     */
    Boolean isClaimed();

    /**
     * Gets the lastKnownPowerState property: Last known power state of the environment.
     *
     * @return the lastKnownPowerState value.
     */
    String lastKnownPowerState();

    /**
     * Gets the networkInterface property: Network details of the environment.
     *
     * @return the networkInterface value.
     */
    NetworkInterface networkInterface();

    /**
     * Gets the totalUsage property: How long the environment has been used by a lab user.
     *
     * @return the totalUsage value.
     */
    Duration totalUsage();

    /**
     * Gets the passwordLastReset property: When the password was last reset on the environment.
     *
     * @return the passwordLastReset value.
     */
    OffsetDateTime passwordLastReset();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * Gets the latestOperationResult property: The details of the latest operation. ex: status, error.
     *
     * @return the latestOperationResult value.
     */
    LatestOperationResult latestOperationResult();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.labservices.fluent.models.EnvironmentInner object.
     *
     * @return the inner object.
     */
    EnvironmentInner innerModel();

    /** The entirety of the Environment definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The Environment definition stages. */
    interface DefinitionStages {
        /** The first stage of the Environment definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Environment definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the Environment definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labAccountName, labName, environmentSettingName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param labAccountName The name of the lab Account.
             * @param labName The name of the lab.
             * @param environmentSettingName The name of the environment Setting.
             * @return the next definition stage.
             */
            WithCreate withExistingEnvironmentsetting(
                String resourceGroupName, String labAccountName, String labName, String environmentSettingName);
        }
        /**
         * The stage of the Environment definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithResourceSets,
                DefinitionStages.WithProvisioningState,
                DefinitionStages.WithUniqueIdentifier {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Environment create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Environment create(Context context);
        }
        /** The stage of the Environment definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Environment definition allowing to specify resourceSets. */
        interface WithResourceSets {
            /**
             * Specifies the resourceSets property: The set of a VM and the setting id it was created for.
             *
             * @param resourceSets The set of a VM and the setting id it was created for.
             * @return the next definition stage.
             */
            WithCreate withResourceSets(ResourceSet resourceSets);
        }
        /** The stage of the Environment definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning status of the resource..
             *
             * @param provisioningState The provisioning status of the resource.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(String provisioningState);
        }
        /** The stage of the Environment definition allowing to specify uniqueIdentifier. */
        interface WithUniqueIdentifier {
            /**
             * Specifies the uniqueIdentifier property: The unique immutable identifier of a resource (Guid)..
             *
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid).
             * @return the next definition stage.
             */
            WithCreate withUniqueIdentifier(String uniqueIdentifier);
        }
    }
    /**
     * Begins update for the Environment resource.
     *
     * @return the stage of resource update.
     */
    Environment.Update update();

    /** The template for Environment update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithResourceSets,
            UpdateStages.WithProvisioningState,
            UpdateStages.WithUniqueIdentifier {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Environment apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Environment apply(Context context);
    }
    /** The Environment update stages. */
    interface UpdateStages {
        /** The stage of the Environment update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Environment update allowing to specify resourceSets. */
        interface WithResourceSets {
            /**
             * Specifies the resourceSets property: The set of a VM and the setting id it was created for.
             *
             * @param resourceSets The set of a VM and the setting id it was created for.
             * @return the next definition stage.
             */
            Update withResourceSets(ResourceSetFragment resourceSets);
        }
        /** The stage of the Environment update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning status of the resource..
             *
             * @param provisioningState The provisioning status of the resource.
             * @return the next definition stage.
             */
            Update withProvisioningState(String provisioningState);
        }
        /** The stage of the Environment update allowing to specify uniqueIdentifier. */
        interface WithUniqueIdentifier {
            /**
             * Specifies the uniqueIdentifier property: The unique immutable identifier of a resource (Guid)..
             *
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid).
             * @return the next definition stage.
             */
            Update withUniqueIdentifier(String uniqueIdentifier);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Environment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Environment refresh(Context context);

    /**
     * Claims the environment and assigns it to the user.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void claim();

    /**
     * Claims the environment and assigns it to the user.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> claimWithResponse(Context context);

    /**
     * Resets the user password on an environment This operation can take a while to complete.
     *
     * @param resetPasswordPayload Represents the payload for resetting passwords.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetPassword(ResetPasswordPayload resetPasswordPayload);

    /**
     * Resets the user password on an environment This operation can take a while to complete.
     *
     * @param resetPasswordPayload Represents the payload for resetting passwords.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetPassword(ResetPasswordPayload resetPasswordPayload, Context context);

    /**
     * Starts an environment by starting all resources inside the environment. This operation can take a while to
     * complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Starts an environment by starting all resources inside the environment. This operation can take a while to
     * complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Stops an environment by stopping all resources inside the environment This operation can take a while to
     * complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Stops an environment by stopping all resources inside the environment This operation can take a while to
     * complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);
}