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

import layout.LayoutComponent;
import solutions.bellatrix.playwright.infrastructure.PlaywrightService;

import java.awt.*;

public class Screen implements LayoutComponent {
    private final Point location;
    private final Dimension size;

    Screen() {
        location = new Point(0, 0);
        size = convertDimension();
    }

    @Override
    public String getComponentName() {
        return "Screen";
    }

    @Override
    public java.awt.Point getLocation() {
        return location;
    }

    @Override
    public java.awt.Dimension getSize() {
        return size;
    }

    private java.awt.Dimension convertDimension() {
        var playwrightSize = PlaywrightService.wrappedBrowser().getCurrentPage().viewportSize();
        return new Dimension(playwrightSize.width, playwrightSize.height);
    }
}
