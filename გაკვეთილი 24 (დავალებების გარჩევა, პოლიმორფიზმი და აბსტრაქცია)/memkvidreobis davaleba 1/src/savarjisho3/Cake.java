package savarjisho3;

import java.time.LocalDate;

public class Cake extends Product{
    private double weight;

    public Cake(double price, LocalDate expirationDate, double weight) {
        super(price, expirationDate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
