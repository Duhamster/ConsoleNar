package com.company;

public class GameObjiect {
    String look;
    String msg;
boolean teleport = false;
    public GameObjiect(
    ) {
        armor=0;
        health = 1;
        dmg = 0;
        msg = "";
        look = "_";
        live = true;
    }
    int dmg;
    int health;
    boolean live;
    int armor;

    void isDamaged(int dmg, GameObjiect agressor) {
       int dmg2 = dmg - armor;
       if(dmg2<0){dmg2=0;}
        health = health - dmg2;
        if (health <= 0) {
            death();
        }
    }
    void death(){
        live = false;
        look = "";
    }

    void vzaimodeist(GameObjiect subject) {
    }
}
