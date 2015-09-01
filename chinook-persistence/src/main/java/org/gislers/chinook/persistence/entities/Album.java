package org.gislers.chinook.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jim on 8/28/15.
 */
@Entity
public class Album extends BaseEntity {

    @Id
    @GeneratedValue
    private int albumId;
    private String title;
    private int artistId;

    public Album() {
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Album{");
        sb.append("albumId=").append(albumId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", artistId=").append(artistId);
        sb.append('}');
        return sb.toString();
    }
}
