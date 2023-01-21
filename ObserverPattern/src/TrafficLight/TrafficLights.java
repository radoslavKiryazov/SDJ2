package TrafficLight;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class TrafficLights implements PropertyChangeSubject
{


  private String[] lights = {"GREEN","YELLOW","RED","YELLOW"};
  private int count = 2;
  private String currentLight;
  private PropertyChangeSupport support;

  public TrafficLights(){
    currentLight = lights[count];
    support = new PropertyChangeSupport(this);
  }

  public void start() throws InterruptedException {
    String previous = "";
    for (int i = 0; i < 10; i++) {
      Thread.sleep(2000);
      count = (++count) % 4;
      previous = currentLight;
      currentLight = lights[count];
      System.out.println("Light is "+currentLight);

      support.firePropertyChange("LightChanged",previous,currentLight);
      support.firePropertyChange(currentLight,previous,currentLight);
    }
  }

  @Override
  public void addPropertyChangeListener(String eventName, PropertyChangeListener listener) {
      if(eventName == null || eventName.equals("")){
       addPropertyChangeListener(listener);
      }
      else {
        support.addPropertyChangeListener(eventName, listener);
      }
  }

  @Override
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    support.addPropertyChangeListener(listener);
  }

  @Override
  public void removePropertyChangeListener(String eventName, PropertyChangeListener listener) {
    if(eventName == null || eventName.equals("")){
      removePropertyChangeListener(listener);
    }
    else {
      support.removePropertyChangeListener(eventName, listener);
    }
  }

  @Override
  public void removePropertyChangeListener(PropertyChangeListener listener) {
    support.removePropertyChangeListener(listener);
  }
}
