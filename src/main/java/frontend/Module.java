package main.java.frontend;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import lib.informationholder.Entertainment;
import lib.informationholder.Movie;
import main.java.api.API;
import main.java.util.Logging;

public class Module<EType extends Entertainment> extends BorderPane {

    @FXML
    Label module_id;

    @FXML
    Label module_extended_name;

    @FXML
    Label module_info_left;

    @FXML
    Label module_info_right;

    API api;
    EType entertainment;

    public Module(EType entertainment, API api) {

        this.api = api;
        this.entertainment = entertainment;

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../res/fxmls/Module.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
            setPreferredSize();
        } catch (IOException e) {
            Logging.log(Logging.ERROR, this, e.getMessage());
        }

        updateUI();
        setupMouseEvent();

    }

    private void setupMouseEvent() {
        this.setOnMouseClicked(this::handleMouseClick);
    }

    private void handleMouseClick(MouseEvent event) {
        // TODO: code to send entertianment to api
    }

    private void setPreferredSize() {
        this.setPrefWidth(841.0); // Set preferred width
        this.setPrefHeight(29.0); // Set preferred height
    }

    private void updateUI() {

        if (entertainment instanceof Movie) {
            Movie movie = (Movie) entertainment;
            module_id.setText(Integer.toString(movie.getId()));
            module_extended_name.setText(movie.getFranchise());
            module_info_left.setText(movie.getRuntime() + " min");
            module_info_right.setText(Integer.toString(movie.getReleaseYear()));
        }
    }

    public EType getEntertainment() {
        return entertainment;
    }
}
