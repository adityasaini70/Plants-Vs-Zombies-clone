package sample;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;

public class Level extends TimerTask {
    Random random = new Random();
    ArrayList<Zombie> zombies = new ArrayList<Zombie>();
    ArrayList<Plant> plants = new ArrayList<Plant>();
    Lawn area;
    int no_level;
    int no_zombies = no_level*2;
    public void spawnSunTokens(AnchorPane pane){
        float x = random.nextInt(600)*(random.nextFloat()) + 200;
        float y = 0;

        ImageView s = new ImageView(new Image(String.valueOf(this.getClass().getResource("sun.gif"))));
        s.setLayoutY(0);
        s.setLayoutX(x);

        pane.getChildren().add(s);

    }
    public void addZombies(){
        for(int i = 0;i<no_level;i++){
//            Zombie temp = new Zombie(no_level*2, no_level*2, );
        }
    }

    @Override
    public void run() {
//        spawnSunTokens(window);
    }
}
