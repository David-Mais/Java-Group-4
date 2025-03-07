import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "banana", "apple", "pineapple"};
        HashMap<String, Integer> result = countWordFrequency(words);
        for (String key : result.keySet()) {
            System.out.println(key + " : " + result.get(key));
        }
    }

    private static HashMap<String, Integer> countWordFrequency(String[] words) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }
        return result;
    }
}
