package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.GenreEntity;
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
public class GenreEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(GenreEntityRepositoryTest.class);

    @Inject
    private GenreRepository repository;

    @Test
    public void testFind() {
        Optional<GenreEntity> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        GenreEntity genreEntity = optional.get();
        assertEquals(new Integer(1), genreEntity.getGenreId());
        assertEquals("Rock", genreEntity.getName());
    }

    @Test
    public void testFind_NotFound() {
        Optional<GenreEntity> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
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