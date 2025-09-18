public class UniversitySystemMain {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Watson");

        Course c1 = new Course("Physics");
        Course c2 = new Course("Chemistry");

        c1.assignProfessor(p1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c2);

        s1.showCourses();
    }
}
