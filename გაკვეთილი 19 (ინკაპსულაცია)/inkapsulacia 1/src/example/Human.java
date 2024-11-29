package example;

public class Human {
    protected String name;
    private int age;

    //    protected Human (String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
}
