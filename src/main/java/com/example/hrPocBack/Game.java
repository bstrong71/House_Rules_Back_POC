package com.example.hrPocBack;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private String category;

    @Column
    private String objective;

    @Column
    private String original_rules;

    public Game() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getOriginal_rules() {
        return original_rules;
    }

    public void setOriginal_rules(String original_rules) {
        this.original_rules = original_rules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        return getId() == game.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", objective='" + objective + '\'' +
                ", original_rules='" + original_rules + '\'' +
                '}';
    }
}
