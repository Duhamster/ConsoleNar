package com.company;

public class Portal extends GameObjiect {
    public Portal(){
        look=" ❂ ";
        health=1;
    }
    @Override
    void isDamaged(int dmg, GameObjiect agressor){
        teleport = true;
        }
}
