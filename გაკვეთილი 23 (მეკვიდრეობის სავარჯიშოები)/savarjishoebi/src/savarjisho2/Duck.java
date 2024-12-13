package savarjisho2;

public class Duck extends Animal{
    public String beakColor = "Yellow";

    public Duck(int age, String gender) {
        super(age, gender);
    }

    @Override
    public boolean isMammal() {
        return false;
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void quack() {
        System.out.println("Quack quack");
    }
}
