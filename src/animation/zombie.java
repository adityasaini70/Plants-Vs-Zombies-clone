package animation;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Collection;


public class zombie extends Application {
    javafx.scene.image.Image img_1 = new javafx.scene.image.Image(zombie.class.getResource("zombie_1.jpg").toString());
    javafx.scene.image.Image img_2 = new javafx.scene.image.Image(zombie.class.getResource("zombie_2.jpg").toString());
    Group Zombie;
    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageView z_1 = new ImageView(img_1);
        ImageView z_2 = new ImageView( img_2);
        Zombie = new Group(z_1);
        Timeline t = new Timeline();

        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(Duration.millis(500),(ActionEvent event)->{
        Zombie.getChildren().setAll( z_2);
        }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(1000),(ActionEvent event)->{
            Zombie.getChildren().setAll( z_1);
        }));
        t.play();
primaryStage.setScene(new Scene(Zombie,100,200));
primaryStage.setResizable(false);
primaryStage.show();

    }
}
