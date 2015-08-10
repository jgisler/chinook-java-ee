package org.gislers.chinook.dao.vo;

public class Album {

    private int albumId;
    private String albumTitle;
    private int artistId;

    public Album() {
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public enum Column implements IColumn {
        ALBUM_ID,
        TITLE,
        ARTIST_ID
    }
}
