package view.radiator;

import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.*;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class RadiatorViewModel {
    private RadiatorState radiatorState;
    private StringProperty currentPowerState;
    private Radiator radiator;
    private PropertyChangeListener listener;
    private StringProperty alert;

    public RadiatorViewModel(RadiatorState radiatorState){
        this.radiatorState=radiatorState;
        currentPowerState = new SimpleStringProperty();
        radiator = new Radiator();
        alert = new SimpleStringProperty();
        radiator.addPropertyChangeListener(this::heatListener);
    }

    public void powerUp(){
      radiator.turnUp(radiator);
    }
    public void powerDown(){
     radiator.turnDown(radiator);
    }
    public StringProperty getAlert() {
       return alert;
   }

   public void heatListener(PropertyChangeEvent evt) {
            currentPowerState.setValue("Level "+evt.getNewValue());
            System.out.println(evt.getNewValue());

   }
    public StringProperty getCurrentPowerState(){
        return currentPowerState;
    }

}
