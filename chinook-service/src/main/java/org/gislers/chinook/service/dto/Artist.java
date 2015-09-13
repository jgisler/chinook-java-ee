package org.gislers.chinook.service.dto;

import org.gislers.chinook.persistence.entities.AlbumEntity;
import org.gislers.chinook.persistence.entities.ArtistEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jim
 * Created on 9/13/15.
 */
public class Artist {

    private long artistId;
    private String artistName;
    private List<Album> albums = new ArrayList<>();

    public Artist() {
    }

    public Artist( ArtistEntity artistEntity ) {
        this.artistId = artistEntity.getArtistId();
        this.artistName = artistEntity.getName();

        List<AlbumEntity> albumEntities = artistEntity.getAlbumEntities();
        this.albums = new ArrayList<>(albumEntities.size());
        for( AlbumEntity albumEntity : albumEntities ) {
            this.albums.add( new Album(albumEntity) );
        }
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
