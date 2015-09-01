package org.gislers.chinook.persistence.dao.impl;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.gislers.chinook.persistence.config.AppConfig;
import org.gislers.chinook.persistence.entities.Album;
import org.gislers.chinook.persistence.respositories.AlbumRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jim on 8/31/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes= AppConfig.class,
        loader=AnnotationConfigContextLoader.class
)
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class
})
@DatabaseSetup("sql/schema.sql")
public class AlbumDaoImplTest {

    private static final Logger logger = LoggerFactory.getLogger(AlbumDaoImplTest.class);

    @Autowired
    private AlbumRepository albumRepository;

    @Test
    public void testSave() throws Exception {

    }

    @Test
    public void testFindAll() throws Exception {
        List<Album> albumList = albumRepository.findAll();
        for( Album album : albumList ) {
            logger.info( album.toString() );
        }
        assertNotNull( albumList );
    }
}