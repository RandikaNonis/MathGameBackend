package com.mathgame.game.repository;

import com.mathgame.game.Request.InsertData;
import com.mathgame.game.Request.UpdateRank;

public interface GameRepository {

    boolean insertUser(InsertData insertData);

    boolean updateRank(UpdateRank updateRank);

    InsertData getUserByUserName(String username);

    boolean login(String username, String paswsord);

}
