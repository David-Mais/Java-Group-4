import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // იპოვეთ n რიცხვის ფაქტორიალი
        // 5! = 5 * 4 * 3 * 2 * 1
//        int n = 5;
//        int product = 1;
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//        System.out.println(product);

        // სკანერით შემოგდით ტექსტი String
        // დაბეჭდეთ ეს ტექსტი უკუღმა
        // სტრინგის ზომა = input.length()
        // კონკრეტული ასოს პოვნა = input.charAt()
//        System.out.print("Please enter a text: ");
//        String input = scanner.nextLine();
//
//        String reversed = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed += input.charAt(i);
//        }
//
//        System.out.println("Reversed text is: " + reversed);


        // სკანერით შემოგდით ტექსტი
        // თევქნი მიზანია დაითვალოთ ხმოვნების რაოდენობა
        // gamarjoba -> 4
//        System.out.print("Please enter a text: ");
//        String text = scanner.nextLine().toLowerCase();
//
//        int count = 0;
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                count++;
//            }
//        }
//
//        System.out.println("Number of vowels: " + count);


        // შემოგდით 2 მთელი რიცხვი a და b
        // დაადიგნეთ a-ს და b-ს უმცირესი საერთო ჯერადი
        // 4, 6 -> 12
//        System.out.print("Enter first number: ");
//        int a = scanner.nextInt();
//        System.out.print("Enter second number: ");
//        int b = scanner.nextInt();
//
//        int lcm = (a > b) ? a : b;
////        int lcm = Math.max(a, b); ეს ვარიანტიც შეიძლება უდიდესის საპოვნელად
//
//        while (true) {
//            if (lcm % a == 0 && lcm % b ==0) {
//                System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
//                break;
//            }
//            lcm++;
//        }



        // გაქვთ რიცხვი n
        // დაბეჭეთ n ხაზიანი მართკუთხა სამკუთხედი *
        // *
        // * *
        // * * *
//        int n = 33;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        // დაადგინეთ რიცხვი არის თუ არა პალინდრომი
        // 12321 არის პალინდრომი
        // 12345 არ არის პალინდრომი
        // 11, 121, 1331 -> პალინდრომია
//        System.out.print("Please enter a number: ");
//        int num = scanner.nextInt();
//        int originalNumber = num, reverse = 0;

        // 12
        // 120
        // 123

        // 432
        // 2 -> 0 * 10 + 2 -> reverse = 2 -> num = 43
        // 3 -> 2 * 10 + 3 -> reverse = 23 -> num = 4
        // 4 -> 23 * 10 + 4 -> reverse = 243 -> num = 0
//        while (num != 0) {
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num /= 10;
//        }
////        System.out.println("Original number: " + originalNumber);
////        System.out.println("Reversed number: " + reverse);
//
//        if (originalNumber == reverse) {
//            System.out.println(originalNumber + " is a palindrome");
//        } else {
//            System.out.println(originalNumber + " is not a palindrome");
//        }



        // დაწერეთ პროგრამა რომელიც 1-დან n-მდე დაბეჭდავს მარტივ რიცხვებს
        // n შემოდის სკანერით და არის მთელი რიცხვი int
        System.out.print("Please enter a number: ");
        int n = scanner.nextInt();

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}