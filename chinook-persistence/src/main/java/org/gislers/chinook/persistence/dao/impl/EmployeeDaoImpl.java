package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.EmployeeDao;
import org.gislers.chinook.persistence.entities.EmployeeEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class EmployeeDaoImpl extends AbstractDaoImpl<EmployeeEntity> implements EmployeeDao {

    public EmployeeDaoImpl() {
        setClazz( EmployeeEntity.class );
    }

}
