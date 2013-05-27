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

package com.rest4j.spring;

import com.rest4j.Converter;
import com.rest4j.ServiceProvider;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Treats service names as Spring bean ids and looks up the beans in the current ApplicationContext.
 *
 * @author Joseph Kapizza <joseph@rest4j.com>
 */
public class ContextServiceProvider implements ServiceProvider, ApplicationContextAware {

	ApplicationContext context;
	String serviceSuffix, mapperSuffix, converterSuffix;

	@Override
	public Object lookupService(String name) {
		if (serviceSuffix != null) name += serviceSuffix;
		return context.getBean(name);
	}

	@Override
	public Object lookupFieldMapper(String model, String name) {
		if (name == null) return null;
		if (mapperSuffix != null) name += mapperSuffix;
		try {
			return context.getBean(name);
		} catch (NoSuchBeanDefinitionException nsbe) {
			return null;
		}
	}

	@Override
	public Converter lookupConverter(String name) {
		if (converterSuffix != null) name += converterSuffix;
		return context.getBean(name, Converter.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	public String getServiceSuffix() {
		return serviceSuffix;
	}

	public void setServiceSuffix(String serviceSuffix) {
		this.serviceSuffix = serviceSuffix;
	}

	public String getMapperSuffix() {
		return mapperSuffix;
	}

	public void setMapperSuffix(String mapperSuffix) {
		this.mapperSuffix = mapperSuffix;
	}

	public String getConverterSuffix() {
		return converterSuffix;
	}

	public void setConverterSuffix(String converterSuffix) {
		this.converterSuffix = converterSuffix;
	}
}
