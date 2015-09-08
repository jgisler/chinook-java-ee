package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.MediaTypeEntity;
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
public class MediaTypeEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(MediaTypeEntityRepositoryTest.class);

    @Inject
    private MediaTypeRepository repository;

    @Test
    public void testFind() {
        MediaTypeEntity entity = repository.findOne(1);
        assertNotNull(entity);
        assertEquals(new Integer(1), entity.getMediaTypeId());
        assertEquals("MPEG audio file", entity.getName());
    }

    @Test
    public void testFind_NotFound() {
        MediaTypeEntity entity = repository.findOne(99999);
        assertNull(entity);
    }

    @Test
    public void testFindAll() throws Exception {
        List<MediaTypeEntity> entityList = repository.findAll();
        assertNotNull( entityList );

        for( MediaTypeEntity entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}