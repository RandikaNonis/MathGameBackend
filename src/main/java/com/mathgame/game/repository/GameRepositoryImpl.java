package com.mathgame.game.repository;

import com.mathgame.game.Request.DataMapper;
import com.mathgame.game.Request.InsertData;
import com.mathgame.game.Request.UpdateRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GameRepositoryImpl implements GameRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean insertUser(InsertData insertData) {
        String sql = "INSERT INTO user(userName,firstName,lastName,password,highestScore,rank)VALUES (?,?,?,?,?,?)";

        int result = jdbcTemplate.update(sql, insertData.getUsername().toUpperCase(), insertData.getFirstName(),
                insertData.getLastName(), insertData.getPassword().toUpperCase(), insertData.getHighestScore(),
                insertData.getRank());

        return result > 0;
    }

    @Override
    public boolean updateRank(UpdateRank updateRank) {
        String sql = "UPDATE USER SET RANK = RANK+1 WHERE USERNAME = ?";
        int result = jdbcTemplate.update(sql, updateRank.getUsername().toUpperCase());

        return result > 0;
    }

    @Override
    public InsertData getUserByUserName(String username) {
        String sql = "SELECT * FROM USER WHERE USERNAME = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{username.toUpperCase()}, new DataMapper());
    }

    @Override
    public boolean login(String username, String password) {
        String sql = "SELECT * FROM USER WHERE USERNAME = ? AND PASSWORD = ?";
        jdbcTemplate.queryForObject(sql, new Object[]{username.toUpperCase(),
                password.toUpperCase()}, new DataMapper());
        return true;
    }

}
