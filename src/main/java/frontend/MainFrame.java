package main.java.frontend;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MainFrame {
    @FXML
    Label information_viewer_title_label;

    @FXML
    Label information_viewer_status_heading_label;

    @FXML
    Label information_viewer_status_1;

    @FXML
    Label information_viewer_status_2;

    @FXML
    Label information_viewer_status_3;

    @FXML
    Label information_viewer_status_4;

    @FXML
    Label information_viewer_franchise_label;

    @FXML
    Label information_viewer_entertainment_type;

    @FXML
    TextField information_viewer_title_textfield;

    @FXML
    TextField information_viewer_franchise_textfield;

    @FXML
    ScrollPane module_scroller_container;

    @FXML
    AnchorPane information_viewer_specialized_info;

    @FXML
    GridPane module_grid_container;

    @FXML
    private void initialize() {
        information_viewer_title_label = new Label();
        information_viewer_status_heading_label = new Label();
        information_viewer_status_1 = new Label();
        information_viewer_status_2 = new Label();
        information_viewer_status_3 = new Label();
        information_viewer_status_4 = new Label();
        information_viewer_franchise_label = new Label();
        information_viewer_entertainment_type = new Label();

        information_viewer_title_textfield = new TextField();
        information_viewer_franchise_textfield = new TextField();

        module_scroller_container = new ScrollPane();

        information_viewer_specialized_info = new AnchorPane();

        module_grid_container = new GridPane();
    }

}