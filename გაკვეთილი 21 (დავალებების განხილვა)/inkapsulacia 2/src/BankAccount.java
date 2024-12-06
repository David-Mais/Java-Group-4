public class BankAccount {
    private final String accountNumber;
    private String password;
    private double balance;

    private final String[] transactions = new String[100];
    private int index = 0;

    private boolean accountLock = false;

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
        if (accountLock) {
            System.out.println("ანაგრიში დაკეტილია!!!");
            return;
        }
        if (amount > 0 && amount <= 10_000) {
            this.balance += amount;
            transactions[index] = "Deposit $" + amount;
            index++;
        } else {
            System.out.println("პრობლემური თანხა!");
        }
    }

    public void withdraw(double amount, String password) {
        if (accountLock) {
            System.out.println("ანაგრიში დაკეტილია!!!");
            return;
        }
        if (this.password.equals(password)) {
            if (amount > 0 && amount <= balance) {
                this.balance -= amount;
                transactions[index] = "Withdraw $" + amount;
                index++;
            } else {
                System.out.println("არასწორი თანხა!");
            }
        } else {
            System.out.println("არასწორი პასვორდი!");
        }
    }

    public void printTransactionHistory() {
        if (accountLock) {
            System.out.println("ანაგრიში დაკეტილია!!!");
            return;
        }
        for (String transaction : transactions) {
            if (transaction == null) {
                continue;
            }
            System.out.println(transaction);
        }
    }

    public void transferMoney(BankAccount bankAccount, double amount) {
        if (accountLock) {
            System.out.println("ანაგრიში დაკეტილია!!!");
            return;
        }
        if (amount <= this.balance && amount <= 1000) {
            this.balance -= amount;
            bankAccount.deposit(amount);
            transactions[index] = "Transfer $" + amount;
        } else {
            System.out.println("არასაკმარისი თანხა");
        }
    }

    public void lockAccount() {
        accountLock = true;
    }

    public void unlockAccount() {
        accountLock = false;
    }

    public double interestCalculator(double initialAmount, int months) {
        return initialAmount * Math.pow(1.01, months);
    }
}