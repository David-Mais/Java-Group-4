import java.io.IOException;
import java.io.PrintWriter;

public class Savarjisho5 {
    public static void main(String[] args) {
        String fileName = "src/files/stars.txt";
        try (
                PrintWriter pw = new PrintWriter(fileName)
        ) {
            for (int i = 1; i <= 50; i++) {
                for (int j = 1; j <= i; j++) {
                    pw.print("* ");
                }
                pw.println();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
