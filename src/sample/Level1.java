package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Level1 implements Initializable {

    ArrayList<Zombie> zombies = new ArrayList<Zombie>();
    ArrayList<Plant> plants = new ArrayList<Plant>();
    Random random = new Random();
    public static int score = 0;
    Lawn area;
    int no_level = 1;
    int no_zombies;

    public Level1(){
        no_level = 1;
        no_zombies = no_level*2;
    }

//
//    public void spawnSunTokens(AnchorPane pane){
//        float x = random.nextInt(600)*(random.nextFloat()) + 200;
//        float y = 0;
//
//        ImageView s = new ImageView(new Image(String.valueOf(this.getClass().getResource("sun.gif"))));
//        s.setLayoutY(0);
//        s.setLayoutX(x);
//
//        pane.getChildren().add(s);
//    }
@FXML
private ImageView zombie;

    @FXML
    private ImageView zombie1;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        SpawnSun sun = new SpawnSun(1,window);
        sun.spawn(window);

        new Timer().schedule(
                new TimerTask() {

                    @Override
                    public void run() {
                        int x = random.nextInt(600) + 200;
                        int y = 100;
                        sun.s.setVisible(true);
                        sun.s.setLayoutY(y);
                        sun.s.setLayoutX(x);
                    }
                }, 0, 10000);


        new Timer().schedule(
                new TimerTask() {

                    @Override
                    public void run() {
                        Timer timer = new Timer();
                        Timer timer1 = new Timer();
                        Translate_Zombie x = new Translate_Zombie(zombie,4,0.1);
                        Translate_Zombie x1 = new Translate_Zombie(zombie1,4,0.1);

                        timer.schedule(x,0);
                        timer.schedule(x1,0);
                    }
                }, 0, 10000);






































        // Shooter event handlers
        shooters.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Dragboard db = shooters.startDragAndDrop(TransferMode.ANY);
                ClipboardContent cb = new ClipboardContent();
                cb.putImage(shooters.getImage());
                cb.putString("shooter");
                cb.putImage(shooters.getImage());
                db.setContent(cb);
                event.consume();
            }
        });

//        shooters.setOnDragDetected(event -> {
//            Dragboard db = shooters.startDragAndDrop(TransferMode.ANY);
//            ClipboardContent cb = new ClipboardContent();
////            cb.putImage(shooters.getImage());
//            cb.putString("shooter");
//            cb.putImage(shooters.getImage());
//            db.setContent(cb);
//            event.consume();
//        });


        // Imageviews ("Boxes") event handler
        box1.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box1.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            System.out.println(score);
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score-=100;
                box1.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box1.getLayoutX(),box1.getLayoutY());
            }
        });


        box2.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box2.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score -=100;
                box2.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box2.getLayoutX(),box2.getLayoutY());
            }
        });



        box3.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box3.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score -=100;
                box3.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box3.getLayoutX(),box3.getLayoutY());
            }
        });




        box4.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box4.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score -=100;
                box4.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box4.getLayoutX(),box4.getLayoutY());
            }
        });



        box5.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box5.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score -=100;
                box5.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box5.getLayoutX(),box5.getLayoutY());
            }
        });



        box6.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box6.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score -=100;
                box6.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box6.getLayoutX(),box6.getLayoutY());
            }
        });




        box7.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box7.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score -=100;
                box7.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box7.getLayoutX(),box7.getLayoutY());
            }
        });




        box8.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box8.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score -=100;
                box8.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box8.getLayoutX(),box8.getLayoutY());
            }
        });

        box9.setOnDragOver(event -> {
            if(event.getDragboard().hasImage()){
                event.acceptTransferModes(TransferMode.ANY);
            }
        });
        box9.setOnDragDropped(event -> {
            ImageView i = new ImageView();
            if(event.getDragboard().getString().equals("shooter")&&score>=100){
                score -=100;
                box9.setImage(new Image(String.valueOf(this.getClass().getResource("pea_shooter.gif"))));
                Pea x = new Pea(2);
                x.spawn(window,box9.getLayoutX(),box9.getLayoutY());
            }
        });

    }

//    @FXML
//    public TextArea text;


    @FXML
    private AnchorPane window;

    @FXML
    private ImageView box9;

    @FXML
    private ImageView box7;

    @FXML
    private ImageView box8;

    @FXML
    private ImageView box5;

    @FXML
    private ImageView box6;

    @FXML
    private ImageView box3;

    @FXML
    private ImageView box4;

    @FXML
    private ImageView box1;

    @FXML
    private ImageView box2;

    @FXML
    private ImageView shooters;

    public void event_options(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Level1.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
//        text.addNotify(new EventListener());
    }














}
