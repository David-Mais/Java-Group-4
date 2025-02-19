import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.dgc.DGC;

public class Main {
    public static void main(String[] args) {
        // ასვარჯიშო 1
//        Employee e1 = new Employee("John Doe", 20000);
//        System.out.println(e1);
//        try (
//                ObjectOutputStream oos = new ObjectOutputStream(
//                        new FileOutputStream("output.txt")
//                )
//        ) {
//            oos.writeObject(e1);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//
//        try (
//                ObjectInputStream ois = new ObjectInputStream(
//                        new FileInputStream("output.txt")
//                )
//        ) {
//            Employee deserialized = (Employee) ois.readObject();
//            System.out.println(deserialized);
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println(e);
//        }


        // სავარჯიშო 2
        Dog dog = new Dog("Dog", "Dog");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("dog.txt")
                )
        ) {
            oos.writeObject(dog);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream("dog.txt")
                )
        ) {
            Dog deserializedDog = (Dog) ois.readObject();
            System.out.println(deserializedDog);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}