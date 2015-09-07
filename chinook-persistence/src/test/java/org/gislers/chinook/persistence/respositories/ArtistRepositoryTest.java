package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.Artist;
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
    public void testSave() {

        // Insert
        Artist newArtist = new Artist();
        newArtist.setName("test artist name");
        newArtist = repository.save( newArtist );
        assertNotNull(newArtist.getArtistId());

        // Test insert success
        int artistId = newArtist.getArtistId();
        Optional<Artist> optional = repository.findOne(artistId);
        assertTrue(optional.isPresent());

        // Test update
        Artist updateArtist = optional.get();
        updateArtist.setName("Test Artist Name 1");
        repository.save(updateArtist);

        // Test update success
        artistId = updateArtist.getArtistId();
        optional = repository.findOne(artistId);
        assertTrue(optional.isPresent());
        assertEquals( updateArtist.getName(), optional.get().getName() );

        // Test delete
        repository.delete(newArtist);
        optional = repository.findOne(artistId);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFind() {
        Optional<Artist> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        Artist artist = optional.get();
        assertEquals(1, artist.getArtistId());
        assertEquals("AC/DC", artist.getName());
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
            logger.debug( artist.toString() );
        }
        assertNotNull( list );
    }
}