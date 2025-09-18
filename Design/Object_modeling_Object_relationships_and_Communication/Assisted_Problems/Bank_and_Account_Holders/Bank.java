import java.util.ArrayList;

public class Bank {
    ArrayList<Customer> customers = new ArrayList<>();

    public void openAccount(Customer customer) {
        customers.add(customer);
    }

    public void showCustomers() {
        for (Customer c : customers) {
            System.out.println(c.name + " Balance: " + c.balance);
        }
    }
}
