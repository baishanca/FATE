/*
 * Copyright 2019 The FATE Authors. All Rights Reserved.
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

package com.webank.ai.eggroll.core.executor;

import java.util.Map;
import java.util.Properties;

public class SimpleProcessorContext implements ProcessorContext {
    private final Properties properties;

    public SimpleProcessorContext(Properties properties) {
        this.properties = properties;
    }

    public SimpleProcessorContext(Map<String, Object> configs) {
        this.properties = new Properties();
        this.properties.putAll(configs);
    }

    @Override
    public Properties getProperties() {
        return properties;
    }

    @Override
    public void commit() {

    }
}
