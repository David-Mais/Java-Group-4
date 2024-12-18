package savarjisho3;

import java.time.LocalDate;

public class Sandwich extends Product{
    private double length;

    public Sandwich(double price, LocalDate expirationDate, double length) {
        super(price, expirationDate);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
