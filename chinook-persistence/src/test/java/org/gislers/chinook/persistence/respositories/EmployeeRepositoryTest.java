package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.entities.Employee;
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
public class EmployeeRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeRepositoryTest.class);

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void testFind() {
        Optional<Employee> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        Employee employee = optional.get();
        assertEquals(new Integer(1), employee.getEmployeeId());
        assertEquals("11120 Jasper Ave NW", employee.getAddress());
    }

    @Test
    public void testFind_NotFound() {
        Optional<Employee> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Employee> list = repository.findAll();
        assertNotNull( list );

        for( Employee item : list ) {
            logger.debug( item.toString() );
        }
    }
}