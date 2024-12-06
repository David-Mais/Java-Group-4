public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double perimeter() {
        return 2 * length + 2 * width;
    }

    double area() {
        return length * width;
    }

    double diagonal() {
        return Math.sqrt(length * length + Math.pow(width, 2));
    }

    boolean isSquare() {
        return length == width;
    }
}