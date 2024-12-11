public class Car extends Transport {
    private int wheels = 4;

    public Car(int maxSpeed, String color) {
        super(maxSpeed, color);
    }

    public Car() {
        setMaxSpeed(200);
        setColor("Silver");
    }

    @Override
    void go() {
        super.go();
        System.out.println("car is going " + getMaxSpeed());
//        System.out.println("car is going " + maxSpeed); არ მუშაობს
    }
}