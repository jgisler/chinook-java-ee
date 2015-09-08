package org.gislers.chinook.persistence.respositories.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "playlistTrack", schema = "chinook")
@IdClass(value = PlaylistTrackEntity.PlaylistTrackId.class)
public class PlaylistTrackEntity extends BaseEntity {

    private Integer playlistId;
    private Integer trackId;

    public PlaylistTrackEntity() {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaylistTrackEntity{");
        sb.append("playlistId=").append(playlistId);
        sb.append(", trackId=").append(trackId);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PlaylistTrackEntity that = (PlaylistTrackEntity) o;

        return new EqualsBuilder()
                .append(playlistId, that.playlistId)
                .append(trackId, that.trackId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(playlistId)
                .append(trackId)
                .toHashCode();
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
