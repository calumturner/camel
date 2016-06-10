/**
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
package org.apache.camel.dataformat.zipfile.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Camel Zip file support
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.dataformat.zipFile")
public class ZipFileDataFormatConfiguration {

    /**
     * If the zip file has more then one entry the setting this option to true
     * allows to work with the splitter EIP to split the data using an iterator
     * in a streaming mode.
     */
    private Boolean usingIterator;

    public Boolean getUsingIterator() {
        return usingIterator;
    }

    public void setUsingIterator(Boolean usingIterator) {
        this.usingIterator = usingIterator;
    }
}