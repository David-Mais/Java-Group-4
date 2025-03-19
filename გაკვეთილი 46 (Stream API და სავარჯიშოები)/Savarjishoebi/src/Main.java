import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> oddNumbers = numbers
//                .stream()
//                .filter(n -> n % 2 == 1)
//                .toList();
//        System.out.println(oddNumbers);

        // 2
//        List<String> words = Arrays.asList("Hello", "World", "Hello", "World");
//        List<String> words2 = words
//                .stream()
//                .map(String::toUpperCase)
//                .toList();
//        System.out.println(words2);

        // 3
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
//        int sum = nums
//                .stream()
//                .map(n -> n * n)
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

        // 4
        // 2 -> 1
        // 3 -> 2
        // 4 -> 1
        // 6 -> 1
//        List<String> words =
//                Arrays.asList(
//                        "Java", "is", "fun", "and", "useful"
//                );
//        Map<Integer, Long> wordCount = words
//                .stream()
//                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        System.out.println(wordCount);

        // 5
//        List<String> words = Arrays.asList(
//                "Java", "Streams", "Joy", "Jingle", "Number"
//        );
//        String result = words
//                .stream()
//                .filter(s -> s.startsWith("J"))
//                .collect(Collectors.joining(" "));
//        System.out.println(result);


        // 6
        List<String> words = Arrays.asList(
                "Java", "Streams", "Joy", "Jingle", "Number"
        );
        Set<String> sortedWords = words
                .stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(sortedWords);
    }
}