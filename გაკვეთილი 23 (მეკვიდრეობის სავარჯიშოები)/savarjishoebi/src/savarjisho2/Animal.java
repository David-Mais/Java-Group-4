package savarjisho2;

public class Animal {
    public int age;
    public String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal() {
        return false;
    }

    public void mate() {
        System.out.println("Animal mating");
    }
}
