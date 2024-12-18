package magaliti2;

public class Bicycle extends Vehicle{
    @Override
    public void go() {
        System.out.println("*Bicycle goes");
    }

    public void pushPedal() {
        System.out.println("*Pedal pressed*");
    }
}
