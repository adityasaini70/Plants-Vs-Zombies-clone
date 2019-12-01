package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

//import javax.swing.text.html.ImageView;
import java.io.File;
import java.util.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Game implements Initializable{
//    ExecutorService executor = Executors.newFixedThreadPool(2);
    @FXML
    private ImageView im;


    @FXML
    private ImageView shooters;

    @FXML
    private ImageView barriers;

    @FXML
    private ImageView sunflower;

    @FXML
    private ImageView bombs;

    @FXML
    private ImageView sun;

    @FXML
    private ImageView zombie;

    @FXML
    private ImageView zombie1;

    @FXML
    private ImageView zombie2;
//    zomb.
    @FXML
    private HBox master;
    @FXML
    VBox home;
    public void event_options(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("IngameMenu.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
//
//    @FXML
//    void handleDrag(MouseEvent event) {
//        Dragboard db = shooters.startDragAndDrop(TransferMode.ANY);
//        ClipboardContent cb = new ClipboardContent();
//        cb.putImage(shooters.getImage());
//        db.setContent(cb);
//        event.consume();
//    }
//
//    void generic_handleDrag(MouseEvent event, ImageView a){
//        Dragboard db = shooters.startDragAndDrop(TransferMode.ANY);
//        ClipboardContent cb = new ClipboardContent();
//        cb.putImage(shooters.getImage());
//        db.setContent(cb);
//        event.consume();
//
//    }
//    public void AddZombie(){
//        transferModes
//    }

//    public void moveZombie(){
//        GridPane x = new GridPane();
//        x.set
//        Rectangle2D viewportRect = new Rectangle2D(40, 35, 110, 110);
////        TranslateTransition transition = new TranslateTransition();
////        transition.setNode(rect);
////
////        transition.setDuration(Duration.INDEFINITE);

    ////        transit
//    class Test extends TimerTask {
//        void print() {
//            AnimationTimer t = new AnimationTimer() {
//                @Override
//                public void handle(long now) {
//                    System.out.println("DSad");
//                }
//            };
//            t.start();
//        }
//
//        @Override
//        public void run() {
//            print();
//        }
//}
//    Test x = new Test(t);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        System.out.println("DSA");
        Timer timer = new Timer();
        Timer timer1 = new Timer();
        Translate_Zombie x = new Translate_Zombie(zombie,4,2);
        Translate_Zombie x1 = new Translate_Zombie(zombie1,4,2);

        Translate_SunToken x2 = new Translate_SunToken(sun,2);
        timer.schedule(x,0);
        timer.schedule(x1,0);
        timer.schedule(x2,0);



        // Event handlers for plants
        shooters.setOnDragDetected(event -> {
            System.out.println("shoooooooooooooooot");
            Dragboard db = shooters.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(shooters.getImage());
            cb.putString("shooter");
            db.setContent(cb);
            event.consume();
        });

        barriers.setOnDragDetected(event -> {
            System.out.println("barrieeeeeeeeeeeeeeeeeeeerrrr");
            Dragboard db = barriers.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(barriers.getImage());
            db.setContent(cb);
            event.consume();
        });

        sunflower.setOnDragDetected(event -> {
            System.out.println("sunnnnnnnnnyyyyy");
            Dragboard db = sunflower.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(sunflower.getImage());
            db.setContent(cb);
            event.consume();
        });

        bombs.setOnDragDetected(event -> {
            Dragboard db = bombs.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(bombs.getImage());
            db.setContent(cb);
            event.consume();
        });

    im.setOnDragOver(event -> {
        if(event.getDragboard().hasImage()){
            event.acceptTransferModes(TransferMode.ANY);
        }
    });
    im.setOnDragOver(event -> {
        ImageView i = new ImageView();

        if(event.getDragboard().getString().equals("shooter")){
            im.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));

        }
    });
        //Event handler for vboxes


//        while(true){
//
//        }
//
//        timer.
//        timer.schedule(x, 5000);
//        timer1.schedule(x1, 5000);
//        if(zombie.getLayoutX()X()<300){
//
//        }
//        Parallel_Zombie p1 = new Parallel_Zombie(timer, x);
//        Parallel_Zombie p2 = new Parallel_Zombie(timer1, x1);
//        executor.execute(p1);
//        executor.execute(p2);
//        if(zombie1.getLayoutX()<100){
//            executor.shutdownNow();;
//        }
    }
}

//class Parallel_Zombie implements Runnable{
//    Timer t;
//    Translate_Zombie z;
//    Parallel_Zombie(Timer t, Translate_Zombie z){
//        this.t = t;
//        this.z = z;
//    }
//
//    @Override
//    public void run() {
//        while(!Thread.currentThread().isInterrupted()){
//            t.schedule(z, 5000);
//        }
//    }
//}