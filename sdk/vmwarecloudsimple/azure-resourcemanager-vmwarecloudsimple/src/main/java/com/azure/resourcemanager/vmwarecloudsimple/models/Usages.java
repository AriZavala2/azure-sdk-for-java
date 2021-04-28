// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Usages. */
public interface Usages {
    /**
     * Returns list of usage in region.
     *
     * @param regionId The region Id (westus, eastus).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of usages.
     */
    PagedIterable<Usage> list(String regionId);

    /**
     * Returns list of usage in region.
     *
     * @param regionId The region Id (westus, eastus).
     * @param filter The filter to apply on the list operation. only name.value is allowed here as a filter e.g.
     *     $filter=name.value eq 'xxxx'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of usages.
     */
    PagedIterable<Usage> list(String regionId, String filter, Context context);
}