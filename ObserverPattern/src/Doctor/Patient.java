package Doctor;



import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Patient implements PropertyChangeListener {

    private int ticketNumber;

    public Patient(int ticketNumber){
        this.ticketNumber=ticketNumber;
        System.out.println("Patient with ticket "+ticketNumber+" entered the waiting room");
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int dingDong = (Integer) evt.getNewValue();
        if(dingDong==ticketNumber){
            System.out.println("Patient with ticket "+ticketNumber+" looks up");
            System.out.println("Patient with ticket "+ticketNumber+" enter the doctor's office");
        } else{
            System.out.println("Patient with ticket "+ticketNumber+" looks up");
            System.out.println("Patient with ticket "+ticketNumber+" goes back on their phone");
        }

    }
}
