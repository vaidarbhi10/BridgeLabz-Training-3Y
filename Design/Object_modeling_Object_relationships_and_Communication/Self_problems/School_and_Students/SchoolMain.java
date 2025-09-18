public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);
        school.addStudent(s1);
        school.addStudent(s2);
        s1.showCourses();
        c1.showStudents();
        school.showStudents();
    }
}
