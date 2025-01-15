public class Elf extends WorkshopMember implements ChristmasCelebrator{
    // 1-10
    private int skillLevel;
    private String elfType;

    public Elf(String name, String nickname, int age, int skillLevel, String elfType) {
        super(name, nickname, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }

    public String getElfType() {
        return elfType;
    }

    public void setElfType(String elfType) {
        this.elfType = elfType;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    @Override
    public void celebrateChristmas() {
        System.out.println(
                "Elf of type: " + this.elfType + " is celebrating!" +
                        " His/Her name is: " + getName()
        );
    }

    @Override
    public void hostChristmasParty() {
        System.out.println(
                "Elf of type: " + this.elfType + " is hosting party!" +
                        " His/Her name is: " + getName()
        );
    }

    public void makeToy() {
        System.out.println("Elf named " + getName() + " is making toy!");
        increaseExperience();
    }

    public void wrapGifts() {
        System.out.println("Elf named " + getName() + " is wrapping gifts!");
        increaseExperience();
    }

    private void increaseExperience() {
        if (skillLevel >= 10) {
            this.skillLevel = 10;
        } else {
            this.skillLevel++;
        }
    }

    @Override
    public String toString() {
        return "Elf{" +
                "skillLevel=" + skillLevel +
                ", elfType='" + elfType + '\'' +
                '}';
    }
}
