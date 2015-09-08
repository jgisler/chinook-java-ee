package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.CustomerEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jim on 9/6/15.
 */
public class CustomerEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(CustomerEntityRepositoryTest.class);

    @Inject
    private CustomerRepository repository;

    @Test
    public void testFind() {
        Optional<CustomerEntity> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        CustomerEntity customerEntity = optional.get();
        assertEquals(1, customerEntity.getCustomerId());
        assertEquals("Av. Brigadeiro Faria Lima, 2170", customerEntity.getAddress());
    }

    @Test
    public void testFind_NotFound() {
        Optional<CustomerEntity> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<CustomerEntity> list = repository.findAll();
        assertNotNull( list );

        for( CustomerEntity item : list ) {
            logger.debug( item.toString() );
        }
    }
}