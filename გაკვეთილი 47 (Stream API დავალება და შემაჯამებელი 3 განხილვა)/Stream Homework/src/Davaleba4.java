import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Davaleba4 {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Alex", 12),
                new Human("Levani", 16),
                new Human("Davit", 20),
                new Human("Giorgi", 14),
                new Human("Mariami", 10)
        );

        List<Human> peopleMoreThan15 = humans
                .stream()
                .filter(human -> human.getAge() >= 15)
                .toList();

        peopleMoreThan15.forEach(System.out::println);

        boolean existsLevani = peopleMoreThan15
                .stream()
                .anyMatch(human -> "Levani".equals(human.getName()));
        System.out.println(existsLevani);
    }
}
