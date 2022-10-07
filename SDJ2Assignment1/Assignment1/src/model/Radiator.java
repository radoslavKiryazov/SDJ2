package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Radiator implements RadiatorState {
    private RadiatorState currentState;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public Radiator() {
        currentState = new OffState();
    }

    @Override
    public void turnUp(Radiator radiator) {
        currentState.turnUp(this);
        support.firePropertyChange("LevelChanged",0,currentState.getPower());
    }

    @Override
    public void turnDown(Radiator radiator) {
        currentState.turnDown(this);
        support.firePropertyChange("LevelChanged",0,currentState.getPower());

    }

    public String getPower() {
        return currentState.getPower();
    }

    @Override
    public void addPropertyChangeListener(String eventName, PropertyChangeListener listener) {
        if (eventName == null) {
            support.addPropertyChangeListener(listener);
        } else {
            support.addPropertyChangeListener(eventName, listener);
        }
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setPowerState(RadiatorState state) {
        currentState = state;
    }

    public RadiatorState getCurrentState(){
        return currentState;
    }


}