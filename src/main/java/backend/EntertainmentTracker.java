package main.java.backend;

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import main.java.api.API;
import main.java.util.Logging;

public class EntertainmentTracker extends Application {

    public static double app_width = 1280.0;
    public static double app_height = 770.0;

    @SuppressWarnings("unused")
    @Override
    public void start(Stage stage) throws Exception {

        API api = new API();
        Logging.log(Logging.PROCESS, this, "API Created");

        @SuppressWarnings("static-access")
        Parent root = new FXMLLoader().load(getClass().getResource("../../res/fxmls/MainFrame.fxml"));

        Scene scene = new Scene(root);
        // Scene scene = new Scene(api.getMainframe(), app_width, app_height);

        // apply style sheet
        scene.getStylesheets().add(new File("src/main/res/css/stylesheet.css").toURI().toURL().toExternalForm());

        stage.setOnCloseRequest(event -> api.quit_app());
        stage.setScene(scene);
        stage.setTitle("Movie Tracker");
        stage.setResizable(false);

        // apply app icon to window
        stage.getIcons().add(new Image(getClass().getResourceAsStream("../../res/img/logo.png")));

        stage.show();
        Logging.log(Logging.PROCESS, this, "Entering App");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
