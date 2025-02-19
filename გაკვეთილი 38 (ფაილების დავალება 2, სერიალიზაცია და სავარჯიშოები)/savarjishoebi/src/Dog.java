import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    String name;

    public Dog(String species, String name) {
        super(species);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
