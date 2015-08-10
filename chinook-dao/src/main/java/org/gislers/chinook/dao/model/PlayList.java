package org.gislers.chinook.dao.model;

public class PlayList {

    private int playListId;
    private String playListName;

    private PlayList() {
    }

    public int getPlayListId() {
        return playListId;
    }

    public String getPlayListName() {
        return playListName;
    }

    public enum Column implements IColumn {
        PlaylistId,
        Name
    }

    public static final class Builder {

        private int playListId;
        private String playListName;

        public Builder() {
        }

        public Builder setPlayListId(int playListId) {
            this.playListId = playListId;
            return this;
        }

        public Builder setPlayListName(String playListName) {
            this.playListName = playListName;
            return this;
        }

        public PlayList build() {
            PlayList playList = new PlayList();
            playList.playListId = playListId;
            playList.playListName = playListName;
            return playList;
        }
    }
}
