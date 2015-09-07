package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.MediaType;
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
public class MediaTypeRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(MediaTypeRepositoryTest.class);

    @Inject
    private MediaTypeRepository repository;

    @Test
    public void testFind() {
        Optional<MediaType> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        MediaType entity = optional.get();
        assertEquals(new Integer(1), entity.getMediaTypeId());
        assertEquals("MPEG audio file", entity.getName());
    }

    @Test
    public void testFind_NotFound() {
        Optional<MediaType> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<MediaType> entityList = repository.findAll();
        assertNotNull( entityList );

        for( MediaType entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}