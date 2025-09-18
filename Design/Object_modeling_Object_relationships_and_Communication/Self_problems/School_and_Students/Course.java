import java.util.ArrayList;

public class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public void showStudents() {
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
