package com.day10.realtimescoreboard;

public class AVLNode {
	int key; // player score
    Player player;
    AVLNode left, right;
    int height;

    AVLNode(Player p) {
        this.key = p.score;
        this.player = p;
        this.height = 1;
    }
}
