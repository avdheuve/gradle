/*
 * Copyright 2011 the original author or authors.
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
package org.gradle.tooling.model.eclipse;

import org.gradle.tooling.model.DomainObjectSet;
import org.gradle.tooling.model.HierarchicalProject;

/**
 * Represents the basic information about an Eclipse project.
 */
public interface HierarchicalEclipseProject extends HierarchicalProject {
    /**
     * {@inheritDoc}
     */
    HierarchicalEclipseProject getParent();

    /**
     * {@inheritDoc}
     */
    DomainObjectSet<? extends HierarchicalEclipseProject> getChildren();

    /**
     * Returns the project dependencies for this project.
     *
     * @return The project dependencies. Returns an empty set if the project has no project dependencies.
     */
    DomainObjectSet<? extends EclipseProjectDependency> getProjectDependencies();

    /**
     * Returns the source directories for this project.
     *
     * @return The source directories. Returns an empty set if the project has no source directories.
     */
    DomainObjectSet<? extends EclipseSourceDirectory> getSourceDirectories();

    /**
     * Returns the linked resources for this project.
     *
     * @return The linked resources.
     */
    DomainObjectSet<? extends EclipseLinkedResource> getLinkedResources();
}
