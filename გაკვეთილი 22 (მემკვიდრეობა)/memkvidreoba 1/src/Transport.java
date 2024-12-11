public class Transport {
    private int maxSpeed;
    private String color;

    public Transport(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public Transport(){}

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void go() {
        System.out.println("Transport start");
    }

    void stop() {
        System.out.println("Transport stop");
    }
}
