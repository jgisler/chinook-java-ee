package org.gislers.chinook.rest.controller;

import org.gislers.chinook.persistence.config.PersistenceConfig;
import org.gislers.chinook.rest.config.RestApiConfig;
import org.gislers.chinook.rest.config.WebMvcConfig;
import org.gislers.chinook.service.config.ServiceConfig;
import org.gislers.chinook.test.support.JndiDatasourceHelper;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by:   jgisle
 * Created date: 9/9/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={
        PersistenceConfig.class,
        ServiceConfig.class,
        RestApiConfig.class,
        WebMvcConfig.class,

})
@TestExecutionListeners(listeners = {
        DependencyInjectionTestExecutionListener.class
})
@WebAppConfiguration
@ComponentScan({
        "org.gislers.chinook.persistence",
        "org.gislers.chinook.service"
})
public abstract class BaseControllerTest {

    @BeforeClass
    public static void beforeClass() {
        JndiDatasourceHelper.setUpJndiDatasource();
    }
}
