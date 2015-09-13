package org.gislers.chinook.rest.controller;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.gislers.chinook.service.dto.Album;
import org.gislers.chinook.service.dto.Artist;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by:   jgisle
 * Created date: 9/9/15
 */
@Ignore
public class AlbumControllerTest { //extends BaseControllerTest{

    @Autowired
    private AlbumController albumController;

    @Ignore
    @Test
    public void testGetAlbumById() throws Exception {
        ResponseEntity<Album> responseEntity = albumController.getAlbumById(1);
        assertNotNull(responseEntity);

        Album album = responseEntity.getBody();
        assertEquals(1, album.getAlbumId());
        assertEquals("For Those About To Rock We Salute You", album.getAlbumTitle());

        Artist artist = album.getArtist();
        assertNotNull( artist );
        assertEquals(1, artist.getArtistId());
        assertEquals("AC/DC", artist.getArtistName());
    }
}