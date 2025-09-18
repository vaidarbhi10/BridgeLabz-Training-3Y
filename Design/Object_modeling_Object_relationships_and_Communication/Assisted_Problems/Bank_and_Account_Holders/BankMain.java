public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer c1 = new Customer("Alice", 1000);
        Customer c2 = new Customer("Bob", 2000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();

        bank.showCustomers();
    }
}
