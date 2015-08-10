package org.gislers.chinook.dao.model;

public class Genre {

    private int genreId;
    private String genreName;

    private Genre() {
    }

    public int getGenreId() {
        return genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public enum Column implements IColumn {
        GenreId,
        Name
    }

    public static final class Builder {

        private int genreId;
        private String genreName;

        public Builder() {
        }

        public Builder setGenreId(int genreId) {
            this.genreId = genreId;
            return this;
        }

        public Builder setGenreName(String genreName) {
            this.genreName = genreName;
            return this;
        }

        public Genre build() {
            Genre genre = new Genre();
            genre.genreId = genreId;
            genre.genreName = genreName;
            return genre;
        }
    }
}

