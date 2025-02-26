public class PhoneBook {
    private PhoneContact[] phoneContacts = new PhoneContact[30];
    private int count = 0;

    public void displayContacts() {
        System.out.println("Displaying Phone Contacts");
        if (count == 0) {
            System.out.println("No phone contacts found");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(phoneContacts[i]);
        }
    }

    public void addPhoneContact(PhoneContact phoneContact) {
        if (count >= 30) {
            System.out.println("Phone Contact is full");
            return;
        }

        phoneContacts[count] = phoneContact;
        count++;

        Data.serializeContacts(phoneContacts);
    }

    public void removePhoneContact(PhoneContact phoneContact) {
        for (int i = 0; i < phoneContacts.length; i++) {
            if (phoneContacts[i] == null) {
                continue;
            }
            if (phoneContacts[i].equals(phoneContact)) {
                phoneContacts[i] = null;
            }
        }

        Data.serializeContacts(phoneContacts);
    }


    public void editPhoneContact(PhoneContact original, PhoneContact edited) {
        for (int i = 0; i < phoneContacts.length; i++) {
            if (phoneContacts[i] == null) {
                continue;
            }
            if (phoneContacts[i].equals(original)) {
                phoneContacts[i] = edited;
            }
        }

        Data.serializeContacts(phoneContacts);
    }
}
