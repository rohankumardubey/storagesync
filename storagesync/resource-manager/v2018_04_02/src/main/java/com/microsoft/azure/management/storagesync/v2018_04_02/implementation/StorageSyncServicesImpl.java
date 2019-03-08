/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.storagesync.v2018_04_02.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.storagesync.v2018_04_02.StorageSyncServices;
import com.microsoft.azure.management.storagesync.v2018_04_02.StorageSyncService;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.storagesync.v2018_04_02.CheckNameAvailabilityResult;

class StorageSyncServicesImpl extends GroupableResourcesCoreImpl<StorageSyncService, StorageSyncServiceImpl, StorageSyncServiceInner, StorageSyncServicesInner, StorageSyncManager>  implements StorageSyncServices {
    protected StorageSyncServicesImpl(StorageSyncManager manager) {
        super(manager.inner().storageSyncServices(), manager);
    }

    @Override
    protected Observable<StorageSyncServiceInner> getInnerAsync(String resourceGroupName, String name) {
        StorageSyncServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        StorageSyncServicesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<StorageSyncService> listByResourceGroup(String resourceGroupName) {
        StorageSyncServicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<StorageSyncService> listByResourceGroupAsync(String resourceGroupName) {
        StorageSyncServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<StorageSyncServiceInner>, Observable<StorageSyncServiceInner>>() {
            @Override
            public Observable<StorageSyncServiceInner> call(Page<StorageSyncServiceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<StorageSyncServiceInner, StorageSyncService>() {
            @Override
            public StorageSyncService call(StorageSyncServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<StorageSyncService> list() {
        StorageSyncServicesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<StorageSyncService> listAsync() {
        StorageSyncServicesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<StorageSyncServiceInner>, Observable<StorageSyncServiceInner>>() {
            @Override
            public Observable<StorageSyncServiceInner> call(Page<StorageSyncServiceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<StorageSyncServiceInner, StorageSyncService>() {
            @Override
            public StorageSyncService call(StorageSyncServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public StorageSyncServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected StorageSyncServiceImpl wrapModel(StorageSyncServiceInner inner) {
        return  new StorageSyncServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected StorageSyncServiceImpl wrapModel(String name) {
        return new StorageSyncServiceImpl(name, new StorageSyncServiceInner(), this.manager());
    }

    @Override
    public Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String locationName, String name) {
        StorageSyncServicesInner client = this.inner();
        return client.checkNameAvailabilityAsync(locationName, name)
        .map(new Func1<CheckNameAvailabilityResultInner, CheckNameAvailabilityResult>() {
            @Override
            public CheckNameAvailabilityResult call(CheckNameAvailabilityResultInner inner) {
                return new CheckNameAvailabilityResultImpl(inner, manager());
            }
        });
    }

}
