/*
 * Copyright 2022 Automate The Planet Ltd.
 * Author: Teodor Nikolov
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package solutions.bellatrix.web.components;

import layout.LayoutComponent;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import solutions.bellatrix.web.services.BrowserService;

public class Screen implements LayoutComponent {
    private final Point location;
    private final Dimension size;

    Screen() {
        var browserService = new BrowserService();
        location = new Point(0, 0);
        size = browserService.getWrappedDriver().manage().window().getSize();
    }

    @Override
    public String getComponentName() {
        return "Screen";
    }

    @Override
    public java.awt.Point getLocation() {
        return new java.awt.Point(location.getX(), location.getY());
    }

    @Override
    public java.awt.Dimension getSize() {
        return new java.awt.Dimension(size.getWidth(), size.getHeight());
    }
}
