package animation;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;

public class peashooter extends Application {
    javafx.scene.image.Image img_1 = new javafx.scene.image.Image(zombie.class.getResource("ps_1.jpg").toString());
    javafx.scene.image.Image img_2 = new javafx.scene.image.Image(zombie.class.getResource("ps_2.jpg").toString());
    javafx.scene.image.Image img_3 = new javafx.scene.image.Image(zombie.class.getResource("ps_3.jpg").toString());
    javafx.scene.image.Image img_4 = new javafx.scene.image.Image(zombie.class.getResource("ps_4.jpg").toString());
    javafx.scene.image.Image img_5 = new javafx.scene.image.Image(zombie.class.getResource("ps_5.jpg").toString());
    javafx.scene.image.Image img_6 = new javafx.scene.image.Image(zombie.class.getResource("ps_6.jpg").toString());
    javafx.scene.image.Image img_7 = new javafx.scene.image.Image(zombie.class.getResource("ps_7.jpg").toString());
    javafx.scene.image.Image img_8 = new javafx.scene.image.Image(zombie.class.getResource("ps_8.jpg").toString());
    javafx.scene.image.Image img_9 = new javafx.scene.image.Image(zombie.class.getResource("ps_9.jpg").toString());
    javafx.scene.image.Image img_10 = new javafx.scene.image.Image(zombie.class.getResource("ps_10.jpg").toString());
    javafx.scene.image.Image img_11 = new javafx.scene.image.Image(zombie.class.getResource("ps_11.jpg").toString());
    javafx.scene.image.Image img_12 = new javafx.scene.image.Image(zombie.class.getResource("ps_12.jpg").toString());
    javafx.scene.image.Image img_13 = new javafx.scene.image.Image(zombie.class.getResource("ps_13.jpg").toString());

    Group shooters;
    @Override
    public void start(Stage stage) {
        ImageView z_1 = new ImageView(img_1);
        ImageView z_2 = new ImageView(img_2);
        ImageView z_3 = new ImageView(img_3);
        ImageView z_4 = new ImageView(img_4);
        ImageView z_5 = new ImageView(img_5);
        ImageView z_6 = new ImageView(img_6);
        ImageView z_7 = new ImageView(img_7);
        ImageView z_8 = new ImageView(img_8);
        ImageView z_9 = new ImageView(img_9);
        ImageView z_10 = new ImageView(img_10);
        ImageView z_11= new ImageView(img_11);
        ImageView z_12 = new ImageView(img_12);
        ImageView z_13= new ImageView(img_13);

        shooters = new Group(z_1);
        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(Duration.millis(100),(ActionEvent event)->{
            shooters.getChildren().setAll( z_2);
        }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(200),(ActionEvent event)->{
            shooters.getChildren().setAll( z_3);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(300),(ActionEvent event)->{
            shooters.getChildren().setAll( z_4);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(400),(ActionEvent event)->{
            shooters.getChildren().setAll( z_5);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(500),(ActionEvent event)->{
            shooters.getChildren().setAll( z_6);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(600),(ActionEvent event)->{
            shooters.getChildren().setAll( z_7);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(700),(ActionEvent event)->{
            shooters.getChildren().setAll( z_8);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(800),(ActionEvent event)->{
            shooters.getChildren().setAll( z_9);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(900),(ActionEvent event)->{
            shooters.getChildren().setAll( z_10);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(1000),(ActionEvent event)->{
            shooters.getChildren().setAll( z_11);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(1100),(ActionEvent event)->{
            shooters.getChildren().setAll( z_12);
        })); t.getKeyFrames().add(new KeyFrame(Duration.millis(1200),(ActionEvent event)->{
            shooters.getChildren().setAll( z_13);
        }));
        t.play();
        stage.setScene(new Scene(shooters,400,400));
//        stage.setResizable(false);
        stage.show();
    }

}