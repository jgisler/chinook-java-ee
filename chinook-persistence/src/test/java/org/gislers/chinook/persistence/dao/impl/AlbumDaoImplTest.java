package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.AlbumDao;
import org.gislers.chinook.persistence.respositories.entities.Album;
import org.junit.Test;

import javax.inject.Inject;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by jim on 9/7/15.
 */
public class AlbumDaoImplTest extends BaseDaoImplTest{

    @Inject
    private AlbumDao albumDao;

    @Test
    public void testSave() throws Exception {

        String albumTitle = UUID.randomUUID().toString();

        Album newAlbum = new Album();
        newAlbum.setArtistId( 1 );
        newAlbum.setTitle(albumTitle);

        Album savedAlbum = albumDao.save(newAlbum);
        assertNotNull( savedAlbum.getAlbumId() );

        int albumId = savedAlbum.getAlbumId();
        Album fetchedAlbum = albumDao.findById( albumId );

        assertEquals( savedAlbum, fetchedAlbum );
    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testFindById() throws Exception {

    }

    @Test
    public void testFindAll() throws Exception {

    }
}