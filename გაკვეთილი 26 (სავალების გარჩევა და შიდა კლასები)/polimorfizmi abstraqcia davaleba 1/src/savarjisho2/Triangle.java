package savarjisho2;

public class Triangle extends Shape{
    private double z;

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void shapeName() {
        System.out.println("სამკუთხედი");
    }

    @Override
    public void printInfo() {
        System.out.println("Triangle {" +
                "\nx: " + getX() +
                "\ny: " + getY() +
                "\nz: " + z +
                "\n}"
        );
    }

    @Override
    public double perimeter() {
        return getX() + getY() + z;
    }
}
