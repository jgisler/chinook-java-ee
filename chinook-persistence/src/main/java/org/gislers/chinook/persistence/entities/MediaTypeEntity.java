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
@Table(name = "media_type", schema = "chinook")
public class MediaTypeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="media_type_id")
    private long mediaTypeId;

    private String  name;

    public MediaTypeEntity() {
    }

    public long getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(long mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
