package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.PlaylistEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by jim on 9/6/15.
 */
public class PlaylistEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(PlaylistEntityRepositoryTest.class);

    @Inject
    private PlaylistRepository repository;

    @Test
    public void testFind() {
        PlaylistEntity entity = repository.findOne(1);
        assertNotNull(entity);
        assertEquals(new Integer(1), entity.getPlaylistId());
        assertEquals("Music", entity.getName());
    }

    @Test
    public void testFind_NotFound() {
        PlaylistEntity entity = repository.findOne(99999);
        assertNull(entity);
    }

    @Test
    public void testFindAll() throws Exception {
        List<PlaylistEntity> entityList = repository.findAll();
        assertNotNull( entityList );

        for( PlaylistEntity entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}