package org.gislers.chinook.dao.model;

import java.math.BigDecimal;

public class Track {

    private int trackId;
    private String trackName;
    private int albumId;
    private int mediaTypeId;
    private int genreId;
    private String composer;
    private int durationInMs;
    private int fileSizeInBytes;
    private BigDecimal unitPrice;

    private Track() {
    }

    public int getTrackId() {
        return trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public int getAlbumId() {
        return albumId;
    }

    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public int getGenreId() {
        return genreId;
    }

    public String getComposer() {
        return composer;
    }

    public int getDurationInMs() {
        return durationInMs;
    }

    public int getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public enum Column implements IColumn {
        TrackId,
        Name,
        AlbumId,
        MediaTypeId,
        GenreId,
        Composer,
        Milliseconds,
        Bytes,
        UnitPrice
    }

    public static final class Builder {

        private int trackId;
        private String trackName;
        private int albumId;
        private int mediaTypeId;
        private int genreId;
        private String composer;
        private int durationInMs;
        private int fileSizeInBytes;
        private BigDecimal unitPrice;

        public Builder() {
        }

        public Builder setTrackId(int trackId) {
            this.trackId = trackId;
            return this;
        }

        public Builder setTrackName(String trackName) {
            this.trackName = trackName;
            return this;
        }

        public Builder setAlbumId(int albumId) {
            this.albumId = albumId;
            return this;
        }

        public Builder setMediaTypeId(int mediaTypeId) {
            this.mediaTypeId = mediaTypeId;
            return this;
        }

        public Builder setGenreId(int genreId) {
            this.genreId = genreId;
            return this;
        }

        public Builder setComposer(String composer) {
            this.composer = composer;
            return this;
        }

        public Builder setDurationInMs(int durationInMs) {
            this.durationInMs = durationInMs;
            return this;
        }

        public Builder setFileSizeInBytes(int fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            return this;
        }

        public Builder setUnitPrice(BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Track build() {
            Track track = new Track();
            track.trackId = trackId;
            track.trackName = trackName;
            track.albumId = albumId;
            track.mediaTypeId = mediaTypeId;
            track.genreId = genreId;
            track.composer = composer;
            track.durationInMs = durationInMs;
            track.fileSizeInBytes = fileSizeInBytes;
            track.unitPrice = unitPrice;
            return track;
        }
    }
}
