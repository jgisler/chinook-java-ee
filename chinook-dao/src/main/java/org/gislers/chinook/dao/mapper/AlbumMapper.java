package org.gislers.chinook.dao.mapper;

import org.gislers.chinook.dao.model.Album;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.gislers.chinook.dao.model.Album.Column.*;

public class AlbumMapper extends AbstractMapper<Album> {

    @Override
    public Album mapRow(ResultSet resultSet, int i) throws SQLException{
        return new Album.Builder()
                .setAlbumId(getInt(resultSet, AlbumId))
                .setAlbumTitle(getString(resultSet, Title))
                .setArtistId(getInt(resultSet, ArtistId))
                .build();
    }
}
