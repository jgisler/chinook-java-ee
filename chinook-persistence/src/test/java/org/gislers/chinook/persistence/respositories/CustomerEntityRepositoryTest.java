package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.entities.CustomerEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
public class CustomerEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(CustomerEntityRepositoryTest.class);

    @Inject
    private CustomerRepository repository;

    @Test
    public void testFind() {
        CustomerEntity entity = repository.findOne(1);
        assertNotNull(entity);
        assertEquals(1, entity.getCustomerId());
        assertEquals("Av. Brigadeiro Faria Lima, 2170", entity.getAddress());
    }

    @Test
    public void testFind_NotFound() {
        CustomerEntity entity = repository.findOne(99999);
        assertNull(entity);
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