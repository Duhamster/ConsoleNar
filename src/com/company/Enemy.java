package com.company;

public class Enemy extends GameObjiect {
    public Enemy(){
        dmg=1;
        look="{'-'}";
        health=3;
        msg="Перед вами рядовой враг. Он не силён и не умён. Единственный способ взаимодействия - запугать своей силой";
    }
    @Override
    void isDamaged(int dmg, GameObjiect agressor) {
        health = health - dmg;
        agressor.isDamaged(this.dmg,agressor);
        if (health <= 0) {
            agressor.dmg++;
            live = false;
            look = "";
        }
    }
}
