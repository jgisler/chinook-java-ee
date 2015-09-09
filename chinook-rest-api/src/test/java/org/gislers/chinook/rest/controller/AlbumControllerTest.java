package org.gislers.chinook.rest.controller;

import org.gislers.chinook.rest.model.Album;
import org.gislers.chinook.rest.model.Artist;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

/**
 * Created by:   jgisle
 * Created date: 9/9/15
 */
public class AlbumControllerTest extends BaseControllerTest{

    @Autowired
    private AlbumController albumController;

    @Test
    public void testGetAlbumById() throws Exception {
        ResponseEntity<Album> responseEntity = albumController.getAlbumById(1);
        assertNotNull( responseEntity );

        Album album = responseEntity.getBody();
        assertEquals(1, album.getId());
        assertEquals("For Those About To Rock We Salute You", album.getName());

        Artist artist = album.getArtist();
        assertNotNull( artist );
        assertEquals(1, artist.getId());
        assertEquals("AC/DC", artist.getName());
    }
}