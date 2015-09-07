package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.Track;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jim on 9/6/15.
 */
public class TrackRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(TrackRepositoryTest.class);

    @EJB
    private TrackRepository repository;

    @Test
    public void testFind() {
        Optional<Track> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        Track entity = optional.get();
        assertEquals(new Integer(1), entity.getTrackId());
        assertEquals("For Those About To Rock (We Salute You)", entity.getName());
    }

    @Test
    public void testFind_NotFound() {
        Optional<Track> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Track> entityList = repository.findAll();
        assertNotNull( entityList );

        for( Track entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}