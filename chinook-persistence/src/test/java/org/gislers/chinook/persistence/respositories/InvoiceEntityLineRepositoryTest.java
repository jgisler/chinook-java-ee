package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.InvoiceLineEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jim on 9/6/15.
 */
public class InvoiceEntityLineRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(InvoiceEntityLineRepositoryTest.class);

    @Inject
    private InvoiceLineRepository repository;

    @Test
    public void testFind() {
        Optional<InvoiceLineEntity> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        InvoiceLineEntity entity = optional.get();
        assertEquals(new Integer(1), entity.getInvoiceId());
        assertEquals(new BigDecimal("0.99"), entity.getUnitPrice());
    }

    @Test
    public void testFind_NotFound() {
        Optional<InvoiceLineEntity> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<InvoiceLineEntity> entityList = repository.findAll();
        assertNotNull( entityList );

        for( InvoiceLineEntity entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}