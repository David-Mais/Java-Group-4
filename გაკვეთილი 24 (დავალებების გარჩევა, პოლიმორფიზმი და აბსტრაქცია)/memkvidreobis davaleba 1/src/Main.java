import savarjisho3.Cake;
import savarjisho3.Milk;
import savarjisho3.Product;
import savarjisho3.Sandwich;
import savarjisho3.Shop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Milk milk = new Milk(
                5.45,
                LocalDate.of(2024, 12, 20),
                0.5
        );
        Sandwich sandwich = new Sandwich(
                5.45,
                LocalDate.of(2024, 12, 20),
                0.5
        );
        Cake cake = new Cake(
                5.45,
                LocalDate.of(2024, 12, 20),
                0.5
        );

        Product[] products = {milk, sandwich, cake};
        Shop shop = new Shop(products);
    }
}