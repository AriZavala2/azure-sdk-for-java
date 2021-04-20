// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ServiceRunnerInner;
import java.util.Map;

/** An immutable client-side representation of ServiceRunner. */
public interface ServiceRunner {
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
     * Gets the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    IdentityProperties identity();

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
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.ServiceRunnerInner object.
     *
     * @return the inner object.
     */
    ServiceRunnerInner innerModel();

    /** The entirety of the ServiceRunner definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The ServiceRunner definition stages. */
    interface DefinitionStages {
        /** The first stage of the ServiceRunner definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ServiceRunner definition allowing to specify location. */
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
        /** The stage of the ServiceRunner definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param labName The name of the lab.
             * @return the next definition stage.
             */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }
        /**
         * The stage of the ServiceRunner definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ServiceRunner create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ServiceRunner create(Context context);
        }
        /** The stage of the ServiceRunner definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ServiceRunner definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }
    }
    /**
     * Begins update for the ServiceRunner resource.
     *
     * @return the stage of resource update.
     */
    ServiceRunner.Update update();

    /** The template for ServiceRunner update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ServiceRunner apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ServiceRunner apply(Context context);
    }
    /** The ServiceRunner update stages. */
    interface UpdateStages {
        /** The stage of the ServiceRunner update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ServiceRunner update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityProperties identity);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ServiceRunner refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ServiceRunner refresh(Context context);
}