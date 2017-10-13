package com.example.hrPocBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "https://dry-forest-51238.herokuapp.com")
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
    public String newGame(@RequestBody Game game) {
        games.save(game);
        return "Ok";
    }

    @GetMapping(path = "/api/game/{id}")
    public Game findOneGame(@PathVariable("id") int id) {
        Game game = games.findOne(id);
        System.out.println(game);
        return game;
    }

    @GetMapping(path = "/api/games")
    public List<Game> findAllGames() {
        List<Game> gameList = new ArrayList<>();
        games.findAll().forEach(game -> gameList.add(game));
        System.out.println("Successful get to endpoint");
        return gameList;
    }
}