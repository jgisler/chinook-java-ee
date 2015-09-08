package org.gislers.chinook.rest.service;

import org.gislers.chinook.persistence.respositories.AlbumRepository;
import org.gislers.chinook.persistence.respositories.ArtistRepository;
import org.gislers.chinook.persistence.respositories.entities.AlbumEntity;
import org.gislers.chinook.persistence.respositories.entities.ArtistEntity;
import org.gislers.chinook.rest.model.Album;
import org.gislers.chinook.rest.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by:   jgisle
 * Created date: 9/8/15
 */
@Component
public class AlbumService {

    private AlbumRepository albumRepository;
    private ArtistRepository artistRepository;

    @Autowired
    public void setAlbumRepository(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Album findAlbum( int albumId ) {
        return null;
    }

    AlbumEntity findAlbumEntity( int albumId ) {
        return albumRepository.findOne( albumId );
    }
}
