package magaliti3;

public class TestClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Jeka", 2);
//        Animal animal = new Animal(); ვერ შეიქმნება აბსტრაქტული კლასის ობიექტი
//        Animal animal = new Dog();
        Animal otherDog = new Dog("Cuga", 5);
        Cat cat = new Cat("fiso", 14);
        dog.makeSound();
        otherDog.makeSound();
        cat.makeSound();

        Animal someAnimal = new Dog("doggo", 8);
        someAnimal = new Cat("Kitty", 9);

        System.out.println(cat.getAge());
        System.out.println(otherDog.getName());
    }
}
