package helloapp;

import java.math.RoundingMode;
import java.text.DecimalFormat;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class App extends Application {

    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        showFirstScene();
        stage.show();
    }

    private void showFirstScene(){
        Image img = new Image("kalkulator.png");
        ImageView imgview = new ImageView(img);
        imgview.setFitWidth(150);
        imgview.setFitHeight(150);
        
        Label l1 = new Label("My Calcu");
        l1.setId("namaApp");
        Button button = new Button("Mulai");
        button.setId("tombolMulai");
        button.setOnAction(action -> {
            
            showSecondScene();
            
        });
        VBox vbox1 = new VBox(imgview,l1,button);
        vbox1.setId("latarScene1");
       
        vbox1.setAlignment(Pos.CENTER);
        stage.setTitle("Kalkulator Sederhana");
        Scene scene1 = new Scene(vbox1, 360, 570, null);
        scene1.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene1);

        stage.show();

    }
    private void showSecondScene() {
        Label l2 = new Label("Pilih Menu");
        l2.setId("menuCalcu");

        Button button1 = new Button("Kalkulator Pythagoras");
        button1.setId("tombol1");
        button1.setOnAction(action -> {
            showThirdScene();
        });
        Button button2 = new Button("Kalkulator Konversi Suhu");
        button2.setId("tombol2");
        button2.setOnAction(action -> {
            showFourthScene();
        });
        
        VBox vbox2 = new VBox(l2,button1,button2);
        vbox2.setId("latarScene2");
        vbox2.setAlignment(Pos.TOP_CENTER);
        Scene scene2 = new Scene(vbox2, 360, 570,null);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
        stage.show();
        
    }
    private void showThirdScene() {
        Label l1 = new Label("Calcu Pythagoras");
        l1.setId("judulPythagoras");
        Label l2 = new Label("Hasil :");
        l2.setId("hasilPythagoras");
        Label l3 = new Label("");
        l3.setId("hasilnyaPythagoras");
        Label l4 = new Label("");
        l4.setId("salahInput");
        
        TextField tf1 = new TextField();
        tf1.setId("input1Pythagoras");
        tf1.setPromptText("Input 1");
        
        TextField tf2 = new TextField();
        tf2.setId("input2Pythagoras");
        tf2.setPromptText("Input 2");
        
        TextField textHasil = new TextField();
        textHasil.setId("textHasil");
        
        Button buttonClear = new Button("Clear");
        buttonClear.setId("buttonClear");
        buttonClear.setTextAlignment(TextAlignment.CENTER);
        buttonClear.setOnAction(action ->{
            tf1.setText("");
            tf2.setText("");
            l3.setText("");
        } );
        
        Button buttonCalculate = new Button("Calculate");
        buttonCalculate.setId("buttonCalculate");
        buttonCalculate.setOnAction(action -> {
            try{
                int angka1 = Integer.parseInt(tf1.getText());
                int angka2 = Integer.parseInt(tf2.getText());
                double calculate = (Math.pow(angka1, 2))+ (Math.pow(angka2,2));
                double calculateAkhir = Math.sqrt(calculate);
                int hapusNol = Double.valueOf(calculateAkhir).intValue();
                // Untuk mengambil 2 angka dibelakang koma
                DecimalFormat df= new DecimalFormat("#.##");
                // Agar 2 angka dibelakang koma tdk dibulatkan
                df.setRoundingMode(RoundingMode.DOWN);
                String angkaStringBulat = Integer.toString(hapusNol);
                if(calculateAkhir % 1 == 0){
                    l3.setText(" " + angkaStringBulat + " Cm");
                    l4.setText("");
                }else{
                    l3.setText(" " + df.format(calculateAkhir) + " Cm");
                    l4.setText("");
                }
            }catch(Exception e){
                l4.setText("Masukan Angka !" );        
            }
            
        });
        
        Button buttonHome = new Button("Home");
        buttonHome.setId("buttonHome"); 
        buttonHome.setOnAction(action -> {
            showFirstScene();
        });
        
        
        VBox vbox3 = new VBox(l1,l4,tf1,tf2,l2,l3,buttonClear,buttonCalculate,buttonHome);
        vbox3.setId("latarScene3");
        vbox3.setAlignment(Pos.TOP_CENTER);
        Scene scene3 = new Scene(vbox3,360,570,null);
        
        scene3.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene3); 
        stage.show();
        
    }
    private void showFourthScene() {
           
        Label l1 = new Label("Calcu Suhu");
        l1.setId("judulSuhu");
        Label l2 = new Label("Hasil :");
        l2.setId("hasilSuhu");
        Label l3 = new Label("");
        l3.setId("hasilnyaSuhu");
        Label l4 = new Label("");
        l4.setId("salahInputSuhu");
    
        TextField tf1 = new TextField();
        tf1.setId("input1Suhu");
        tf1.setPromptText("Input Celcius");
        
        
        TextField textHasil = new TextField();
        textHasil.setId("textHasilSuhu");
        
        Button buttonClear = new Button("Clear");
        buttonClear.setId("buttonClearSuhu");
        buttonClear.setOnAction(action ->{
            tf1.setText("");
            l3.setText("");
        });
        Button buttonCalculate = new Button("Calculate");
        buttonCalculate.setId("buttonCalculateSuhu");
        buttonCalculate.setOnAction(action -> {
        try{ 
            int angka1 = Integer.parseInt(tf1.getText());
            double calculate = ((angka1*9/5)+ 32);
            // String angkaString = Double.toString(calculate);
            int hapusNol = Double.valueOf(calculate).intValue();
            // Untuk mengambil 2 angka dibelakang koma
            DecimalFormat df= new DecimalFormat("#.##");
            // Agar 2 angka dibelakang koma tdk dibulatkan
            df.setRoundingMode(RoundingMode.DOWN);
            String angkaStringBulat = Integer.toString(hapusNol);
            if(calculate % 1 == 0){
                l3.setText(  angkaStringBulat + " F");
                l4.setText("");
            }else{
                l3.setText( df.format(calculate) + " F");
                l4.setText("");
            }
        }catch(Exception e){
            l4.setText("Masukan Angka !" );
        }
        });
        
        Button buttonHome = new Button("Home");
        buttonHome.setId("buttonHomeSuhu");
        buttonHome.setOnAction(action -> {
            showFirstScene();
        });
        VBox vbox3 = new VBox(l1,l4,tf1,l2,l3,buttonClear,buttonCalculate,buttonHome);
        vbox3.setId("latarScene4");
        vbox3.setAlignment(Pos.TOP_CENTER);
        Scene scene3 = new Scene(vbox3,360,570,null);
        
        scene3.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene3); 
        stage.show();
    }
        
    public static void main(String[] args) {
        launch(args);
    }
}
