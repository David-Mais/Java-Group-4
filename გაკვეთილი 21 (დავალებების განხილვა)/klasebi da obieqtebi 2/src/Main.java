import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1
//        Car car1 = new Car();
//        car1.make = "BMW";
//        car1.model = "i8";
//        car1.year = 2020;
//        car1.licensePlate = "ZZ000ZZ";
//        Car car2 = new Car();
//        car2.make = "Mercedes";
//        car2.model = "SLS";
//        car2.year = 2023;
//        car2.licensePlate = "ME123RC";
//
//        car1.printInfo();
//        car2.printInfo();

        // 2
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int k = scanner.nextInt();
//
//        System.out.println(multiples(a, b, k));

        // 3
//        System.out.println(countSum(4));

        // 4
//        System.out.println(power(2, 4));

        // 5
//        System.out.println(countZeros(102_030_405));
        oddOrEvenZeros(101);
        oddOrEvenZeros(1001);
    }

    static int multiples(int a, int b, int k) {
        if (a == b) {
            if (a % k == 0) {
                return a;
            }
            return 0;
        }

        if (a % k == 0) {
            return a + multiples(a + 1, b, k);
        }

        return multiples(a + 1, b, k);
    }

    static int countSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + countSum(n - 1);
    }

    static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);
    }

    static int countZeros(int number) {
        if (number == 0) {
            return 1;
        }

        if (number % 10 == 0) {
            return 1 + countZeros(number / 10);
        } else {
            if (number / 10 == 0) {
                return 0;
            }
            return countZeros(number / 10);
        }
    }

    static void oddOrEvenZeros(int number) {
        int numberOfZeros = countZeros(number);

        if (numberOfZeros % 2 == 0) {
            System.out.println("ლუწი რაოდენობა ნულების!");
        } else {
            System.out.println("კენტი რაოდენობა ნულების!");
        }
    }
}