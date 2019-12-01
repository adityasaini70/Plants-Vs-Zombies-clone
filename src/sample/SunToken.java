package sample;

import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.TimerTask;

public class SunToken extends TimerTask {

    double speed;
    AnimationTimer t;
    ImageView a;
    SunToken(ImageView a, double speed){
        this.a = a;
        this.speed = speed;
    }
    public void move(ImageView a) {
        t = new AnimationTimer() {
            @Override
            public void handle(long now) {
                a.setLayoutY(a.getLayoutY() + speed);
//                System.out.println(a.getLayoutX());
            }
        };
        t.start();
    }
    @Override
    public void run() {
        move(a);
    }
}
