package TrafficLight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CarVersion2 {

    public CarVersion2(PropertyChangeSubject subject){
        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                reactToChange(evt);
            }
        };
        subject.addPropertyChangeListener(listener);
    }
    public void reactToChange(PropertyChangeEvent evt) {
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
