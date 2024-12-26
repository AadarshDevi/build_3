package main.java.util.Custom;

import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class CLabel extends Label {

    public CLabel() {
        this.setAlignment(Pos.CENTER);
    }

    public CLabel(String string) {
        this.setAlignment(Pos.CENTER);
        this.setText(string);
    }
}
