package org.gislers.chinook.service.beans;

import org.gislers.chinook.persistence.dao.AlbumDao;
import org.gislers.chinook.persistence.entities.AlbumEntity;
import org.gislers.chinook.service.AlbumService;
import org.gislers.chinook.service.dto.Album;
import org.gislers.chinook.service.exceptions.ChinookServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 * Created by jim
 * Created on 9/13/15.
 */
@Stateless(mappedName="ejb/AlbumService")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class AlbumServiceBean implements AlbumService {

    @Autowired
    private AlbumDao albumDao;

    @Override
    public Album findAlbum(long albumId) {
        AlbumEntity albumEntity = albumDao.findOne( albumId );
        if( albumEntity == null ) {
            throw new ChinookServiceException("Album not found");
        }
        return new Album( albumEntity );
    }
}
