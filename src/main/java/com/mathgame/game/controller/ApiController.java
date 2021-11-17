package com.mathgame.game.controller;

import com.mathgame.game.Request.InsertData;
import com.mathgame.game.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/game")
public class ApiController {

    @Autowired
    private GameService gameService;

    @PostMapping("/insertUser")
    public boolean insertUser(@RequestBody InsertData insertData) {
        try {
            return gameService.insertUser(insertData);
        } catch (Exception ex) {
            return false;
        }
    }

    @GetMapping("/login/{username}/{password}")
    public boolean login(@PathVariable(value = "username") String username,
                         @PathVariable(value = "password") String password) {
        try {
            return gameService.login(username, password);
        } catch (Exception ex) {
            return false;
        }

    }

    @GetMapping("/getUserByUserName/{username}")
    public InsertData getUserByUserName(@PathVariable(value = "username") String username) {
        try {
            return gameService.getUserByUserName(username);
        } catch (Exception ex) {
            return null;
        }

    }

}
