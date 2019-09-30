package game.model;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class GameData {
    private Stage gameStage;
    private Button[] buttons;
    private Boolean[] haveToPress;
    private int[] haveToPress2;
    private int eltalalt;
    private int elrontott;
    private int db;
    private int n_edik_proba;
    private int level;
    private int wait;
    private float allflash;
    private float success;
    private int time;

    public GameData() {

    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setGameStage(Stage gameStage) {
        this.gameStage = gameStage;
    }

    public Stage getGameStage() {
        return gameStage;
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

    public float getAllflash() {
        return allflash;
    }

    public void setAllflash(float allflash) {
        this.allflash = allflash;
    }

    public float getSuccess() {
        return success;
    }

    public void setSuccess(float success) {
        this.success = success;
    }
}