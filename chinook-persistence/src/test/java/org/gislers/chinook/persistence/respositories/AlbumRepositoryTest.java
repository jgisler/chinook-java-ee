package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.Album;
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
 * Created by jim on 8/31/15.
 */
public class AlbumRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(AlbumRepositoryTest.class);

    @Inject
    private AlbumRepository repository;

    @Test
    public void testSave() {

        Album album = new Album();
        album.setArtistId(1);
        album.setTitle("Test title");

        album = repository.save(album);
        assertEquals( new Integer(1), album.getArtistId() );
        assertEquals( "Test title", album.getTitle() );

        repository.delete( album );
    }

    @Test
    public void testFind() {
        Optional<Album> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        Album album = optional.get();
        assertEquals(new Integer(1), album.getAlbumId());
        assertEquals("For Those About To Rock We Salute You", album.getTitle());
        assertEquals(new Integer(1), album.getArtistId());
    }

    @Test
    public void testFind_NotFound() {
        Optional<Album> albumOptional = repository.findOne(99999);
        assertFalse(albumOptional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Album> albumList = repository.findAll();
        for( Album album : albumList ) {
            logger.debug( album.toString() );
        }
        assertNotNull( albumList );
    }
}