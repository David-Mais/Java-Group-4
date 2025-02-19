import java.io.Serializable;

public class Human implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    int height;

    public void walk() {
        System.out.println(name + " is walking.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}