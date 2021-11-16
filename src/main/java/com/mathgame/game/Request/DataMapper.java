package com.mathgame.game.Request;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataMapper implements RowMapper<InsertData> {
    @Override
    public InsertData mapRow(ResultSet resultSet, int i) throws SQLException {
        InsertData insertData = new InsertData();
        insertData.setUsername(resultSet.getString("username"));
        insertData.setFirstName(resultSet.getString("firstName"));
        insertData.setLastName(resultSet.getString("lastName"));
        insertData.setPassword(resultSet.getString("password"));
        insertData.setHighestScore(resultSet.getInt("highestScore"));
        insertData.setRank(resultSet.getInt("rank"));
        return insertData;
    }
}
