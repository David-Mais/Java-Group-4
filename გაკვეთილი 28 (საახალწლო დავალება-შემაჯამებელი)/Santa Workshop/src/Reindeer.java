public class Reindeer extends WorkshopMember {
    private double flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickname, int age, String noseColor, double flyingSpeed) {
        super(name, nickname, age);
        this.noseColor = noseColor;
        this.flyingSpeed = flyingSpeed;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println(
                "Reindeer named: " + getName() +
                        " is flying at speed: " + getFlyingSpeed()
        );
    }

    public void trainForChristmas() {
        System.out.println("Reindeer training for christmas");
    }

    public char checkFitnessLevel() {
        if (flyingSpeed >= 50 && getAge() < 10) {
            return 'A';
        }else if (flyingSpeed >= 30 && getAge() < 15) {
            return 'D';
        } else {
            return 'F';
        }
    }

    @Override
    public String toString() {
        return "Reindeer{" +
                "flyingSpeed=" + flyingSpeed +
                ", noseColor='" + noseColor + '\'' +
                '}';
    }
}
