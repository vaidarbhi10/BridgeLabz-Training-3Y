public class HospitalMain {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Brown");
        Doctor d2 = new Doctor("Dr. Green");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);
        d1.consult(p1);
        d2.consult(p2);
        d1.consult(p2);
    }
}
