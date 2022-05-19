package com.example.memorygame;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/**
 * JavaFX App
 */
public class HelloApplication extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        URL url = new File("src/main/resources/com/example/memorygame/hello-view.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        stage.setTitle("Memory Game");
        stage.setScene(new Scene(root));

        stage.show(); // IMPORTANT
    }

    public static void main(String[] args) {
        launch();
    }

}



