package org.gislers.chinook.dao.model;

public class Album {

    private int albumId;
    private String albumTitle;
    private int artistId;

    private Album() {
    }

    public int getAlbumId() {
        return albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public int getArtistId() {
        return artistId;
    }

    public enum Column implements IColumn {
        AlbumId,
        Title,
        ArtistId
    }

    public static final class Builder {

        private int albumId;
        private String albumTitle;
        private int artistId;

        public Builder() {
        }

        public Builder setAlbumId(int albumId) {
            this.albumId = albumId;
            return this;
        }

        public Builder setAlbumTitle(String albumTitle) {
            this.albumTitle = albumTitle;
            return this;
        }

        public Builder setArtistId(int artistId) {
            this.artistId = artistId;
            return this;
        }

        public Album build() {
            Album album = new Album();
            album.albumId = albumId;
            album.albumTitle = albumTitle;
            album.artistId = artistId;
            return album;
        }
    }
}
