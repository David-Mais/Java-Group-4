import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Davaleba5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 5, 5);

        int secondSmallest = nums
                .stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondSmallest);


        int secondLargest = nums
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargest);
    }
}
