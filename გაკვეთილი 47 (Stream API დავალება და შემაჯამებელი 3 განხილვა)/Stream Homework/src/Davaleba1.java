import java.util.Arrays;
import java.util.List;

public class Davaleba1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(13, 1, 2, 3, 14, 90, -10);

        int sum = numbers
                .stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}