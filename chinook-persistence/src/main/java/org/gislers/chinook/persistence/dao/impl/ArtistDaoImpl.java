package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.ArtistDao;
import org.gislers.chinook.persistence.entities.ArtistEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class ArtistDaoImpl extends AbstractDaoImpl<ArtistEntity> implements ArtistDao {

    public ArtistDaoImpl() {
        setClazz( ArtistEntity.class );
    }
}
