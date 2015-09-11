package org.gislers.chinook.persistence.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "mediaType", schema = "chinook")
public class MediaTypeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer mediaTypeId;
    private String  name;

    public MediaTypeEntity() {
    }

    public Integer getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(Integer mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MediaTypeEntity{");
        sb.append("mediaTypeId=").append(mediaTypeId);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MediaTypeEntity mediaTypeEntity = (MediaTypeEntity) o;

        return new EqualsBuilder()
                .append(mediaTypeId, mediaTypeEntity.mediaTypeId)
                .append(name, mediaTypeEntity.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(mediaTypeId)
                .append(name)
                .toHashCode();
    }
}
