package com.company;

public class GameObjiect {
    String look;
boolean teleport = false;
    public GameObjiect(
    ) {
        look = "_";
        live = true;
    }

    int health;
    boolean live;

    void isDamaged(int dmg, GameObjiect agressor) {
        health = health - dmg;
        if (health <= 0) {
            live = false;
            look = "";
        }
    }

    void vzaimodeist() {
    }
}
