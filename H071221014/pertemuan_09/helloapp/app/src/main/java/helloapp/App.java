package helloapp;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setResizable(false);
        primaryStage.setTitle("Kalkulator Sederhana");
        primaryStage.getIcons().add(new Image("D:/IMG Poster FILM/logo.png"));

        HomeScene initScene = new HomeScene(primaryStage);
        initScene.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}
