import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Human h1 = new Human(
//                "Davit",
//                "Maisuradze",
//                20
//        );
        Human h2 = new Human(
                "Andria",
                "Demuria",
                17
        );
//        h1.walk();
//        h2.hangout(h1);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("შეიყვანე სახელი: ");
            String firstName = scanner.nextLine();

            System.out.print("შეიყვანე გვარი: ");
            String lastName = scanner.nextLine();

            System.out.print("შეიყვანე ასაკი: ");
            int age = scanner.nextInt();

            Human human = new Human(firstName, lastName, age);
            System.out.println(human);
            human.walk();
            human.hangout(h2);
        } catch (InputMismatchException e) {
            System.err.println(e);
        }
    }
}