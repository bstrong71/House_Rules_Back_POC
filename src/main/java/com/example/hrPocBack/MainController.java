package com.example.hrPocBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MainController {

    @Autowired
    GameRepository games;

    @PostMapping(path = "/api")
    public String testApi() {
        System.out.println("hit endpoint");
        return "working endpoint";
    }

    @PostMapping(path = "/api/game/new")
    public String newGame(@ModelAttribute Game game) {
        games.save(game);
        return "Ok";
    }

    @GetMapping(path = "/api/games")
    public List<Game> findGames() {
        List<Game> gameList = new ArrayList<>();
        games.findAll().forEach(game -> gameList.add(game));
        System.out.println("Successful get to endpoint");
        return gameList;
    }
}