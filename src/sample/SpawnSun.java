package sample;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class SpawnSun extends TimerTask {
    int score = 0;
    int speed;
    AnchorPane pane;
    Random random = new Random();
    ImageView s;
    SpawnSun(int speed, AnchorPane pane){
        this.speed = speed;
        this.pane = pane;
    }

    public void spawn(AnchorPane pane){
//        try {
            System.out.println("Helllllo");
            int x = random.nextInt(600) + 200;
            int y = 100;
            System.out.println(x + " " + y);
            s = new ImageView(new Image(String.valueOf(this.getClass().getResource("sun.gif"))));
            s.setLayoutY(y);
            s.setLayoutX(x);
            pane.getChildren().addAll(s);

            Timer t = new Timer();
            Translate_SunToken tr = new Translate_SunToken(s, 2);
            t.schedule(tr, 0);

            //Event handler for sun

            s.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Level1.score+=25;
                    System.out.println(Level1.score);
                    s.setVisible(false);
                }
            });
    }
    @Override
    public void run() {
        spawn(pane);
    }
}
