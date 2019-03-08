/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2018_04_02.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Storage Sync Service object.
 */
@JsonFlatten
public class StorageSyncServiceInner extends Resource {
    /**
     * Storage Sync service status.
     */
    @JsonProperty(value = "properties.storageSyncServiceStatus", access = JsonProperty.Access.WRITE_ONLY)
    private Integer storageSyncServiceStatus;

    /**
     * Storage Sync service Uid.
     */
    @JsonProperty(value = "properties.storageSyncServiceUid", access = JsonProperty.Access.WRITE_ONLY)
    private String storageSyncServiceUid;

    /**
     * Get storage Sync service status.
     *
     * @return the storageSyncServiceStatus value
     */
    public Integer storageSyncServiceStatus() {
        return this.storageSyncServiceStatus;
    }

    /**
     * Get storage Sync service Uid.
     *
     * @return the storageSyncServiceUid value
     */
    public String storageSyncServiceUid() {
        return this.storageSyncServiceUid;
    }

}
