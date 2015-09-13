package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.MediaTypeDao;
import org.gislers.chinook.persistence.entities.MediaTypeEntity;
import org.gislers.chinook.persistence.entities.TrackEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by:   jgisle
 * Created date: 9/11/15
 */
public class MediaTypeDaoImplTest extends BaseDaoImplTest {

    @Autowired
    private MediaTypeDao dao;

    @Test
    public void testFindOne() throws Exception {
        MediaTypeEntity entity = dao.findOne(1);
        assertNotNull(entity);
        assertEquals("MPEG audio file", entity.getName());

        List<TrackEntity> trackEntities = entity.getTrackEntities();
        assertFalse(trackEntities.isEmpty());
    }

    @Test
    public void testFindAll() throws Exception {
        List<MediaTypeEntity> entities = dao.findAll();
        assertFalse(entities.isEmpty());
        assertEquals(5, entities.size());
    }

    @Test
    public void testUpdate() throws Exception {
        MediaTypeEntity entity = dao.findOne(1);
        assertNotNull(entity);
        assertEquals( "MPEG audio file", entity.getName() );

        entity.setName("Compact Disc");
        dao.update(entity);

        entity = dao.findOne(1);
        assertNotNull(entity);
        assertEquals("Compact Disc", entity.getName());
    }

    @Test
    public void testDelete() throws Exception {
        MediaTypeEntity entity = dao.findOne(1);
        assertNotNull(entity);

        dao.delete(entity);

        entity = dao.findOne(1);
        assertNull(entity);
    }

    @Test
    public void testDeleteById() throws Exception {
        MediaTypeEntity entity = dao.findOne(1);
        assertNotNull(entity);

        dao.deleteById(1);

        entity = dao.findOne(1);
        assertNull(entity);
    }
}