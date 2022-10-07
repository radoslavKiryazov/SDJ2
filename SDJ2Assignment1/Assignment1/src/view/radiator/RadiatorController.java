package view.radiator;

import core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.beans.PropertyChangeEvent;

public class RadiatorController {
    public TextField powerStateDispay;
    public Label alert;
    private ViewHandler viewHandler;
    private RadiatorViewModel radiatorVM;
    private PropertyChangeEvent evt;

    public void innit(ViewHandler viewHandler, RadiatorViewModel radiatorVM){
        this.viewHandler = viewHandler;
        this.radiatorVM = radiatorVM;
        System.out.println("Radiator is OFF");
        powerStateDispay.textProperty().bind(radiatorVM.getCurrentPowerState());
    }

    public void onPowerUp() throws InterruptedException {
        radiatorVM.powerUp();
    }

    public void onPowerDown() {
        radiatorVM.powerDown();
    }

    public void onThermothersButton() {
        viewHandler.openThermometersView();
    }
}
