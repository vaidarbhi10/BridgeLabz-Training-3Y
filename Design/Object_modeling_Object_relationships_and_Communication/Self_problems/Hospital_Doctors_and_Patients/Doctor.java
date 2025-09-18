import java.util.ArrayList;
public class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();
    public Doctor(String name) {
        this.name = name;
    }
    public void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println(name + " is consulting " + p.name);
    }
}
