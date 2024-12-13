package savarjisho3;

public class Vehicle {
    private String name;
    protected float speed;

    protected Vehicle(String name) {
        this.name = name;
    }

    public float move(float distance) {
        System.out.println("Vehicle covered " + distance + " miles!");
        return distance;
    }

    public String getName() {
        return name;
    }

    public String describe() {
        return "Name: " + name + "\nSpeed: " + speed;
    }
}
