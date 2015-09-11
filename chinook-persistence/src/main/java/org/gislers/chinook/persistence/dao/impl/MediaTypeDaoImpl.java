package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.InvoiceLineDao;
import org.gislers.chinook.persistence.entities.InvoiceLineEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Repository
public class MediaTypeDaoImpl extends AbstractDaoImpl<InvoiceLineEntity> implements InvoiceLineDao {

    public MediaTypeDaoImpl() {
        setClazz( InvoiceLineEntity.class );
    }

}
