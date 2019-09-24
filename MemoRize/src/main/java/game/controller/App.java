package game.controller;

import game.model.GameData;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.security.Key;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class App extends Application {
    GameData gameData = new GameData();
    public void start(Stage stage) throws InterruptedException {

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
        startButtonHandler(gameData.getStart());
        gameData.setHaveToPress(new Boolean[36]);
        allFalse();
        gameData.setElrontott(0);
        gameData.setEltalalt(0);
        gameData.setDb(3);
        gameData.setN_edik_proba(0);

    }

    public void startButtonHandler(Button startButton){
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                gameData.setElrontott(0);
                gameData.setEltalalt(0);
                gameData.setN_edik_proba(0);
                //gameData.getStart().setStyle("-fx-background-color: #00ff00; ");
                //gameFunction(3);
                try {
                    gameFunction(gameData.getDb());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public void gameFunction(int db) throws InterruptedException {
        allFalse();
        allDisable();
        Random random = new Random();
        ArrayList<Integer> randomnumbers = new ArrayList<Integer>();
        int rand;
        int i=0;
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(200), event -> {
                    changeToGreen(gameData.getButtons()[randomnumbers.get(0)]);
                    gameData.getHaveToPress()[randomnumbers.get(0)]=true;
                    //System.out.println(randomnumbers.get(0));
                }),
                new KeyFrame(Duration.millis(1200), event -> {
                    changeToGray(gameData.getButtons()[randomnumbers.get(0)]);
                    randomnumbers.remove(0);
                })
        );
        timeline.setCycleCount(db);

        while (true){
            rand = random.nextInt(36);
            while (gameData.getHaveToPress()[rand]){
                rand = random.nextInt(36);
            }
            gameData.getHaveToPress()[rand]=true;
            randomnumbers.add(rand);
            i++;
            if(i == db){
                break;
            }
        }
        timeline.play();
    }
    public void changeToGreen(Button button){
        //System.out.println("set to green");
        button.setStyle("-fx-background-color: #00ff00; ");
    }
    public void changeToGray(Button button){
        //System.out.println("set to gray");
        button.setStyle("-fx-background-color: #808080; ");
    }
    public void changeToRed(Button button){
        button.setStyle("-fx-background-color: #ff0000; ");
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
    }

    //A gombok kezeléséért felel a táblán
    public void buttonHandler(Button button){
        int id=Integer.parseInt(button.getId());
        gameData.setN_edik_proba(gameData.getN_edik_proba()+1);

        //System.out.println("n-edik proba: "+gameData.getN_edik_proba());
        //System.out.println("ennyiszer kell kattintani: "+gameData.getDb());
        if (gameData.getN_edik_proba()<=gameData.getDb()) {
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.millis(20), event -> {
                        //System.out.println("Az adott elem sorszáma: "+id);
                        if (gameData.getHaveToPress()[id]) {
                            changeToGreen(gameData.getButtons()[id]);
                            gameData.setEltalalt(gameData.getEltalalt() + 1);
                            //System.out.println("Eltaláltad");

                        } else {
                            changeToRed(gameData.getButtons()[id]);
                            gameData.setElrontott(gameData.getElrontott() + 1);
                            //System.out.println("Elrontottad");
                        }
                        if (gameData.getN_edik_proba()==gameData.getDb()){
                            result();
                        }
                    }),
                    new KeyFrame(Duration.millis(800), event -> {
                        changeToGray(gameData.getButtons()[id]);
                    })
            );
            timeline.play();
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
            buttons[i].setId(Integer.toString(i));
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

    //kiírja az összes gomb állapotát(meg kell nyomni vagy sem)
    public void kiir(){
        for (int i = 0; i <gameData.getHaveToPress().length ; i++) {
            System.out.println(gameData.getHaveToPress()[i]);
        }
    }

    public void result(){
        System.out.println("Eltaláltak száma: "+gameData.getEltalalt());
        System.out.println("Elrontottak száma: "+gameData.getElrontott());
        System.out.println("Teljesítmény: "+(int)((gameData.getEltalalt()/(double)gameData.getDb())*100)+"%");
    }

}
