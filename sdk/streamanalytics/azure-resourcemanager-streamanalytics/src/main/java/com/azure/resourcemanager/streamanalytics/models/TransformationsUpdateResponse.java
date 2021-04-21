// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.streamanalytics.fluent.models.TransformationInner;

/** Contains all response data for the update operation. */
public final class TransformationsUpdateResponse
    extends ResponseBase<TransformationsUpdateHeaders, TransformationInner> {
    /**
     * Creates an instance of TransformationsUpdateResponse.
     *
     * @param request the request which resulted in this TransformationsUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TransformationsUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        TransformationInner value,
        TransformationsUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public TransformationInner getValue() {
        return super.getValue();
    }
}