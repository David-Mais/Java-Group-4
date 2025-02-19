import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "Davit";
        h1.age = 20;

        System.out.println(
                ObjectStreamClass
                        .lookup(h1.getClass())
                        .getSerialVersionUID()
        );

        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(
                                "info.txt"
                        )
                )
        ) {
            oos.writeObject(h1);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}