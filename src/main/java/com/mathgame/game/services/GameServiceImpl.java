package com.mathgame.game.services;

import com.mathgame.game.Request.InsertData;
import com.mathgame.game.Request.UpdateRank;
import com.mathgame.game.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameRepository gameRepository;

    @Override
    public boolean insertUser(InsertData insertData) {
        return gameRepository.insertUser(insertData);
    }

    @Override
    public boolean updateRank(UpdateRank updateRank) {
        return gameRepository.updateRank(updateRank);
    }

    @Override
    public InsertData getUserByUserName(String username) {
        return gameRepository.getUserByUserName(username);
    }

    @Override
    public boolean login(String username, String paswsord) {
        return gameRepository.login(username, paswsord);
    }
}
