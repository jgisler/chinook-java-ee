package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.MediaTypeDao;
import org.gislers.chinook.persistence.entities.MediaTypeEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class MediaTypeDaoImpl extends AbstractDaoImpl<MediaTypeEntity> implements MediaTypeDao {

    public MediaTypeDaoImpl() {
        setClazz( MediaTypeEntity.class );
    }

}
