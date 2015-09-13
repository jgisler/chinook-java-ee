package org.gislers.chinook.service.dto;

import org.gislers.chinook.persistence.entities.AlbumEntity;

/**
 * Created by jim
 * Created on 9/13/15.
 */
public class Album {

    private long albumId;
    private String albumTitle;
    private Artist artist;

    public Album() {
    }

    public Album( AlbumEntity albumEntity ) {
        this.albumId = albumEntity.getAlbumId();
        this.albumTitle = albumEntity.getTitle();
        this.artist = new Artist( albumEntity.getArtistEntity() );
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
