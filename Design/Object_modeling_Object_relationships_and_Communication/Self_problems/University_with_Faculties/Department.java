import java.util.ArrayList;
public class Department {
    String name;
    ArrayList<Faculty> faculties = new ArrayList<>();
    public Department(String name) {
        this.name = name;
    }
    public void addFaculty(Faculty f) {
        faculties.add(f);
    }
    public void showFaculties() {
        for (Faculty f : faculties) {
            System.out.println(f.getDetails());
        }
    }
}
