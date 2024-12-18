package savarjisho3;

import java.time.LocalDate;

public class Milk extends Product{
    private double volume;

    public Milk(double price, LocalDate expirationDate, double volume) {
        super(price, expirationDate);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
