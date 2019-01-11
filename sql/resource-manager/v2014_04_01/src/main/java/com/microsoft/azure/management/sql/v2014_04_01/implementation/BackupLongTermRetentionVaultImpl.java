/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.BackupLongTermRetentionVault;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class BackupLongTermRetentionVaultImpl extends CreatableUpdatableImpl<BackupLongTermRetentionVault, BackupLongTermRetentionVaultInner, BackupLongTermRetentionVaultImpl> implements BackupLongTermRetentionVault, BackupLongTermRetentionVault.Definition, BackupLongTermRetentionVault.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String crecoveryServicesVaultResourceId;
    private String urecoveryServicesVaultResourceId;

    BackupLongTermRetentionVaultImpl(String name, SqlManager manager) {
        super(name, new BackupLongTermRetentionVaultInner());
        this.manager = manager;
        // Set resource name
        this.serverName = name;
        //
    }

    BackupLongTermRetentionVaultImpl(BackupLongTermRetentionVaultInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serverName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BackupLongTermRetentionVault> createResourceAsync() {
        BackupLongTermRetentionVaultsInner client = this.manager().inner().backupLongTermRetentionVaults();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.crecoveryServicesVaultResourceId)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BackupLongTermRetentionVault> updateResourceAsync() {
        BackupLongTermRetentionVaultsInner client = this.manager().inner().backupLongTermRetentionVaults();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.urecoveryServicesVaultResourceId)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BackupLongTermRetentionVaultInner> getInnerAsync() {
        BackupLongTermRetentionVaultsInner client = this.manager().inner().backupLongTermRetentionVaults();
        return client.getAsync(this.resourceGroupName, this.serverName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String recoveryServicesVaultResourceId() {
        return this.inner().recoveryServicesVaultResourceId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BackupLongTermRetentionVaultImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public BackupLongTermRetentionVaultImpl withRecoveryServicesVaultResourceId(String recoveryServicesVaultResourceId) {
        if (isInCreateMode()) {
            this.crecoveryServicesVaultResourceId = recoveryServicesVaultResourceId;
        } else {
            this.urecoveryServicesVaultResourceId = recoveryServicesVaultResourceId;
        }
        return this;
    }

}