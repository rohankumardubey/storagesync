/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2018_04_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Create operation.
 */
public class SyncGroupsCreateHeaders {
    /**
     * request id.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /**
     * correlation request id.
     */
    @JsonProperty(value = "x-ms-correlation-request-id")
    private String xMsCorrelationRequestId;

    /**
     * Get request id.
     *
     * @return the xMsRequestId value
     */
    public String xMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set request id.
     *
     * @param xMsRequestId the xMsRequestId value to set
     * @return the SyncGroupsCreateHeaders object itself.
     */
    public SyncGroupsCreateHeaders withXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get correlation request id.
     *
     * @return the xMsCorrelationRequestId value
     */
    public String xMsCorrelationRequestId() {
        return this.xMsCorrelationRequestId;
    }

    /**
     * Set correlation request id.
     *
     * @param xMsCorrelationRequestId the xMsCorrelationRequestId value to set
     * @return the SyncGroupsCreateHeaders object itself.
     */
    public SyncGroupsCreateHeaders withXMsCorrelationRequestId(String xMsCorrelationRequestId) {
        this.xMsCorrelationRequestId = xMsCorrelationRequestId;
        return this;
    }

}
