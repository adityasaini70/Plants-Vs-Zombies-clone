package sample;

import javafx.animation.AnimationTimer;
import javafx.scene.image.ImageView;

import java.util.TimerTask;

public class Translate_Zombie extends TimerTask {
    int health;
    double speed;
    AnimationTimer t;

    public void move(ImageView a) {
        t = new AnimationTimer() {
            @Override
            public void handle(long now) {
                a.setLayoutX(a.getLayoutX() - speed);
//                System.out.println(a.getLayoutX());
            }
        };
        t.start();
    }
    Translate_Zombie(ImageView a, int health, double speed){
        this.a = a;
        this.health = health;
        this.speed = speed;
    }

    void kill(){
        t.stop();
        a.setVisible(false);
    }

    ImageView a;

    @Override
    public void run() {
        try{
            move(a);
        }
        catch (Exception e){

        }
    }

}