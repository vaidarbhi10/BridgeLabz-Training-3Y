class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 101, 50000);
        Employee e2 = new Employee("Priya", 102, 60000);

        e1.displayDetails();
        e2.displayDetails();
    }
}
