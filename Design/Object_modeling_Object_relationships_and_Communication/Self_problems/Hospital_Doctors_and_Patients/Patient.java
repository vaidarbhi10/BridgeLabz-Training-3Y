import java.util.ArrayList;
public class Patient {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    public Patient(String name) {
        this.name = name;
    }
    public void addDoctor(Doctor d) {
        doctors.add(d);
    }
}
