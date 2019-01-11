/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v3_2014_04.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v3_2014_04.TransparentDataEncryptionActivities;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.sql.v3_2014_04.TransparentDataEncryptionActivity;

class TransparentDataEncryptionActivitiesImpl extends WrapperImpl<TransparentDataEncryptionActivitiesInner> implements TransparentDataEncryptionActivities {
    private final SqlManager manager;

    TransparentDataEncryptionActivitiesImpl(SqlManager manager) {
        super(manager.inner().transparentDataEncryptionActivities());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TransparentDataEncryptionActivity> listByConfigurationAsync(String resourceGroupName, String serverName, String databaseName) {
        TransparentDataEncryptionActivitiesInner client = this.inner();
        return client.listByConfigurationAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<List<TransparentDataEncryptionActivityInner>, Observable<TransparentDataEncryptionActivityInner>>() {
            @Override
            public Observable<TransparentDataEncryptionActivityInner> call(List<TransparentDataEncryptionActivityInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<TransparentDataEncryptionActivityInner, TransparentDataEncryptionActivity>() {
            @Override
            public TransparentDataEncryptionActivity call(TransparentDataEncryptionActivityInner inner) {
                return new TransparentDataEncryptionActivityImpl(inner, manager());
            }
        });
    }

}