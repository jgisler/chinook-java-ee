package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.entities.PlaylistTrackEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
public class PlaylistEntityTrackEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(PlaylistEntityTrackEntityRepositoryTest.class);

    @Inject
    private PlaylistTrackRepository repository;

    @Test
    public void testFindAll() throws Exception {
        List<PlaylistTrackEntity> entityList = repository.findAll();
        assertNotNull( entityList );

        for( PlaylistTrackEntity entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}