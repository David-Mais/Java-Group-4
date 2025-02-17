import java.io.Serializable;

public class User implements Serializable {
    static final int legs = 2;
    String name;
    String password;
    transient String age;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
