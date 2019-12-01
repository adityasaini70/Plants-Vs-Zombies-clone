package sample;

import java.awt.*;

public class Zombie {
    int attack_attribute;
    int defence_attribute;
    String type;
    int position_x;
    int position_y;
    int health;
    public Zombie(int attack_attribute, int defence_attribute, String s, int position_x, int position_y, int health){
        this.attack_attribute = attack_attribute;
        this.defence_attribute = defence_attribute;
        this.type = s;
        this.position_x = position_x;
        this.position_y = position_y;
        this.health = health;
    }
    public void attack(Plant p){
        p.health-=(this.attack_attribute);
    };
}
