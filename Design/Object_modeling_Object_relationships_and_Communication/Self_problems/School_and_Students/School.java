import java.util.ArrayList;

public class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
