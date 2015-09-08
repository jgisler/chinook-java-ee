package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.EmployeeEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by jim on 9/6/15.
 */
public class EmployeeEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeEntityRepositoryTest.class);

    @Inject
    private EmployeeRepository repository;

    @Test
    public void testFind() {
        EmployeeEntity entity = repository.findOne(1);
        assertNotNull(entity);
        assertEquals(new Integer(1), entity.getEmployeeId());
        assertEquals("11120 Jasper Ave NW", entity.getAddress());
    }

    @Test
    public void testFind_NotFound() {
        EmployeeEntity entity = repository.findOne(99999);
        assertNull(entity);
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