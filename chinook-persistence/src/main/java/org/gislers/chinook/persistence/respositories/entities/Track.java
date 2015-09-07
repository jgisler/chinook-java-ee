package org.gislers.chinook.persistence.respositories.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by jim on 9/6/15.
 */
@Entity
public class Track extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer     trackId;

    private String      name;
    private Integer     albumId;
    private Integer     mediaTypeId;
    private Integer     genreId;
    private String      composer;
    private Integer     milliseconds;
    private Integer     bytes;
    private BigDecimal  unitPrice;

    public Track() {
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(Integer mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Track{");
        sb.append("trackId=").append(trackId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", albumId=").append(albumId);
        sb.append(", mediaTypeId=").append(mediaTypeId);
        sb.append(", genreId=").append(genreId);
        sb.append(", composer='").append(composer).append('\'');
        sb.append(", milliseconds=").append(milliseconds);
        sb.append(", bytes=").append(bytes);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        return new EqualsBuilder()
                .append(trackId, track.trackId)
                .append(name, track.name)
                .append(albumId, track.albumId)
                .append(mediaTypeId, track.mediaTypeId)
                .append(genreId, track.genreId)
                .append(composer, track.composer)
                .append(milliseconds, track.milliseconds)
                .append(bytes, track.bytes)
                .append(unitPrice, track.unitPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(trackId)
                .append(name)
                .append(albumId)
                .append(mediaTypeId)
                .append(genreId)
                .append(composer)
                .append(milliseconds)
                .append(bytes)
                .append(unitPrice)
                .toHashCode();
    }
}
