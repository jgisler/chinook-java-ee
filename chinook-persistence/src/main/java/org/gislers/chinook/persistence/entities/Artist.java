package org.gislers.chinook.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jim on 8/29/15.
 */
@Entity
public class Artist extends BaseEntity {

    @Id
    @GeneratedValue
    private int artistId;

    private String name;

    public Artist() {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Artist{");
        sb.append("artistId=").append(artistId);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
