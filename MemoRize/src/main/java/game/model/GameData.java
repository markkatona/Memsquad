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
}
