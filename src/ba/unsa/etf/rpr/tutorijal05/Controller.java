package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    private SimpleStringProperty tekst;

    public Controller() {
        tekst = new SimpleStringProperty("0");
    }

}
