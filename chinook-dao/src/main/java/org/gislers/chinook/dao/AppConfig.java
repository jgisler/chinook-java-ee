package org.gislers.chinook.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages="org.gislers.chinook.dao")
@PropertySource("classpath:META-INF/application.properties")
public class AppConfig {

    @Value("${jndi.datasource.name}")
    private String jndiDataSourceName;

    @Bean
    public static PropertySourcesPlaceholderConfigurer applicationProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    @Resource(name="${jndi.datasource.name}")
    public JndiDataSourceLookup jndiDataSourceLookup() {
        final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
        dsLookup.setResourceRef(true);
        return dsLookup;
    }

    @Bean
    public DataSource dataSource() {
        return jndiDataSourceLookup().getDataSource(jndiDataSourceName);
    }
}
