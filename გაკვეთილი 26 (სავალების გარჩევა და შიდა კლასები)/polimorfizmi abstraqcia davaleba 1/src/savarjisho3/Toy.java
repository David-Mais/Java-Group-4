package savarjisho3;

public abstract class Toy {
    private double additionalPrice;

    public Toy(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public abstract double calculatePrice();
}
