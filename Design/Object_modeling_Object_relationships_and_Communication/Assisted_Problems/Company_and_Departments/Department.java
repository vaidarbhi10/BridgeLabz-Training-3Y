import java.util.ArrayList;

public class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showEmployees() {
        for (Employee e : employees) {
            System.out.println(e.getDetails());
        }
    }
}
