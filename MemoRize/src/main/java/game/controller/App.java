package game.controller;

import game.model.GameData;
import game.model.PlayerData;
import game.model.PlayerStat;
import game.model.SQLPersistance;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.security.Key;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class App extends Application {
    public static GameData gameData = new GameData();
    public static PlayerData playerData = new PlayerData();
    public static PlayerStat playerStat = new PlayerStat();
    public static SQLPersistance sqlPersistance = new SQLPersistance();

    @FXML
    Button menuButton;

    @FXML
    Button exitButton;

    @FXML
    Button nextLevel;
    @FXML
    TextField nev;
    @FXML
    TextField kor;
    @FXML
    TextField nem;

    @FXML
    Label myLevel;

    @FXML
    Label mySucces;

    @FXML
    Label myAll;
    //a főmenü gombja mit csináljon ha megnyomjuk
    @FXML
    private void menuAction(ActionEvent actionEvent) {
        sqlPersistance.openEntityManager();
        playerData.setNev(nev.getText());
        playerData.setKor(Integer.parseInt(kor.getText()));
        playerData.setNem(nem.getText());
        playerData.setKitoltes_ideje(Date.valueOf(LocalDate.now()));
        sqlPersistance.insertPlayerData(playerData);
        sqlPersistance.closeEntityManager();
        gameData.setTime(getCurrentTimeInSeconds());
        System.out.println(getCurrentTimeInSeconds());
        changeScene("gameGUI");
        //A játék megjelenítése full screen-ben
        //gameData.getGameStage().setMaximized(true);
    }

    public int getCurrentTimeInSeconds(){
        LocalTime time = LocalTime.now();
        return time.getHour() * 3600 + time.getMinute() * 60 + time.getSecond();
    }

    //a next level gomb mit csináljon ha megnyomjuk
    @FXML
    private void nextLevel(ActionEvent actionEvent){
        //myAll.setText(Integer.toString((int)gameData.getAllflash()));
        gameData.setAllflash(gameData.getAllflash() + gameData.getDb());
        myAll.setText(Integer.toString(gameData.getDb()));

        gameData.setSuccess(gameData.getSuccess() + gameData.getEltalalt());
        //mySucces.setText(Integer.toString((int)gameData.getSuccess()));
        gameData.setElrontott(0);
        gameData.setEltalalt(0);
        gameData.setN_edik_proba(0);
        gameData.setWait(0);
        mySucces.setText(Integer.toString(gameData.getEltalalt()));
        alterTableHandler(gameData.getButtons());
        try {
            gameFunction(gameData.getDb());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    //megkeresi az összes Node-ot egy Parent-en belül, és kiválasztja csak azokat a Node-okat amik Button-ok
    public static List<Node> getAllButtons(List<Node> all_the_buttons, Parent parent) {
        List<Node> result = new LinkedList<>();
        result.addAll(parent.getChildrenUnmodifiable().stream().collect(Collectors.toList()));
        for (Node node: result) {
            if(node instanceof Parent){
                getAllButtons(all_the_buttons, (Parent) node);
            }
        }
        all_the_buttons.addAll(result.stream().filter(e -> e instanceof Button).collect(Collectors.toList()));
        return result;
    }

    //scene-t változtat
    public void changeScene(String scene){
        switch (scene){
            case "menu": {
                //gameData.getGameStage().setMaximized(true);
                //fájlbeolvasás
                Parent menu = null;
                try { menu = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
                } catch (IOException e) { e.printStackTrace(); }
                Platform.runLater(menu::requestFocus);
                //scene váltás
                gameData.getGameStage().setScene(new Scene(menu));
                //fejléc eltüntetése
                //gameData.getGameStage().initStyle(StageStyle.UNDECORATED);
                break;
            }
            case "gameGUI": {
                //fájl beolvasás
                Parent gameGUI = null;
                try { gameGUI = FXMLLoader.load(getClass().getResource("/fxml/gameGUI.fxml"));
                } catch (IOException e) { e.printStackTrace(); }
                Platform.runLater(gameGUI::requestFocus);
                //scene váltás
                gameData.getGameStage().setScene(new Scene(gameGUI));

                //megkeressük a gameGUI-n belül az összes gombot, berakjuk az all_the_buttons listába
                List<Node> all_the_buttons = new LinkedList<>();
                getAllButtons(all_the_buttons, gameGUI);

                //gameDataban csinál változásokat
                setUp();

                //az all_the buttons listából egy tömbbe rakjuk át az összes gombot és átadjuk a GameData osztálynak
                Button[] buttons = new Button[36];
                for (int i = 0; i<36; i++){
                    buttons[i] = (Button) all_the_buttons.get(i);
                }
                gameData.setButtons(buttons);
                break;
            }
        }
    }

    public void start(Stage stage) throws InterruptedException, IOException {
        //lementjük a stage-et hogy később tudjunk rajta scene-t cserélni
        gameData.setGameStage(stage);
        //alapból a menü jöjjön be
        changeScene("menu");
        //title és  stage megjelenítés
        gameData.getGameStage().setTitle("MemoRize");
        stage.show();
    }

    @FXML
    private void exitGame(){
        gameData.setTime(getCurrentTimeInSeconds()-gameData.getTime());

        sqlPersistance.openEntityManager();
        playerStat.setUser_id(sqlPersistance.readIdFromPlayerData());
        playerStat.setXp_lvl(gameData.getLevel());
        playerStat.setGame_time(gameData.getTime());
        playerStat.setHit_rate(gameData.getSuccess()/gameData.getAllflash());
        sqlPersistance.insertPlayerStat(playerStat);
        sqlPersistance.closeEntityManager();

        gameData.getGameStage().close();
    }

    //felsetupolja a scene-t, valamint néhány egyébb változót
    public void setUp(){
        gameData.setHaveToPress(new Boolean[36]);
        gameData.setHaveToPress2(new int[36]);
        allFalse();
        gameData.setElrontott(0);
        gameData.setEltalalt(0);
        gameData.setDb(3);
        //myAll.setText(Integer.toString(3));
        //mySucces.setText(Integer.toString(gameData.getEltalalt()));
        gameData.setN_edik_proba(0);

        if (gameData.getDb()==0) {
            gameData.setDb(3);
        }
        if (gameData.getLevel()==0){
            gameData.setLevel(1);
        }
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
                    gameData.setWait(gameData.getWait()+1);
                    System.out.println(gameData.getWait());
                    if (gameData.getWait()==gameData.getDb()){
                        tableHandler(gameData.getButtons());
                    }
                })
        );
        timeline.setCycleCount(db);

        while (true){
            rand = random.nextInt(36);
            while (gameData.getHaveToPress()[rand]){
                rand = random.nextInt(36);
            }
            gameData.getHaveToPress()[rand]=true;
            gameData.getHaveToPress2()[i]=rand;
            randomnumbers.add(rand);
            i++;
            if(i == db){
                break;
            }
        }
        timeline.play();
    }
    public void changeToGreen(Button button){
        button.setStyle("-fx-background-color: #00ff00; ");
    }
    public void changeToGray(Button button){
        button.setStyle("-fx-background-color: #808080; ");
    }
    public void changeToRed(Button button){
        button.setStyle("-fx-background-color: #ff0000; ");
    }

    public static void main(String[] args) {
        //////////////////////////////////////////////////////
        //ezt kell majd berakni az exit game gomb eventjének//
        //////////////////////////////////////////////////////
        /*sqlPersistance.openEntityManager();
        playerStat.setUser_id(sqlPersistance.readIdFromPlayerData());
        playerStat.setXp_lvl(7);
        playerStat.setGame_time(300);
        playerStat.setHit_rate(1);
        sqlPersistance.insertPlayerStat(playerStat);
        sqlPersistance.closeEntityManager();*/

        launch(args);
    }

    //A tábla kezeléséért felel
    public void tableHandler(Button[] buttons){
        for (int i=0; i<buttons.length; i++){
            final int j=i;
            buttons[i].setOnAction(event->buttonHandler(buttons[j]));
        }
    }

    public void alterTableHandler(Button[] buttons){
        for (int i=0; i<buttons.length; i++){
            final int j=i;
            buttons[i].setOnAction(event->{});
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
                        //if (gameData.getHaveToPress()[id]) {
                        if (gameData.getHaveToPress2()[gameData.getN_edik_proba()-1]==id){
                            changeToGreen(gameData.getButtons()[id]);
                            gameData.setEltalalt(gameData.getEltalalt() + 1);
                            mySucces.setText(Integer.toString(gameData.getEltalalt()));
                            //System.out.println("Eltaláltad");

                        } else {
                            changeToRed(gameData.getButtons()[id]);
                            gameData.setElrontott(gameData.getElrontott() + 1);
                            //System.out.println("Elrontottad");
                        }
                        if (gameData.getN_edik_proba()==gameData.getDb()){
                            result();
                            if (gameData.getEltalalt()==gameData.getDb()){
                                gameData.setLevel(gameData.getLevel()+1);
                                myLevel.setText(Integer.toString(gameData.getLevel()));
                                gameData.setDb(gameData.getDb()+1);
                            }else{
                                gameData.setSuccess(gameData.getSuccess() + gameData.getEltalalt());
                            }
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
        System.out.println("Az általad elért szint: "+gameData.getLevel());
    }

}
