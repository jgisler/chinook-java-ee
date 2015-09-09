package org.gislers.chinook.rest.service;

import org.gislers.chinook.persistence.respositories.AlbumRepository;
import org.gislers.chinook.persistence.respositories.ArtistRepository;
import org.gislers.chinook.persistence.respositories.entities.AlbumEntity;
import org.gislers.chinook.persistence.respositories.entities.ArtistEntity;
import org.gislers.chinook.rest.model.Album;
import org.gislers.chinook.rest.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by:   jgisle
 * Created date: 9/8/15
 */
@Component
public class AlbumService {

    private AlbumRepository albumRepository;
    private ArtistService artistService;

    @Autowired
    public void setAlbumRepository(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Autowired
    public void setArtistService(ArtistService artistService) {
        this.artistService = artistService;
    }

    public Album getAlbum(int albumId) {
        Album album = null;
        AlbumEntity albumEntity = albumRepository.findOne( albumId );
        if( albumEntity != null ) {
            album = new Album( albumEntity );
            Artist artist = artistService.getArtist(albumEntity.getArtistId());
            if( artist != null ) {
                album.setArtist( artist );
            }
        }
        return album;
    }
}
