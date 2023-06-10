package org.Kalkulator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;
    private Scene scene1, scene2, scene3;
    private TextField inputField;
    private Label resultLabel;
    private String calculationType;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        createScene1();
        createScene2();
        createScene3();

        primaryStage.setTitle("Simple JavaFX App");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private void createScene1() {
        Label nameLabel = new Label("Nama Aplikasi");

        Button startButton = new Button("Mulai");
        startButton.setOnAction(e -> primaryStage.setScene(scene2));

        VBox layout = new VBox(10);
        layout.getChildren().addAll(nameLabel, startButton);
        layout.setAlignment(Pos.CENTER);

        scene1 = new Scene(layout, 400, 300);
    }

    private void createScene2() {
        Label menuLabel = new Label("Menu Utama");
        Button cmToInchButton = new Button("Konversi CM ke Inch");
        Button celsiusToFahrenheitButton = new Button("Konversi Celcius ke Fahrenheit");

        cmToInchButton.setOnAction(e -> {
            primaryStage.setScene(scene3);
            setCalculationType("cmToInch");
        });

        celsiusToFahrenheitButton.setOnAction(e -> {
            primaryStage.setScene(scene3);
            setCalculationType("celsiusToFahrenheit");
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(menuLabel, cmToInchButton, celsiusToFahrenheitButton);
        layout.setAlignment(Pos.CENTER);

        scene2 = new Scene(layout, 400, 300);
    }

    private void createScene3() {
        Label calculationLabel = new Label();
        inputField = new TextField();
        Button clearButton = new Button("Clear");
        Button calculateButton = new Button("Calculate");
        Button backButton = new Button("Kembali ke Menu");

        resultLabel = new Label(); // Tambahkan inisialisasi resultLabel di sini

        clearButton.setOnAction(e -> inputField.clear());

        calculateButton.setOnAction(e -> {
            String input = inputField.getText();
            double result = 0.0;

            if (getCalculationType().equals("cmToInch")) {
                result = Double.parseDouble(input) * 0.393701;
            } else if (getCalculationType().equals("celsiusToFahrenheit")) {
                result = (Double.parseDouble(input) * 9 / 5) + 32;
            }

            resultLabel.setText("Hasil: " + result);
        });

        backButton.setOnAction(e -> primaryStage.setScene(scene1));

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(calculationLabel, 0, 0, 2, 1);
        gridPane.add(new Label("Input:"), 0, 1);
        gridPane.add(inputField, 1, 1);
        gridPane.add(clearButton, 0, 2);
        gridPane.add(calculateButton, 1, 2);
        gridPane.add(resultLabel, 0, 3, 2, 1);
        gridPane.add(backButton, 0, 4, 2, 1);

        scene3 = new Scene(gridPane, 400, 300);
    }


    private String getCalculationType() {
        return calculationType;
    }

    private void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }
}
