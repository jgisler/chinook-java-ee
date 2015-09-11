package org.gislers.chinook.persistence.dao;

import org.gislers.chinook.persistence.entities.AlbumEntity;
import org.gislers.chinook.persistence.entities.ArtistEntity;

import java.util.List;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
public interface ArtistDao extends BaseDao<ArtistEntity> {

    List<AlbumEntity> findAlbumsByArtist( int artistId );
}
