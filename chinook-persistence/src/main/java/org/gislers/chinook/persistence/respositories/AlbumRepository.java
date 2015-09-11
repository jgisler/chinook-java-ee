package org.gislers.chinook.persistence.respositories;

import org.gislers.chinook.persistence.entities.AlbumEntity;

import java.util.List;

/**
 * Created by:   jim
 * Created date: 8/31/15
 */
public interface AlbumRepository extends BaseRepository<AlbumEntity, Integer> {

    List<AlbumEntity> findByArtistIdOrderByTitleAsc( Integer artistId );
}
