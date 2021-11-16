package com.mathgame.game.services;

import com.mathgame.game.Request.InsertData;

public interface GameService {

    String insertUser(InsertData insertData);

    InsertData getUserByUserName(String username);

    boolean login(String username, String paswsord);

}
