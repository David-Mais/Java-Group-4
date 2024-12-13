package savarjisho3;

public class Truck extends MotorVehicle{
    private float horsePower;

    public Truck(String name, float horsePower) {
        super(name);
        this.horsePower = horsePower;
    }

    @Override
    public String describe() {
        return super.describe() +
                "\nNumber of wheels: " + numberOfWheels +
                "\nEngine volume: " + engineVolume +
                "\nHorse power: " + horsePower;
    }

    @Override
    public String honkHorn() {
        return "Truck is honking horn!!!";
    }
}
