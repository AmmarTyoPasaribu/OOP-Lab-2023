package kalkul;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage stage) {
            FirstScene firstScene = new FirstScene(stage);
            firstScene.showFirstScene();
            stage.setTitle("Booktify");
            stage.setResizable(false);
            stage.show();
        }
    }


