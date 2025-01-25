package savarjisho3;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private boolean hasSolution;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        solve();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    private void solve() {
        double discriminant = Math.pow(b,2) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The equation has a negative discriminant");
            hasSolution = false;
            return;
        }
        hasSolution = true;
        this.x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        this.x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    @Override
    // 1, 2
    // 2, 1
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        QuadraticEquation other = (QuadraticEquation) obj;

        if (hasSolution != other.hasSolution) return false;
        if (this.getX1() == other.getX1() && this.getX2() == other.getX2()) return true;
        if (this.getX1() == other.getX2() && this.getX2() == other.getX1()) return true;

        return false;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", hasSolution=" + hasSolution +
                '}';
    }
}
