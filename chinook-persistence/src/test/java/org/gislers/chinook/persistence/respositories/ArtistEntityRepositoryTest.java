package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.respositories.entities.ArtistEntity;
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
        Optional<ArtistEntity> optional = repository.findOne(artistId);
        assertTrue(optional.isPresent());

        // Test update
        ArtistEntity updateArtistEntity = optional.get();
        updateArtistEntity.setName("Test ArtistEntity Name 1");
        repository.save(updateArtistEntity);

        // Test update success
        artistId = updateArtistEntity.getArtistId();
        optional = repository.findOne(artistId);
        assertTrue(optional.isPresent());
        assertEquals( updateArtistEntity.getName(), optional.get().getName() );

        // Test delete
        repository.delete(newArtistEntity);
        optional = repository.findOne(artistId);
        assertFalse(optional.isPresent());
    }

    @Test
    public void testFind() {
        Optional<ArtistEntity> optional = repository.findOne(1);
        assertTrue(optional.isPresent());

        ArtistEntity artistEntity = optional.get();
        assertEquals(1, artistEntity.getArtistId());
        assertEquals("AC/DC", artistEntity.getName());
    }

    @Test
    public void testFind_NotFound() {
        Optional<ArtistEntity> optional = repository.findOne(99999);
        assertFalse(optional.isPresent());
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