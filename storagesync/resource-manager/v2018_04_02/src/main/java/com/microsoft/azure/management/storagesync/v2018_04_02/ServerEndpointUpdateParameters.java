/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2018_04_02;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters for updating an Server Endpoint.
 */
@JsonFlatten
public class ServerEndpointUpdateParameters {
    /**
     * The user-specified tags associated with the server endpoint.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Cloud Tiering. Possible values include: 'on', 'off'.
     */
    @JsonProperty(value = "properties.cloudTiering")
    private String cloudTiering;

    /**
     * Level of free space to be maintained by Cloud Tiering if it is enabled.
     */
    @JsonProperty(value = "properties.volumeFreeSpacePercent")
    private Integer volumeFreeSpacePercent;

    /**
     * Get the user-specified tags associated with the server endpoint.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the user-specified tags associated with the server endpoint.
     *
     * @param tags the tags value to set
     * @return the ServerEndpointUpdateParameters object itself.
     */
    public ServerEndpointUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get cloud Tiering. Possible values include: 'on', 'off'.
     *
     * @return the cloudTiering value
     */
    public String cloudTiering() {
        return this.cloudTiering;
    }

    /**
     * Set cloud Tiering. Possible values include: 'on', 'off'.
     *
     * @param cloudTiering the cloudTiering value to set
     * @return the ServerEndpointUpdateParameters object itself.
     */
    public ServerEndpointUpdateParameters withCloudTiering(String cloudTiering) {
        this.cloudTiering = cloudTiering;
        return this;
    }

    /**
     * Get level of free space to be maintained by Cloud Tiering if it is enabled.
     *
     * @return the volumeFreeSpacePercent value
     */
    public Integer volumeFreeSpacePercent() {
        return this.volumeFreeSpacePercent;
    }

    /**
     * Set level of free space to be maintained by Cloud Tiering if it is enabled.
     *
     * @param volumeFreeSpacePercent the volumeFreeSpacePercent value to set
     * @return the ServerEndpointUpdateParameters object itself.
     */
    public ServerEndpointUpdateParameters withVolumeFreeSpacePercent(Integer volumeFreeSpacePercent) {
        this.volumeFreeSpacePercent = volumeFreeSpacePercent;
        return this;
    }

}
