package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.CustomerDao;
import org.gislers.chinook.persistence.entities.CustomerEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class CustomerDaoImpl extends AbstractDaoImpl<CustomerEntity> implements CustomerDao {

    public CustomerDaoImpl() {
        setClazz( CustomerEntity.class );
    }
}
