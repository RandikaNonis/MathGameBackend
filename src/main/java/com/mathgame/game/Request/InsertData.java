package com.mathgame.game.Request;

import lombok.Data;

@Data
public class InsertData {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private Integer highestScore;
    private Integer rank;
}
