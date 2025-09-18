public class UniversityMain {
    public static void main(String[] args) {
        University uni = new University("Oxford");
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mathematics");
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Johnson");
        d1.addFaculty(f1);
        d2.addFaculty(f2);
        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.showDepartments();
    }
}
