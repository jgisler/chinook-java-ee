package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.AlbumDao;
import org.gislers.chinook.persistence.entities.AlbumEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class AlbumDaoImpl extends AbstractDaoImpl<AlbumEntity> implements AlbumDao {

    public AlbumDaoImpl() {
        setClazz( AlbumEntity.class );
    }
}
