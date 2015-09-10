package org.gislers.chinook.rest.controller;

import org.gislers.chinook.rest.model.Album;
import org.gislers.chinook.rest.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by:   jgisle
 * Created date: 9/8/15
 */
@Controller
@RequestMapping(value = "/api/album")
public class AlbumController {

    private AlbumService albumService;

    @Autowired
    public void setAlbumService(AlbumService albumService) {
        this.albumService = albumService;
    }

    @RequestMapping(value = "/id/{albumId}", method = RequestMethod.GET)
    public ResponseEntity<Album> getAlbumById( @PathVariable("albumId") int albumId ) {
        Album album = albumService.getAlbum( albumId );
        if( album == null ) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(album, HttpStatus.OK);
    }

    @RequestMapping(value = "/artist/id/{artistId}", method = RequestMethod.GET)
    public ResponseEntity<List<Album>> getAlbumsByArtistId( @PathVariable("artistId") int artistId ) {
        List<Album> albums = albumService.getAlbumsByArtist( artistId );
        return new ResponseEntity<>(albums, HttpStatus.OK);
    }
}
