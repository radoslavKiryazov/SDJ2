package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Power1State implements RadiatorState {
    private static String power = "1";

    @Override public void turnUp(Radiator radiator) {
        radiator.setPowerState(new Power2State());
        System.out.println("Heating Level 2");
    }

    @Override
    public void turnDown(Radiator radiator) {
        radiator.setPowerState(new OffState());
        System.out.println("Radiator is OFF");

    }

    @Override
    public String getPower() {
        return power;
    }


    @Override
    public void addPropertyChangeListener(String eventName, PropertyChangeListener listener) {
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
    }

}
