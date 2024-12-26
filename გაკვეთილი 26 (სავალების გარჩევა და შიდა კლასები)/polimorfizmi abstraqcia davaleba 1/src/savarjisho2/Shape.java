package savarjisho2;

public class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void shapeName() {
        System.out.println("ზოგადი ფიგურა");
    }

    public void printInfo() {
        System.out.println("Shape {" +
                "\nx: " + x +
                "\ny: " + y +
                "\n}");
    }

    public double perimeter() {
        return 0;
    }
}
