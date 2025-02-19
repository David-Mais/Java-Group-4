import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        System.out.println(
                ObjectStreamClass
                        .lookup(h1.getClass())
                        .getSerialVersionUID()
        );

        String fileName = "/Users/davidmaisuradze/Mziuri Groups/Java Group 4/გაკვეთილი 38 (ფაილების დავალება 2, სერიალიზაცია და სავარჯიშოები)/serialization 2/info.txt";

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(fileName)
                )
        ) {
            Human human = (Human) ois.readObject();
            human.walk();
            System.out.println(human);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}