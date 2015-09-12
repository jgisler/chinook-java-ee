package org.gislers.chinook.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "playlist_track", schema = "chinook")
public class PlaylistTrackEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="playlist_track_id")
    private long playlistTrackId;

    @Column(name="playlist_id")
    private long playlistId;

    @Column(name="track_id")
    private long trackId;

    public PlaylistTrackEntity() {
    }

    public long getPlaylistTrackId() {
        return playlistTrackId;
    }

    public void setPlaylistTrackId(long playlistTrackId) {
        this.playlistTrackId = playlistTrackId;
    }

    public long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(long playlistId) {
        this.playlistId = playlistId;
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }
}
