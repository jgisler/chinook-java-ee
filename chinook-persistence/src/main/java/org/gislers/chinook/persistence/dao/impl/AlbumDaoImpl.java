package org.gislers.chinook.persistence.dao.impl;

import org.gislers.chinook.persistence.dao.AlbumDao;
import org.gislers.chinook.persistence.respositories.AlbumRepository;
import org.gislers.chinook.persistence.respositories.entities.Album;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by jim on 9/7/15.
 */
@Named
public class AlbumDaoImpl implements AlbumDao {

    private AlbumRepository albumRepository;

    @Inject
    public void setAlbumRepository(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    @Transactional
    public Album save(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public void delete(Album album) {
        albumRepository.delete(album);
    }

    @Override
    public Album findById(int albumId) {
        return albumRepository
                .findOne(albumId)
                .orElse(null);
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }
}
