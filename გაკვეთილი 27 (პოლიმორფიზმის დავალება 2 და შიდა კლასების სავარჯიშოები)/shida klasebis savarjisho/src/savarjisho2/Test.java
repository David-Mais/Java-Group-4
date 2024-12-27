package savarjisho2;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
