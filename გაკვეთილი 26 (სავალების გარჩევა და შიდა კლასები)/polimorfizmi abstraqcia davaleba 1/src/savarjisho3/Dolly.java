package savarjisho3;

public class Dolly extends Toy{
    private double hairPrice;
    private double clothesPrice;

    public Dolly(double hairPrice, double clothesPrice, double additionalPrice) {
        super(additionalPrice);
        this.hairPrice = hairPrice;
        this.clothesPrice = clothesPrice;
    }

    public double getHairPrice() {
        return hairPrice;
    }

    public void setHairPrice(double hairPrice) {
        this.hairPrice = hairPrice;
    }

    public double getClothesPrice() {
        return clothesPrice;
    }

    public void setClothesPrice(double clothesPrice) {
        this.clothesPrice = clothesPrice;
    }

    @Override
    public double calculatePrice() {
        return hairPrice + clothesPrice + getAdditionalPrice();
    }
}
