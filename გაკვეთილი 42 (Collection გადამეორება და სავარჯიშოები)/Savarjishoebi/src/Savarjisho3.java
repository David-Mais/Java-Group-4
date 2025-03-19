import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Savarjisho3 {
    public static void main(String[] args) {
        // start: 5, 5, 8, 1, 1, 1, 4, 4, 1
        // end: 1, 4, 5, 8
        Integer[] nums = {5, 5, 8, 1, 1, 1, 4, 4, 1};
        HashSet<Integer> set = new HashSet<>(
                Arrays.asList(nums)
        );
        System.out.println(set);

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
