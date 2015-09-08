package org.gislers.chinook.rest.model;

/**
 * Created by:   jgisle
 * Created date: 9/8/15
 */
public class Album {

    private int id;
    private String name;
    private Artist artist;

    public Album() {
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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
