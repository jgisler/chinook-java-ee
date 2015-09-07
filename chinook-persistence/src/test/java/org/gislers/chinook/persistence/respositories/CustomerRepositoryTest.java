package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.Customer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jim on 9/6/15.
 */
public class CustomerRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(CustomerRepositoryTest.class);

    @Autowired
    private CustomerRepository repository;

    @Test
    public void testFind() {
        Optional<Customer> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        Customer customer = optional.get();
        assertEquals(1, customer.getCustomerId());
        assertEquals("Av. Brigadeiro Faria Lima, 2170", customer.getAddress());
    }

    @Test
    public void testFind_NotFound() {
        Optional<Customer> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Customer> list = repository.findAll();
        assertNotNull( list );

        for( Customer item : list ) {
            logger.debug( item.toString() );
        }
    }
}