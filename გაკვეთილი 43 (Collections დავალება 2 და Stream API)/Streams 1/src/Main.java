import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1
//        List<Integer> scores = Arrays.asList(100, 300, 200);
//        Stream<Integer> scoreStream = scores.stream();

        // 2
//        String[] books = {"book1",  "book2", "book3"};
//        Stream<String> bookStream = Arrays.stream(books);

        // 3
//        Stream<String> nameStream = Stream.of("Davit", "Giorgi");
//        IntStream oneToTen = IntStream.range(1, 11);
//        oneToTen.forEach(System.out::println);

        // 4
//        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
//        Stream<Integer> evenNumbers = list
//                .stream()
//                .filter(number -> number % 2 == 0);;
//
//        evenNumbers.forEach(System.out::println);

        // 5
//        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
//        Stream<Integer> squared = list
//                .stream()
//                .map(data -> data * data);
//        squared.forEach(System.out::println);

        // 6
//        ArrayList<Integer> list = new ArrayList<>(List.of(100, 50, 150, 75));
//        Stream<Integer> stream = list
//                .stream()
//                .sorted();
//        stream.forEach(System.out::println);

        // 7
//        List<Human> humans = new ArrayList<>(
//                List.of(
//                        new Human("Giorgi", 23),
//                        new Human("Davit", 11),
//                        new Human("Mariam", 2434),
//                        new Human("Andria", 4),
//                        new Human("Rati", 90)
//                )
//        );
//        Stream<Human> humanStream = humans
//                .stream()
//                .sorted(new HumanAgeComparator());
//        humanStream.forEach(System.out::println);


        // 8
//        ArrayList<String> colors = new ArrayList<>(
//                List.of("Red", "Blue", "Red", "Green", "Blue")
//        );
//        Stream<String> colorsStream = colors
//                .stream()
//                .distinct();
//        colorsStream.forEach(System.out::println);

        // 9
//        List<Human> humans = new ArrayList<>(
//                List.of(
//                        new Human("Giorgi", 23),
//                        new Human("Giorgi", 23),
//                        new Human("Giorgi", 23),
//                        new Human("Davit", 11),
//                        new Human("Mariam", 2434),
//                        new Human("Andria", 4),
//                        new Human("Rati", 90)
//                )
//        );
//        Stream<Human> stream = humans
//                .stream()
//                .distinct();
//        stream.forEach(System.out::println);

        // 10
//        ArrayList<Integer> ints = new ArrayList<>(
//                List.of(1,2,3,4,4,5,7,872,2,43,21,2)
//        );
//        Stream<Integer> intStream = ints
//                .stream()
//                .limit(3);
//        intStream.forEach(System.out::println);

        // 11
//        ArrayList<Integer> ints = new ArrayList<>(
//                List.of(1,2,3,4,4,5,7,872,2,43,21,2)
//        );
//        Stream<Integer> intStream = ints
//                .stream()
//                .skip(3);
//        intStream.forEach(System.out::println);

        // 12
//        ArrayList<Integer> ints = new ArrayList<>(
//                List.of(1,2,3,4,4,5,7,872,2,43,21,2)
//        );
//        Stream<Integer> intStream = ints
//                .stream()
//                .skip(3)
//                .distinct()
//                .sorted()
//                .limit(4);
//        intStream.forEach(System.out::println);

        // 13 problemaa!!!!!
//        ArrayList<Integer> ints = new ArrayList<>(
//                List.of(1, 2, 3, 4, 4, 5, 7, 872, 2, 43, 21, 2)
//        );
//        Stream<Integer> intStream = ints
//                .stream()
//                .forEach(System.out::println)
//                .skip(3);
//        intStream.forEach(System.out::println);

        // 14
//        ArrayList<String> tasks =  new ArrayList<>(
//                List.of("Homework", "Cleaning", "Gaming", "Reading")
//        );
//        Stream<String> stream = tasks
//                .stream()
//                .skip(2);
//
//        ArrayList<String> changedTasks = new ArrayList<>(
//                stream.collect(Collectors.toList())
//        );
//        changedTasks.forEach(System.out::println);

        // 15
//        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = ints
//                .stream()
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

        // 16
//        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
//        long count = ints
//                .stream()
//                .count();
//        System.out.println(count);

        // 17
//        List<String> names = Arrays.asList("Daviti", "Nikolozi", "Avtandili");
//        boolean lenFour = names
//                .stream()
//                .allMatch(s -> s.length() > 4);
//        System.out.println(lenFour);


        // 18
//        List<String> names = Arrays.asList("Daviti", "Nikolozi", "Avtandili");
//        boolean lenSeven = names
//                .stream()
//                .allMatch(s -> s.length() > 7);
//        System.out.println(lenSeven);
    }
}