import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Savarjisho1 {
    public static void main(String[] args) {
        String fileName = "src/files/documents/read.txt";
        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(fileName)
                )
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
