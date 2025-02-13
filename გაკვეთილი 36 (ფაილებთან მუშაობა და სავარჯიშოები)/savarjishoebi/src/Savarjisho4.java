import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Savarjisho4 {
    public static void main(String[] args) {
        String fileName = "src/files/documents/read.txt";
        try {
            List<String> lines = Files.readAllLines(
                    Paths.get(fileName)
            );
            System.out.println(fileName + " აქვს " + lines.size() + " ხაზი");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
