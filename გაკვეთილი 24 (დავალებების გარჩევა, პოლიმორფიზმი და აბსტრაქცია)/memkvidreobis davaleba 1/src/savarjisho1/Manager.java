package savarjisho1;

public class Manager extends Employee{
    private String managerId;

    public Manager(String firstName, String lastName, int age, String id, String managerId) {
        super(firstName, lastName, age, id);
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
}
