import java.util.Arrays;
import java.util.List;

public class Davaleba2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "Box", "Play", "Jemali",
                "Jumberi"
        );

        List<String> words2 = words
                .stream()
                .filter(s -> s.startsWith("J"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(words2);
    }
}
