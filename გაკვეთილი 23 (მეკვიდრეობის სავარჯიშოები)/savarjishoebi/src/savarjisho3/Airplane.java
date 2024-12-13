package savarjisho3;

public class Airplane extends Vehicle {
    private float wingspan;
    private int capacity;
    private boolean landingGear;

    public Airplane(String name, float wingspan, int capacity) {
        super(name);
        this.wingspan = wingspan;
        this.capacity = capacity;
    }

    private void landingGear(boolean set) {
        this.landingGear = set;
    }

    @Override
    public float move(float distance) {
        System.out.println("Airplane moved " + distance + " miles!");
        return distance;
    }

    @Override
    public String describe() {
        return super.describe() +
                "\nWingspan: " + wingspan +
                "\nCapacity: " + capacity +
                "\nLanding gear: " + landingGear;
    }
}
