import java.util.ArrayList;
public class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course c) {
        courses.add(c);
        c.enroll(this);
    }

    public void showCourses() {
        for (Course c : courses) {
            System.out.println(c.name);
        }
    }
}

