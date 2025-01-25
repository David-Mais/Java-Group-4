package savarjisho1;

import java.util.Objects;
import java.util.StringJoiner;

public class Writer {
    private String firstName;
    private String lastName;

    public Writer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Writer other = (Writer) obj;
        return
                Objects.equals(getFirstName(), other.getFirstName()) &&
                        Objects.equals(getLastName(), other.getLastName());
    }

    @Override
    public String toString() {
        return "Writer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
