package sample;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.Timer;
import java.util.TimerTask;

public class Pea extends TimerTask {
    double speed;
    AnimationTimer t;
    ImageView a;
    Pea(double speed){
        this.speed = speed;
    }
    public void spawn(AnchorPane pane, double x, double y){
//        try {

        a = new ImageView(new Image(String.valueOf(this.getClass().getResource("Pea.png"))));
        a.setLayoutY(y);
        a.setLayoutX(x);
        pane.getChildren().addAll(a);

        Timer t = new Timer();
        TranslatePea tr = new TranslatePea(a, (int)speed);
        t.schedule(tr, 0);

    }

    @Override
    public void run() {
//        spawn();

//
    }
}
