package abstraqcia;

public class Car extends Vehicle implements Movement, MotorThings{
    @Override
    public void go() {
        System.out.println("Going!!!");
    }

    @Override
    public void startEngine() {
        System.out.println("*abstraqcia.Car starts engine*");
    }

    @Override
    public void stopEngine() {
        System.out.println("*abstraqcia.Car stops engine*");
    }
}
