package sample;

import javafx.fxml.FXML;

import java.awt.*;

public class Controller {


    @FXML
    private Label LABEL;

    @FXML
    private void initialize() {
        LABEL.setText("I'm a Label.");
    }

}
