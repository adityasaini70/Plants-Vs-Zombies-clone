package sample;

import javafx.animation.AnimationTimer;
import javafx.scene.image.ImageView;

import java.util.TimerTask;

public class TranslatePea extends TimerTask {
    double speed;
    AnimationTimer t;
    ImageView a;

    TranslatePea(ImageView a, int speed){
        this.a = a;
        this.speed = speed;
    }

    public void move(ImageView a) {
        t = new AnimationTimer() {
            @Override
            public void handle(long now) {
                a.setLayoutX(a.getLayoutX() + speed);
//                System.out.println(a.getLayoutY());
            }
        };
        t.start();
    }
    @Override
    public void run() {
        try{
            move(a);
        }catch (Exception e){

        }

    }
}
