/*
 * Copyright 2024 Automate The Planet Ltd.
 * Author: Miriam Kyoseva
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package solutions.bellatrix.playwright.components;

import solutions.bellatrix.core.plugins.EventListener;
import solutions.bellatrix.playwright.components.common.ComponentActionEventArgs;
import solutions.bellatrix.playwright.components.contracts.*;

public class Range extends WebComponent implements ComponentDisabled, ComponentValue, ComponentRange, ComponentList, ComponentAutoComplete, ComponentRequired, ComponentMax, ComponentMin, ComponentStep {
    public final static EventListener<ComponentActionEventArgs> SETTING_RANGE = new EventListener<>();
    public final static EventListener<ComponentActionEventArgs> RANGE_SET = new EventListener<>();

    @Override
    public double getRange() {
        return Double.parseDouble(getValue());
    }

    @Override
    public void setRange(Number value) {
        defaultSetValue(SETTING_RANGE, RANGE_SET, String.valueOf(value));
    }

    @Override
    public boolean isAutoComplete() {
        return defaultGetAutoCompleteAttribute();
    }

    @Override
    public boolean isDisabled() {
        return defaultGetDisabledAttribute();
    }

    @Override
    public String getList() {
        return defaultGetList();
    }

    @Override
    public double getMax() {
        return Double.parseDouble(defaultGetMaxAttribute());
    }

    @Override
    public double getMin() {
        return Double.parseDouble(defaultGetMinAttribute());
    }

    @Override
    public boolean isRequired() {
        return defaultGetRequiredAttribute();
    }

    @Override
    public double getStep() {
        return Double.parseDouble(defaultGetStepAttribute());
    }

    @Override
    public String getValue() {
        return defaultGetValue();
    }
}