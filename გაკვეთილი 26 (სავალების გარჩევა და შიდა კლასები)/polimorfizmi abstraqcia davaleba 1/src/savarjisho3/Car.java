package savarjisho3;

public class Car extends Toy {
    private double interiorPrice;
    private double tyrePrice;

    public Car(double additionalPrice, double interiorPrice, double tyrePrice) {
        super(additionalPrice);
        this.interiorPrice = interiorPrice;
        this.tyrePrice = tyrePrice;
    }

    public double getInteriorPrice() {
        return interiorPrice;
    }

    public void setInteriorPrice(double interiorPrice) {
        this.interiorPrice = interiorPrice;
    }

    public double getTyrePrice() {
        return tyrePrice;
    }

    public void setTyrePrice(double tyrePrice) {
        this.tyrePrice = tyrePrice;
    }

    @Override
    public double calculatePrice() {
        return interiorPrice + tyrePrice * 4 + getAdditionalPrice();
    }
}
