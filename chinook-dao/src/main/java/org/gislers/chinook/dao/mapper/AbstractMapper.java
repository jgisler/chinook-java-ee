package org.gislers.chinook.dao.mapper;

import org.gislers.chinook.dao.model.IColumn;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public abstract class AbstractMapper<T> implements RowMapper<T> {

    @Override
    public abstract T mapRow( ResultSet resultSet, int i ) throws SQLException;

    int getInt( ResultSet rs, IColumn column ) throws SQLException {
        return rs.getInt(column.name());
    }

    String getString( ResultSet rs, IColumn column ) throws SQLException {
        return rs.getString(column.name());
    }

    Date getDate( ResultSet rs, IColumn column ) throws SQLException {
        return rs.getDate(column.name());
    }

    Timestamp getTimestamp( ResultSet rs, IColumn column ) throws SQLException {
        return rs.getTimestamp(column.name());
    }
}
