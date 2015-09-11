package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.PlaylistTrackDao;
import org.gislers.chinook.persistence.entities.PlaylistTrackEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class PlaylistTrackDaoImpl extends AbstractDaoImpl<PlaylistTrackEntity> implements PlaylistTrackDao {

    public PlaylistTrackDaoImpl() {
        setClazz( PlaylistTrackEntity.class );
    }

}
