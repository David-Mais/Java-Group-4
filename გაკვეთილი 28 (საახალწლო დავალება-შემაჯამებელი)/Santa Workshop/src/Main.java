import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf("elf1", "elf", 19, 8, "Short foot");
        System.out.println(elf);
        elf.makeToy();
        elf.wrapGifts();
        System.out.println(elf);
        System.out.println();

        Reindeer reindeer = new Reindeer("Rudolf", "rednose", 9, "Red", 80);
        System.out.println(reindeer);
        reindeer.fly();
        System.out.println(reindeer.checkFitnessLevel());
        System.out.println();

        Child child1 = new Child("David", 10);
        Child child2 = new Child("Andria", 9);
        Child child3 = new Child("Avto", 3);
        Child child4 = new Child("Gio", 5);
        child1.addWish("Porsche 911 GT3");
        child2.addWish("Porsche 911 GT3");
        child3.addWish("Porsche 911 GT3");
        child4.addWish("Porsche 911 GT3");

        List<Child> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        children.add(child4);
        Santa santa = new Santa("Nick", "Santa", 1754);
        santa.setChildList(children);

        System.out.println(children);
        System.out.println(santa.checkNaughtyOrNiceList());
        santa.deliverGifts();




        Snowman snowman = new Snowman(5.23, "Black", false);
        System.out.println(snowman);
        snowman.melt();
        snowman.decorate("Carrot");
        snowman.decorate("Coal");
        snowman.decorate("Buttons");
        snowman.decorate("Scarf");
        System.out.println(snowman);
        snowman.melt();
        System.out.println(snowman);
        snowman.melt();
        snowman.makeMagical();
        System.out.println(snowman);
    }
}
