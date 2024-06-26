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

package solutions.bellatrix.playwright.infrastructure.httptraffic;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Request;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * BrowserContext specific container for Request type objects.
 */
@Getter
public class Requests {
    public Requests(BrowserContext context) {
        this.context = context;
        requests = new ArrayList<>();
    }

    private final BrowserContext context;
    private final List<Request> requests;
}
