package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.GenreDao;
import org.gislers.chinook.persistence.entities.GenreEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class GenreDaoImpl extends AbstractDaoImpl<GenreEntity> implements GenreDao {

    public GenreDaoImpl() {
        setClazz( GenreEntity.class );
    }

}
