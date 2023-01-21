package Doctor;

import TrafficLight.PropertyChangeSubject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WaitingRoom implements PropertyChangeSubject {
    private PropertyChangeSupport support;

public WaitingRoom(){
    support = new PropertyChangeSupport(this);
}
    @Override
    public void addPropertyChangeListener(String eventName, PropertyChangeListener listener) {
    if(eventName == null || eventName.equals("")){
        addPropertyChangeListener(listener);
        } else{
        support.addPropertyChangeListener(eventName,listener);
    }
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
     support.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(String eventName, PropertyChangeListener listener) {
    if (eventName == null || eventName.equals("")){
        removePropertyChangeListener(listener);
    } else{
        support.removePropertyChangeListener(eventName,listener);
    }
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
    support.removePropertyChangeListener(listener);

    }
    int currentTicket;
    public void run() throws InterruptedException {
        int counter = 1;

    for (int i = counter; i < 10 ; i++) {
        counter++;
        int previous = currentTicket;
        currentTicket = counter;
        support.firePropertyChange("Ticket Changed",previous,currentTicket);
        System.out.println("DING!");
        Thread.sleep(1000);
        }
    }
}
