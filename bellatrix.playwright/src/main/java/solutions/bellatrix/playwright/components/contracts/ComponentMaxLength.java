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

package solutions.bellatrix.playwright.components.contracts;

import solutions.bellatrix.playwright.components.WebComponent;
import solutions.bellatrix.playwright.components.common.validate.ComponentValidator;

public interface ComponentMaxLength extends Component {
    int getMaxLength();

    default void validateMaxLengthIsSet() {
        ComponentValidator.defaultValidateAttributeNotNull((WebComponent)this, this::getMaxLength, "max length");
    }

    default void validateMaxLengthNotSet() {
        ComponentValidator.defaultValidateAttributeIsNull((WebComponent)this, this::getMaxLength, "max length");
    }

    default void validateMaxLengthIs(int value) {
        ComponentValidator.defaultValidateAttributeIs((WebComponent)this, this::getMaxLength, value, "max length");
    }
}
