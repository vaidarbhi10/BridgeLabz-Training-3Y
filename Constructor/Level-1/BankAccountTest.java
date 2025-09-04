class BankAccount {
    public String accountNumber;      // Public
    protected String accountHolder;   // Protected
    private double balance;           // Private

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

// Subclass demonstrating access to public & protected members
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);   // public
        System.out.println("Account Holder: " + accountHolder);   // protected
        System.out.println("Balance: " + getBalance());           // private via method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "Ramesh", 10000, 5.0);
        sa.displayDetails();

        sa.deposit(2000);
        sa.withdraw(1500);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
