package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.EmployeeEntity;
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
public class EmployeeEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeEntityRepositoryTest.class);

    @Inject
    private EmployeeRepository repository;

    @Test
    public void testFind() {
        Optional<EmployeeEntity> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        EmployeeEntity employeeEntity = optional.get();
        assertEquals(new Integer(1), employeeEntity.getEmployeeId());
        assertEquals("11120 Jasper Ave NW", employeeEntity.getAddress());
    }

    @Test
    public void testFind_NotFound() {
        Optional<EmployeeEntity> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<EmployeeEntity> list = repository.findAll();
        assertNotNull( list );

        for( EmployeeEntity item : list ) {
            logger.debug( item.toString() );
        }
    }
}