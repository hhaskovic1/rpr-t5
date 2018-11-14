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

    public String getTekst() {
        return tekst.get();
    }

    public SimpleStringProperty tekstProperty() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst.set(tekst);
    }

}
