package model;

import java.beans.PropertyChangeListener;

public class OffState implements RadiatorState {
  private static String power = "0";

  @Override public void turnUp(Radiator radiator) {
    radiator.setPowerState(new Power1State());
    System.out.println("OffState turnUp");
  }

  @Override public void turnDown(Radiator radiator)
  {
    System.out.println("Radiator is already OFF");
  }

  @Override public String getPower() {
    return power;
  }

  @Override
  public void addPropertyChangeListener(String eventName, PropertyChangeListener listener) {
  }

  @Override
  public void addPropertyChangeListener(PropertyChangeListener listener) {
  }
}
