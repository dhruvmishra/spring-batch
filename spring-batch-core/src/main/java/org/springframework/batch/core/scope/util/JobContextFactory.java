/*
 * Copyright 2006-2007 the original author or authors.
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

package org.springframework.batch.core.scope.util;

import org.springframework.batch.core.scope.context.JobContext;
import org.springframework.batch.core.scope.context.JobSynchronizationManager;

/**
 * Implementation of {@link ContextFactory} that provides the current
 * {@link JobContext} as a context object.
 * 
 * @author Dave Syer
 * @author Jimmy Praet
 */
public class JobContextFactory implements ContextFactory {

	public Object getContext() {
		return JobSynchronizationManager.getContext();
	}

	public String getContextId() {
		JobContext context = JobSynchronizationManager.getContext();
		return context!=null ? (String) context.getId() : "sysinit";
	}

}