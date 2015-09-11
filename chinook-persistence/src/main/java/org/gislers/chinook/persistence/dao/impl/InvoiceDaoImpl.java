package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.InvoiceDao;
import org.gislers.chinook.persistence.entities.InvoiceEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class InvoiceDaoImpl extends AbstractDaoImpl<InvoiceEntity> implements InvoiceDao {

    public InvoiceDaoImpl() {
        setClazz( InvoiceEntity.class );
    }

}
