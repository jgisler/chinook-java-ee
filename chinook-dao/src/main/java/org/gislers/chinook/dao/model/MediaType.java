package org.gislers.chinook.dao.model;

public class MediaType {

    private int mediaTypeId;
    private String mediaTypeName;

    private MediaType() {
    }

    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public String getMediaTypeName() {
        return mediaTypeName;
    }

    public enum Column implements IColumn {
        MediaTypeId,
        Name
    }

    public static final class Builder {

        private int mediaTypeId;
        private String mediaTypeName;

        public Builder() {
        }

        public Builder setMediaTypeId(int mediaTypeId) {
            this.mediaTypeId = mediaTypeId;
            return this;
        }

        public Builder setMediaTypeName(String mediaTypeName) {
            this.mediaTypeName = mediaTypeName;
            return this;
        }

        public MediaType build() {
            MediaType mediaType = new MediaType();
            mediaType.mediaTypeId = mediaTypeId;
            mediaType.mediaTypeName = mediaTypeName;
            return mediaType;
        }
    }
}
