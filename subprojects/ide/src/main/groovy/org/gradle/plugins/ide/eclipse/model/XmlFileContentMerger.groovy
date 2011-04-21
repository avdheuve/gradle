/*
 * Copyright 2010 the original author or authors.
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

package org.gradle.plugins.ide.eclipse.model

import org.gradle.api.internal.XmlTransformer

/**
 * Models the generation/parsing/merging capabilities. Adds xml-related hooks.
 * <p>
 * For example see docs for {@link EclipseProject}, {@link EclipseClasspath}, {@link EclipseWtp}
 *
 * @author: Szczepan Faber, created at: 4/21/11
 */
class XmlFileContentMerger extends FileContentMerger {

    XmlTransformer xmlTransformer

    XmlFileContentMerger(XmlTransformer xmlTransformer) {
        this.xmlTransformer = xmlTransformer
    }

    /**
     * Adds a closure to be called when the file has been created. The XML is passed to the closure as a
     * parameter in form of a {@link org.gradle.api.artifacts.maven.XmlProvider}. The closure can modify the XML before
     * it is written to the output file.
     * <p>
     * For example see docs for {@link EclipseProject}
     *
     * @param closure The closure to execute when the XML has been created.
     */
    public void withXml(Closure closure) {
        xmlTransformer.addAction(closure)
    }
}