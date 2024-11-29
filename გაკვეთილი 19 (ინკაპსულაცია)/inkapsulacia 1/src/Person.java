public class Person {
    public static final int limbs = 4;
    private String name;
    private int age;
    private final String id;

    Person (String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 1) {
            this.age = age;
        } else {
            System.out.println("არადადებითი ასაკი დაუშვებელია!");
        }
    }

//    public void setId(String id) {
//        this.id = id;
//    } არ იმუშავებს

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public String getId() {
        return this.id;
    }

    public void birthday() {
        age++;
        this.printDetails();
    }

    void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Id: " + this.id);
        System.out.println();
    }

    public static void sayHello() {
        System.out.println("I am a human");
    }
}
