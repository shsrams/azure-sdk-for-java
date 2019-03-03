/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.sql.v2018_06_01_preview.RecommendedSensitivityLabels;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class RecommendedSensitivityLabelsImpl extends WrapperImpl<SensitivityLabelInner> implements RecommendedSensitivityLabels {
    private final SqlManager manager;

    RecommendedSensitivityLabelsImpl(SensitivityLabelInner inner,  SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String informationType() {
        return this.inner().informationType();
    }

    @Override
    public String informationTypeId() {
        return this.inner().informationTypeId();
    }

    @Override
    public String labelId() {
        return this.inner().labelId();
    }

    @Override
    public String labelName() {
        return this.inner().labelName();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
