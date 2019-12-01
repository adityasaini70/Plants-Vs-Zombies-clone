package sample;

public abstract class Plant {
    int health;
    String type;
    int attack_attribute;
    int defence_attribute;
    int waitingTime;
    int position_x;
    int position_y;
    int requiredLevel;

    public abstract void function(Zombie z);

}
