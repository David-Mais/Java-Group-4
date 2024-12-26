package savarjisho4;

public class DailyPayEmployee extends Employee {
    private double dailyPay;
    private int daysOfWork;

    public DailyPayEmployee(String firstName, String lastName, String phoneNumber, double dailyPay, int daysOfWork) {
        super(firstName, lastName, phoneNumber);
        this.dailyPay = dailyPay;
        this.daysOfWork = daysOfWork;
    }

    public double getDailyPay() {
        return dailyPay;
    }

    public void setDailyPay(double dailyPay) {
        this.dailyPay = dailyPay;
    }

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    @Override
    public double calculateSalary() {
        return dailyPay * daysOfWork;
    }
}
