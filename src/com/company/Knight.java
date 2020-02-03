package com.company;

public class Knight extends GameObjiect{
    public Knight(){
        int i =(int)Math.random()*10;
        if(i>7) {
            armor = 1;
            dmg = 2;
        }
        else{
            armor = 2;
            dmg = 3;
        }
        look=" [\uD83D\uDE29⇪";
        health=3;
        msg="Перед вами рыцарь. Его земельный участок забрал некий король и направил против вас. Вы можете предложить ему своё оружие(-2) для перепродажи и , возможно, он успокоится.";
    }
    @Override
    void isDamaged(int dmg, GameObjiect agressor) {
        int dmg2 = dmg - armor;
        if(dmg2<0){dmg2=0;}
        health = health-dmg2;
        agressor.isDamaged(this.dmg,agressor);
        if (health <= 0) {
            System.out.println("Вы убили рыцаря и забрали его броню");
            agressor.armor++;
            death();
        }
    }
    @Override
    void vzaimodeist(GameObjiect subject){
subject.dmg=subject.dmg-2;
if(subject.dmg<0){
    subject.dmg=0;
}
this.death();
    }
}
