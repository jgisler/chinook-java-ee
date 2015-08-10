package org.gislers.chinook.dao.model;

public class PlayListTrack {

    private int playListId;
    private int trackId;

    private PlayListTrack() {
    }

    public int getPlayListId() {
        return playListId;
    }

    public int getTrackId() {
        return trackId;
    }

    public enum Column implements IColumn {
        PlaylistId,
        TrackId
    }

    public static final class Builder {

        private int playListId;
        private int trackId;

        public Builder() {
        }

        public Builder setPlayListId(int playListId) {
            this.playListId = playListId;
            return this;
        }

        public Builder setTrackId(int trackId) {
            this.trackId = trackId;
            return this;
        }

        public PlayListTrack build() {
            PlayListTrack playListTrack = new PlayListTrack();
            playListTrack.playListId = playListId;
            playListTrack.trackId = trackId;
            return playListTrack;
        }
    }
}
