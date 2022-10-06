package model;

import java.beans.PropertyChangeListener;

public class Power3State implements RadiatorState {
    private static String power = "3";
    private Thread radiatorThread;

    public Power3State(Radiator radiator) {
        radiatorThread = new Thread(()->timeOut(radiator));
        radiatorThread.start();
    }

    @Override
    public void turnUp(Radiator radiator) {
        System.out.println("Radiator is already maxed");
    }

    @Override
    public void turnDown(Radiator radiator) {
        radiator.setPowerState(new Power2State());
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

    public void timeOut(Radiator radiator){
        try
        {
            Thread.sleep(1000);
            radiator.turnDown(radiator);
            System.out.println("Overheating...Switched Back To Heating Level 2");
        }
        catch (InterruptedException e)
        {
            radiator.turnDown(radiator);
        }
    }
}

