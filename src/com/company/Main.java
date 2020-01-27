package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int damage = 1;
        GameObjiect[] level = new GameObjiect[10];
        level[0] = new Player();
        level[level.length - 1] = new Portal();
        for (int i = 1; i < level.length - 1; i++) {
            int a =(int)Math.round(Math.random()*20);
            if(a==4){
                level[i]=new Enemy();
            }
            else {
                level[i] = new Grass();
            }
        }
        while (!level[level.length - 1].teleport) {
            System.out.println("");
            for (int i = 0; i < level.length; i++) {
                if (level[i].live == true) {
                    System.out.print(level[i].look);
                }
            }
            for (int i = 1; i < level.length; i++) {
                if (level[i].live == true) {
                    int act = in.nextInt();
                    if (act == 1) {
                        level[i].isDamaged(damage, level[0]);
                    }
                    if (act == 2) {
                        level[i].vzaimodeist();
                    }
                    break;
                }
            }
        }
    }
}
