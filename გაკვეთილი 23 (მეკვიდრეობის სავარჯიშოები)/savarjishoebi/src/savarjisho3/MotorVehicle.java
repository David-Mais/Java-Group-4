package savarjisho3;

public class MotorVehicle extends Vehicle {
    protected int numberOfWheels;
    protected float engineVolume;

    protected MotorVehicle(String name) {
        super(name);
    }

    public String honkHorn() {
        return "Beep beep!";
    }
}
