package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
//    // TODO Auto-generated method stub
//    //Initialising path of the media file, replace this with your file path
//    String path = "C:\\Users\\ASUS\\Desktop\\Menu.mp3";
//
//    //Instantiating Media class
//    Media media = new Media(new File(path).toURI().toString());
//
//    //Instantiating MediaPlayer class
//    MediaPlayer mediaPlayer = new MediaPlayer(media);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        mediaPlayer.setAutoPlay(true);

        System.out.println("Initialized");

    }
//    public void tester(){
//        System.out.println("I was clicked !");
//    }

    public void changeScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

}
