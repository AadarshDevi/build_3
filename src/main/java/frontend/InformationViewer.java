package main.java.frontend;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import lib.informationholder.Anime;
import lib.informationholder.Entertainment;
import lib.informationholder.Movie;
import main.java.backend.EntertainmentTracker;
import main.java.util.Custom.CLabel;
import main.java.util.Custom.CTextField;

public class InformationViewer extends AnchorPane {

    CLabel entertainment_type;

    CTextField franchise;
    CTextField title;

    VBox info_panel;

    public static double width = (EntertainmentTracker.app_width / 3) - 20;

    public InformationViewer() {

        this.getStyleClass().add("information-viewer");

        info_panel = new VBox();
        info_panel.setPrefSize(width, EntertainmentTracker.app_height - 70);
        info_panel.setAlignment(Pos.BASELINE_CENTER);

        franchise = new CTextField();
        franchise.setPrefSize(width, 30);

        title = new CTextField();
        title.setPrefSize(width, 30);

        entertainment_type = new CLabel();
        entertainment_type.setPrefSize(width, 30);

        info_panel.getChildren().addAll(entertainment_type, franchise, title);

        this.getChildren().addAll(info_panel);

        setIDs();
        lockViewer();
    }

    private void setIDs() {
        entertainment_type.setId("information-viewer-entertainment-type");
        franchise.setId("information-viewer-franchise-textfield");
        title.setId("information-viewer-title-textfield");
    }

    public void view(Entertainment entertainment) {

        if (entertainment instanceof Movie) {
            Movie movie = (Movie) entertainment;
            resetViewer();

            entertainment_type.setText("Movie");

            if (movie.getFranchise().contains(": ")) {
                int i = movie.getFranchise().indexOf(": ");
                String before = movie.getFranchise().substring(0, i);
                String after = movie.getFranchise().substring(++i);
                franchise.setText(before);
                // title.setDisable(false);
                title.setText(after);
                title.setStyle("-fx-opacity: 1.0;");
            } else {
                title.setText("");
                // title.setDisable(true);
                franchise.setText(movie.getFranchise());
                title.setStyle("-fx-opacity: 0;");
            }

            lockViewer();

        } else if (entertainment instanceof Anime) {
            Anime anime = (Anime) entertainment;
            entertainment_type.setText("Anime");

            if (anime.getTitle() != null) {
                franchise.setText(anime.getFranchise());
                // title.setDisable(false);
                title.setText(anime.getTitle());
                title.setStyle("-fx-opacity: 1.0;");
            } else {
                title.setText("");
                // title.setDisable(true);
                franchise.setText(anime.getFranchise());
                title.setStyle("-fx-opacity: 0;");
            }
        }
    }

    private void lockViewer() {

        // franchise.setEditable(false);
        // franchise.setDisable(true);

        // title.setEditable(false);
        // title.setDisable(true);

    }

    private void resetViewer() {
        this.getChildren().removeAll();
    }
}
