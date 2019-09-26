package game.model;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class GameData {
    private Stage gameStage;

    private Group mainGroup;
    private Scene mainScene;
    private Button[] buttons;
    private Boolean[] haveToPress;
    private int[] haveToPress2;
    private Button start;
    private int eltalalt;
    private int elrontott;
    private int db;
    private int n_edik_proba;
    private int level;
    private int wait;

    public GameData(){

    }

    public void setGameStage(Stage gameStage) {
        this.gameStage = gameStage;
    }

    public Stage getGameStage() {
        return gameStage;
    }

    public Scene menuView(){
        Group group= new Group();
        Scene main= new Scene(group,600,400);

        return main;
    }

    public Group getMainGroup() {
        return mainGroup;
    }

    public void setMainGroup(Group mainGroup) {
        this.mainGroup = mainGroup;
    }

    public Scene getMainScene() {
        return mainScene;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }

    public Button[] getButtons() {
        return buttons;
    }

    public void setButtons(Button[] buttons) {
        this.buttons = buttons;
    }

    public Boolean[] getHaveToPress() {
        return haveToPress;
    }

    public void setHaveToPress(Boolean[] haveToPress) {
        this.haveToPress = haveToPress;
    }

    public Button getStart() {
        return start;
    }

    public void setStart(Button start) {
        this.start = start;
    }

    public int getEltalalt() {
        return eltalalt;
    }

    public void setEltalalt(int eltalalt) {
        this.eltalalt = eltalalt;
    }

    public int getElrontott() {
        return elrontott;
    }

    public void setElrontott(int elrontott) {
        this.elrontott = elrontott;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public int getN_edik_proba() {
        return n_edik_proba;
    }

    public void setN_edik_proba(int n_edik_proba) {
        this.n_edik_proba = n_edik_proba;
    }

    public int[] getHaveToPress2() {
        return haveToPress2;
    }

    public void setHaveToPress2(int[] haveToPress2) {
        this.haveToPress2 = haveToPress2;
    }

    public int getWait() {
        return wait;
    }

    public void setWait(int wait) {
        this.wait = wait;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
