package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.InvoiceLineDao;
import org.gislers.chinook.persistence.entities.InvoiceLineEntity;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Named
@Repository
public class InvoiceLineDaoImpl extends AbstractDaoImpl<InvoiceLineEntity> implements InvoiceLineDao {

    public InvoiceLineDaoImpl() {
        setClazz( InvoiceLineEntity.class );
    }

}
