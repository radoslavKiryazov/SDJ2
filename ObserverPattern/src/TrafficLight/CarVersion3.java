package TrafficLight;

import java.beans.PropertyChangeEvent;

public class CarVersion3 {


    public CarVersion3(PropertyChangeSubject subject){
        subject.addPropertyChangeListener("GREEN",this::reactToGreen);
        subject.addPropertyChangeListener("YELLOW",this::reactToYellow);
        subject.addPropertyChangeListener("RED",this::reactToRed);
    }
    public void reactToRed(PropertyChangeEvent event){
        System.out.println("Car Stop");

    }
    public void reactToYellow(PropertyChangeEvent event){
        if("RED".equals(event.getOldValue())){
            System.out.println("Car Turns Engine On");
        } else {
            System.out.println("Car Slows Down");
        }
    }
    public void reactToGreen(PropertyChangeEvent event){
        System.out.println("Car Drives");

    }

}
