package helloapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage){
        this.stage = stage;
    }

    public void show() {
        Button buttonMulai = new Button("MULAI");
        buttonMulai.setOnAction(V -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });
        buttonMulai.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-text-fill: black; -fx-background-color: white");
        buttonMulai.setAlignment(Pos.CENTER);
        buttonMulai.setPrefWidth(200);
        buttonMulai.setPrefHeight(30);
        Label label = new Label("Kalkulator Sederhana");
        label.setStyle("-fx-font-family: Arial; -fx-font-size: 20px; -fx-text-fill: white");

        Image image = new Image("file:D:/kisspng-team-sport-basketball-logo-basquet-5b293f50839468.014962581529429840539.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(imageView,1,2);
        gridPane.add(label,1,4);
        gridPane.add(buttonMulai,1,5);
        gridPane.setAlignment(Pos.CENTER);      

        Scene scene = new Scene(new StackPane(gridPane), 350, 600);
        gridPane.setStyle("-fx-background-color: black;");
        stage.setScene(scene);
        stage.show();
    }
}
