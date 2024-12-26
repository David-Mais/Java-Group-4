package savarjisho5;

public class Car implements Movable, Turnable{

    @Override
    public void start() {
        System.out.println("Starting car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car");
    }

    @Override
    public void left() {
        System.out.println("Turning left");
    }

    @Override
    public void right() {
        System.out.println("Turning right");
    }
}
