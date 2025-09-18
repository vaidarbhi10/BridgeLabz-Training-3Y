import java.util.ArrayList;

public class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showDepartments() {
        for (Department d : departments) {
            System.out.println("Department: " + d.name);
            d.showEmployees();
        }
    }
}
