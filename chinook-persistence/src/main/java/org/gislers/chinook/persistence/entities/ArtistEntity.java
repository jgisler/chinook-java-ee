package org.gislers.chinook.persistence.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.util.List;

/**
 * Created by:   jim
 * Created date: 8/29/15
 */
@Entity
@Table(name = "artist", schema = "chinook")
public class ArtistEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int artistId;
    private String name;

    @OneToMany
    private List<AlbumEntity> albumEntities;

    public ArtistEntity() {
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AlbumEntity> getAlbumEntities() {
        return albumEntities;
    }

    public void setAlbumEntities(List<AlbumEntity> albumEntities) {
        this.albumEntities = albumEntities;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArtistEntity{");
        sb.append("artistId=").append(artistId);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ArtistEntity artistEntity = (ArtistEntity) o;

        return new EqualsBuilder()
                .append(artistId, artistEntity.artistId)
                .append(name, artistEntity.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(artistId)
                .append(name)
                .toHashCode();
    }
}
