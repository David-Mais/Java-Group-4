package savarjisho2;

public class Zebra extends Animal{
    public boolean isWild;

    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }

    public void run() {
        System.out.println("Zebra is running");
    }

    @Override
    public boolean isMammal() {
        return true;
    }
}
