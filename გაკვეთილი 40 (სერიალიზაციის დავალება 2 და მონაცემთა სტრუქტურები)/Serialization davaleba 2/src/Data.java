import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Data {
    private static final String FILE_NAME = "contacts.txt";

    public static void serializeContacts(PhoneContact[] contacts) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(FILE_NAME)
                )
        ) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static PhoneContact[] deserializeContacts() {
        PhoneContact[] contacts = null;
        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(FILE_NAME)
                )
        ) {
            contacts = (PhoneContact[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        return contacts;
    }
}
