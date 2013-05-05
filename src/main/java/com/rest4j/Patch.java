/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rest4j;

import java.util.Map;

/**
 * @author Joseph Kapizza <joseph@rest4j.com>
 */
public class Patch<T> {
	final private T original;
	final private T patched;
	final private Map<String, Object> changedProperties;

	public Patch(T original, T patched, Map<String, Object> changedProperties) {
		this.original = original;
		this.patched = patched;
		this.changedProperties = changedProperties;
	}

	public T getOriginal() {
		return original;
	}

	public T getPatched() {
		return patched;
	}

	public Map<String, Object> getChangedProperties() {
		return changedProperties;
	}
}
