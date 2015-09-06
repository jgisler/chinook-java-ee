package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.entities.InvoiceLine;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
public class InvoiceLineRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(InvoiceLineRepositoryTest.class);

    @Autowired
    private InvoiceLineRepository repository;

    @Test
    public void testFind() {
        Optional<InvoiceLine> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        InvoiceLine entity = optional.get();
        assertEquals(new Integer(1), entity.getInvoiceId());
        assertEquals(new BigDecimal("0.99"), entity.getUnitPrice());
    }

    @Test
    public void testFind_NotFound() {
        Optional<InvoiceLine> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<InvoiceLine> entityList = repository.findAll();
        assertNotNull( entityList );

        for( InvoiceLine entity : entityList ) {
            logger.debug(entity.toString());
        }
    }
}