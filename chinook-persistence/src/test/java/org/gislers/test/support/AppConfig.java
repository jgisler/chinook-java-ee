package org.gislers.test.support;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by jim on 8/31/15.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("org.gislers.chinook.persistence.respositories")
@ComponentScan("org.gislers.chinook.persistence")
@PropertySource("classpath:META-INF/application.properties")
public class AppConfig {

    @Autowired
    private Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer applicationProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        HikariConfig dataSourceConfig = new HikariConfig();
        dataSourceConfig.setDriverClassName(getEnvProp("db.driver"));
        dataSourceConfig.setJdbcUrl(getEnvProp("db.url"));
        dataSourceConfig.setUsername(getEnvProp("db.username"));
        dataSourceConfig.setPassword(getEnvProp("db.password"));
        return new HikariDataSource(dataSourceConfig);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setPersistenceUnitName("chinook-pu");
        em.setDataSource(dataSource);
        em.setPackagesToScan(new String[]{"org.gislers.chinook.persistence.entities"});

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        return em;
    }

    @Bean
    JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

    int getIntegerEnvProp(String name) {
        return Integer.parseInt(getEnvProp(name));
    }

    String getEnvProp( String name ) {
        return env.getRequiredProperty(name);
    }
}
