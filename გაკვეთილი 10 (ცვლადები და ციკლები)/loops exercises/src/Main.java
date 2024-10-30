import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for ციკლით დაბეჭდეთ რიცხვები 1-10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        // დაბეჭდეთ ყველა ლუწი რიცხვი 1-20 ჩათვლით
        // v1
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println();
//
//        // v2
//        for (int i = 2; i <= 20; i += 2) {
//            System.out.println(i);
//        }
//        System.out.println();
//
//        // v3
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }


        // 5 10 15...
        // დაბეჭდეთ 5-ის პირველი 10 ჯერადი
//        for (int i = 1; i <= 10; i++){
//            System.out.println(5 * i);
//        }


        // 1-დან 10-ის ჩათვლით ნატურალური რიცხვების ჯამი
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("sum = " + sum);


        // მომხმარებელს კონსოლიდან შემოჰყავს რიცხვი
        // დაწერეთ ამ რიცხვის გამრავლების ტაბულა
        // 1 x 5 = 5
        // 2 x 5 = 10
        // ...
        // 10 x 5 = 50
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + a + " = " + (i * a));
        }
    }
}