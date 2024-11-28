public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println();
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!\n");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println();
        }
    }

    void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }
}
