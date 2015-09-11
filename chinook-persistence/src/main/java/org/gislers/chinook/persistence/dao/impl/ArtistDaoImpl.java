package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.ArtistDao;
import org.gislers.chinook.persistence.entities.AlbumEntity;
import org.gislers.chinook.persistence.entities.ArtistEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class ArtistDaoImpl extends AbstractDaoImpl<ArtistEntity> implements ArtistDao {

    public ArtistDaoImpl() {
        setClazz( ArtistEntity.class );
    }

    @Override
    public List<AlbumEntity> findAlbumsByArtist(int artistId) {
        return entityManager.createQuery( "from Album album where aritstId = :artistId", AlbumEntity.class )
                .setParameter( "artistId", artistId )
                .getResultList();
    }
}
