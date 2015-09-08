package org.gislers.chinook.rest.controller;

import org.gislers.chinook.persistence.respositories.AlbumRepository;
import org.gislers.chinook.persistence.respositories.entities.AlbumEntity;
import org.gislers.chinook.rest.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

/**
 * Created by:   jgisle
 * Created date: 9/8/15
 */
@Controller
@RequestMapping(value = "/api/album")
public class AlbumController {



    @RequestMapping(value = "/id/{albumId}", method = RequestMethod.GET)
    public ResponseEntity<Album> getAlbumById( @PathVariable("albumId") int albumId ) {
        return null;
    }
}
