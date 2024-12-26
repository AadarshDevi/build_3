package main.java.util.Custom;

import javafx.scene.layout.GridPane;

public class FourGrid extends GridPane {

    CLabel top_left;
    CLabel top_right;
    CLabel bottom_left;
    CLabel bottom_right;

    public FourGrid() {
        top_left = new CLabel();
        top_right = new CLabel();
        bottom_left = new CLabel();
        bottom_right = new CLabel();
    }

    public void setTLText(String string) {
        top_left.setText(string);
    }

    public void setTRText(String string) {
        top_right.setText(string);
    }

    public void setBLText(String string) {
        bottom_left.setText(string);
    }

    public void setBRText(String string) {
        bottom_right.setText(string);
    }

    public void setAll(String tl, String tr, String bl, String br) {
        top_left.setText(tl);
        top_right.setText(tr);
        bottom_left.setText(bl);
        bottom_right.setText(br);
    }

}
