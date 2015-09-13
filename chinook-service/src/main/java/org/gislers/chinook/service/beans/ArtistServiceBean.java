package org.gislers.chinook.service.beans;

import org.gislers.chinook.persistence.dao.ArtistDao;
import org.gislers.chinook.persistence.entities.ArtistEntity;
import org.gislers.chinook.service.ArtistService;
import org.gislers.chinook.service.dto.Artist;
import org.gislers.chinook.service.exceptions.ChinookServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 * Created by jim
 * Created on 9/13/15.
 */
@Stateless(mappedName="ejb/ArtistService")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class ArtistServiceBean implements ArtistService {

    @Autowired
    private ArtistDao artistDao;

    @Override
    public Artist findArtist(long artistId) {
        ArtistEntity artistEntity = artistDao.findOne(artistId);
        if( artistEntity == null ) {
            throw new ChinookServiceException("Artist not found");
        }
        return new Artist( artistEntity );
    }
}
