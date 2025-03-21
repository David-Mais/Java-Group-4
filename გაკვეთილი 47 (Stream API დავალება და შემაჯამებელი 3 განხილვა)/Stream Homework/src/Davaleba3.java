import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Davaleba3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "Box", "Play", "Jemali",
                "Jumberi"
        );

        Set<String> wordSet = words
                .stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(wordSet);
    }
}
