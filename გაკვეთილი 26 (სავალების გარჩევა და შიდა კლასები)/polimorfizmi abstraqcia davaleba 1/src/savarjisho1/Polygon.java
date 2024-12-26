package savarjisho1;

public class Polygon {
    private int sides;
    private double length;

    public Polygon(int sides, double length) {
        this.sides = sides;
        this.length = length;
    }

    public double perimeter() {
        return length * sides;
    }
}
