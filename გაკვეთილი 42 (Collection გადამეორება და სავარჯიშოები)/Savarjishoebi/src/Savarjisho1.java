import java.util.ArrayList;

public class Savarjisho1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                nums.add(i);
            }
        }
        System.out.println(nums);
    }
}