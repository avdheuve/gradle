/*
 * Copyright 2009 the original author or authors.
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
package org.gradle.api.internal.file.copy;

import org.gradle.api.file.CopyAction;
import org.gradle.api.file.FileVisitDetails;

public class EmptyCopySpecVisitor implements CopySpecVisitor {
    public boolean getDidWork() {
        return false;
    }

    public void startVisit(CopyAction action) {
    }

    public void visitDir(FileVisitDetails dirDetails) {
    }

    public void endVisit() {
    }

    public void visitFile(FileVisitDetails fileDetails) {
    }

    public void visitSpec(ReadableCopySpec spec) {
    }
}