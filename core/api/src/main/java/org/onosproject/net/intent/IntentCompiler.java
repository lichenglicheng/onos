/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.net.intent;

import org.onosproject.net.resource.link.LinkResourceAllocations;

import java.util.List;
import java.util.Set;

/**
 * Abstraction of a compiler which is capable of taking an intent
 * and translating it to other, potentially installable, intents.
 *
 * @param <T> the type of intent
 */
public interface IntentCompiler<T extends Intent> {
    /**
     * Compiles the specified intent into other intents.
     *
     * @param intent      intent to be compiled
     * @param installable previously compilation result; optional
     * @param resources   previously allocated resources; optional
     * @return list of resulting intents
     * @throws IntentException if issues are encountered while compiling the intent
     */
    List<Intent> compile(T intent, List<Intent> installable,
                         Set<LinkResourceAllocations> resources);

}
