package savarjisho3;

public class Car extends MotorVehicle {
    private int numDoors;

    public Car(String name, int numDoors) {
        super(name);
        this.numDoors = numDoors;
    }

    @Override
    public String describe() {
        return super.describe() +
                "\nNumber of wheels: " + numberOfWheels +
                "\nEngine volume: " + engineVolume +
                "\nNum doors: " + numDoors;
    }

    @Override
    public String honkHorn() {
        return "Car is honking horn!";
    }
}
