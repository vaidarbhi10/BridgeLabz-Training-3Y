class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "GLA University";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 10000);
        c1.displayCourseDetails();

        Course.updateInstituteName("IIT Delhi");

        Course c2 = new Course("Python", 4, 8000);
        c2.displayCourseDetails();
    }
}
