import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("შეიყვანეთ " + (i + 1) + " ქვეყნის ინფორმაცია:");
            System.out.print("ქვეყნის დასახელება: ");
            String name = scanner.nextLine();

            System.out.print("ქვეყნის მოსახლეობა: ");
            long population = scanner.nextLong();

            System.out.print("ქვეყნის ფართობი: ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(
                    name,
                    population,
                    area
            );
        }

        for (Country country : countries) {
            System.out.println(country);
        }
        System.out.println();

        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("countries.txt")
                )
        ) {
            oos.writeObject(countries);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("countries.txt")
                )
        ) {
            Country[] array = (Country[]) ois.readObject();

            for (Country country : array) {
                System.out.println(country);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}