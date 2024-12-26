package main.java.util.Custom;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class CTextField extends TextField {
    public CTextField() {
        this.setAlignment(Pos.BASELINE_CENTER);

        // this.setEditable(false);
        // this.setDisable(true);
    }

    public CTextField(String string) {

        this.setAlignment(Pos.BASELINE_CENTER);

        // this.setEditable(false);
        // this.setDisable(true);

        this.setText(string);
    }

}
