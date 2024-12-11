public class Cat extends Animal {
    boolean isPurring;

    Cat (int age, String name, boolean isPurring) {
//        this.age = age;
//        this.name = name; აღარ გვჭირდება
        super(age, name);
        this.isPurring = isPurring;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Meow Meow...");
    }
}