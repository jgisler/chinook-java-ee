package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.PlaylistEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jim on 9/6/15.
 */
public class PlaylistEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(PlaylistEntityRepositoryTest.class);

    @Inject
    private PlaylistRepository repository;

    @Test
    public void testFind() {
        Optional<PlaylistEntity> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        PlaylistEntity entity = optional.get();
        assertEquals(new Integer(1), entity.getPlaylistId());
        assertEquals("Music", entity.getName());
    }

    @Test
    public void testFind_NotFound() {
        Optional<PlaylistEntity> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
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