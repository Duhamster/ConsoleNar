package com.company;

public class Enemy extends GameObjiect {
    public Enemy(){
        int i =(int)Math.random()*10;
        if(i<7) {
            dmg = 1;
        }
        else{
            dmg = 2;
        }
        look=" (\uD83D\uDC40)";
        health=3;
        msg="Перед вами рядовой враг. Он не силён и не умён. Единственный способ взаимодействия - запугать своей силой";
    }
    @Override
    void isDamaged(int dmg, GameObjiect agressor) {
        int dmg2 = dmg - armor;
        if(dmg2<0){dmg2=0;}
        health = health-dmg2;
        agressor.isDamaged(this.dmg,agressor);
        if (health <= 0) {
            System.out.println("Вы убили незадачливого противника и забрали всю его амуницию. Урон увеличен на "+ this.dmg);
            agressor.dmg=agressor.dmg+this.dmg;
            death();
        }
    }
    @Override
    void vzaimodeist(GameObjiect subject) {
        int r = (int)(Math.random()*10);
        int i = (int)(Math.random()*10);
        double dmg1 = (double)subject.dmg;
        double dmg2 = (double)this.dmg;
        if((dmg1/(dmg2*5))*10>i) {
            death();
            if (i != 1) {
                System.out.println("Ваш враг убежал от страха. Испугался он Вашего оружия или Вас самих - неизвестно.");
            } else {
                System.out.println("Ваш враг погиб от страха, основав кирпичный завод. Вы забрали всю его амуницию. Урон увеличен на 1");
                subject.dmg = subject.dmg + this.dmg;
            }
        }
            else{
                subject.isDamaged(dmg*2,subject);
            }
        }
    }
