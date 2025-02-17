import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
//        User user = new User("John", "John123");
//        user.sayHello();
//
//        try (
//                FileOutputStream fos = new FileOutputStream(
//                        "user.txt"
//                );
//                ObjectOutputStream oos = new ObjectOutputStream(fos)
//        ) {
//            oos.writeObject(user);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (
//                ObjectOutputStream oos = new ObjectOutputStream(
//                        new FileOutputStream(
//                                "user.txt"
//                        )
//                )
//        ) {
//            oos.writeObject(user);
//        } catch (IOException e) {
//            System.out.println(e);
//        }


//        try (
//                ObjectInputStream ois = new ObjectInputStream(
//                        new FileInputStream(
//                                "user.txt"
//                        )
//                )
//        ) {
//            User deserializedUser = (User) ois.readObject();
//
//            System.out.println(deserializedUser.toString());
//            deserializedUser.sayHello();
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }



//        ChildUser child = new ChildUser("Jane", "1234", false);
//        try (
//                ObjectOutputStream oos = new ObjectOutputStream(
//                        new FileOutputStream(
//                                "child.txt"
//                        )
//                )
//        ) {
//            oos.writeObject(child);
//        } catch (IOException e) {
//            System.out.println(e);
//        }



        User user = new User("John", "John123");
        user.age = "19";
        user.sayHello();
        System.out.println(user);

        try (
                FileOutputStream fos = new FileOutputStream(
                        "user.txt"
                );
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(user);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(
                                "user.txt"
                        )
                )
        ) {
            User deserializedUser = (User) ois.readObject();

            System.out.println(deserializedUser.toString());
            deserializedUser.sayHello();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}