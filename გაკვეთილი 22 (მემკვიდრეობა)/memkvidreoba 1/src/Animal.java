public class Animal {
    int age;
    String name;

    Animal (int age, String name) {
        this.age = age;
        this.name = name;
    }

    Animal() {}

//    Animal() {
//
//    }

    void makeSound() {
        System.out.println("Animal sound...");
    }
}