/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.implementation;

import com.microsoft.azure.management.streamanalytics.FunctionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * A function object, containing all information associated with the named
 * function. All functions are contained under a streaming job.
 */
public class FunctionInner extends SubResource {
    /**
     * The properties that are associated with a function.
     */
    @JsonProperty(value = "properties")
    private FunctionProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public FunctionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the FunctionInner object itself.
     */
    public FunctionInner withProperties(FunctionProperties properties) {
        this.properties = properties;
        return this;
    }

}