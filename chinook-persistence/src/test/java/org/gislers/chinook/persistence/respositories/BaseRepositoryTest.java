package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.config.AppConfig;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Created by jim on 9/5/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@Ignore
public class BaseRepositoryTest {

    private static final String DS_NAME="ChinookDS";

    @BeforeClass
    public static void beforeClass() {
        try {
            InitialContext ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("jdbc."+DS_NAME);
            // rebind for alias if needed
            ctx.rebind("jdbc/" + DS_NAME, ds);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
