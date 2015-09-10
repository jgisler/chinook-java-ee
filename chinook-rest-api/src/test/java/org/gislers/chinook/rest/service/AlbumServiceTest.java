package org.gislers.chinook.rest.service;

import org.gislers.chinook.persistence.config.PersistenceConfig;
import org.gislers.chinook.persistence.respositories.entities.ArtistEntity;
import org.gislers.chinook.rest.config.RestConfig;
import org.gislers.chinook.rest.model.Album;
import org.gislers.chinook.rest.model.Artist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by:   jgisle
 * Created date: 9/9/15
 */
public class AlbumServiceTest extends BaseServiceTest {

    @Autowired
    private AlbumService albumService;

    @Test
    public void testGetAlbum() throws Exception {
        Album album = albumService.getAlbum( 1 );
        assertNotNull(album);
        assertEquals(1, album.getId());
        assertEquals("For Those About To Rock We Salute You", album.getName());

        Artist artist = album.getArtist();
        assertNotNull( artist );
        assertEquals(1, artist.getId());
        assertEquals("AC/DC", artist.getName());
    }

    @Test
    public void testGetAlbumsByArtist() {

        List<Album> albums = albumService.getAlbumsByArtist(1);
        assertFalse( albums.isEmpty());
        assertEquals(2, albums.size());

        Album album = albums.get(0);
        assertEquals(1, album.getId());
        assertEquals( "For Those About To Rock We Salute You", album.getName() );

        album = albums.get(1);
        assertEquals( 4, album.getId() );
        assertEquals( "Let There Be Rock", album.getName() );
    }
}