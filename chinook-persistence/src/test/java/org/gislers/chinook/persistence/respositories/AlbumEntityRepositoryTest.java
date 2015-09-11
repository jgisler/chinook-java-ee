package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.entities.AlbumEntity;
import org.gislers.chinook.persistence.entities.ArtistEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by:   jim
 * Created date: 8/31/15
 */
public class AlbumEntityRepositoryTest extends BaseRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(AlbumEntityRepositoryTest.class);

    @Inject
    private AlbumRepository repository;

    @Test
    public void testFind() {
        AlbumEntity entity = repository.findOne(1);
        assertNotNull(entity);

        assertEquals(new Integer(1), entity.getAlbumId());
        assertEquals("For Those About To Rock We Salute You", entity.getTitle());

        ArtistEntity artistEntity = entity.getArtistEntity();
        assertNotNull( artistEntity );
        assertEquals(1, artistEntity.getArtistId());
        assertEquals("", artistEntity.getName());
    }

    @Test
    public void testFind_NotFound() {
        AlbumEntity entity = repository.findOne(99999);
        assertNull(entity);
    }

    @Test
    public void testFindAll() throws Exception {
        List<AlbumEntity> albumEntityList = repository.findAll();
        for( AlbumEntity albumEntity : albumEntityList) {
            logger.debug( albumEntity.toString() );
        }
        assertNotNull(albumEntityList);
    }

    @Test
    public void testFindByArtistIdOrderByTitleAsc() {
        List<AlbumEntity> albumEntities = repository.findByArtistIdOrderByTitleAsc( 1 );
        assertFalse( albumEntities.isEmpty() );
        assertEquals( 2, albumEntities.size() );

        AlbumEntity albumEntity = albumEntities.get(0);
        assertEquals( new Integer(1), albumEntity.getAlbumId() );
        assertEquals("For Those About To Rock We Salute You", albumEntity.getTitle());

        albumEntity = albumEntities.get(1);
        assertEquals( new Integer(4), albumEntity.getAlbumId() );
        assertEquals( "Let There Be Rock", albumEntity.getTitle() );
    }
}