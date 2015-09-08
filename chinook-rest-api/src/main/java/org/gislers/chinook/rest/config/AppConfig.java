package org.gislers.chinook.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by:   jgisle
 * Created date: 9/8/15
 */
@Configuration
@EnableWebMvc
@PropertySource("classpath:META-INF/application.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer applicationProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
