package savarjisho1;

public class Employee extends Human{
    private String id;

    public Employee(String firstName, String lastName, int age, String id) {
        super(firstName, lastName, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
