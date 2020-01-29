package com.company;

public class GameObjiect {
    String look;
    String msg;
boolean teleport = false;
    public GameObjiect(
    ) {
        dmg = 0;
        msg = "";
        look = "_";
        live = true;
    }
    int dmg;
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
