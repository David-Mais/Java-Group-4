public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
//        System.out.println(methods.sum(4));
//        System.out.println(methods.power(4, 10));

//        Circle circle = new Circle(7.55);
//        System.out.println(circle.calculateArea());
//        System.out.println(circle.calculateCircumference());

        BankAccount account = new BankAccount(
                "123kj4213kjh123kjh1234",
                "Davit Maisuradze",
                67800.66
        );

        account.displayDetails();
        account.deposit(50.4);
        account.displayDetails();
        account.withdraw(67000);
        account.displayDetails();
        account.withdraw(1500);
        account.displayDetails();
    }
}