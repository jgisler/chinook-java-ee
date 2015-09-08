package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.GenreEntity;
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
public class GenreEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(GenreEntityRepositoryTest.class);

    @Inject
    private GenreRepository repository;

    @Test
    public void testFind() {
        GenreEntity entity = repository.findOne(1);
        assertNotNull(entity);
        assertEquals(new Integer(1), entity.getGenreId());
        assertEquals("Rock", entity.getName());
    }

    @Test
    public void testFind_NotFound() {
        GenreEntity entity = repository.findOne(99999);
        assertNull(entity);
    }

    @Test
    public void testFindAll() throws Exception {
        List<GenreEntity> list = repository.findAll();
        assertNotNull( list );

        for( GenreEntity item : list ) {
            logger.debug(item.toString());
        }
    }
}