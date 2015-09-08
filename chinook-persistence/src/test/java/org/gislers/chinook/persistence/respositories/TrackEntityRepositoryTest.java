package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.TrackEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by jim on 9/6/15.
 */
public class TrackEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(TrackEntityRepositoryTest.class);

    @EJB
    private TrackRepository repository;

    @Test
    public void testFind() {
        TrackEntity entity = repository.findOne(1);
        assertNotNull(entity);
        assertEquals(new Integer(1), entity.getTrackId());
        assertEquals("For Those About To Rock (We Salute You)", entity.getName());
    }

    @Test
    public void testFind_NotFound() {
        TrackEntity entity = repository.findOne(99999);
        assertNull(entity);
    }

    @Test
    public void testFindAll() throws Exception {
        List<TrackEntity> entityList = repository.findAll();
        assertNotNull( entityList );

        for( TrackEntity entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}