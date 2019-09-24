package game.model;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class GameData {
    private Group mainGroup;
    private Scene mainScene;
    private Button[] buttons;
    private Boolean[] haveToPress;
    private Button start;
    private int eltalalt;
    private int elrontott;
    private int db;
    private int n_edik_proba;

    public GameData(){

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
}
