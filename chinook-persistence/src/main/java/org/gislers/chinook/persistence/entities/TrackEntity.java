package org.gislers.chinook.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "track", schema = "chinook")
public class TrackEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="track_id")
    private long trackId;

    @Column(name="album_id")
    private long albumId;

    @Column(name="media_type_id")
    private long mediaTypeId;

    @Column(name="genre_id")
    private long genreId;

    private String name;
    private String  composer;
    private Integer milliseconds;
    private Integer bytes;
    private BigDecimal unitPrice;

    public TrackEntity() {
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public long getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(long mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
