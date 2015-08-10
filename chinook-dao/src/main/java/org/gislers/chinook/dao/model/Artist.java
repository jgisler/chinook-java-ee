package org.gislers.chinook.dao.model;

public class Artist {

    private int artistId;
    private String artistName;

    private Artist() {
    }

    public int getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public enum Column implements IColumn {
        ArtistId,
        Name
    }

    public static final class Builder {

        private int artistId;
        private String artistName;

        public Builder() {
        }

        public Builder setArtistId(int artistId) {
            this.artistId = artistId;
            return this;
        }

        public Builder setArtistName(String artistName) {
            this.artistName = artistName;
            return this;
        }

        public Artist build() {
            Artist artist = new Artist();
            artist.artistId = artistId;
            artist.artistName = artistName;
            return artist;
        }
    }
}
