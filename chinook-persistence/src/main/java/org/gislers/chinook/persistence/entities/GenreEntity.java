package org.gislers.chinook.persistence.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "genre", schema = "chinook")
public class GenreEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer genreId;

    private String name;

    public GenreEntity() {
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenreEntity{");
        sb.append("genreId=").append(genreId);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        GenreEntity genreEntity = (GenreEntity) o;

        return new EqualsBuilder()
                .append(genreId, genreEntity.genreId)
                .append(name, genreEntity.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(genreId)
                .append(name)
                .toHashCode();
    }
}
