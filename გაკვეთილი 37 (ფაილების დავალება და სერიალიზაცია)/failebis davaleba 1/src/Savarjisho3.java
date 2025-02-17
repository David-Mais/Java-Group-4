import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Savarjisho3 {
    public static void main(String[] args) {
        String fileName = "src/files/vefxi.txt";
        String searchWord = "ბოთლი";

        try {
            String content = new String(
                    Files.readAllBytes(
                            Paths.get(fileName)
                    )
            );

            if (content.contains(searchWord)) {
                System.out.println("სიტყვა: " + searchWord + " ნაპოვნია ფაილში!");
            } else {
                System.out.println("სიტყვა: " + searchWord + " არ არის ფაილში!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
