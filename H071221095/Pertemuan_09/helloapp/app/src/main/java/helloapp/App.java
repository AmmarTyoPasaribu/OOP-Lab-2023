
package helloapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class App extends Application{

    
        public static void main(String[] args){
            Application.launch(args);
        }
    
    @Override
    public void start(Stage stage) {
        
        VBox vbox = new VBox();
       
        Label tittle = new Label ("Kalkulator Xisals");
        // tittle.getStyleClass().add("tittle");
        tittle.setFont(Font.font("Times New Roman",35));
        vbox.setStyle("-fx-background-color: #FFFAF0;");
        vbox.getChildren().add(tittle);
        vbox.setSpacing(22.0);

        // // Image logo = new Image(getClass().getClassLoader().getResourceAsStream("/image/timbangan.png"));
        ImageView logoCal = new ImageView("/image/kalkulator.jpg");
        logoCal.setFitWidth(260);
        logoCal.setFitHeight(262);
        logoCal.setPreserveRatio(true);
        logoCal.setId("logo");
        VBox.setMargin(logoCal,new Insets(40,185, 10, 185));

        
        

        Button startButton = new Button("Mulai");
        // startButton.getStyleClass().add("startButton");
        vbox.getChildren().addAll(logoCal,startButton);
        vbox.setAlignment(Pos.CENTER);
        startButton.setOnAction(action -> {
            // Seluruh kode diantara {} disini akan dijalankan / dieksekusi ketika button sedang di click.
                tampilkanScen1(stage);
        });
        


        Scene scene = new Scene(vbox,320, 512);
        
        stage.setScene(scene);
        stage.setTitle("Pertemuan9");
        stage.show();
    }


    public void tampilkanScen1(Stage stage){
        VBox vbox = new VBox();
        Label judul = new Label ("Pilih Kalkulator");
        judul.setFont(Font.font("Times New Roman",20));
        vbox.setStyle("-fx-background-color: #FFFAF0;");
        vbox.getChildren().add(judul);
        vbox.setSpacing(12.0);

        Button kalkulator1 = new Button("Kalkulator BMI");
        vbox.getChildren().add(kalkulator1);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);
        kalkulator1.setOnAction(action -> {
            // Seluruh kode diantara {} disini akan dijalankan / dieksekusi ketika button sedang di click.
                kalkulatorBMI(stage);
        });

        Button kalkulator2 = new Button("Kalkulator kalori");
        vbox.getChildren().add(kalkulator2);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);
        kalkulator2.setOnAction(action -> {
            // Seluruh kode diantara {} disini akan dijalankan / dieksekusi ketika button sedang di click.
                gender(stage);
        });

        

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void kalkulatorBMI(Stage stage){
        

        Label judul1 = new Label("KALKULATOR BMI");
        judul1.setFont(Font.font("Times New Roman",20));

        TextField tfBerat = new TextField();
        tfBerat.setPromptText("Berat badan"); //bayangan
        TextField tfTinggi = new TextField();
        tfTinggi.setPromptText("Tinggi badan");

        Button buttonCalculate = new Button("Calculate");

        Label labelHasil = new Label();
        Button buttonBack = new Button("Kembali");
        buttonBack.setOnAction(v->{
            tampilkanScen1(stage);
        });
        buttonCalculate.setOnAction(v->{
            double tinggi= Double.parseDouble(tfTinggi.getText());
            tinggi=tinggi/100;
            double berat= Double.parseDouble(tfBerat.getText());
            double hasil = berat/(tinggi*tinggi);
            labelHasil.setText(String.format("%f", hasil));

            String result;
        if (hasil < 18.5) {
            result = "Berat badan kurang proporsional";
        } else if (hasil < 25) {
            result = "Berat badan normal ";
        } else if (hasil < 30) {
            result = " Berat badan berlebih (berpotensi obesitas)";
        } else {
            result = "Obesitas";
        }
            labelHasil.setText("BMI: " + String.format("%.1f", hasil) + " - " + result);
        });



        VBox vbox = new VBox(judul1, tfTinggi,tfBerat,buttonCalculate, labelHasil,buttonBack);
        vbox.setStyle("-fx-background-color: #FFFAF0;");
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        
        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void gender(Stage stage){

        Button perempuan = new Button("Perempuan");
        perempuan.setOnAction(v->{
            kalkulatorKaloriPerempuan(stage);
        });

        Button laki = new Button("Laki-Laki");
        laki.setOnAction(v->{
            kalkulatorKaloriLaki(stage);
        });

        Button back = new Button("Kembali");
        back.setOnAction(v->{
            tampilkanScen1(stage);
        });

        VBox vbox = new VBox(perempuan, laki,back);
        vbox.setStyle("-fx-background-color: #FFFAF0;");
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void kalkulatorKaloriPerempuan(Stage stage){

        Label judul2 = new Label("KALKULATOR KALORI");
        judul2.setFont(Font.font("Times New Roman",20));

        TextField tfBeratK = new TextField();
        tfBeratK.setPromptText("Berat badan dalam kg");
        TextField tfTinggiK = new TextField();
        tfTinggiK.setPromptText("Tinggi dalam cm");
        TextField tfUmurK = new TextField();
        tfUmurK.setPromptText("Umur dalam tahun");

        Button calculate1 = new Button("calculate");

        Label labelHasil1Label = new Label();
        calculate1.setOnAction(v->{
            double result = 447.6 + 9.25 * Double.parseDouble(tfBeratK.getText()) + 
            3.1 * Double.parseDouble(tfTinggiK.getText()) - 44.3 * Double.parseDouble(tfUmurK.getText()) * 1.375;
            
            labelHasil1Label.setText(String.valueOf(result));
        });
        Button buttonBack1 = new Button("Kembali");
        buttonBack1.setOnAction(v->{
            gender(stage);
        });
        
        VBox vbox = new VBox(judul2, tfBeratK, tfTinggiK, tfUmurK,calculate1, labelHasil1Label, buttonBack1);
        vbox.setStyle("-fx-background-color: #FFFAF0;");
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }

    public void kalkulatorKaloriLaki(Stage stage){

        Label judul2 = new Label("KALKULATOR KALORI");
        judul2.setFont(Font.font("Times New Roman",20));

        TextField tfBeratK = new TextField();
        tfBeratK.setPromptText("Berat badan dalam kg");
        TextField tfTinggiK = new TextField();
        tfTinggiK.setPromptText("Tinggi dalam cm");
        TextField tfUmurK = new TextField();
        tfUmurK.setPromptText("Umur dalam tahun");


        Button calculate1 = new Button("calculate");
        

        Label labelHasil1Label = new Label();
        calculate1.setOnAction(action -> {
            double result = 88.4 + 13.4 * Double.parseDouble(tfBeratK.getText()) +
                4.8 * Double.parseDouble(tfTinggiK.getText()) - 5.68 * Double.parseDouble(tfUmurK.getText()) * 1.55;
            
            labelHasil1Label.setText(String.valueOf(result));
        });

        Button buttonBack1 = new Button("Kembali");
        buttonBack1.setOnAction(v->{
            gender(stage);
        });

        VBox vbox = new VBox(judul2, tfBeratK, tfTinggiK, tfUmurK,calculate1, labelHasil1Label, buttonBack1);
        vbox.setStyle("-fx-background-color: #FFFAF0;");
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 320, 512);
        stage.setScene(scene);
        stage.show();
    }
}
