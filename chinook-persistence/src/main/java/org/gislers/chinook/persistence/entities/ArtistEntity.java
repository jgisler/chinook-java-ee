package org.gislers.chinook.persistence.entities;

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

    @OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="artistEntity")
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
}
