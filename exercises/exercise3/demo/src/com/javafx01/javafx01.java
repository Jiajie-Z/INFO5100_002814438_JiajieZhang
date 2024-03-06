package com.javafx01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.xml.namespace.QName;

public class javafx01 extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(@org.jetbrains.annotations.NotNull Stage stage) throws Exception {
        stage.setTitle("Basic Calculator");
        String name = "/calculator.fxml";
        Pane root = FXMLLoader.load(getClass().getResource(name));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
