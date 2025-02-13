import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Savarjisho3 {
    public static void main(String[] args) {
        String fileName = "src/files/output.txt";
        try (
                Scanner scanner = new Scanner(
                        new File(fileName)
                )
        ) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
