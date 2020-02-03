package com.company;

public class Player extends GameObjiect{
    public Player(){
        dmg=1;
        look="\uD83D\uDE0E";
        health=10;
    }
    @Override
    void isDamaged(int dmg, GameObjiect agressor) {
        int dmg2 = dmg - armor;
        if(dmg2<0){dmg2=0;}
        health = health-dmg2;
        if (health <= 0) {
            System.out.println("Потрачено");
            death();
        }
    }

}
