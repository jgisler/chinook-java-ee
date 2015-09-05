package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.entities.Album;
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
 * Created by jim on 8/31/15.
 */

public class AlbumRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(AlbumRepositoryTest.class);

    @Autowired
    private AlbumRepository albumRepository;

    @Test
    public void testFind() {
        Optional<Album> albumOptional = albumRepository.findOne(1);
        assertTrue(albumOptional.isPresent());
        assertEquals(1, albumOptional.get().getAlbumId());
        assertEquals("For Those About To Rock We Salute You", albumOptional.get().getTitle());
        assertEquals(1, albumOptional.get().getArtistId());
    }

    @Test
    public void testFind_NotFound() {
        Optional<Album> albumOptional = albumRepository.findOne(99999);
        assertFalse(albumOptional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Album> albumList = albumRepository.findAll();
        for( Album album : albumList ) {
            logger.info( album.toString() );
        }
        assertNotNull( albumList );
    }
}