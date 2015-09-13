package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.TrackDao;
import org.gislers.chinook.persistence.entities.TrackEntity;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Named
@Repository
public class TrackDaoImpl extends AbstractDaoImpl<TrackEntity> implements TrackDao {

    public TrackDaoImpl() {
        setClazz( TrackEntity.class );
    }

}
