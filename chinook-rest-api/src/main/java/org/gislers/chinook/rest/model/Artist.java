package org.gislers.chinook.rest.model;

import org.gislers.chinook.persistence.respositories.entities.ArtistEntity;

/**
 * Created by:   jgisle
 * Created date: 9/8/15
 */
public class Artist {

    private int id;
    private String name;

    public Artist() {
    }

    public Artist( ArtistEntity artistEntity ) {
        this.id = artistEntity.getArtistId();
        this.name = artistEntity.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
