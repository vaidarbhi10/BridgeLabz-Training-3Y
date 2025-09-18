import java.util.ArrayList;
public class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
    public Hospital(String name) {
        this.name = name;
    }
    public void addDoctor(Doctor d) {
        doctors.add(d);
    }
    public void addPatient(Patient p) {
        patients.add(p);
    }
}
