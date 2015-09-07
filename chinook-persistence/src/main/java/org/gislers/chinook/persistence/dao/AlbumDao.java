package org.gislers.chinook.persistence.dao;

import org.gislers.chinook.persistence.respositories.entities.Album;

import java.util.List;

/**
 * Created by jim on 9/7/15.
 */
public interface AlbumDao {

    Album save( Album album );
    void  delete( Album album );
    Album findById( int albumId );
    List<Album> findAll();
}
