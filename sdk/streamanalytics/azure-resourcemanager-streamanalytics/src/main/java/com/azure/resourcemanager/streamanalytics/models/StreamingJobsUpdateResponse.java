// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.streamanalytics.fluent.models.StreamingJobInner;

/** Contains all response data for the update operation. */
public final class StreamingJobsUpdateResponse extends ResponseBase<StreamingJobsUpdateHeaders, StreamingJobInner> {
    /**
     * Creates an instance of StreamingJobsUpdateResponse.
     *
     * @param request the request which resulted in this StreamingJobsUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public StreamingJobsUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        StreamingJobInner value,
        StreamingJobsUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public StreamingJobInner getValue() {
        return super.getValue();
    }
}