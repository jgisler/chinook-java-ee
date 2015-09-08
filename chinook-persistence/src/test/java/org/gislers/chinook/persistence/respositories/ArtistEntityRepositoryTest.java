package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.ArtistEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by jim on 9/5/15.
 */
public class ArtistEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(ArtistEntityRepositoryTest.class);

    @Inject
    private ArtistRepository repository;

    @Test
    public void testSave() {

        // Insert
        ArtistEntity newArtistEntity = new ArtistEntity();
        newArtistEntity.setName("test artist name");
        newArtistEntity = repository.save(newArtistEntity);
        assertNotNull(newArtistEntity.getArtistId());

        // Test insert success
        int artistId = newArtistEntity.getArtistId();
        ArtistEntity entity = repository.findOne(artistId);
        assertNotNull(entity);

        // Test update
        entity.setName("Test ArtistEntity Name 1");
        repository.save(entity);

        // Test update success
        artistId = entity.getArtistId();
        entity = repository.findOne(artistId);
        assertNotNull(entity);
        assertEquals("Test ArtistEntity Name 1", entity.getName());

        // Test delete
        repository.delete(newArtistEntity);
        entity = repository.findOne(artistId);
        assertNull(entity);
    }

    @Test
    public void testFind() {
        ArtistEntity entity = repository.findOne(1);
        assertNotNull(entity);

        assertEquals(1, entity.getArtistId());
        assertEquals("AC/DC", entity.getName());
    }

    @Test
    public void testFind_NotFound() {
        ArtistEntity entity = repository.findOne(99999);
        assertNull(entity);
    }

    @Test
    public void testFindAll() throws Exception {
        List<ArtistEntity> list = repository.findAll();
        for( ArtistEntity artistEntity : list ) {
            logger.debug( artistEntity.toString() );
        }
        assertNotNull( list );
    }
}