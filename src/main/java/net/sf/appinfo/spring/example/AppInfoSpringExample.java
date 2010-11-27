/* Copyright (c) 2010 Marcin Zajaczkowski
 * All rights reserved.
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
package net.sf.appinfo.spring.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * net.sf.appinfo.spring.example.AppInfoSpringExample
 *
 * @author Marcin Zajączkowski, 2010-10-31
 */
public class AppInfoSpringExample {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    private ApplicationContext context;

    public static void main(String args[]) {
        AppInfoSpringExample app = new AppInfoSpringExample();
        app.start();
    }

    private void start() {
        log.info("Welcome to AppInfo Spring Example");
        initSpringContext();
        printAppInfo();
    }

    private void printAppInfo() {
        String appInfoText = context.getBean("appInfoText", String.class);
        log.info("The application info is: {}", appInfoText);
    }

    private void initSpringContext() {
        context = new ClassPathXmlApplicationContext(
                "classpath:net/sf/appinfo/spring/example/applicationContext.xml",
                "classpath:net/sf/appinfo/appInfoDefaultContext.xml");
    }
}
