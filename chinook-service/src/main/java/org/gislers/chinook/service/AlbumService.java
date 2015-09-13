package org.gislers.chinook.service;

import org.gislers.chinook.service.dto.Album;

import javax.ejb.Local;

/**
 * Created by jim
 * Created on 9/13/15.
 */
@Local
public interface AlbumService {

    Album findAlbum( long albumId );

}
