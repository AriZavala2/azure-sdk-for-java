// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Jobs. */
public interface Jobs {
    /**
     * Gets a list of Jobs within the specified Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Jobs within the specified Experiment.
     */
    PagedIterable<Job> listByExperiment(String resourceGroupName, String workspaceName, String experimentName);

    /**
     * Gets a list of Jobs within the specified Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param maxResults The maximum number of items to return in the response. A maximum of 1000 files can be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Jobs within the specified Experiment.
     */
    PagedIterable<Job> listByExperiment(
        String resourceGroupName, String workspaceName, String experimentName, Integer maxResults, Context context);

    /**
     * Deletes a Job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String experimentName, String jobName);

    /**
     * Deletes a Job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String experimentName, String jobName, Context context);

    /**
     * Gets information about a Job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a Job.
     */
    Job get(String resourceGroupName, String workspaceName, String experimentName, String jobName);

    /**
     * Gets information about a Job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a Job.
     */
    Response<Job> getWithResponse(
        String resourceGroupName, String workspaceName, String experimentName, String jobName, Context context);

    /**
     * List all directories and files inside the given directory of the Job's output directory (if the output directory
     * is on Azure File Share or Azure Storage Container).
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @param outputdirectoryid Id of the job output directory. This is the OutputDirectory--&gt;id parameter that is
     *     given by the user during Create Job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    PagedIterable<File> listOutputFiles(
        String resourceGroupName,
        String workspaceName,
        String experimentName,
        String jobName,
        String outputdirectoryid);

    /**
     * List all directories and files inside the given directory of the Job's output directory (if the output directory
     * is on Azure File Share or Azure Storage Container).
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @param outputdirectoryid Id of the job output directory. This is the OutputDirectory--&gt;id parameter that is
     *     given by the user during Create Job.
     * @param directory The path to the directory.
     * @param linkexpiryinminutes The number of minutes after which the download link will expire.
     * @param maxResults The maximum number of items to return in the response. A maximum of 1000 files can be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    PagedIterable<File> listOutputFiles(
        String resourceGroupName,
        String workspaceName,
        String experimentName,
        String jobName,
        String outputdirectoryid,
        String directory,
        Integer linkexpiryinminutes,
        Integer maxResults,
        Context context);

    /**
     * Gets a list of currently existing nodes which were used for the Job execution. The returned information contains
     * the node ID, its public IP and SSH port.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of currently existing nodes which were used for the Job execution.
     */
    PagedIterable<RemoteLoginInformation> listRemoteLoginInformation(
        String resourceGroupName, String workspaceName, String experimentName, String jobName);

    /**
     * Gets a list of currently existing nodes which were used for the Job execution. The returned information contains
     * the node ID, its public IP and SSH port.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of currently existing nodes which were used for the Job execution.
     */
    PagedIterable<RemoteLoginInformation> listRemoteLoginInformation(
        String resourceGroupName, String workspaceName, String experimentName, String jobName, Context context);

    /**
     * Terminates a job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void terminate(String resourceGroupName, String workspaceName, String experimentName, String jobName);

    /**
     * Terminates a job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric
     *     characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination
     *     of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
     *     characters long.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void terminate(
        String resourceGroupName, String workspaceName, String experimentName, String jobName, Context context);

    /**
     * Gets information about a Job.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a Job.
     */
    Job getById(String id);

    /**
     * Gets information about a Job.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a Job.
     */
    Response<Job> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Job.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Job.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Job resource.
     *
     * @param name resource name.
     * @return the first stage of the new Job definition.
     */
    Job.DefinitionStages.Blank define(String name);
}