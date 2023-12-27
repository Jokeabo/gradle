/*
 * Copyright 2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.util.internal;

import groovy.lang.Closure;

/**
 * NOTE: You should use {@link org.gradle.util.internal.configuration.ConfigureUtil} instead of this class when adding a closure backed method to the DSL, whether statically or dynamically added. {@link org.gradle.util.internal.configuration.ConfigureUtil} is much more efficient and takes care of applying consistent DSL behaviour when closures are nested.
 */
//TODO-RC remove this, redirect callers to new package
public class ClosureBackedAction<T> extends org.gradle.util.internal.configuration.ClosureBackedAction<T> {
    public ClosureBackedAction(Closure closure) {
        super(closure);
    }

    public ClosureBackedAction(Closure closure, int resolveStrategy) {
        super(closure, resolveStrategy);
    }

    public ClosureBackedAction(Closure closure, int resolveStrategy, boolean configurableAware) {
        super(closure, resolveStrategy, configurableAware);
    }
}
