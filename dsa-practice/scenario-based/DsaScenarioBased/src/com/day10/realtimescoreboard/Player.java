package com.day10.realtimescoreboard;

public class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + " (" + score + ")";
    }
}
