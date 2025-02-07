import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(divide());

//        System.out.println(divideByInput());

//        try {
//            negativeChecker(50);
//            negativeChecker(-67);
//        } catch (NegativeNumberException e) {
//            System.err.println(e.getMessage());
//        }

        try {
            System.out.println(squareRoot(-1));
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }
    }

    static int divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი: ");
        int numberOne = scanner.nextInt();
        System.out.print("შეიყვანეთ რიცხვი: ");
        int numberTwo = scanner.nextInt();

        try {
            return numberOne / numberTwo;
        } catch (ArithmeticException ae) {
            System.out.println("ნულზე ვერ გაიყოფა");
//            throw new RuntimeException("ნულზე ვერ გაიყოფა");
        }
        return 0;
    }

    static int divideByInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი: ");
        String numberString = scanner.nextLine();

        // ვერსია 1
//        try {
//            int number = Integer.parseInt(numberString);
//            return number / number;
//        } catch (ArithmeticException ae) {
//            System.err.println("ვერ გაყოფ ნულზე!");
//        } catch (NumberFormatException nfe) {
//            System.err.println("ტექსტი: " + numberString + " ვერ გადაიქცა რიცხვად!");
//        }

        // ვერსია 2
        try {
            int number = Integer.parseInt(numberString);
            return number / number;
        } catch (ArithmeticException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }

        return 0;
    }

    static boolean negativeChecker(int n) throws NegativeNumberException{
        if (n < 0) {
            throw new NegativeNumberException("უარყოფითები არ დაიშვება!: " + n);
        }
        return false;
    }

    static double squareRoot(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(n + " რიცხვის კვადრატული ფესვი არ არსებობს!");
        }
        return Math.sqrt(n);
    }
}