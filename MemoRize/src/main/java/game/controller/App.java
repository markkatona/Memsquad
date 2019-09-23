package game.controller;

import game.model.GameData;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class App extends Application {
    GameData gameData = new GameData();
    public void start(Stage stage) throws InterruptedException {
        /*fxData.setStage(stage);

        //főmenü scene
        MainMenu mainMenu = new MainMenu(fxData.getImage());
        Scene mainMenuScene = new Scene(mainMenu);
        fxData.setStartMenu(mainMenuScene);

        //játék végi menü scene
        EndMenu endMenu = new EndMenu(fxData.getImage());
        Scene endMenuScene = new Scene(endMenu);
        fxData.setEndMenu(endMenuScene);
        fxData.setEndMenuText(endMenu.text);

        button_press_handler(mainMenu.new_game_button);
        button_press_handler(mainMenu.load_game_button);
        button_press_handler(mainMenu.exit_game_button);
        button_press_handler(endMenu.new_game_button);
        button_press_handler(endMenu.exit_game_button);

        fxData.changeScene(mainMenuScene);
        stage.show();*/
        setUp();
        stage.setScene(gameData.getMainScene());

        //5 random gombot kell megnyomni
        //randomNumbers(5);
        //kiir();
        stage.show();
        //TimeUnit.SECONDS.sleep(10);
        //System.out.println("p;lda");
    }

    //felsetupolja a scene-t, valamint néhány egyébb változót
    public void setUp(){
        gameData.setMainGroup(new Group());
        gameData.setStart(new Button("Start"));
        gameData.getStart().setLayoutX(40);
        gameData.getStart().setLayoutY(350);
        gameData.getStart().setMinSize(25, 25);
        gameData.getStart().setId(Integer.toString(0));
        gameData.getMainGroup().getChildren().add(gameData.getStart());

        gameData.setButtons(gombolo());

        gameData.getMainGroup().getChildren().addAll(gameData.getButtons());
        gameData.setMainScene(new Scene(gameData.getMainGroup(),600,400));

        tableHandler(gameData.getButtons());
        gameData.setHaveToPress(new Boolean[36]);
        allFalse();

    }

    public static void main(String[] args) {
        launch(args);
    }

    //A tábla kezeléséért felel
    public void tableHandler(Button[] buttons){
        for (int i=0; i<buttons.length; i++){
            final int j=i;
            buttons[i].setOnAction(event->buttonHandler(buttons[j]));
        }
        gameData.getStart().setOnAction(event -> {
            randomNumbers(5);
        });
        //kiir();
    }

    //A gombok kezeléséért felel a táblán
    public void buttonHandler(Button button){
        int id=Integer.parseInt(button.getId());
        if(id==0) {
            button.setId(Integer.toString(1));
            button.setStyle("-fx-background-color: #0080ff "); //a gomb színe kék színre vált
            //button.setStyle("-fx-background-color: #00ff00; "); //a gomb színe z0ld szinre vált
        }else{
            button.setId(Integer.toString(0));
            button.setStyle("-fx-background-color: #808080 "); //a gomb színe szürke szinre vált
        }
    }

    //ezt a részt fogja felváltani a view, jelenleg csak sablonként használ egy kézzel setupolt gombot
    public Button[] gombolo(){
        Button[] buttons = new Button[36];
        for (int i = 0; i <buttons.length ; i++) {
            buttons[i] = new Button();
            buttons[i].setLayoutX(30*(i%6));
            buttons[i].setLayoutY(30*(i/6));
            buttons[i].setMinSize(25, 25);
            buttons[i].setId(Integer.toString(0));
            buttons[i].setStyle("-fx-background-color: #808080 ");
        }
        return buttons;
    }

    //beállítja azt, hogy egyik gomb sincs megnyomva
    public void allFalse(){
        for (int i = 0; i <36 ; i++) {
            gameData.getHaveToPress()[i]=false;
        }
    }
    public void allDisable(){
        for (int i = 0; i <gameData.getButtons().length ; i++) {
            gameData.getButtons()[i].setStyle("-fx-background-color: #808080 ");
        }
    }

    //random kiválasztja, hogy melyik gombokat kell megnyomni
    public void randomNumbers(int db){
        allFalse();
        allDisable();
        Random random = new Random();
        int rand;
        int i=0;
        while (i<db){
            i++;
            rand = random.nextInt(36);
            while (gameData.getHaveToPress()[rand]){
                rand = random.nextInt(36);
            }
            gameData.getHaveToPress()[rand]=true;
            gameData.getButtons()[rand].setStyle("-fx-background-color: #00ff00; ");
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //kiírja az összes gomb állapotát(meg kell nyomni vagy sem)
    public void kiir(){
        for (int i = 0; i <gameData.getHaveToPress().length ; i++) {
            System.out.println(gameData.getHaveToPress()[i]);
        }
    }

}
