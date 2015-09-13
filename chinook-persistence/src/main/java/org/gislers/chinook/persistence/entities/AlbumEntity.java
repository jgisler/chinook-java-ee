package org.gislers.chinook.persistence.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by:   jim
 * Created date: 8/28/15
 */
@Entity
@Table(name = "album", schema = "chinook")
public class AlbumEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="album_id")
    private long albumId;

    private String title;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="artist_id")
    private ArtistEntity artistEntity;

    @OneToMany(fetch= FetchType.LAZY, cascade= CascadeType.ALL, mappedBy="mediaTypeEntity")
    private List<TrackEntity> trackEntities;

    public AlbumEntity() {
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
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
