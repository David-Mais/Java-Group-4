import java.io.Serializable;
import java.util.SequencedCollection;

public class Animal {
    String species;

    public Animal() {
        System.out.println("Animal Constructor");
    }

    public Animal(String species) {
        this.species = species;
    }
}
