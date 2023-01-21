package Doctor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WaitingRoom waitingRoom = new WaitingRoom();
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(5));
        waitingRoom.addPropertyChangeListener(patients.get(0));
        for (Patient patient : patients) {
            if (patient.getTicketNumber() == waitingRoom.currentTicket) {
                waitingRoom.removePropertyChangeListener(patient);
            }
        }
        waitingRoom.run();
    }
}
