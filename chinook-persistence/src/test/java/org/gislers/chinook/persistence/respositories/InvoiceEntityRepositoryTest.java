package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.InvoiceEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by jim on 9/6/15.
 */
public class InvoiceEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(InvoiceEntityRepositoryTest.class);

    @Inject
    private InvoiceRepository repository;

    @Test
    public void testFind() {
        InvoiceEntity entity = repository.findOne(1);
        assertNotNull(entity);
        assertEquals(new Integer(1), entity.getInvoiceId());
        assertEquals(new BigDecimal("1.98"), entity.getTotal());
    }

    @Test
    public void testFind_NotFound() {
        InvoiceEntity entity = repository.findOne(99999);
        assertNull(entity);
    }

    @Test
    public void testFindAll() throws Exception {
        List<InvoiceEntity> entityList = repository.findAll();
        assertNotNull( entityList );

        for( InvoiceEntity entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}