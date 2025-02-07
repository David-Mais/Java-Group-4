import java.util.Scanner;

public class UtilMethods {
    public int divide() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number1 = scanner.nextInt();
            System.out.print("Enter an integer: ");
            int number2 = scanner.nextInt();

            return number1 / number2;
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        return 0;
    }

    public int factorial() throws NumberLessThanZeroException {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        if (number < 0) {
            throw new NumberLessThanZeroException("Provided number is less than zero");
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double calculate(double a, double b, char operation) throws InvalidOperationException {
        switch (operation) {
            case '+': return (a + b);
            case '-': return (a - b);
            case '*': return (a * b);
            case '/':
                if (b == 0) {
                    return 0;
                }
                return (a / b);
            default:
                throw new InvalidOperationException("Operation " + operation + " is not defined");
        }
    }
}
