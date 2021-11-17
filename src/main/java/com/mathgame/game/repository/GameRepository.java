package com.mathgame.game.repository;

import com.mathgame.game.Request.InsertData;

public interface GameRepository {

    boolean insertUser(InsertData insertData);

    InsertData getUserByUserName(String username);

    boolean login(String username, String paswsord);

}
