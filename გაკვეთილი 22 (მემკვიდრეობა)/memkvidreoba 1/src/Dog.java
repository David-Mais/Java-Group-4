public class Dog extends Animal {
    boolean lovesFetch;

    Dog (int age, String name, boolean lovesFetch) {
//        super.age = age; არ შეიძლება თუ private არის age
//        this.age = age;
//        this.name = name; აღარ გვჭირდება
        super(age, name);
        this.lovesFetch = lovesFetch;
    }

    Dog (int age) {
        this.age = age;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Bark Bark...");
//        System.out.println(age);
    }
}