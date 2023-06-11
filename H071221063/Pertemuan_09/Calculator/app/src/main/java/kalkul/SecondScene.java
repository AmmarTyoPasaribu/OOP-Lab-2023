package kalkul;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SecondScene{
    private Stage stage;

    public SecondScene(Stage stage){
        this.stage = stage;
    }

    public Scene showSecondscene(){
        StackPane spLayout = new StackPane();
        Scene scene2 = new Scene((spLayout),500,700);
        stage.setScene(scene2);
        scene2.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());  

        Label menu = new Label("  PILIH MENU  ");
        menu.setAlignment(Pos.TOP_CENTER);
        menu.getStyleClass().add("label");

        VBox vbox1 = new VBox(150, menu);
        vbox1.setAlignment(Pos.TOP_CENTER);

        Button button1 = new Button("Hitung Luas & Keliling Persegi");
        button1.getStyleClass().add("buttonAct");

        Button button2 = new Button("Hitung Luas & Keliling Persegi Panjang");
        button2.getStyleClass().add("buttonAct");

        Button button3 = new Button("Kalkulator Basic");
        button3.getStyleClass().add("buttonAct");

        Button button4 = new Button("<-");
        button4.getStyleClass().add("buttonAct");


        VBox vbox2 = new VBox(15,button1,button2,button3,button4) ;
        vbox2.setAlignment(Pos.TOP_CENTER);

        VBox vbox = new VBox(50,vbox1,vbox2);
        vbox.setAlignment(Pos.CENTER);

        VBox vLayout = new VBox(vbox);
        vLayout.setSpacing(80);
        spLayout.getChildren().add(vLayout);
        vLayout.setAlignment(Pos.CENTER);
        
        button1.setOnAction(e -> KalkulatorPersegi());
        button2.setOnAction(e -> KalkulatorPersegipanjang());
        button3.setOnAction(e->kalkulatorbasic());

        button4.setOnAction(v -> {
            FirstScene firstScene = new FirstScene(stage);
            stage.setScene(firstScene.showFirstScene());
        });
          
        Image bekgrong = new Image("/styles/wall.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(bekgrong,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        spLayout.setBackground(new javafx.scene.layout.Background(backgroundImage));

        return scene2;
    }

    private void KalkulatorPersegi(){

        StackPane spLayout = new StackPane();
        Scene scene3 = new Scene((spLayout),500,700);
        stage.setScene(scene3);
        scene3.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());  

        Button luaspersegi = new Button("Hitung Luas");
        luaspersegi.getStyleClass().add("buttonHitung");

        Button kelilingpersegi = new Button("Hitung Keliling");
        kelilingpersegi.getStyleClass().add("buttonHitung");

        Button clear= new Button("CLEAR");
        clear.getStyleClass().add("buttonHitung");

        Button balikmenu = new Button("KEMBALI KE MENU");
        balikmenu.getStyleClass().add("buttonHitung");

        TextField sisipersegi = new TextField();
        sisipersegi.setPromptText("Masukkan Sisi ");
        sisipersegi.setMaxSize(400, 300);
        sisipersegi.getStyleClass().add("myTextField");

        Label labelsisipersegi = new Label("MASUKKAN PANJANG SISI");
        labelsisipersegi.getStyleClass().add("label");

        Label labelhasilpersegi = new Label("Persegi = ");
        labelhasilpersegi.getStyleClass().add("label1");

        VBox vboxpersegi = new VBox(10, labelsisipersegi, sisipersegi, labelhasilpersegi, luaspersegi, kelilingpersegi, clear, balikmenu);
        vboxpersegi.setAlignment(Pos.CENTER);

        VBox vLayout = new VBox(vboxpersegi);
        vLayout.setSpacing(80);
        spLayout.getChildren().add(vLayout);
        vLayout.setAlignment(Pos.CENTER);
        
        Image bekgrong = new Image("/styles/wall.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(bekgrong,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        spLayout.setBackground(new javafx.scene.layout.Background(backgroundImage));

        stage.setScene(scene3);

        luaspersegi.setOnAction(event ->{
            int angkapersegi= Integer.parseInt(sisipersegi.getText());
            int luaspersegihasil= angkapersegi*angkapersegi;
            labelhasilpersegi.setText("Luas Persegi = "+luaspersegihasil);});

        kelilingpersegi.setOnAction(event ->{
            int angkapersegi= Integer.parseInt(sisipersegi.getText());
            int kelilingpersegihasil= angkapersegi*4;
            labelhasilpersegi.setText("Keliling Persegi = "+kelilingpersegihasil);});

        clear.setOnAction(event->{
            sisipersegi.clear();
            labelhasilpersegi.setText("");});

        balikmenu.setOnAction(event->{
            showSecondscene();
        });
    }


    private void KalkulatorPersegipanjang(){

        StackPane spLayout = new StackPane();
        Scene scene3 = new Scene((spLayout),500,700);
        stage.setScene(scene3);
        scene3.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());  

        Button luaspersegipanjang = new Button("Hitung Luas");
        luaspersegipanjang.getStyleClass().add("buttonHitung");

        Button kelilingpersegipanjang = new Button("Hitung Keliling");
        kelilingpersegipanjang.getStyleClass().add("buttonHitung");

        Button clear2= new Button("CLEAR");
        clear2.getStyleClass().add("buttonHitung");

        Button balikmenu = new Button("KEMBALI KE MENU");
        balikmenu.getStyleClass().add("buttonHitung");

        TextField sisipersegipanjang = new TextField();
        sisipersegipanjang.setPromptText("Masukkan Panjang Persegi");
        sisipersegipanjang.getStyleClass().add("myTextField");
        sisipersegipanjang.setMaxSize(400, 300);

        TextField lebarpersegipanjang = new TextField();
        lebarpersegipanjang.setPromptText("Masukkan Lebar Persegi");
        lebarpersegipanjang.getStyleClass().add("myTextField");
        lebarpersegipanjang.setMaxSize(400, 300);

        Label labelsisipersegipanjang = new Label("PANJANG X LEBAR");
        labelsisipersegipanjang.getStyleClass().add("label");

        Label labelhasilpersegipanjang = new Label("Persegi Panjang =");
        labelhasilpersegipanjang.getStyleClass().add("label1");;

        VBox vLabel = new VBox(10, labelsisipersegipanjang);
        vLabel.setAlignment(Pos.TOP_CENTER);

        VBox vTextField = new VBox(15, sisipersegipanjang, lebarpersegipanjang, labelhasilpersegipanjang);
        vTextField.setAlignment(Pos.TOP_CENTER);
        
        VBox vAtas = new VBox(20, vLabel, vTextField);
        vAtas.setAlignment(Pos.TOP_CENTER);

        VBox vBawah = new VBox(10, luaspersegipanjang, kelilingpersegipanjang, clear2, balikmenu);
        vBawah.setAlignment(Pos.TOP_CENTER);

        VBox vboxpersegi = new VBox(30, vAtas, vBawah);
        vboxpersegi.setAlignment(Pos.CENTER);

        VBox vLayout = new VBox(vboxpersegi);
        vLayout.setSpacing(80);
        spLayout.getChildren().add(vLayout);
        vLayout.setAlignment(Pos.CENTER);

        stage.setScene(scene3);

        Image bekgrong = new Image("/styles/wall.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(bekgrong,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        spLayout.setBackground(new javafx.scene.layout.Background(backgroundImage));

        luaspersegipanjang.setOnAction(event ->{
            int panjangpersegipanjang= Integer.parseInt(sisipersegipanjang.getText());
            int lebarintpersegipanjang= Integer.parseInt(lebarpersegipanjang.getText());
            int luaspersegipanjanghasil= panjangpersegipanjang*lebarintpersegipanjang;
            labelhasilpersegipanjang.setText("Luas Persegi Panjang = "+luaspersegipanjanghasil);});

        kelilingpersegipanjang.setOnAction(event ->{
            int panjangpersegipanjang= Integer.parseInt(sisipersegipanjang.getText());
            int lebarintpersegipanjang= Integer.parseInt(lebarpersegipanjang.getText());
            int kelilingpersegipanjanghasil= panjangpersegipanjang+panjangpersegipanjang+lebarintpersegipanjang+lebarintpersegipanjang;
            labelhasilpersegipanjang.setText("Keliling Persegi Panjang = "+kelilingpersegipanjanghasil);});

        clear2.setOnAction(event->{
            sisipersegipanjang.clear();
            lebarpersegipanjang.clear();
            labelhasilpersegipanjang.setText("");});

        balikmenu.setOnAction(event->{
            showSecondscene();
        });
            
    }

    private void kalkulatorbasic(){

        StackPane spLayout = new StackPane();
        Scene scene4 = new Scene((spLayout),500,700);
        stage.setScene(scene4);
        scene4.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());  

        Label label = new Label("  Kalkulator Basic  ");
        label.getStyleClass().add("label");
       
        VBox vbox1 =new VBox(10,label);
        vbox1.setAlignment(Pos.TOP_CENTER);
        
        TextField input1 = new TextField();
        input1.setPromptText("Masukan Angka 1");
        input1.getStyleClass().add("myTextField");
        input1.setMaxSize(400, 300);

        TextField input2 = new TextField();
        input2.setPromptText("Masukkan Angka 2");
        input2.getStyleClass().add("myTextField");
        input2.setMaxSize(400, 300);

        GridPane gridpane = new GridPane();
        gridpane.setVgap(10);
        gridpane.add(input1,0,0);
        gridpane.add(input2,0,1);
        gridpane.setAlignment(Pos.CENTER);

        Label labelhasil1 = new Label(" HASIL =  ");
        labelhasil1.getStyleClass().add("label1");
        Label labelhasil2 = new Label();
        labelhasil2.getStyleClass().add("label1");

        HBox hbox1 = new HBox(10, labelhasil1,labelhasil2);
        hbox1.setAlignment(Pos.TOP_CENTER);
        
        Button button1 = new Button("+");
        button1.getStyleClass().add("buttonOperasi");
        
        Button button2 = new Button("-");
        button2.getStyleClass().add("buttonOperasi");

        Button button3 = new Button("X");
        button3.getStyleClass().add("buttonOperasi");

        Button button4 = new Button("/");
        button4.getStyleClass().add("buttonOperasi");

        HBox hboxOperasi= new HBox(8,button1,button2,button3,button4);
        hboxOperasi.setAlignment(Pos.TOP_CENTER);

        Button button5 = new Button("CLEAR");
        button5.getStyleClass().add("buttonHitung");

        Button button6 = new Button("BACK TO HOME");
        button6.getStyleClass().add("buttonHitung");

        VBox vbox3 = new VBox(10,button5,button6);
        vbox3.setAlignment(Pos.TOP_CENTER);

        VBox vBawah = new VBox(25,hboxOperasi, vbox3);
        vBawah.setAlignment(Pos.TOP_CENTER);

        VBox vboxasli = new VBox(10, vbox1,gridpane,hbox1,vBawah);
        vboxasli.setAlignment(Pos.CENTER);
        
        VBox vLayout = new VBox(vboxasli);
        vLayout.setSpacing(80);
        spLayout.getChildren().add(vLayout);
        vLayout.setAlignment(Pos.CENTER);

        stage.setScene(scene4);

        Image bekgrong = new Image("/styles/wall.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(bekgrong,BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        spLayout.setBackground(new javafx.scene.layout.Background(backgroundImage));

        button1.setOnAction(a->{
            double angka1=Double.parseDouble(input1.getText());
            double angka2=Double.parseDouble(input2.getText());
            double hasil = angka1+angka2;
            if(hasil%1==0) {

                int hasilInt=(int)hasil;
                labelhasil2.setText(""+hasilInt);
            }

            else {
                labelhasil2.setText(""+hasil);
            }
        });

        button2.setOnAction(a->{
            double angka1=Double.parseDouble(input1.getText());
            double angka2=Double.parseDouble(input2.getText());
            double hasil = angka1-angka2;
            if(hasil%1==0) {
                int hasilInt=(int)hasil;
                labelhasil2.setText(""+hasilInt);
            }

            else {
                labelhasil2.setText(""+hasil);
            }
        });

        button3.setOnAction(a->{
            double angka1=Double.parseDouble(input1.getText());
            double angka2=Double.parseDouble(input2.getText());
            double hasil = angka1*angka2;
            if(hasil%1==0) {
                int hasilInt=(int)hasil;
                labelhasil2.setText(""+hasilInt);
            }
            
            else {
                labelhasil2.setText(""+hasil);
            }
        });

        button4.setOnAction(a->{
            double angka1=Double.parseDouble(input1.getText());
            double angka2=Double.parseDouble(input2.getText());
            double hasil = angka1/angka2;
            if(hasil%1==0) {

                int hasilInt=(int)hasil;
                labelhasil2.setText(""+hasilInt);
            }

            else {
                labelhasil2.setText(""+hasil);
            }
        });

        button5.setOnAction(event->{
            input1.clear();
            input2.clear();
            labelhasil2.setText("");});
        button6.setOnAction(a->{showSecondscene();
        
        });
    
    }
}
