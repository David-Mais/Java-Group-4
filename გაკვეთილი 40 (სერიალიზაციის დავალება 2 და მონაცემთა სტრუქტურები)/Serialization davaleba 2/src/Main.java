public class Main {
    public static void main(String[] args) {
        PhoneContact c1 = new PhoneContact(
                "a",
                "a",
                "a",
                "a"
        );
        PhoneContact c2 = new PhoneContact(
                "b",
                "b",
                "b",
                "b"
        );
        PhoneContact c3 = new PhoneContact(
                "c",
                "c",
                "c",
                "c"
        );

        PhoneContact[] contacts = {c1, c2, c3};
        Data.serializeContacts(contacts);

        PhoneContact[] deserializedContacts = Data.deserializeContacts();
        for (PhoneContact c : deserializedContacts) {
            System.out.println(c);
        }
    }
}