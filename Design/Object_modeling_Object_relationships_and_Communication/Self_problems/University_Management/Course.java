public class Course {
    String name;
    Professor professor;
    public Course(String name) {
        this.name = name;
    }
    public void assignProfessor(Professor p) {
        professor = p;
        System.out.println("Professor " + p.name + " assigned to " + name);
    }
}
