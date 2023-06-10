package helloapp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Kalkulator1 {
    private Stage stage;
    
    Kalkulator1(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Label label1 = new Label("Kalkulator Perkalian");
        label1.setStyle("-fx-font-family: Verdana; -fx-font-size: 20px; -fx-text-fill: white;");
        Label label2= new Label("Hasil");
        label2.setStyle("-fx-font-family: Verdana; -fx-font-size: 16px; -fx-text-fill: white;");
        Label label3= new Label();
        label3.setStyle("-fx-font-family: Verdana; -fx-font-size: 16px; -fx-text-fill: white;");
        

        TextField textField1 = new TextField("input 1");
        textField1.setStyle("-fx-background-radius: 5;");
        TextField textField2 = new TextField("input 2");
        textField2.setStyle("-fx-background-radius: 5;");


        
        Button buttonClear = new Button("Clear");
        buttonClear.setOnAction(V ->{
            Kalkulator1 kalkulator1 = new Kalkulator1(stage);
            kalkulator1.show();
        });
        buttonClear.setStyle("-fx-font-family: Tahoma; -fx-font-size: 16px; -fx-background-color: grey; -fx-text-fill: white;");
        buttonClear.setPrefWidth(125);
        buttonClear.setPrefHeight(30);
        Button buttonCalculate = new Button("Calculate");
        buttonCalculate.setOnAction(v -> {
            int input1 = Integer.parseInt(textField1.getText());
            int input2 = Integer.parseInt(textField2.getText()); 
            int hasil = input1 * input2;
            String hasilText = String.valueOf(hasil);
            label3.setText(hasilText);
            
        });
        buttonCalculate.setStyle("-fx-font-family: Tahoma; -fx-font-size: 16px; -fx-background-color: gold; -fx-text-fill: white;");
        buttonCalculate.setPrefWidth(125);
        buttonCalculate.setPrefHeight(30);
        Button buttonBackHome = new Button("Back to Home");
        buttonBackHome.setOnAction(V ->{
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });
        buttonBackHome.setStyle("-fx-font-family: Tahoma; -fx-font-size: 16px; -fx-background-color: white; -fx-text-fill: black; -fx-border-color: black");
        buttonBackHome.setPrefWidth(250);
        buttonBackHome.setPrefHeight(20);
        HBox hBox = new HBox();
        hBox.getChildren().add(buttonClear);
        hBox.getChildren().add(buttonCalculate);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(label1, 1, 1);
        gridPane.add(textField1,1,2);
        gridPane.add(textField2, 1,3);
        gridPane.add(label2,1,4);
        gridPane.add(label3,1,5);
        gridPane.add(hBox, 1, 6);
        gridPane.add(buttonBackHome,1,7);
        gridPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(gridPane,350, 600);
        gridPane.setStyle("-fx-background-color: black;");
        stage.setScene(scene);
        stage.show();
    }
}
