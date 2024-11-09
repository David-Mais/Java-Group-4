import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // სავარჯიშო 1
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        double sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum / n);

        // სავარჯიშო 2
//        String binary = "";
//        int decimal = 250;
//        // 1110
//        while (decimal > 0) {
//            int remainder = decimal % 2;
//            binary = remainder + binary;
//            decimal /= 2;
//        }
//        System.out.println(binary);
//
//        int binNum = Integer.parseInt(binary);
//        System.out.println(binNum);
//
//        int position = 0;
//        while (binNum > 0) {
//            int lastDigit = binNum % 10;
//            if (lastDigit == 1) {
//                System.out.print((int) Math.pow(2, position) + " + ");
//            }
//            position++;
//            binNum /= 10;
//        }


        // სავარჯიშო 3
//        for (int i = 1; i <= 15; i++) {
//            if (i == 5 || i == 7 || i == 11) {
//                continue;
//            }
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }


        // სავარჯიშო 4
//        Scanner scanner = new Scanner(System.in);
//        int binaryNum = scanner.nextInt();
//        int decimalNum = 0;
//        int multiplier = 1;
//
//        while (binaryNum > 0) {
//            int lastDigit = binaryNum % 10;
//
//            decimalNum += lastDigit * multiplier;
//            binaryNum /= 10;
//            multiplier *= 2;
//        }
//        System.out.println(decimalNum);

        // სავარჯიშო 5
//        Scanner scanner = new Scanner(System.in);
//        int decimal = scanner.nextInt();
//        String binary = "";
//        while (decimal > 0) {
//            int remainder = decimal % 2;
//            binary = remainder + binary;
//            decimal /= 2;
//        }
//        System.out.println(binary);

        // სავარჯიშო 6
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;

        System.out.print("Please enter initial number: ");
        int userNumber = scanner.nextInt();
        int attempts = 1;
        while (userNumber != numberToGuess) {
            if (userNumber < numberToGuess) {
                System.out.print("Try Higher: ");
                userNumber = scanner.nextInt();
                attempts++;
            }
            if (userNumber > numberToGuess) {
                System.out.print("Try Lower: ");
                userNumber = scanner.nextInt();
                attempts++;
            }
        }
        System.out.println(userNumber + " was the correct number!");
        System.out.println("It took you " + attempts + " attempts!");
    }
}