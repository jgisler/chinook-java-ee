package org.gislers.chinook.service.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jim
 * Created on 9/13/15.
 */
@Configuration
@ComponentScan("org.gislers.chinook.service")
public class ServiceConfig {

    private static final Logger logger = LoggerFactory.getLogger(ServiceConfig.class);

}
