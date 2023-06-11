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

public class FirstScene {
    private Stage stage;

    public FirstScene(Stage stage) {
        this.stage = stage;
    }

    public void start(Stage primaryStage) throws Exception{
        
        stage = primaryStage;
        stage.setResizable(false);
        showFirstScene();
        stage.show();
    }

    public Scene showFirstScene(){
        StackPane spLayout = new StackPane();
        Scene scene1 = new Scene(spLayout,500,700);
        scene1.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());    
        
        stage.setTitle("BORED CALCULATOR");
        stage.setScene(scene1);
        stage.show();

        Image backgroundImage = new Image(getClass().getResourceAsStream("/styles/backHome.jpg"));
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,  BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        spLayout.setBackground(new javafx.scene.layout.Background(background));

        Font.loadFont(getClass().getResourceAsStream("/font/Poppins.ttf"),40);
        Text text = new Text("  DON'T USE CALCULATOR ");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Poppins",30));

        Text text1 = new Text("  H071221063 - Muhammad Aditya Permana ");
        text1.setFill(Color.WHITE);
        text1.setFont(Font.font("Poppins",10));

        VBox vbox1 = new VBox(50,text);
        vbox1.setAlignment(Pos.TOP_CENTER);
        
        Button button = new Button("DO IT ANYWAY!");
        button.setFont(Font.font("Poppins",40));
        button.getStyleClass().add("buttonAll");
        
        VBox vbox3 = new VBox(15, button);
        vbox3.setAlignment(Pos.TOP_CENTER);
        
        VBox asli = new VBox(15,vbox1,vbox3);
        asli.setAlignment(Pos.CENTER);

        VBox forText1 = new VBox(text1);
        forText1.setAlignment(Pos.BOTTOM_CENTER);

        VBox asliBanget = new VBox(text, asli);
        asliBanget.setAlignment(Pos.TOP_CENTER);

        VBox vLayout = new VBox(text, asliBanget, text1);
        vLayout.setSpacing(20);
        spLayout.getChildren().add(vLayout);
        vLayout.setAlignment(Pos.CENTER);

        button.setOnAction(v -> {
            SecondScene secondScene = new SecondScene(stage);
            stage.setScene(secondScene.showSecondscene());
        });

        return scene1;
    }

}
