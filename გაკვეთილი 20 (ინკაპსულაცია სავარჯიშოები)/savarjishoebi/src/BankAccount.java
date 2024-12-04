public class BankAccount {
    private final String accountNumber;
    private String password;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0 && amount <= 10_000) {
            this.balance += amount;
        } else {
            System.out.println("პრობლემური თანხა!");
        }
    }

    public void withdraw(double amount, String password) {
        if (this.password.equals(password)) {
            if (amount > 0 && amount <= balance) {
                this.balance -= amount;
            } else {
                System.out.println("არასწორი თანხა!");
            }
        } else {
            System.out.println("არასწორი პასვორდი!");
        }
    }

//    public void doSomethingStupid() {
//        accountNumber = "123412";
//    }
}