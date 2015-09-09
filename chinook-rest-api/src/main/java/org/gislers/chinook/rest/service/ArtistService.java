package org.gislers.chinook.rest.service;

import org.gislers.chinook.persistence.respositories.ArtistRepository;
import org.gislers.chinook.persistence.respositories.entities.ArtistEntity;
import org.gislers.chinook.rest.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by:   jgisle
 * Created date: 9/9/15
 */
@Component
public class ArtistService {

    private ArtistRepository artistRepository;

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Artist getArtist( int artistId ) {
        Artist artist = null;
        ArtistEntity artistEntity = artistRepository.findOne( artistId );
        if( artistEntity != null ) {
            artist = new Artist( artistEntity );
        }
        return artist;
    }
}
