package main.java.frontend;

import java.lang.classfile.Label;

import javafx.fxml.FXML;
import lib.informationholder.Entertainment;
import main.java.api.API;

// import javafx.fxml.FXMLLoader;
// import javafx.geometry.Pos;
// import javafx.scene.control.Label;
// import javafx.scene.layout.HBox;
// import lib.informationholder.Anime;
// import lib.informationholder.Entertainment;
// import lib.informationholder.Movie;
// import main.java.api.API;
// import main.java.backend.EntertainmentTracker;

public class Module<EType extends Entertainment> {

    EType entertainment;

    // public static final double MODULE_WIDTH = EntertainmentTracker.app_width -
    // 420;
    // public static final double MODULE_HEIGHT = 40;

    API api;

    @FXML
    Label module_info;

    @FXML
    Label module_extended_name;

    @FXML
    Label module_info_left;

    @FXML
    Label module_info_right;

    public Module(EType entertainment, API api) {

        this.api = api;

        this.entertainment = entertainment;
        // this = new
        // FXMLLoader().load(getClass().getResource("../../res/fxmls/MainFrame.fxml"));
        // this.setPrefSize(MODULE_WIDTH, MODULE_HEIGHT);
        // this.getStyleClass().add("module_class");
        // // id, franchise and title, left and right information
        // Label e_num = new Label(" " + entertainment.getId());
        // Label e_name = new Label();
        // Label left_module_info = new Label();
        // Label right_module_info = new Label();
        // e_name.setAlignment(Pos.CENTER_LEFT);
        // e_num.setAlignment(Pos.CENTER_LEFT);
        // left_module_info.setAlignment(Pos.CENTER);
        // right_module_info.setAlignment(Pos.CENTER);
        // e_num.setPrefSize(50, MODULE_HEIGHT);
        // e_name.setPrefSize(600, MODULE_HEIGHT);
        // left_module_info.setPrefSize(90, MODULE_HEIGHT);
        // right_module_info.setPrefSize(90, MODULE_HEIGHT);
        // e_num.setId("module-text");
        // e_name.setId("module-text");
        // left_module_info.setId("module-text");
        // right_module_info.setId("module-text");
        // if (entertainment instanceof Movie) {
        // Movie movie = (Movie) entertainment;
        // e_name.setText(entertainment.getFranchise());
        // left_module_info.setText(Integer.toString(movie.getReleaseYear()));
        // right_module_info.setText(movie.getRuntime() + " min");
        // } else if (entertainment instanceof Anime) {
        // Anime anime = (Anime) entertainment;
        // if (anime.getTitle() != null)
        // e_name.setText(entertainment.getFranchise() + ": " + anime.getTitle());
        // else
        // e_name.setText(entertainment.getFranchise());
        // left_module_info.setText("S" + anime.getSeasons());
        // right_module_info.setText("E" + anime.getEpisodes());
        // } else {
        // e_name.setText(entertainment.getFranchise());
        // left_module_info.setText("No Info");
        // right_module_info.setText("No Info");
        // }
        // this.getChildren().addAll(e_num, e_name, left_module_info,
        // right_module_info);
        // this.setOnMouseClicked(event -> {
        // api.view(entertainment);
        // });

        // write code
    }

    public EType getEntertainment() {
        return entertainment;
    }
}
