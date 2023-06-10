package pertemuan_09;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Kalkulator Sederhana by NIM 030");

        stage = primaryStage;
        showFirstScene();
        stage.show();
    }

    public void showFirstScene() {
        Image image = new Image("/icon.png");
        ImageView imageView = new ImageView(image);

        Label label = new Label("Tugas Praktikum 9");
        label.setFont(Font.font("HARRINGTON", 25));

        Button button1 = new Button("Mulai");
        button1.getStyleClass().add("custom-button1");
        button1.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(imageView, label, button1);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene1 = new Scene(vBox, 300, 400);
        scene1.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene1);
    }

    public void showSecondScene() {
        Label label = new Label("Pilih Menu");
        label.setFont(Font.font("ELEPHANT", 25));

        Button basic = new Button("Aritmatika Dasar");
        basic.getStyleClass().add("custom-button1");
        basic.setOnAction(action -> {
            showBasicMath();
        });
        
        Button trigonometry = new Button("Trigonometri");
        trigonometry.getStyleClass().add("custom-button1");
        trigonometry.setOnAction(action -> {
            showTrigonometry();
        });
        
        Button suhu = new Button("Konversi Suhu");
        suhu.getStyleClass().add("custom-button1");
        suhu.setOnAction(action -> {
            showSuhu();
        });
        
        Button kubus = new Button("Operasi Kubus");
        kubus.getStyleClass().add("custom-button1");
        kubus.setOnAction(action -> {
            showKubus();
        });

        Button balok = new Button("Operasi Balok");
        balok.getStyleClass().add("custom-button1");
        balok.setOnAction(action -> {
            showBalok();
        });

        VBox vBox = new VBox(label, basic, trigonometry, suhu, kubus, balok);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setSpacing(15);
        Scene scene2 = new Scene(vBox, 300, 400);
        scene2.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene2);
    }

    public void showBasicMath() {
        Label label = new Label("Aritmatika Dasar");
        label.setFont(Font.font("ELEPHANT", 25));

        TextField input1 = new TextField();
        input1.setPromptText("Input angka");
        TextField input2 = new TextField();
        input2.setPromptText("Input angka");

        Label output = new Label();

        Button tambah = new Button("+");
        tambah.getStyleClass().add("custom-button3");
        tambah.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int hasil = angka1 + angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button kurang = new Button("-");
        kurang.getStyleClass().add("custom-button3");
        kurang.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int hasil = angka1 - angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox tambahKurang = new HBox(tambah, kurang);
        tambahKurang.setAlignment(Pos.CENTER);
        tambahKurang.setSpacing(10);

        Button kali = new Button("x");
        kali.getStyleClass().add("custom-button3");
        kali.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int hasil = angka1 * angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button bagi = new Button("/");
        bagi.getStyleClass().add("custom-button3");
        bagi.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                Double hasil = (double) angka1 / angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox kaliBagi = new HBox(kali, bagi);
        kaliBagi.setAlignment(Pos.CENTER);
        kaliBagi.setSpacing(10);

        VBox tambahKurangKaliBagi = new VBox(tambahKurang, kaliBagi);
        tambahKurangKaliBagi.setAlignment(Pos.CENTER);
        tambahKurangKaliBagi.setSpacing(10);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input1.setText("");
            input2.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, input1, input2, output, tambahKurangKaliBagi, clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene3 = new Scene(vBox, 300, 400);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public void showTrigonometry() {
        Label label = new Label("Trigonometri");
        label.setFont(Font.font("ELEPHANT", 25));

        Label label2 = new Label("Masukkan Angka");
        TextField input = new TextField();
        Label output = new Label();

        Button sin = new Button("Sin");
        sin.getStyleClass().add("custom-button3");
        sin.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                double hasil = Math.sin(angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button cos = new Button("Cos");
        cos.getStyleClass().add("custom-button3");
        cos.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                double hasil = Math.cos(angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button tan = new Button("Tan");
        tan.getStyleClass().add("custom-button3");
        tan.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                double hasil = Math.tan(angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox sinCosTan = new HBox(sin, cos, tan);
        sinCosTan.setSpacing(5);

        Button cosec = new Button("Cosec");
        cosec.getStyleClass().add("custom-button3");
        cosec.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                double hasil = 1 / Math.sin(angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button sec = new Button("Sec");
        sec.getStyleClass().add("custom-button3");
        sec.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                double hasil = 1 / Math.cos(angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button cot = new Button("Cot");
        cot.getStyleClass().add("custom-button3");
        cot.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                double hasil = 1 / Math.tan(angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox cosecot = new HBox(cosec, sec, cot);
        cosecot.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, label2, input, output, sinCosTan, cosecot, clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene3 = new Scene(vBox, 300, 400);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public void showSuhu() {
        Label label = new Label("Konversi Suhu");
        label.setFont(Font.font("ELEPHANT", 25));

        Label label2 = new Label("Celcius :");
        TextField input1 = new TextField();
        Label label3 = new Label("Fahrenheit :");
        TextField input2 = new TextField();
        Label label4 = new Label("Kelvin :");
        TextField input3 = new TextField();
        Label output = new Label();

        Button konversi = new Button("Konversi");
        konversi.getStyleClass().add("custom-button1");
        konversi.setOnAction(action -> {
            try {
                if (!input1.getText().isEmpty()) {
                    double celcius = Double.parseDouble(input1.getText());
                    double fahrenheit = celcius * 9/5 + 32;
                    input2.setText(String.format("%.2f", fahrenheit));
                
                    double kelvin = celcius + 273.15;
                    input3.setText(String.format("%.2f", kelvin));
                } else if (!input2.getText().isEmpty()) {
                    double fahrenheit = Double.parseDouble(input2.getText());
                    double celcius = (fahrenheit - 32) * 5/9;
                    input1.setText(String.format("%.2f", celcius));
                
                    double kelvin = (fahrenheit + 459.67) * 5/9;
                    input3.setText(String.format("%.2f", kelvin));
                } else if (!input3.getText().isEmpty()) {
                    double kelvin = Double.parseDouble(input3.getText());
                    double celcius = kelvin - 273.15;
                    input1.setText(String.format("%.2f", celcius));
                
                    double fahrenheit = kelvin * 9/5 - 459.67;
                    input2.setText(String.format("%.2f", fahrenheit));
                }
            } catch (NumberFormatException e) {
                output.setText("Bukan angka");
            }
        });

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input1.setText("");
            input2.setText("");
            input3.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, label2, input1, label3, input2, label4, input3, konversi, clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(5);
        Scene scene3 = new Scene(vBox, 300, 400);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public void showKubus() {
        Label label = new Label("Operasi Kubus");
        label.setFont(Font.font("ELEPHANT", 25));

        Label label2 = new Label("Masukkan panjang rusuk :");
        TextField input = new TextField();
        Label output = new Label();

        Button keliling = new Button("Keliling");
        keliling.getStyleClass().add("custom-button3");
        keliling.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = 12 * angka;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-button3");
        luas.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = 6 * (angka*angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox luke = new HBox(keliling, luas);
        luke.setAlignment(Pos.CENTER);
        luke.setSpacing(5);

        Button volume = new Button("Volume");
        volume.getStyleClass().add("custom-button4");
        volume.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = angka*angka*angka;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        VBox lukevo = new VBox(luke, volume);
        lukevo.setAlignment(Pos.CENTER);
        lukevo.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, label2, input, output, lukevo, clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene3 = new Scene(vBox, 300, 400);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public void showBalok() {
        Label label = new Label("Operasi Balok");
        label.setFont(Font.font("ELEPHANT", 25));

        Label label2 = new Label("Masukkan panjang :");
        TextField input1 = new TextField();
        Label label3 = new Label("Masukkan lebar :");
        TextField input2 = new TextField();
        Label label4 = new Label("Masukkan tinggi :");
        TextField input3 = new TextField();
        Label output = new Label();

        Button keliling = new Button("Keliling");
        keliling.getStyleClass().add("custom-button3");
        keliling.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int angka3 = Integer.parseInt(input3.getText());
                int hasil = 4 * (angka1 + angka2 + angka3);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-button3");
        luas.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int angka3 = Integer.parseInt(input3.getText());
                int hasil = 2 * (angka1 * angka2 + angka1 * angka3 + angka2 * angka3);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox luke = new HBox(keliling, luas);
        luke.setAlignment(Pos.CENTER);
        luke.setSpacing(5);

        Button volume = new Button("Volume");
        volume.getStyleClass().add("custom-button4");
        volume.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int angka3 = Integer.parseInt(input3.getText());
                int hasil = angka1*angka2*angka3;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        VBox lukevo = new VBox(luke, volume);
        lukevo.setAlignment(Pos.CENTER);
        lukevo.setSpacing(5);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input1.setText("");
            input2.setText("");
            input3.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, label2, input1, label3, input2, label4, input3, output, lukevo, clear, back);
        vBox.setAlignment(Pos.CENTER);
        Scene scene3 = new Scene(vBox, 300, 400);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}