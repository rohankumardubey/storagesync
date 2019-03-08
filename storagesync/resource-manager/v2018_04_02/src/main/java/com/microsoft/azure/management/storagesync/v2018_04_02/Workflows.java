/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2018_04_02;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.storagesync.v2018_04_02.implementation.WorkflowsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Workflows.
 */
public interface Workflows extends HasInner<WorkflowsInner> {
    /**
     * Abort the given workflow.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param workflowId workflow Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable abortAsync(String resourceGroupName, String storageSyncServiceName, String workflowId);

    /**
     * Get Workflows resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param workflowId workflow Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Workflow> getAsync(String resourceGroupName, String storageSyncServiceName, String workflowId);

}
