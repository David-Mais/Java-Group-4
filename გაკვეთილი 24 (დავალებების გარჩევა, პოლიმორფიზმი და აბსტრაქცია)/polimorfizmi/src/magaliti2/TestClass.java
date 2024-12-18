package magaliti2;

public class TestClass {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] transport = {car, bicycle, boat};

        for(Vehicle x : transport) {
            x.go();
        }

        // აუცილებლად გატესტეთ!!!!!!!!!
//        Vehicle vehicle = new Bicycle();
//        vehicle.go();
//        vehicle.pushPedal();
    }
}
