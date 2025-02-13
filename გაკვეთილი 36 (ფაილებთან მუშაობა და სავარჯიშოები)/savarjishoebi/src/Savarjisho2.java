import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Savarjisho2 {
    public static void main(String[] args) {
        String fileName = "src/files/output.txt";
        try (
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(fileName)
                )
        ) {
            bw.write("Hello everyone");
            bw.newLine();
            bw.write("my name is david\n");
            bw.write("Goodbye");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
