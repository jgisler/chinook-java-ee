package org.gislers.test.support;

import com.mysql.management.MysqldResource;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.IOException;

/**
 * Created by jim on 8/31/15.
 */
public class EmbeddedMysqlDatabase extends DriverManagerDataSource {

    private static final Logger logger = LoggerFactory.getLogger(EmbeddedMysqlDatabase.class);

    private final MysqldResource mysqldResource;

    public EmbeddedMysqlDatabase(MysqldResource mysqldResource) {
        this.mysqldResource = mysqldResource;
    }

    public void shutdown() {
        if (mysqldResource != null) {
            mysqldResource.shutdown();
            if (!mysqldResource.isRunning()) {
                logger.info(">>>>>>>>>> DELETING MYSQL BASE DIR [{}] <<<<<<<<<<", mysqldResource.getBaseDir());
                try {
                    FileUtils.forceDelete(mysqldResource.getBaseDir());
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }
    }
}
