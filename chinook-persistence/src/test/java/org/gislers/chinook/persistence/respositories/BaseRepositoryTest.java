package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.config.AppConfig;
import org.gislers.chinook.persistence.test.support.JndiDatasourceHelper;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * Created by jim on 9/5/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class})
public abstract class BaseRepositoryTest {

    @BeforeClass
    public static void beforeClass() {
        JndiDatasourceHelper.setUpJndiDatasource();
    }
}
