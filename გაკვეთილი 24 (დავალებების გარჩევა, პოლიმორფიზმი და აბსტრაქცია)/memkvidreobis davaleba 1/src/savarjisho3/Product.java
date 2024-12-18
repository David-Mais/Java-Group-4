package savarjisho3;

import java.time.LocalDate;

public class Product {
    private double price;
    private LocalDate expirationDate;

    public Product(double price, LocalDate expirationDate) {
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
