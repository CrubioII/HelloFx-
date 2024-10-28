package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myC;
    private double x;
    private double y;
    public void up(ActionEvent e){
    System.out.println("up");
    myC.setCenterY(y-=10);
    }

    public void down(ActionEvent e){
        System.out.println("down");
        myC.setCenterY(y+=10);
    }
    public void right(ActionEvent e){
        myC.setCenterX(x+=10);
        System.out.println("right");
    }
    public void left(ActionEvent e){
        myC.setCenterX(x-=10);
        System.out.println("left");
    }

}