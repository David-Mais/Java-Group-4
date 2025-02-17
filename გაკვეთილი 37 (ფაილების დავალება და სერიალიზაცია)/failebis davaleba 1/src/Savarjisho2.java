import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Savarjisho2 {
    public static void main(String[] args) {
        String fileName = "src/files/vefxi.txt";
        try {
            String content = new String(
                    Files.readAllBytes(Paths.get(fileName))
            );

            String[] words = content.split("\\s+");
            System.out.println("ფაილში სიტყვების რაოდენობა: " + words.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
