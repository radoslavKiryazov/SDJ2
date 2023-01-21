package TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Car implements PropertyChangeListener {

  private int id;

  public Car(){}


  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    String oldValue=(String)evt.getOldValue();
    String newValue = (String) evt.getNewValue();

    if(newValue.equals("GREEN")){
      System.out.println("Drive.");
    }
    else if(newValue.equals("YELLOW")) {
      if("RED".equals(evt.getOldValue())){
        System.out.println("Engine Turns On");
      }
      else {
        System.out.println("Slow Down");
      }
    }
    else if(evt.getNewValue().equals("RED")){
      System.out.println("Car Stops");
    }
  }

}
