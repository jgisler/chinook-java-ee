package org.gislers.chinook.persistence.respositories.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;

/**
 * Created by:   jim
 * Created date: 8/28/15
 */
@Entity
@Table(name = "album", schema = "chinook")
public class AlbumEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer albumId;
    private String  title;
    private Integer artistId;

    public AlbumEntity() {
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        AlbumEntity albumEntity = (AlbumEntity) o;

        return new EqualsBuilder()
                .append(albumId, albumEntity.albumId)
                .append(title, albumEntity.title)
                .append(artistId, albumEntity.artistId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(albumId)
                .append(title)
                .append(artistId)
                .toHashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AlbumEntity{");
        sb.append("albumId=").append(albumId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", artistId=").append(artistId);
        sb.append('}');
        return sb.toString();
    }
}
