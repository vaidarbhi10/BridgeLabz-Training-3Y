class Employee {
    public int employeeID;      // Public
    protected String department; // Protected
    private double salary;       // Private

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}

// Subclass demonstrating access
class Manager extends Employee {
    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);  // public
        System.out.println("Department: " + department);   // protected
        System.out.println("Salary: " + getSalary());      // private via method
        System.out.println("Team: " + teamName);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m1 = new Manager(101, "IT", 75000, "Backend Team");
        m1.displayDetails();

        m1.setSalary(80000);
        System.out.println("Updated Salary: " + m1.getSalary());
    }
}
