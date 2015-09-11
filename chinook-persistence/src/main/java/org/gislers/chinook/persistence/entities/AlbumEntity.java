package org.gislers.chinook.persistence.entities;

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
    private String title;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="artistid")
    private ArtistEntity artistEntity;

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

    public ArtistEntity getArtistEntity() {
        return artistEntity;
    }

    public void setArtistEntity( ArtistEntity artistEntity ) {
        this.artistEntity = artistEntity;
    }
}
