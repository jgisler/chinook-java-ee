package org.gislers.chinook.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

/**
 * Created by jim on 9/6/15.
 */
@Entity
@IdClass(value = PlaylistTrack.PlaylistTrackId.class)
public class PlaylistTrack extends BaseEntity {

    private Integer playlistId;
    private Integer trackId;

    public PlaylistTrack() {
    }

    @Id
    @Column(name="playlistId")
    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    @Id
    @Column(name="trackId")
    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public static class PlaylistTrackId implements Serializable {

        private Integer playlistId;
        private Integer trackId;

        public PlaylistTrackId() {
        }

        public Integer getPlaylistId() {
            return playlistId;
        }

        public void setPlaylistId(Integer playlistId) {
            this.playlistId = playlistId;
        }

        public Integer getTrackId() {
            return trackId;
        }

        public void setTrackId(Integer trackId) {
            this.trackId = trackId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PlaylistTrackId that = (PlaylistTrackId) o;

            if (!playlistId.equals(that.playlistId)) return false;
            return trackId.equals(that.trackId);

        }

        @Override
        public int hashCode() {
            int result = playlistId.hashCode();
            result = 31 * result + trackId.hashCode();
            return result;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("PlaylistTrackId{");
            sb.append("playlistId=").append(playlistId);
            sb.append(", trackId=").append(trackId);
            sb.append('}');
            return sb.toString();
        }
    }
}
