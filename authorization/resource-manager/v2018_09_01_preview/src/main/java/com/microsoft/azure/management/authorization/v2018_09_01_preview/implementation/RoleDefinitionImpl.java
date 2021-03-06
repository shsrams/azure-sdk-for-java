/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.microsoft.azure.management.authorization.v2018_09_01_preview.RoleDefinition;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.Permission;

class RoleDefinitionImpl extends CreatableUpdatableImpl<RoleDefinition, RoleDefinitionInner, RoleDefinitionImpl> implements RoleDefinition, RoleDefinition.Definition, RoleDefinition.Update {
    private String scope;
    private String roleDefinitionId;
    private final AuthorizationManager manager;

    RoleDefinitionImpl(String name, AuthorizationManager manager) {
        super(name, new RoleDefinitionInner());
        this.manager = manager;
        // Set resource name
        this.roleDefinitionId = name;
        //
    }

    RoleDefinitionImpl(RoleDefinitionInner inner, AuthorizationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.roleDefinitionId = inner.name();
        // set resource ancestor and positional variables
        this.roleDefinitionId = IdParsingUtils.getValueFromIdByName(inner.id(), "roleDefinitions");
        this.scope = IdParsingUtils.getValueFromIdByPosition(inner.id(), 0);
        // set other parameters for create and update
    }

    @Override
    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RoleDefinition> createResourceAsync() {
        RoleDefinitionsInner client = this.manager().inner().roleDefinitions();
        return client.createOrUpdateAsync(this.scope, this.roleDefinitionId, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RoleDefinition> updateResourceAsync() {
        RoleDefinitionsInner client = this.manager().inner().roleDefinitions();
        return client.createOrUpdateAsync(this.scope, this.roleDefinitionId, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RoleDefinitionInner> getInnerAsync() {
        RoleDefinitionsInner client = this.manager().inner().roleDefinitions();
        return client.getAsync(this.scope, this.roleDefinitionId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> assignableScopes() {
        return this.inner().assignableScopes();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<Permission> permissions() {
        List<Permission> lst = new ArrayList<Permission>();
        if (this.inner().permissions() != null) {
            for (PermissionInner inner : this.inner().permissions()) {
                lst.add( new PermissionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String roleName() {
        return this.inner().roleName();
    }

    @Override
    public String roleType() {
        return this.inner().roleType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public RoleDefinitionImpl withScope(String scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public RoleDefinitionImpl withAssignableScopes(List<String> assignableScopes) {
        this.inner().withAssignableScopes(assignableScopes);
        return this;
    }

    @Override
    public RoleDefinitionImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public RoleDefinitionImpl withPermissions(List<PermissionInner> permissions) {
        this.inner().withPermissions(permissions);
        return this;
    }

    @Override
    public RoleDefinitionImpl withRoleName(String roleName) {
        this.inner().withRoleName(roleName);
        return this;
    }

    @Override
    public RoleDefinitionImpl withRoleType(String roleType) {
        this.inner().withRoleType(roleType);
        return this;
    }

}
