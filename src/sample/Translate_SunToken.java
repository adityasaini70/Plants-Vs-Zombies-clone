package sample;

import javafx.animation.AnimationTimer;
import javafx.scene.image.ImageView;

import java.util.TimerTask;

public class Translate_SunToken extends TimerTask {
    double speed;
    AnimationTimer t;
    ImageView a;
    public void move(ImageView a) {
        t = new AnimationTimer() {
            @Override
            public void handle(long now) {
                a.setLayoutY(a.getLayoutY() + speed);
//                System.out.println(a.getLayoutY());
            }
        };
        t.start();
    }

    Translate_SunToken(ImageView a, int speed){
        this.a = a;
        this.speed = speed;
    }

    @Override
    public void run() {
        try{
            move(a);
        }
        catch (Exception e){

        }
    }
}
