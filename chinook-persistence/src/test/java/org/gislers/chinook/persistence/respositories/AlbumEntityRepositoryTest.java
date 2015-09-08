package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.AlbumEntity;
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
 * Created by:   jim
 * Created date: 8/31/15
 */
public class AlbumEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(AlbumEntityRepositoryTest.class);

    @Inject
    private AlbumRepository repository;

    @Test
    public void testSave() {

        AlbumEntity albumEntity = new AlbumEntity();
        albumEntity.setArtistId(1);
        albumEntity.setTitle("Test title");

        albumEntity = repository.save(albumEntity);
        assertEquals( new Integer(1), albumEntity.getArtistId() );
        assertEquals( "Test title", albumEntity.getTitle() );

        repository.delete(albumEntity);
    }

    @Test
    public void testFind() {
        Optional<AlbumEntity> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        AlbumEntity albumEntity = optional.get();
        assertEquals(new Integer(1), albumEntity.getAlbumId());
        assertEquals("For Those About To Rock We Salute You", albumEntity.getTitle());
        assertEquals(new Integer(1), albumEntity.getArtistId());
    }

    @Test
    public void testFind_NotFound() {
        Optional<AlbumEntity> albumOptional = repository.findOne(99999);
        assertFalse(albumOptional.isPresent());
    }

    @Test
    public void testFindAll() throws Exception {
        List<AlbumEntity> albumEntityList = repository.findAll();
        for( AlbumEntity albumEntity : albumEntityList) {
            logger.debug( albumEntity.toString() );
        }
        assertNotNull(albumEntityList);
    }
}