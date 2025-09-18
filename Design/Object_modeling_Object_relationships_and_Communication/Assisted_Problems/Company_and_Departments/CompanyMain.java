public class CompanyMain {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("HR");
        Department d2 = new Department("IT");

        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));
        d2.addEmployee(new Employee("Charlie"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showDepartments();
    }
}
