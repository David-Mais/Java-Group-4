public class Car{
    // v1
//    String make = "BMW";
//    String model = "M4";
//    int year = 2024;
//    String color = "Blue";
//    double price = 55000.67;

    // v2
    String make;
    String model;
    int year;
    String color;
    double price;

    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    Car() {

    }

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    Car(String make, int year) {

    }

    Car(int make, String year) {

    }

    void drive() {
        System.out.println(make + " " + model + " დაიძრა");
    }

    void stop() {
        System.out.println(make + " " + model + " გაჩერდა");
    }

    void turnLeft() {
        System.out.println(make + " " + model + " მოუხვია მარცხნივ");
    }

    void turnRight() {
        System.out.println(make + " " + model + " მოუხვია მარჯვნივ");
    }
}