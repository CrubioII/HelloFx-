package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application  {



    public static void main(String[] args) {


        launch(args);
    }
    @Override
    public void start(Stage primarystage) throws Exception {
        //Stage stage = new Stage();

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        Image icon = new Image("img.png");
        //preguntar pq no puede estar en la carpeta que creé de rescursos
        primarystage.getIcons().add(icon);
        primarystage.setWidth(420);
        primarystage.setHeight(420);
        primarystage.setFullScreen(true);
        primarystage.setFullScreenExitHint("Press Q");
        primarystage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        primarystage.setTitle("titulo");

        primarystage.setScene(scene);
        primarystage.show();
    }

}