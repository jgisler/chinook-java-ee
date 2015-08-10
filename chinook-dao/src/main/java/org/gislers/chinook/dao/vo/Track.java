package org.gislers.chinook.dao.vo;

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

    public Track() {
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getDurationInMs() {
        return durationInMs;
    }

    public void setDurationInMs(int durationInMs) {
        this.durationInMs = durationInMs;
    }

    public int getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    public void setFileSizeInBytes(int fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
