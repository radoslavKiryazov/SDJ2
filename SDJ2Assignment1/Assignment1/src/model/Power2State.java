package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Power2State implements RadiatorState {
  private static String power = "2";


  @Override public void turnUp(Radiator radiator)
  {
    radiator.setPowerState(new Power3State(radiator));
    System.out.println("Heating Level 3");
  }

  @Override public void turnDown(Radiator radiator)
  {
    radiator.setPowerState(new Power1State());
    System.out.println("Heating Level 1");}

  @Override public String getPower()
  {
    return power;
  }

  @Override
  public void addPropertyChangeListener(String eventName, PropertyChangeListener listener) {
  }

  @Override
  public void addPropertyChangeListener(PropertyChangeListener listener) {

  }

}
