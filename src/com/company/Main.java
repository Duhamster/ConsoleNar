package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GameObjiect[] level = new GameObjiect[40];
        level[0] = new Player();
        level[level.length - 1] = new Portal();
        for (int i = 1; i < level.length - 1; i++) {
            int a =(int)Math.round(Math.random()*(5+i));
            if(a<10&&a>7){
                level[i]=new Enemy();
            }
            else {
                if(a>35){
                    level[i]=new Knight();
                }
                else {
                    level[i] = new Grass();
                }
            }
        }
        while (!level[level.length - 1].teleport) {
            System.out.println("");
            if(level[0].live==false){
                break;
            }
            for (int i = 0; i < level.length; i++) {
                if (level[i].live == true) {
                    System.out.print(level[i].look);
                }
            }
            for (int i = 1; i < level.length; i++) {
                if (level[i].live == true) {
                    System.out.println("");
                    System.out.println(level[i].msg);
                    System.out.println(" Ваши жизни: "+ level[0].health+" Ваш урон: "+level[0].dmg+" Ваша броня: "+ level[0].armor + " Урон существа: "+level[i].dmg+" Жизни существа: "+level[i].health+ " Броня существа: " + level[i].armor);
                    int act = in.nextInt();
                    if (act == 1) {
                        level[i].isDamaged(level[0].dmg, level[0]);
                    }
                    if (act == 2) {
                        level[i].vzaimodeist(level[0]);
                    }
                    break;
                }
            }
        }
    }
}
