package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        Scene scene = new Scene(root, 600,600,Color.LAVENDERBLUSH);
        Image icon = new Image("img.png");
        primarystage.getIcons().add(icon);

        Text text = new Text();
        text.setText("aaa!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.WHITE);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(50);
        line.setStroke(Color.GRAY);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLANCHEDALMOND);
        rectangle.setRotate(-5);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(200.1,200.2, 300.0,300.0, 200.0 , 200.2);
        triangle.setFill(Color.BURLYWOOD);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(78);
        circle.setFill(Color.ORANGE);

        Image pizza = new Image("img_1.png");
        ImageView imageView = new ImageView(pizza);
        imageView.setX(45);
        imageView.setY(78);

        root.getChildren().add(imageView);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(text);
        //preguntar pq no puede estar en la carpeta que creé de rescursos





        primarystage.setScene(scene);
        primarystage.show();
    }

}