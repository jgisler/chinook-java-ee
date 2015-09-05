package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.entities.Artist;
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
 * Created by jim on 9/5/15.
 */
public class ArtistRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(ArtistRepositoryTest.class);

    @Autowired
    private ArtistRepository repository;

    @Test
    public void testFind() {
        Optional<Artist> optional = repository.findOne(1);
        assertTrue(optional.isPresent());
        assertEquals(1, optional.get().getArtistId());
        assertEquals("AC/DC", optional.get().getName());
    }

    @Test
    public void testFind_NotFound() {
        Optional<Artist> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Artist> list = repository.findAll();
        for( Artist artist : list ) {
            logger.info( artist.toString() );
        }
        assertNotNull( list );
    }
}