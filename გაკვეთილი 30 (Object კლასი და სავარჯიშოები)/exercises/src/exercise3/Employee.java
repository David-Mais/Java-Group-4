package exercise3;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return
                id == employee.id &&
                        Objects.equals(name, employee.name) &&
                        Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    @Override
    public String toString() {
        return "Employee{\n"
                + "\tid: " + id + ",\n"
                + "\tauthor: " + name + ",\n"
                + "\tAddress: " + address + "\n"
                + "}";
    }

    public Employee clone() {
        return new Employee(
                id,
                name,
                new Address(
                        address.getStreet(),
                        address.getCity()
                )
        );
    }

    public static void main(String[] args) {
        Employee employee = new Employee(
                1,
                "Davit",
                new Address("Akhalgazrdoba", "Kutaisi")
        );

        System.out.println(employee);
    }
}
