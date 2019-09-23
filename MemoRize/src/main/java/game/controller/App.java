package game.controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App extends Application {
    public void start(Stage stage){
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
    }

    public static void main(String[] args) {
        launch(args);
    }
}
