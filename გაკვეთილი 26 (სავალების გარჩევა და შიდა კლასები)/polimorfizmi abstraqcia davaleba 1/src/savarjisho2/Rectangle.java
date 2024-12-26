package savarjisho2;

public class Rectangle extends Shape {
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void shapeName() {
        System.out.println("მართკუთხედი");
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle {" +
                "\nx: " + getX() +
                "\ny: " + getY() +
                "\n}"
        );
    }

    @Override
    public double perimeter() {
        return 2 * (getX() + getY());
    }
}
