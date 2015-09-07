package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.PlaylistTrack;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jim on 9/6/15.
 */
public class PlaylistTrackRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(PlaylistTrackRepositoryTest.class);

    @Inject
    private PlaylistTrackRepository repository;

    @Test
    public void testFindAll() throws Exception {
        List<PlaylistTrack> entityList = repository.findAll();
        assertNotNull( entityList );

        for( PlaylistTrack entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}