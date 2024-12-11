import javax.smartcardio.Card;

public class Main {
    public static void main(String[] args) {
        // მაგალითი 1
//        Dog dog = new Dog();
//        dog.age = 7;
//        dog.name = "Jeka";
//        dog.lovesFetch = true;
//        dog.isPurring = false;  პრობლემაა

//        Cat cat = new Cat();
//        cat.age = 9;
//        cat.name = "Fiso";
//        cat.isPurring = false;
//        cat.lovesFetch = true;   პრობლემაა

//        System.out.println(dog.name);
//        System.out.println(dog.age);
//        System.out.println(dog.lovesFetch);
//        dog.makeSound();

//        System.out.println(cat.name);
//        System.out.println(cat.age);
//        System.out.println(cat.isPurring);
//        cat.makeSound();

//        Animal animal = new Animal();
//        animal.age = 8;
//        animal.name = "რაღაცა ცხოველი";
//        animal.makeSound();


        // მაგალითი 2
//        Dog dog = new Dog(7, "Cuga", true);
//        Cat cat = new Cat(2, "Kitty", true);
//
//        dog.makeSound();
//        cat.makeSound();
//        System.out.println(cat.isPurring);
//        System.out.println(cat.name);
//        System.out.println(cat.age);

//        dog.super.makeSound(); არ შეიძლება

//        Dog dog1 = new Dog();


        // მაგალითი 3
        Car car = new Car(150, "Black");
        System.out.println(car.getMaxSpeed());
        car.go();
    }
}