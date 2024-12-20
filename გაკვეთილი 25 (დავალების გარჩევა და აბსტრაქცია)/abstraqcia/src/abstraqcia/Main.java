package abstraqcia;

public class Main {
    public static void main(String[] args) {
        System.out.println(Movement.speed);
//        abstraqcia.Movement.speed += 10;
        Car car = new Car();
//        System.out.println(car.speed);

//        abstraqcia.Movement movement = new abstraqcia.Movement(); ინტერფეისებისგან ობიექტს ვერ შევქმნით
        Movement movement = new Car();
        movement.go();
        car.go();
        car.startEngine();
        car.stopEngine();

//        movement.startEngine(); არ შეიძლება ერთი ინტერფეისიდან სხვა ინტერფეისის მეთოდებზე წვდომა
        MotorThings motored = new Car();
        motored.startEngine();
        motored.stopEngine();
//        motored.go();
    }
}