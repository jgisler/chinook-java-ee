package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.Genre;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jim on 9/6/15.
 */
public class GenreRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(GenreRepositoryTest.class);

    @Autowired
    private GenreRepository repository;

    @Test
    public void testFind() {
        Optional<Genre> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        Genre genre = optional.get();
        assertEquals(new Integer(1), genre.getGenreId());
        assertEquals("Rock", genre.getName());
    }

    @Test
    public void testFind_NotFound() {
        Optional<Genre> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Genre> list = repository.findAll();
        assertNotNull( list );

        for( Genre item : list ) {
            logger.debug(item.toString());
        }
    }
}