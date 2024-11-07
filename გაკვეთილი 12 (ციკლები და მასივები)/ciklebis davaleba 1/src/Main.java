import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // სავარჯიშო 1
//        int sum = 0;
//        for (int i = 10; i < 100; i++) {
//            if (i % 5 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

//        int sum = 0;
//        for (int i = 10; i < 100; i += 5) {
//            sum += i;
//        }
//        System.out.println(sum);

        // სავარჯიშო 2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("გთხოვთ შეიყვანოთ რიცხვი: ");
//        int num = sc.nextInt();
//        int digit = 1;
//
//        while (num >= 10) {
//            num /= 10;
//            digit++;
//        }
//        System.out.println("ეს რიცხვი არის " + digit + " ნიშნა");

        // სავარჯიშო 3
//        int number = 26;
//        int denominator = 2;
//        if (number == 1) {
//            System.out.println("რიცხვი არაა მარტივი");
//        }
//        while (denominator < number) {
//            if (number % denominator == 0) {
//                System.out.println("რიცხვი არაა მარტივი");
//                break;
//            }
//            denominator++;
//        }
//        if (number == denominator) {
//            System.out.println("ეს რიცხვი მარტივია");
//        }

        // სავარჯიშო 4
        // 24 - 20 = 4
        // 44 - 24 = 20 - 4 = 16 - 4 = 12 - 4 = 8 - 4 =
//        int a = 44;
//        int b = 24;
//        while (a != b) {
//            if (a >  b) {
//                a -= b;
//            }
//            if (a < b) {
//                b -= a;
//            }
//        }
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);

        // სავარჯიშო 5
        // 189,2
//        int digitSum = 0;
//        int currentNum = 0;
//        for (int i = 100; i < 1000; i++) {
//            currentNum = i;
//            while (currentNum != 0) {
//                int digit = currentNum % 10;
//                digitSum += digit;
//                currentNum /= 10;
//            }
//            if (i % digitSum == 0) {
//                System.out.println(i);
//            }
//            digitSum = 0;
//        }

        // სავარჯიშო 6
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("ფიბონაჩის რამდენი წევრი გნებავთ?: ");
//        int amount = scanner.nextInt();
//        int num1 = 0;
//        int num2 = 1;
//
//        if (amount < 0) {
//            System.out.println("უარყოფითი რაოდენობის რიცხვს ან ნულს ვერ დავბეჭდავ!");
//        } else if (amount == 1) {
//            System.out.println(num1);
//        }else if (amount == 2) {
//            System.out.println(num1 + " " + num2);
//        } else {
//            amount -= 2;
//            System.out.print(num1 + " " + num2 + " ");
//            for (int i = 0; i < amount; i++) {
//                int newNumber = num1 + num2;
//                System.out.print(newNumber + " ");
//                num1 = num2;
//                num2 = newNumber;
//            }
//        }
    }
}