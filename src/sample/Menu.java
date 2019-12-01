package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Menu {

    public void event_new(javafx.event.ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("Level1.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void event_exit(){
        System.exit(0);
    }

    public void event_load(){

    }

    public void event_choose_level(){

    }

}
