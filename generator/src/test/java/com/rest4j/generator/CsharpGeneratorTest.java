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

package com.rest4j.generator;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Joseph Kapizza <joseph@rest4j.com>
 */
public class CsharpGeneratorTest {
	Generator gen = new Generator();

	@Test
	public void testCSHARPClient() throws Exception {
		gen.setStylesheet("com/rest4j/client/csharp.xslt");
		new File("target/csharp").mkdir();
		gen.setApiXmlUrl(getClass().getResource("doc-generator-graph.xml"));
		gen.setOutputDir("target/csharp");
		gen.addParam(new TemplateParam("common-params", "access-token"));
		gen.addParam(new TemplateParam("additional-client-code", "// ADDITIONAL CODE"));
		gen.generate();

		// check doc comments in the file A.cs
		String a = IOUtils.toString(new File("target/csharp/Api/Src/Model/A.cs").toURI());
		assertTrue(a, a.contains("Some additional client info"));
		assertFalse(a, a.contains("Some additional python client info"));

		// check existence of Parameter Object class
		a = IOUtils.toString(new File("target/csharp/Api/Src/Model/PatchBRequest.cs").toURI());
		assertTrue(a, a.contains("class PatchBRequest"));

		String client = IOUtils.toString(new File("target/csharp/Api/Src/Client.cs").toURI());
		assertTrue(client.contains("ADDITIONAL CODE"));
	}


}
