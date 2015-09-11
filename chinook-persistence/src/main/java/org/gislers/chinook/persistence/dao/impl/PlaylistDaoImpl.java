package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.PlaylistDao;
import org.gislers.chinook.persistence.entities.PlaylistEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class PlaylistDaoImpl extends AbstractDaoImpl<PlaylistEntity> implements PlaylistDao {

    public PlaylistDaoImpl() {
        setClazz( PlaylistEntity.class );
    }

}
